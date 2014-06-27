package br.ufrgs.inf.sid.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.ufrgs.inf.sid.business.populate.Populate;

@Controller
public class PopulateDataController {
	
	@Autowired private Populate populate;

	@RequestMapping(value = "/populate-data", method = RequestMethod.GET)
    public String showView() {
		populate.savePessoa(null);
		populate.populateWithACMData();
        return "populate-data";
    }
}