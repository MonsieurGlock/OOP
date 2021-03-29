/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author User
 */
public class Circle extends GeometricObject implements Cloneable{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String name) {
        super(color, name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public int compareTo(GeometricObject y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle)super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public boolean equals(Circle obj) {
        if(getArea() == obj.getArea()){
            return true;
        }else{
            return false;
        }
            //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
