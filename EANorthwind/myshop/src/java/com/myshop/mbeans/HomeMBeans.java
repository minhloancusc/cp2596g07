/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.myshop.mbeans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

/**
 *
 * @author minhloan
 */
@Named(value = "homeMBeans")
@SessionScoped
public class HomeMBeans implements Serializable {

    /**
     * Creates a new instance of HomeMBeans
     */
    public HomeMBeans() {
    }
    
}
