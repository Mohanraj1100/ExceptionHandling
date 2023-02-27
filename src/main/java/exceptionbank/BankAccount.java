package exceptionbank;

import java.util.Scanner;
import java.util.logging.*;
import java.util.InputMismatchException;


public class BankAccount{
    public static void main(String[] args) {
    	String holdername = null;
        long accno = 0;
        int choice;
        Scanner inputobj = new Scanner(System.in);
        Logger log=Logger.getLogger("hi");
        try {
        	log.info("Enter the Account Holder Name");
        	holdername = inputobj.next();
        	log.info("Enter the Account Number");
        	accno = inputobj.nextLong();
        }
        catch(InputMismatchException e)
        {
        	log.info(String.valueOf(e));
        	System.exit(0);
        }
        BankOperation bo = new BankOperation(holdername,accno);
        boolean inp = true;
        while (inp) {
            log.info("Enter your choice\n1.Deposit\n2.Withdraw\n3.balance\n4.Exit");
            choice = inputobj.nextInt();
            switch (choice) {
                case 1:
                    bo.deposit();
                    break;

                case 2:
                    bo.withDraw();
                    break;

                case 3:
                    bo.balanceAmt();
                    break;

                case 4:
                	log.info("Thank You");
                    inp = false;
                    break;

                default:
                    log.info("Enter the correct choice");

            }
        }

    }
}

    
