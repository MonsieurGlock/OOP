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
public class Transaction {

    //private Date  dateCreated = new Date(); 
    private Date  dateCreated;
    private char type;
    private double amount;
    private double balance;
    public Transaction() {
    }
    

    /*public void transactions (Date day , char type , double amount , double balance){
        s.add(day + "\t" + type+ "\t" + amount+ "\t" + balance);
    }
    public int size (){
        return s.size();
    }
    public String getTrans(int i) {
        return s.get(i);
    }*/

    public Transaction(char type, double amount, double balance) {
        dateCreated = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    
}
