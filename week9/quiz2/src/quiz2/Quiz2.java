/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matrixSize = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Input size : ");
        matrixSize = input.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        for(int i = 0 ; i < matrixSize ; i++){
            for(int j = 0 ; j < matrixSize ; j++){
                matrix[i][j] = (int)(Math.random()*2);
            }
        }
        for(int i = 0 ; i < matrixSize ; i++){
            for(int j = 0 ; j < matrixSize ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        //cout row
        int[] temp1 = new int[matrixSize];
        for(int i = 0 ; i < matrixSize ; i++){
            for(int j = 0 ; j < matrixSize ; j++){
                if(matrix[i][j] == 1){
                    temp1[i]++;
                }
            }
        }
        
        
        int min = matrixSize;
        for(int i = 0 ; i < matrixSize ; i++){
            if(min > temp1[i]){
                min = temp1[i];
            }
        }
        //check qual
        int aTemp = 0; 
        System.out.print("Row with the least found 1 : ");
        for(int i = 0 ; i < matrixSize ; i++){
            if(min == temp1[i]){
                aTemp++;
            }
        }
        if(aTemp > 1){
            System.out.println("NO");
        }
        for(int i = 0 ; i < matrixSize && aTemp == 1 ; i++){
            if(min == temp1[i]){
                System.out.println("YES, "+(i+1));
            }    
        }
        
        //#########################################################
        
        int[] temp2 = new int[matrixSize];
        for(int i = 0 ; i < matrixSize ; i++){
            for(int j = 0 ; j < matrixSize ; j++){
                if(matrix[j][i] == 0){
                    temp2[i]++;
                }
            }
        }
        min = matrixSize;
        for(int i = 0 ; i < matrixSize ; i++){
            if(min > temp2[i]){
                min = temp2[i];
            }
        }
        int bTemp = 0; 
        System.out.print("Column with the least found 0 : ");
        for(int i = 0 ; i < matrixSize ; i++){
            if(min == temp2[i]){
                bTemp++;
            }
        }
        if(bTemp > 1){
            System.out.println("NO");
        }
        for(int i = 0 ; i < matrixSize && bTemp == 1 ; i++){
            if(min == temp2[i]){
                System.out.println("YES, "+(i+1));
            }    
        }
    }
    
}
