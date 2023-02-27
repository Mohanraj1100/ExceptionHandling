package exceptionschool;
import java.util.*;
import java.util.logging.*;
public class Student 
{
    public static void main(String[] args) {
    	String studentname;
        char gradelevel;
        float gpa;
        Scanner inputobj = new Scanner(System.in);
        Logger log = Logger.getLogger("hi");
        try {
        log.info("Enter the Student Name");
        studentname = inputobj.nextLine();
        log.info("Enter the Grade level");
        gradelevel = inputobj.next().charAt(0);
        log.info("Enter your GPA out of 10");
        gpa = inputobj.nextFloat();
        StudentLevel sl = new StudentLevel(studentname,gradelevel,gpa);
        sl.update();
        sl.result();
        }
        catch(InputMismatchException e)
        {
        	String msg = "Exception"+e;
        	log.info(msg);
        }
    }

}
