
package com.cogent.factory;

public class UPSShipper implements Shipable {
    
    private final String name = "UPS";

    @Override
    public void ship() {
        
        System.out.println("SHIPPING WITH " + this.name);
        
    }
    
}
