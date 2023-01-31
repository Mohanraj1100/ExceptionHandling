package exceptionbank;

import java.util.Scanner;
import java.util.logging.*;
import java.util.InputMismatchException;

public class BankAccount{
    String holdername;
    long accno;
    double balance = 0;
    boolean a = true;
    int x;
    Scanner sc = new Scanner(System.in);
    Scanner si = new Scanner(System.in);
    Logger log=Logger.getLogger("hi");

    BankAccount() // constructor for creation
    {
        try{
            log.info("Enter your Account Holder Name");
            holdername = sc.nextLine();
            log.info("Enter your Account Number ");
            accno = sc.next();
        }
        catch(InputMismatchException e)
        {
            log.info(String.valueOf(e));
            System.exit(0);
        }
    }

    void operation() {
        while (a) {
            log.info("Enter your choice\n1.Deposit\n2.Withdraw\n3.balance\n4.Exit");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    deposit();
                    break;

                case 2:
                    withDraw();
                    break;

                case 3:
                    balanceAmt();
                    break;

                case 4:
                    a = false;
                    break;

                default:
                    log.info("Enter the correct choice");

            }
        }
    }

    public static void main(String[] args) {
        BankAccount in = new BankAccount();

        in.operation();

    }

    void deposit() {
        try{       
        log.info("Enter deposit Amount");
        double amount = si.nextDouble();
        balance = balance + amount;
        }
        catch(InputMismatchException e)
        {
            log.info(String.valueOf(e));
            System.exit(0);
        }
        
    }

    void withDraw() {
        try{
        log.info("Enter Withdraw Amount");
        double withdrawamt = si.nextDouble();
        if (withdrawamt > balance) {
            log.info("Thers is no required amount");
        } else {
            balance = balance - withdrawamt;
        }
        }
        catch(InputMismatchException e)
        {
            log.info(String.valueOf(e));
            System.exit(0);
        }
        
    }

    void balanceAmt() {
        log.info("Balance is" + Balance);
    }
}
