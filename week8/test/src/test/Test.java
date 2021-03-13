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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(2.5);
        c1.setColor("Red");
        c1.setIsFilled(true);
        double areaC1 = c1.getArea();
        System.out.println(c1.getRadius() + c1.getColor());
        
        Rectangle r1 = new Rectangle(1, 2);
        
    }
    
}
