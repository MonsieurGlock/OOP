/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author admin
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        int num = 2;

        while (true) {
            if (isPrime(num) == true) {
                if(palin(num) == true){
                    System.out.print(num + " ");
                    count += 1;
                    if(count % 10 == 0){
                        System.out.println();
                    }
                }
            }
            if (count == 100) {
                break;
            }
            num += 1;
        }

    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
            /*if(i + 1 == num){
                return true;
            }*/
        }
        return true;
    }

    public static boolean palin(int n) {
        //int n, reversedN = 0, remainder, originalN;
        int rever = 0;
        int temp = 0;
        int old = n;

        while (n != 0) {
            temp = n % 10;
            rever = rever * 10 + temp;
            n /= 10;
        }
        if (old == rever) {
            return true;
        } else {
            return false;
        }
    }

}
