/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String test;
        Course c1 = new Course("OOP");
        c1.addStudent("Nut");
        c1.addStudent("Nutto");
        c1.addStudent("Nutty");
        c1.addStudent("chick");
        
        
        c1.dropStudent("Nut");
        c1.dropStudent("Nutto");
        
        //c1.clear();
        
        for(int i = 0 ; i < c1.getIndex(); i++){
            System.out.println(c1.getStudnets()[i]);
        }
    }
    
}
