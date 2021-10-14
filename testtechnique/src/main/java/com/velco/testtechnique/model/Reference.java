package com.velco.testtechnique.model;

import lombok.Data;

@Data
public class Reference extends AbstractReference {

    private int numReference;

    private int size;

    private float price;

    private String color;

    public Reference(int numReference, int size, float price, String color){
        this.numReference = numReference;
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
