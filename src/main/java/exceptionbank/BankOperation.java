package exceptionbank;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class BankOperation{
	String holdername;
    long accno;
    double balance = 0;
    Scanner inputobj = new Scanner(System.in);
    Logger log=Logger.getLogger("hi");
	BankOperation(String holdername,long accno){
		this.holdername =holdername;
		this.accno = accno;
		balance = 0;
	}
	void deposit() { 
		try {
        log.info("Enter deposit Amount");
        double amount = inputobj.nextDouble();
        balance = balance + amount;
		}
		catch(InputMismatchException e) {
    		log.info(String.valueOf(e));
        	System.exit(0);
    	}
    }

    void withDraw() {
    	try {
        log.info("Enter Withdraw Amount");
        double withdrawamt = inputobj.nextDouble();
        if (withdrawamt > balance) {
            log.info("Thers is no required amount");
        } else {
            balance = balance - withdrawamt;
        }
    	}
    	catch(InputMismatchException e) {
    		log.info(String.valueOf(e));
        	System.exit(0);
    	}
    }

    void balanceAmt() {
        log.log(Level.INFO,()->"Balance is" + balance);
    }
}

