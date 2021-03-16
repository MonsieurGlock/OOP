package pkg1;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date  dateCreated = new Date();
    Account(){
        
    }
    Account(int id , double balance , double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12; 
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
    public void deposit (double money){
        balance += money;
        System.out.println(balance);
    }
    
    public double getMonthlyInterset (){
        return balance * (annualInterestRate/12)/100;
        
    }
    
    
}