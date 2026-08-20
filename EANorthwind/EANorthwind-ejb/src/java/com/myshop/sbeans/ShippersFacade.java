package com.myshop.sbeans;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import com.myshop.ebeans.Shippers;

/**
 *
 * @author minhloan
 */
@Stateless
public class ShippersFacade extends AbstractFacade<Shippers> implements ShippersFacadeLocal {

    @PersistenceContext(unitName = "EANorthwind-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ShippersFacade() {
        super(Shippers.class);
    }

}
