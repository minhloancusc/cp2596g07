/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myshop.sbeans;

import jakarta.ejb.Local;
import java.util.List;
import com.myshop.ebeans.Shippers;

/**
 *
 * @author minhloan
 */
@Local
public interface ShippersFacadeLocal {

    void create(Shippers shippers);

    void edit(Shippers shippers);

    void remove(Shippers shippers);

    Shippers find(Object id);

    List<Shippers> findAll();

    List<Shippers> findRange(int[] range);

    int count();
    
}
