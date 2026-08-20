/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myshop.sbeans;

import jakarta.ejb.Local;
import java.util.List;
import com.myshop.ebeans.Territories;

/**
 *
 * @author minhloan
 */
@Local
public interface TerritoriesFacadeLocal {

    void create(Territories territories);

    void edit(Territories territories);

    void remove(Territories territories);

    Territories find(Object id);

    List<Territories> findAll();

    List<Territories> findRange(int[] range);

    int count();
    
}
