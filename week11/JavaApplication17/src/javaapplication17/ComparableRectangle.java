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
public class ComparableRectangle extends Rectangle implements Comparable{

    public ComparableRectangle() {
    }

    public ComparableRectangle(double x, double y) {
        super(x, y);
    }

    public ComparableRectangle(double x, double y, String color, String name) {
        super(x, y, color, name);
    }
    
    @Override
    public int compareTo(GeometricObject y){
        if(getArea() > y.getArea()){
            return 1;
        }else if(getArea() < y.getArea()){
            return 0;
        }else{
            return -1;
        }
    }
}
