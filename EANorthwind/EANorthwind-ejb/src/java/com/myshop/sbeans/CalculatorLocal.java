/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/SessionLocal.java to edit this template
 */
package com.myshop.sbeans;

import jakarta.ejb.Local;

/**
 *
 * @author minhloan
 */
@Local
public interface CalculatorLocal {

    double sum(double a, double b);
    
}
