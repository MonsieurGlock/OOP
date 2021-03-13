/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Staff s1 = new Staff();
        Person p1 = new Person("cat", "kit125", "061", "sd@");
        Student St2 = new Student(1);
        
        System.out.println(p1.toString()+St2.toString());
        /*
        System.out.println("---Staff---");
        System.out.print("Enter Name : ");
        s1.setName(input.nextLine());
        //System.out.print(s1.getName());
        System.out.print("Enter address : ");
        s1.setAddress(input.nextLine());
        System.out.print("Enter phone number : ");
        s1.setPhoneNumber(input.nextLine());
        System.out.print("Enter email : ");
        s1.setEmailAddress(input.nextLine());
        System.out.print("Enter office : ");
        s1.setOffice(input.nextLine());
        System.out.print("Enter salary : ");
        s1.setSalary(input.nextLine());
        System.out.print("Enter title : ");
        s1.setTitle(input.nextLine());
        
        System.out.println("name="+s1.getName());
        System.out.println("address="+s1.getAddress());
        System.out.println("phone number="+s1.getPhoneNumber());
        System.out.println("email="+s1.getEmailAddress());
        System.out.println("office="+s1.getOffice());
        System.out.println("salary="+s1.getSalary());
        System.out.println("title="+s1.getTitle());
        
        Faculty f1 = new Faculty();
        System.out.println("---Faculty---");
        System.out.print("Enter Name : ");
        f1.setName(input.nextLine());
        System.out.print("Enter address : ");
        f1.setAddress(input.nextLine());
        System.out.print("Enter phone number : ");
        f1.setPhoneNumber(input.nextLine());
        System.out.print("Enter email : ");
        f1.setEmailAddress(input.nextLine());
        System.out.print("Enter office : ");
        f1.setOffice(input.nextLine());
        System.out.print("Enter salary : ");
        f1.setSalary(input.nextLine());
        System.out.print("Enter office hours : ");
        f1.setOfficeHour(input.nextLine());
        System.out.print("Enter rank : ");
        f1.setRank(input.nextLine());
        
        System.out.println("name="+f1.getName());
        System.out.println("address="+f1.getAddress());
        System.out.println("phone number="+f1.getPhoneNumber());
        System.out.println("email="+f1.getEmailAddress());
        System.out.println("office="+f1.getOffice());
        System.out.println("salary="+f1.getSalary());
        System.out.println("Office Hour="+f1.getOfficeHour());
        System.out.println("rank="+f1.getRank());
        
        Student st1 = new Student();
        System.out.println("---Stundet---");
        System.out.print("Enter Name : ");
        st1.setName(input.nextLine());
        System.out.print("Enter address : ");
        st1.setAddress(input.nextLine());
        System.out.print("Enter phone number : ");
        st1.setPhoneNumber(input.nextLine());
        System.out.print("Enter email : ");
        st1.setEmailAddress(input.nextLine());
        System.out.print("Enter status : ");
        st1.setStatus(input.nextInt());
        
        System.out.println("name="+st1.getName());
        System.out.println("address="+st1.getAddress());
        System.out.println("phone number="+st1.getPhoneNumber());
        System.out.println("email="+st1.getEmailAddress());
        System.out.println("status="+st1.getStatus());
        
        st1.toString();*/
    }
    
}
