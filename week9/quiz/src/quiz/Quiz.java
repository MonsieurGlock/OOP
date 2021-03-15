/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.util.Scanner;
        
/**
 *
 * @author User
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] numberForCompare = {{1,2,3,4,5,6,7,8,9},{0,0,0,0,0,0,0,0,0}};
        
        int[] numberInput = new int[5];
        System.out.println("Select : ");
        for(int i = 0 ; i < 5 ; i++){
            numberInput[i] = input.nextInt();            
        }
        System.out.println("Numbers not in the list are : ");
        
        /*for(int i = 0 ; i < 5 ; i++){
            boolean temp= false;
            for(int j = 0 ; j < 10 ; j++){
                if(numberForCompare[j] == numberInput[i]){
                    temp = true;
                    break;
                }
                else {
                    temp = false;
                }
            }
            if(temp == false){
                System.out.print(numberInput[i]);
            }
            
        }*/
        for(int i = 0 ; i < 9 ; i++){
            boolean temp= false;
            for(int j = 0 ; j < 5 ; j++){
                if(numberForCompare[0][i] == numberInput[j]){
                    numberForCompare[1][i] = 1;
                    break;
                }
                
            }
        }
        for(int i = 0 ; i < 9 ; i++){
            if(numberForCompare[1][i] == 0){
                System.out.print(numberForCompare[0][i]+" ");
            }
        }
        
    }
    
}
