package com.adessoam.taco_cloud;

import com.adessoam.taco_cloud.Ingredient;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/* A domain object defining a taco design
*/

@Data
public class Taco {

    @NotNull
    @Size(min=7, message = "Name must be at least 5 characters")
    private String name;
    @NotNull
    @Size(min=7, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

}
