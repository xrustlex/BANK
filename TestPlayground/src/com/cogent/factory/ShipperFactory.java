
package com.cogent.factory;

public class ShipperFactory implements ShippingService {

    private String name = "SHIPPER";

    @Override
    public void ship() {

        System.out.println("SHIPPING WITH " + this.name);  

    }

}
