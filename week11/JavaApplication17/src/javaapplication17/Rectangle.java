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
public class Rectangle extends GeometricObject implements Cloneable{
    private double x;
    private double y;

    public Rectangle() {
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x, double y, String color, String name) {
        super(color, name);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public double getArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return x*y;
    }

    @Override
    public double getPerimeter() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (x+y)*2;
    }
    @Override
    public int compareTo(GeometricObject y) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(getArea() > y.getArea()){
            return 1;
        }else if(getArea() < y.getArea()){
            return 0;
        }else{
            return -1;
        }
    }
    
    public boolean equals(Rectangle obj) {
        if(getArea() == obj.getArea()){
            return true;
        }else{
            return false;
        }
            //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle)super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
