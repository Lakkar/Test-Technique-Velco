package com.velco.testtechnique.repository;

import com.velco.testtechnique.model.AbstractReference;
import com.velco.testtechnique.model.ErrorReference;
import com.velco.testtechnique.model.Reference;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

@Repository
public class TestTechniqueRepository {

    public ArrayList<AbstractReference> readAll() throws Exception{
        File file = new File("src/main/resources/static/reference_data.txt");
        Scanner sc = new Scanner(file);
        ArrayList<AbstractReference> references = new ArrayList<>();
        String line;
        int numLine = 0;


        while (sc.hasNextLine()){
            line = sc.nextLine();
            numLine++;
            references.add(this.createReference(line,numLine));
        }
        return references;
    }

    private AbstractReference createReference(String line, int numLine){
        String[] fields = line.split(";");
        if (fields.length==4){
            int numReference = Integer.parseInt(fields[0]);
            if (numReference > 0){
                float price = Float.parseFloat(fields[2]);
                if (price > 0){
                    int size = Integer.parseInt(fields[3]);
                    if (size > 0){
                        String type = fields[1];
                        if (type.equals("R") || type.equals("G") || type.equals("B")) {
                            Reference reference = new Reference(numReference, size, price, type);
                            return reference;
                        }else{
                            ErrorReference errorReference = new ErrorReference(numLine,"Incorrect value for color",line);
                            return errorReference;
                        }
                    }else {
                        ErrorReference errorReference = new ErrorReference(numLine,"Incorrect value for size",line);
                        return errorReference;
                    }
                }else {
                    ErrorReference errorReference = new ErrorReference(numLine,"Incorrect value for price",line);
                    return errorReference;
                }
            }else{
                ErrorReference errorReference = new ErrorReference(numLine,"Incorrect value for numReference",line);
                return errorReference;
            }
        }
        ErrorReference errorReference = new ErrorReference(numLine,"Incorrect data format",line);
        return errorReference;

    }

}
