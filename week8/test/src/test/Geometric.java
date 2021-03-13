/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author User
 */
public class Geometric {
    private String color;
    private boolean isFilled;
    public Geometric(){
        
    }
    public Geometric(String color , boolean isFilled) {
        
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    
}
