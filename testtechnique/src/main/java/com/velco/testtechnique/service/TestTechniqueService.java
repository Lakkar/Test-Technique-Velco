package com.velco.testtechnique.service;

import com.velco.testtechnique.model.AbstractReference;
import com.velco.testtechnique.repository.TestTechniqueRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Data
@Service

public class TestTechniqueService {

    @Autowired
    private TestTechniqueRepository testTechniqueRepository;

    /* Input: nothing
     * Output: Multiple AbstractReferenceObject in an ArrayList
     * Purpose: This function calls the readAll() function of the repository to get all AbstractReference Objects sorted*/
    public ArrayList<AbstractReference> getReferences() throws Exception {
        ArrayList<AbstractReference> allReferences = testTechniqueRepository.readAll();
        Collections.sort(allReferences);
        return allReferences;
    }
}
