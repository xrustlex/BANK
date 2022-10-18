
package com.cogent.factory;

public class UPSShipper extends ShipperFactory {
    
    private final String name = "UPS";

    @Override
    public void ship() {
        
        System.out.println("SHIPPING WITH " + this.name);
        
    }
    
}
