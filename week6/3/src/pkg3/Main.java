/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;
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
        Queue q1 = new Queue();
        int k = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("1 :  enqueue");
            System.out.println("2 :  dequeue");
            System.out.println("3 :  empty");
            System.out.println("4 :  size");
            System.out.println("5 :  show queue");
            System.out.println("6 :  exis");
            k = input.nextInt();
            if(k == 1){
                System.out.print(" : ");
                int h = input.nextInt();
                if(h >= 1 && h <=20){
                    q1.enqueue(h);
                }
            }
            else if(k == 2){
                q1.dequeue();
            }
            else if(k == 3){
                q1.empty();
            }
            else if(k == 4){
                System.out.println("-----------");
                System.out.println(q1.getSize());
                System.out.println("-----------");
            }
            else if(k == 5){
                System.out.println("-----------");
                for(int i = 0 ; i < q1.size ; i++){
                    System.out.println(q1.elements[i]);
                }
                System.out.println("-----------");
            }
            
        }while(k != 6);
        
       
    }
    
}
