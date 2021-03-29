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
public class ComparableCircle extends Circle implements Comparable{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, String name) {
        super(radius, color, name);
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

    

    

    
}
