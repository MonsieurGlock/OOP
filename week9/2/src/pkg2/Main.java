/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ArrayList<String> cat = new ArrayList<String>();
        cat.add("63011" + "Jimmy");
        cat.add("63018" + "my");
        System.out.println(cat.get(0));*/
        Account a1 = new Account("Jimmy",6631, 5000, 1.65);
        System.out.println("Name : "+a1.getName());
        System.out.println("Account ID : "+a1.getId());
        System.out.println("Annual interest rate : "+a1.getAnnualInterestRate());
        a1.withdraw(500);
        a1.withdraw(600);
        a1.deposit(50);
        System.out.println("Date \t\t\t\t Type \t Amount \t Balance");
        for(int i = 0 ; i < a1.getTranss().size() ; i++){
            System.out.println(a1.getTranss().get(i).getDateCreated() + "\t" + a1.getTranss().get(i).getType() + "\t" +
                a1.getTranss().get(i).getAmount() + "\t" + a1.getTranss().get(i).getBalance());
        }
        
        
    }
    
}
