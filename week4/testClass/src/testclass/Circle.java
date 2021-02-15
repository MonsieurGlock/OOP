/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass;

/**
 *
 * @author admin
 */
public class Circle {
    double radius;
    Circle(){
       
    }
    Circle(double newR){
       radius = newR;
    }
    double getArea(double radius){
        return radius*radius*3.14;
    }
}
