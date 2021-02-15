/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
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
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to BMI calculator");
        System.out.println("Enter name : ");
        String name = input.nextLine();
        System.out.println("Enter age : ");
        int age = input.nextInt();
        System.out.println("Enter weight : ");
        double weight = input.nextDouble();
        System.out.println("Enter feet : ");
        double feet = input.nextDouble();
        System.out.println("Enter inches : ");
        double inches = input.nextDouble();
        BMI p1 = new BMI(name , age , weight , feet , inches);
        
        System.out.println("Your BMI is : " + p1.cal());
        inter(p1.cal());
        
    }
    
    public static void inter(double bmi){
        if(bmi > 30.0){
            System.out.println("Obese");
        }
        else if(bmi > 25.0 && bmi < 30.0){
            System.out.println("Overweight");
        }
        else if(bmi > 18.5 && bmi < 25.0){
            System.out.println("Normal");
        }
        else if(bmi < 18.5){
            System.out.println("Underweight");
        }
    }
    
}
