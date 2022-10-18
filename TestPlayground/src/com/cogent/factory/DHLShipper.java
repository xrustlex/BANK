
package com.cogent.factory;

public class DHLShipper implements Shipable {

    private final String name = "DHL";

    @Override
    public void ship() {
        
        System.out.println("SHIPPING WITH DHL");
    }
    
}
