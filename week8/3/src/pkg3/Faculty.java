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
public class Faculty extends Employee {
    private String officeHour;
    private String rank;

    public Faculty() {
    }

    public Faculty(String officeHour, String rank, String office, String salary) {
        super(office, salary);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public Faculty(String officeHour, String rank, String office, String salary, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, name, address, phoneNumber, emailAddress);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" + "officeHour=" + officeHour + ", rank=" + rank + '}';
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
}
