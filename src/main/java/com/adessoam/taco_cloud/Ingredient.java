package com.adessoam.taco_cloud;

import lombok.Data;
/* Defining taco ingredients (Zutaten)
 */
@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
