
package com.cogent.factory;

public class Main {

    public static void main(String[] args) {

        Shipable upsShipper = new UPSShipper();
        Shipable dhlSshipper = new DHLShipper();
        Shipable shipper = new ShipperFactory();
        
        shipper.ship();
        upsShipper.ship();
        dhlSshipper.ship();
    }

}
