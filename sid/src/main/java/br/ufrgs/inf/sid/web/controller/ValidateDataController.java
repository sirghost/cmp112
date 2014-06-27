package br.ufrgs.inf.sid.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.ufrgs.inf.sid.business.populate.Populate;
import br.ufrgs.inf.sid.business.uploadcv.AreaDTO;
import br.ufrgs.inf.sid.business.util.Message;
import br.ufrgs.inf.sid.business.util.SidConstants;

@Controller
public class ValidateDataController {

	@Autowired private Populate populate;
	private static final String MODEL = "areaDTO";
	
	@ModelAttribute(MODEL)
	public AreaDTO init() {
		return new AreaDTO();
	}
	
	@RequestMapping(value = "/validate", method = RequestMethod.GET)
    public String showView(ModelMap model, HttpServletRequest request) {
		
		String cvData = (String)request.getSession().getAttribute("DATA_CV");
		String solrData = (String)request.getSession().getAttribute("DATA_SOLR");
		AreaDTO aDTO = new AreaDTO();
		aDTO.setCvData(cvData);
		aDTO.setSolrData(solrData);
		model.addAttribute(MODEL, aDTO);
		
        return "validate";
    }
	
	@RequestMapping(value = "/validate/save", method = RequestMethod.POST, 
			headers = {"content-type=application/json"})
    public @ResponseBody Message saveAreas(HttpServletRequest request, @RequestBody AreaDTO aDTO){
		if(aDTO.getIds() != null){
			return populate.updatePessoaWithAreas(SidConstants.PALAZZO_CODE, aDTO.getIds());
		}
		return null;
	}
}