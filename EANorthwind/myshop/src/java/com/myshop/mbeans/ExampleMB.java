package com.myshop.mbeans;

import com.myshop.sbeans.CalculatorLocal;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;


/**
 *
 * @author minhloan
 */
@Named(value = "exampleMB")
@SessionScoped
public class ExampleMB implements Serializable {

    @jakarta.ejb.EJB
    private CalculatorLocal calculator;
    private double p1;
    private double p2;
    private double result = 0.0;
   
    public ExampleMB() {
    }
    
    public String sum2num(){
        result = calculator.sum(p1, p2);
        return "calculator";
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
}
