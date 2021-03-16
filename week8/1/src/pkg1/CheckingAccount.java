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
public class CheckingAccount extends Account{
    private double overDraftLimit;

    public CheckingAccount(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public CheckingAccount(double overDraftLimit, int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    @Override
    public void withdraw(double money) {
        if(getBalance() + overDraftLimit >= money){
            setBalance(getBalance()-money);
        }
        else {
            System.out.println("You can't withdraw");
        }
        
            
    }

    @Override
    public String toString() {
        return "CheckingAccount{"+ "ID : " + getId() + "overDraftLimit :" + overDraftLimit +'}';
    }
    
    
    
}
