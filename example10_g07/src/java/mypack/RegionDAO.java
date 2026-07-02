/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mypack;

import java.util.List;

/**
 *
 * @author minhloan
 */
public interface RegionDAO {
    public List<Region> showAllRegion();
    public void insertRegion(Region r);
    public void editRegion(Region r);
    public void deleteRegion(int id);
    public List<Region> findRegionbyDes(String des);
    public Region findRegionbyID(int id);
}
