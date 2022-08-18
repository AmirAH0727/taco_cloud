package com.adessoam.taco_cloud;

import com.adessoam.taco_cloud.Ingredient;
import lombok.Data;
import java.util.List;

/* A domain object defining a taco design
*/

@Data
public class Taco {

    private String name;
    private List<Ingredient> ingredients;

}
