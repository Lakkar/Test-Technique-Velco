package com.velco.testtechnique;

import com.velco.testtechnique.model.AbstractReference;
import com.velco.testtechnique.model.ErrorReference;
import com.velco.testtechnique.model.Reference;
import com.velco.testtechnique.service.TestTechniqueService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestTechniqueServiceTest {

    @Autowired
    private TestTechniqueService testTechniqueService;

    @Test
    public void testServiceGetReferences () throws Exception{
        AbstractReference expectedReference = new Reference(1462100044, 19, (float) 5.56, "G");
        AbstractReference resultReference = testTechniqueService.getReferences().get(0);
        assertEquals(expectedReference,resultReference);

        AbstractReference expectedError = new ErrorReference(5,"Incorrect value for color", "1462100403;A;100.1;9");
        AbstractReference resultError = testTechniqueService.getReferences().get(4);
        assertEquals(expectedError,resultError);
    }
}
