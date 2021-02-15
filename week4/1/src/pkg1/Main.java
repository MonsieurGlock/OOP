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
        Stock cat = new Stock("ORCL" , "Oracle Coperation" , 100 , 90);
        System.out.println("Symbol: " + cat.symbol);
        System.out.println("Name: " + cat.name);
        System.out.println("Previous: " + cat.previousClosingPrice);
        System.out.println("Current Price: " + cat.currentPrice);
        System.out.println("Price Change: " + cat.getChangePercent() + " %");
   
    }
    
}
