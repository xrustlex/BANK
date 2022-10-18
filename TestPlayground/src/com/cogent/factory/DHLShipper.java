
package com.cogent.factory;

public class DHLShipper extends ShipperFactory {

    private final String name = "DHL";

    @Override
    public void ship() {
        
        System.out.println("SHIPPING WITH " + this.name);
        
    }
    
}
