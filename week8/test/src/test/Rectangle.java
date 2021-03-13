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
public class Rectangle extends Geometric {
    double height;
    double witdth;

    public Rectangle() {
    }

    public Rectangle(double height, double witdth) {
        this.height = height;
        this.witdth = witdth;
    }

    public Rectangle(double height, double witdth, String color, boolean isFilled) {
        super(color, isFilled);
        this.height = height;
        this.witdth = witdth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWitdth() {
        return witdth;
    }

    public void setWitdth(double witdth) {
        this.witdth = witdth;
    }
    
}
