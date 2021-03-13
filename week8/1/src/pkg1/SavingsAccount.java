/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author User
 */
public class SavingsAccount extends Account{
    private boolean isSaving;
    
    public SavingsAccount(boolean isSaving) {
        this.isSaving = isSaving;
    }

    public SavingsAccount(boolean isSaving, int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        this.isSaving = isSaving;
    }
    public void withdraw (double money){
        if(money <= balance){
            balance -= money;
            System.out.println(balance);
        }
        else {
            System.out.println("You can't withdraw");
        }
    }
    
    
}
