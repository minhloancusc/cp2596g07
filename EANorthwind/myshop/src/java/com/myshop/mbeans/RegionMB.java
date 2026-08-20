package com.myshop.mbeans;

import com.myshop.ebeans.Region;
import com.myshop.sbeans.RegionFacadeLocal;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author minhloan
 */
@Named(value = "regionMB")
@RequestScoped
public class RegionMB implements Serializable {

    @jakarta.ejb.EJB
    private RegionFacadeLocal regionFacade;

    private Region region = new Region();
    
    public RegionMB() {
    }
    
    public String editRegion(Integer id){
        region = regionFacade.find(id);
        return "region";
    }
    
    public String deleteRegion(Integer id){
        regionFacade.remove(regionFacade.find(id));
        return "region";
    }
    
    public String saveRegion(){
        if(regionFacade.find(region.getRegionID())==null){
            regionFacade.create(region);            
        }else{
            regionFacade.edit(region);            
        }
        
        return "region";
    }
    
    public List<Region> showAllRegion(){
        return regionFacade.findAll();
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
    
    
}
