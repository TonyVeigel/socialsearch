package com.socialsearch.controllers;

import com.socialsearch.commands.PersonCommand;
import com.socialsearch.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by veigelto on 7/7/16.
 */
@RequestMapping("/api/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value = {"/add"}
    )
    public String save(@Valid PersonCommand personCommand, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "error";
        }
        return "good";
    }

}
