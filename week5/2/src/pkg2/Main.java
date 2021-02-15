/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(4 , 4);
        RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Perimeter : " + r1.getPerimeter());
        System.out.println("Area : " + r1.getArea());
        System.out.println("Perimeter : " + r2.getPerimeter());
        System.out.println("Area : " + r2.getArea());
        System.out.println("Perimeter : " + r3.getPerimeter());
        System.out.println("Area : " + r3.getArea());
    }
    
}
