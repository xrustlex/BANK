
package com.cogent.factory;

public class Main {

    public static void main(String[] args) {

        ShippingService upsShipper = new UPSShipper();
        ShippingService dhlSshipper = new DHLShipper();
        ShippingService shipper = new ShipperFactory();
        
        shipper.ship();
        upsShipper.ship();
        dhlSshipper.ship();
        
    }

}
