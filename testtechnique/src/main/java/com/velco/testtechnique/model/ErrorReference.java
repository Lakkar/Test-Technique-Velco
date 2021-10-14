package com.velco.testtechnique.model;

import lombok.Data;

@Data
public class ErrorReference extends AbstractReference implements Comparable<AbstractReference>{

    private int line;

    private String message;

    private String value;

    public ErrorReference (int line, String message, String value){
        this.line = line;
        this.message = message;
        this.value = value;
    }

    @Override
    public int compareTo(AbstractReference abstractReference) {
        if (abstractReference instanceof ErrorReference){
            return (this.line - ((ErrorReference) abstractReference).getLine());
        }else{
            return 1;
        }
    }
}
