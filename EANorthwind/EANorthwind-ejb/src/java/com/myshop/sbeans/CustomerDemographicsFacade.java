package com.myshop.sbeans;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import com.myshop.ebeans.CustomerDemographics;

/**
 *
 * @author minhloan
 */
@Stateless
public class CustomerDemographicsFacade extends AbstractFacade<CustomerDemographics> implements CustomerDemographicsFacadeLocal {

    @PersistenceContext(unitName = "EANorthwind-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerDemographicsFacade() {
        super(CustomerDemographics.class);
    }

}
