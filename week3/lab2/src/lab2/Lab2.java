/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 : ");
        String s1 = input.nextLine();
        System.out.print("Enter list2 : ");
        String s2 = input.nextLine();
        /*for(int i = 0 ; i < list1.length ; i++){
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2 : ");
        for(int i = 0 ; i < list2.length ; i++){
            list2[i] = input.nextInt();
        } */
        
        String[] str1 = s1.split(" ");  
        String[] str2 = s2.split(" ");
        
        int[] list1 = new int[str1.length];
        int[] list2 = new int[str2.length];
        
        for(int i = 0; i < str1.length ; i++){
            list1[i] = Integer.parseInt(str1[i]);
        }
        for(int i = 0; i < str2.length ; i++){
            list2[i] = Integer.parseInt(str2[i]); 
        }

        int[] result = merge(list1 , list2);
        System.out.print("The merged list is ");
        for(int i = 0 ; i < result.length ; i++){
            System.out.print(result[i]+ " ");
        }
    }
    
    public static int[] merge(int[] list1, int[] list2){
        int[] order = new int[list1.length + list2.length];
        
        for(int i = 0; i < list1.length ; i++){
            order[i] = list1[i];
        }
        for(int i = 0; i < list2.length ; i++){
            order[i + list1.length] = list2[i];
        }
        for(int i = 0 ; i < order.length ; i++){
            for(int j = 0; j < order.length - i - 1; j++){
                if(order[j] > order[j+1]){
                    int temp = order[j];
                    order[j] = order[j+1];
                    order[j+1] = temp;
                }
            }
        }
        return order;
    }
    
}
