package com.myshop.mbeans;

import com.myshop.ebeans.Region;
import com.myshop.sbeans.RegionFacadeLocal;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author minhloan
 */
@Named(value = "regionMB")
@SessionScoped
public class RegionMB implements Serializable {

    @jakarta.ejb.EJB
    private RegionFacadeLocal regionFacade;

    
    public RegionMB() {
    }
    
    public List<Region> showAllRegion(){
        return regionFacade.findAll();
    }
}
