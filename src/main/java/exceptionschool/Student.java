package exceptionschool;
import java.util.*;
import java.util.logging.*;
public class Student 
{
    String studentname;
    char gradelevel;
    float gpa;
    float updatedgpa;
    int response;
    Scanner sc = new Scanner(System.in);
    Scanner si = new Scanner(System.in);
    Logger log = Logger.getLogger("hi");

    Student() {
        try{
            log.info("Enter the Student Name");
            studentname = sc.nextLine();
            log.info("Enter the Grade level");
            gradelevel = sc.next().charAt(0);
            log.info("Enter your GPA out of 10");
            gpa = sc.nextFloat();
        }
        catch(InputMismatchException e)
        {
            log.info(e);
            System.exit(0);
        }
    }

    void update() {
        try{
            log.info("Do you need to update your GPA\nFor update type 1");
            response = si.nextInt();
            if(response == 1) {
                log.info("Enter updated GPA");
                updatedgpa = si.nextFloat();
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
        catch(InputMismatchException e)
        {
            log.info(e);
            System.exit(0);
        }
    }

    void result() {
        log.fine("{} has a GPA Level of {}",studentname,gpa);
    }

    public static void main(String[] args) {
        Student in = new Student();
        in.update();
        in.result();
    }

}
