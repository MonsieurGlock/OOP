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
public class Staff extends Employee{
    private String title;

    public Staff() {
    }

    public Staff(String title, String office, String salary) {
        super(office, salary);
        this.title = title;
    }

    public Staff(String title, String office, String salary, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" + "title=" + title + '}';
    }
    

    
    
    
}
