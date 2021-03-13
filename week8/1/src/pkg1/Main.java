package pkg1;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account a1 = new Account(1122 , 20000 , 4.5);
        System.out.println("ID : " + a1.getId());
        System.out.println("Balance : " + a1.getBalance());
        System.out.println("Annual InterestRate : "+a1.getAnnualInterestRate());
        System.out.println("Monthly Interest rate : " + a1.getMonthlyInterestRate());
        System.out.println("Date Created : " + a1.getDateCreated());
        int menu = 0;
        do{
            System.out.println("-----------------");
            System.out.println("Menu");
            System.out.println("1 for checking balance");
            System.out.println("2 for withdrawing");
            System.out.println("3 for depositing");
            System.out.println("4 for Exis");
            System.out.print("Select : ");
            menu = input.nextInt();
            System.out.println("-----------------");

            if(menu == 1){
                System.out.println(a1.getBalance());  
            }
            else if(menu == 2){
                System.out.print("Withdraw : ");
                double money = input.nextDouble();
                a1.withdraw(money);
                System.out.println("Monthly Interset : " + a1.getMonthlyInterset());
            }
            else if(menu == 3){
                System.out.print("Deposit : ");
                double money = input.nextDouble();
                a1.deposit(money);
                System.out.println("Monthly Interset : " + a1.getMonthlyInterset());
            }
            
            
        }while (menu != 4);
        
    }
    
}