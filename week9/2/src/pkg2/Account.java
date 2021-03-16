/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    //private Date  dateCreated = new Date();
    Transaction trans = new Transaction();
    private ArrayList<Transaction> transs = new ArrayList<Transaction>();
    Account(){
        
    }
    Account(String name,int id , double balance , double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*public Date getDateCreated() {
        return dateCreated;
    }*/

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
            //System.out.println(balance);
            transs.add(new Transaction('w' , money, balance));
            //transactions(new Date(), 'w' , money, balance);
        }
        else {
            System.out.println("You can't withdraw");
        }   
    }
    public void deposit (double money){
        balance += money;
        //System.out.println(balance);
        //transactions(new Date(), 'd' , money, balance);
        transs.add(new Transaction('d' , money, balance));
    }
    
    public double getMonthlyInterset (){
        return balance * (annualInterestRate/12)/100;
        
    }
    
    /*public void transactions (Date day , char type , double amount , double balance){
        trans.add(day + "\t" + type+ "\t" + amount+ "\t" + balance);
    }*/

    public Transaction getTrans() {
        return trans;
    }

    public ArrayList<Transaction> getTranss() {
        return transs;
    }
   
    
}
