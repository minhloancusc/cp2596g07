package mypack;

/**
 *
 * @author minhloan
 */
public class Region {
    private int regionID;
    private String regionDescription;
        
    public Region() {
        this.regionID = 0;
        this.regionDescription = null;
    }

    public Region(int regionID, String regionDescription) {
        this.regionID = regionID;
        this.regionDescription = regionDescription;
    }
        
    public int getRegionID() {
        return regionID;
    }

    public void setRegionID(int regionID) {
        this.regionID = regionID;
    }

    public String getRegionDescription() {
        return regionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        this.regionDescription = regionDescription;
    }        
}
