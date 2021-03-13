/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

/**
 *
 * @author User
 */
public class Student extends Person{
    private int status;
    private String sta;
    final int FRESHMAN = 1;
    final int SOPHOMORE = 2;
    final int JUNIOR = 3;
    final int SENIOR = 4;
    public Student(int status) {
        this.status = status;
    }

    public Student(String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch(status){
            case 1 : return "FRESHMAN";
            case 2 : return "SOPHOMORE";
            case 3 : return "JUNIOR";
            case 4 : return "SENIOR";
            default: return "non";
        }
        
    }

    @Override
    public String toString() {
        return "Student{" + "status=" + getStatus() +'}';
    }

    
    
    
    
    
    
}
