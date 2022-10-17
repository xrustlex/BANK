/**
 * 
 */
package com.cogent.factory;

/**
 * @author dick
 *
 *         17 окт. 2022 г.
 */
public class ShipperFactory implements Shipable {

    private ShipperFactory shipper = null;;

    public ShipperFactory(String shipper) {

        if (shipper == "UPS")
            shipper = new UPSShipper();

        if (shipper == "DHL")
            shipper = new DHLShipper();

    }

    ShipperFactory getShipperFactory(String shipper) {

        if (shipper == "UPS")
            shipper = new UPSShipper();

        if (shipper == "DHL")
            shipper = new DHLShipper();
        return shipper;
    }

    @Override
    public void ship(String s) {
        // TODO Auto-generated method stub

    }

}
