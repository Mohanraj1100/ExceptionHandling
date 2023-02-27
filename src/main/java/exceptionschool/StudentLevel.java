package exceptionschool;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class StudentLevel{
	String studentname;
    char gradelevel;
    float gpa;
    float updatedgpa;
    int response;
    Scanner inputobj = new Scanner(System.in);
    Logger log = Logger.getLogger("hi");
    StudentLevel(String studentname,char gradelevel,float gpa)
    {
    	this.studentname = studentname;
    	this.gradelevel = gradelevel;
    	this.gpa = gpa;
    }
    
    void update() {
        log.info("Do you need to update your GPA\nFor update type 1");
        response = inputobj.nextInt();
        if(response == 1) {
        	try {
            log.info("Enter updated GPA");
            updatedgpa = inputobj.nextFloat();
        	}
        	catch(InputMismatchException e)
        	{
        		String msg = "Exception"+e;
        		log.info(msg);
        	}
            if ((gradelevel == 'A') && (updatedgpa >= 9) && (updatedgpa <= 10)) {
                gpa = updatedgpa;
            } else if ((gradelevel == 'B') && (updatedgpa >= 7) && (updatedgpa <= 8)) {
                gpa = updatedgpa;
            } else if ((gradelevel == 'C') && (updatedgpa >= 5) && (updatedgpa <= 6)) {
                gpa = updatedgpa;
            } else if ((gradelevel == 'D') && (updatedgpa >= 3) && (updatedgpa <= 4)) {
                gpa = updatedgpa;
            } else if ((gradelevel == 'E') && (updatedgpa >= 1) && (updatedgpa <= 2)) {
                gpa = updatedgpa;
            } else {
                log.info("Cannot be updated");
            }		
    }
    else{
        log.info("Invalid");
    }
}

void result() {
    log.log(Level.INFO,()-> studentname +" has a GPA Level of "+gpa);
}
	
}