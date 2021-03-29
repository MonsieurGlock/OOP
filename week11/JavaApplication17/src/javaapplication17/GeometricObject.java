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
public abstract class GeometricObject implements Comparable,Cloneable{
    private String  color;
    private boolean filled;
    private String name;

    protected GeometricObject() {
    }

    protected GeometricObject(String color, String name) {
        this.color = color;
        this.name = name;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean getFilled(){
        return filled;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void isFilled(){
        if(color == ""){
            filled = false;
        }
        else{
            filled = true;
        }
    }

    public String getName() {
        return name;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    /*public static String max(GeometricObject a,GeometricObject b){
        if(a.compareTo(b) == 1){
            return a.getName();
        }
        else if(a.compareTo(b) == 0){
            return b.getName();
        }
        else {
            return "EQUAL";
        }
    }*/
    public static String max(GeometricObject a,GeometricObject b){
        if(a.getArea() > b.getArea()){
            return a.getName();
        }else if(a.getArea() < b.getArea()){
            return b.getName();
        }
        else {
            return "EQUAL";
        }
    }
}
