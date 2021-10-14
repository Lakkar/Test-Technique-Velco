package com.velco.testtechnique.controller;


import com.velco.testtechnique.model.AbstractReference;
import com.velco.testtechnique.service.TestTechniqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestTechniqueController {

    @Autowired
    private TestTechniqueService testTechniqueService;

    /* Input: nothing
     * Output: Multiple AbstractReferenceObject in an ArrayList
     * Purpose: This function calls the getReferences() function of the service and opens an endpoint to get them in a JSON*/
    @GetMapping("/references")
    public ArrayList<AbstractReference> getReferences() throws Exception {
        return testTechniqueService.getReferences();
    }
}
