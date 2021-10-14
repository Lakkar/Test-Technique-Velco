package com.velco.testtechnique.model;

import lombok.Data;

@Data
public class ErrorReference extends AbstractReference {

    private int line;

    private String message;

    private String value;

    public ErrorReference (int line, String message, String value){
        this.line = line;
        this.message = message;
        this.value = value;
    }

    /* Input: an AbstractReference Object
     * Output: an Integer
     * Purpose: This function compares this ErrorReference to another AbstractReferenceObject. If it's another errorReference,
     * compare them by line. Otherwise, return 1*/
    @Override
    public int compareTo(AbstractReference abstractReference) {
        if (abstractReference instanceof ErrorReference){
            return (this.line - ((ErrorReference) abstractReference).getLine());
        }else{
            return 1;
        }
    }
}
