package com.adessoam.taco_cloud;

import com.adessoam.taco_cloud.Taco;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
/*A domain object for taco orders (Bestellunginformation)
 */

@Data
public class TacoOrder {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();
    public void addTacoToList (Taco taco){
        this.tacos.add(taco);
    }
}
