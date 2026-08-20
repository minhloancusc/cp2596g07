package com.myshop.sbeans;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import com.myshop.ebeans.Suppliers;

/**
 *
 * @author minhloan
 */
@Stateless
public class SuppliersFacade extends AbstractFacade<Suppliers> implements SuppliersFacadeLocal {

    @PersistenceContext(unitName = "EANorthwind-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SuppliersFacade() {
        super(Suppliers.class);
    }

}
