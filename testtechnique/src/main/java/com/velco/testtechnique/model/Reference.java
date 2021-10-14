package com.velco.testtechnique.model;

import lombok.Data;

@Data
public class Reference extends AbstractReference{

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

    /* Input: an AbstractReference Object
     * Output: an Integer
     * Purpose: This function compares this Reference to another AbstractReferenceObject. If it's another reference, compare them by size
     * otherwise, return -1*/
    @Override
    public int compareTo(AbstractReference abstractReference) {
        if (abstractReference instanceof Reference){
            return (this.size - ((Reference) abstractReference).getSize());
        }else{
            return -1;
        }
        }

}
