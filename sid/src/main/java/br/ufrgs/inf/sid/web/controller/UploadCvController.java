package br.ufrgs.inf.sid.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;

import br.ufrgs.inf.sid.business.uploadcv.CvFile;
import br.ufrgs.inf.sid.business.uploadcv.ProcessCV;
import br.ufrgs.inf.sid.business.uploadcv.ViewDTO;
import br.ufrgs.inf.sid.business.util.Message;

@Controller
public class UploadCvController {
	
	@Autowired private ProcessCV processCV;
	
	private static final String CV		= "cv";
	
	@ModelAttribute(CV)
	public CvFile initModel() {
		return new CvFile();
	}

	@RequestMapping(value = "/upload-cv", method = RequestMethod.GET)
    public String showView() {
        return "upload-cv";
    }
	
	@RequestMapping(value = "/upload-cv", method = RequestMethod.POST)
    public String uploadCv(@Valid @ModelAttribute(CV) CvFile cv, BindingResult result, RedirectAttributes redirectAttributes, 
    		Model model, HttpServletRequest request) {

		/*cvFileValidator.validate(cv, result);
		if(result.hasErrors()) {
			return "upload-cv";
		}*/
		Message message = processCV.loadFile(cv);
		if(message.getData() != null) {
			if(message.getData() instanceof ViewDTO){
				ViewDTO res = (ViewDTO)message.getData();
				Gson gson = new Gson();
				request.getSession().setAttribute("DATA_CV", gson.toJson(res.getCvData()).toString());
				request.getSession().setAttribute("DATA_SOLR", gson.toJson(res.getSolrData()).toString());
				//model.addAttribute("DATA_CV", res.getCvData());
				//model.addAttribute("DATA_SOLR", res.getSolrData());
				
				return "redirect:/validate.html";
			}
			//redirectAttributes.addFlashAttribute(MESSAGE, message);
			return "upload-cv";
		}
		else {
			return "upload-cv";
		}
	}
}