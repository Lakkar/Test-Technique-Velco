package com.velco.testtechnique;

import com.velco.testtechnique.model.AbstractReference;
import com.velco.testtechnique.model.ErrorReference;
import com.velco.testtechnique.model.Reference;
import com.velco.testtechnique.repository.TestTechniqueRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestTechniqueRepositoryTest {

    @Autowired
    private TestTechniqueRepository testTechniqueRepository;

    @Test
    public void testRepositoryReadAll() throws Exception{
        AbstractReference expectedReference = new Reference(1460100040, 27, (float) 45.12, "R");
        AbstractReference resultReference = testTechniqueRepository.readAll().get(0);
        assertEquals(expectedReference,resultReference);

        AbstractReference expectedError = new ErrorReference(5,"Incorrect value for color", "1462100403;A;100.1;9");
        AbstractReference resultError = testTechniqueRepository.readAll().get(4);
        assertEquals(expectedError,resultError);
    }
}
