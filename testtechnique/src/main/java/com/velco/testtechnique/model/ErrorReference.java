package com.velco.testtechnique.model;

import lombok.Data;

@Data
public class ErrorReference {

    private int line;

    private String message;

    private String value;

    public ErrorReference (int line, String message, String value){
        this.line = line;
        this.message = message;
        this.value = value;
    }
}
