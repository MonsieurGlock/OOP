/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;
import java.util.GregorianCalendar;
/**
 *
 * @author User
 */
public class Employee extends Person {
    private String office;
    private String salary;
    private GregorianCalendar dateHire = new GregorianCalendar();
    
    public void setDateHire(int x , int y ,int z) {
        dateHire = new GregorianCalendar(x, y, z);
        System.out.println(dateHire);
    }

    public Employee() {
    }

    public void getDateHire() {
        System.out.println(dateHire.getTime());
    }
    
    public Employee(String office, String salary) {
        this.office = office;
        this.salary = salary;
    }

    public Employee(String office, String salary, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "office=" + office + ", salary=" + salary + ", dateHire=" + dateHire + '}';
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    
}
