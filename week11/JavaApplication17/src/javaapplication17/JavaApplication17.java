/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException{
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        //System.out.println("Menu (1=Circle, 2=Rectangle, 3=Triangle, 4=Exit) : ");
        Circle c1 = new Circle(7 , "red" , "c1");
        Circle c2 = new Circle(9 , "yellow" , "c2");
        System.out.println("Circle c1 : "+c1.getRadius()+ " "+c1.getColor());
        System.out.println("Circle c2 : "+c2.getRadius()+ " "+c2.getColor());
        System.out.println("Find the larger object using max method : c1 c2 : " + GeometricObject.max(c1 , c2));
        //System.out.println(GeometricObject.max(c1 , c2));
        Circle c3 = (Circle)c2.clone();
        c3.setName("c3");
        System.out.println("c2==c3 : "+(c2==c3));
        System.out.println("Clone...");
        System.out.println("c2.equals(c3) : "+c2.equals(c3));
        System.out.println("Find the larger of 2 instances of comparable objects : c1 c3 : "+GeometricObject.max(c1 , c3));
        System.out.println("-------------");
        Rectangle r1 = new Rectangle(5 , 3 , "blue" , "r1");
        Rectangle r2 = new Rectangle(3 , 5 , "black" , "r2");
        Rectangle r3 = new Rectangle();
        System.out.println("Rectangle r1 : " + r1.getX() + " "+r1.getY() + " "+r1.getColor());
        System.out.println("Rectangle r2 : " + r2.getX() + " "+r2.getY() + " "+r2.getColor());
        System.out.println("Find the larger object using max method : r1 r2 : " + GeometricObject.max(r1, r2));
        System.out.println("r2==r3 :"+(r2==r3));
        System.out.println("Clone...");
        r3 = (Rectangle)r2.clone();
        System.out.println("r2.equals(r3) :"+r2.equals(r3));
        System.out.println("Find the larger object using max method : r1 r2 : " + GeometricObject.max(r1 , r3));
    }
    
}
