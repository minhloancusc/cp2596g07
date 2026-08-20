package com.myshop.mbeans;

import com.myshop.ebeans.Shippers;
import com.myshop.sbeans.ShippersFacadeLocal;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.List;

@Named(value = "shippersMB")
@RequestScoped
public class ShippersMB {

    @jakarta.ejb.EJB
    private ShippersFacadeLocal shippersFacade;

    private Shippers shiper = new Shippers();

    public ShippersMB() {
    }

    public String editShipper(Integer id) {
        shiper = shippersFacade.find(id);
        return "shipper";
    }

    public String deleteShipper(Integer id) {
        shippersFacade.remove(shippersFacade.find(id));
        return "shipper";
    }

    public String saveShipper() {
        if (shiper.getShipperID()==null) {
            shippersFacade.create(shiper);
        } else {
            shippersFacade.edit(shiper);
        }
        return "shipper";
    }

    public List<Shippers> showAllShippers() {
        return shippersFacade.findAll();
    }

    public Shippers getShiper() {
        return shiper;
    }

    public void setShiper(Shippers shiper) {
        this.shiper = shiper;
    }

}
