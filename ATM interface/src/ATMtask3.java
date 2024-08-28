
import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class ATMtask3 {
private double balance;


    public ATMtask3(double initialBalance) {
        this.balance =initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposite( double amount ){
        if (amount>0 ){
            balance += amount;
            System.out.println("deposite of $ " + amount + "successfull.current balance : $" + balance);
        }
        else {
            System.out.println("Invalid deposite amount.");
        }
        }
     public void withdraw ( double amount) {
        if (amount > 0 && amount<=balance ){
            balance -= amount;
            System.out.println("withdraw of $" + amount + " successful.Current balance: $" + balance );
        }
        else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }
}
  class ATM {
    private ATMtask3 bankAccount;
    public ATM(ATMtask3 bankAccount){
        this.bankAccount = bankAccount;
    }
    public void displayMenu(){
        System.out.println("ATM Menu ");
        System.out.println("1. Check Balance ");
        System.out.println("2. Deposite ");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit ");
    }
    public void performTransaction (int choice,Scanner scanner){
        switch (choice){
            case 1:
            System.out.println("current balance : $ "+ bankAccount.getBalance());
            break;
            case 2:
            System.out.println("Enter deposite amount : $ ");
            double depositeAmount = scanner.nextDouble();
            bankAccount.deposite(depositeAmount);
            break;
            case 3:
            System.out.println("Enter withdraw  amount : $ ");
            double withdrawAmount = scanner.nextDouble();
            bankAccount.withdraw(withdrawAmount);
            break;
            case 4:
            System.out.println("Exiting ATM. Thank you ! ");
            scanner.close();
            System.exit(0);
            default:

           System.out.println("Invalid choice.please select a valid option. ");
        }
    }
}

class ATM_Interface {
    public static void main ( String [] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial account balance : $");
        double initialBalance =scanner.nextDouble();
        ATMtask3 bankAccount = new ATMtask3(initialBalance);

        ATM atm = new ATM (bankAccount);
        while (true){
            atm.displayMenu();
            System.out.println("select an option: ");
            int choice = scanner.nextInt();

            atm.performTransaction(choice, scanner);
        }
    }
}
        

    

        
  

     
  
        
        



    
   
   
    

