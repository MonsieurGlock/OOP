/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
import java.lang.Math; 
/**
 *
 * @author admin
 */
public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x;
    private double y;
    RegularPolygon(){
    }
    RegularPolygon(int n , double side){
        this.n = n;
        this.side = side;
    }
    RegularPolygon(int n , double side , double x , double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPerimeter(){
        return n * side;
    }
    
    public double getArea(){
        return ((double)n * side * side)/(4 * Math.tan(Math.PI / (double)n));
    }
}
