/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friend;

/**
 *
 * @author admin
 */
public class Friend {
    private int count = 0;
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        int cout = 0;
        while (cout<99999) {
            palin(cout);
            

            cout++;
            
            
        }
        
    }
    public static void palin(int num)
    {
        int posfront = num;
        int posback = 0;
        int temp = 0;
        while (num != 0) {
            temp = num % 10;
            //System.out.println(temp);
            posback = posback * 10 + temp;
            //System.out.println(posback);
            num /= 10;
            //System.out.println(num);
        }
        if (posfront == posback) {
            prime(posfront);
        }
    }

    public static void prime(int num) {
        int i;
        boolean check = false;
        
        for (i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                check = true;
                break;
            }
        }
        
        if (num >= 2 && check == false)
        {
            count += 1;
            System.out.print(num +" ");
            if(count % 10 == 0){
                System.out.println();
            }
        }
    }
}
    

