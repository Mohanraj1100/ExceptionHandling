package exceptionshape;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class ShapeCalculation{
	double length;
    double breadth;
    double height;
    double width;
    double base;
    double side;
    double radius;
    double perimeter;
    double area;
    double pie=3.14;
    double half=0.5;
    int choice;
    Logger log = Logger.getLogger("hi");
    Scanner inputobj = new Scanner(System.in);
    ShapeCalculation(int choice){
    	this.choice = choice;
    	switch (choice) {
        case 1:
        	try {
            log.info("Enter Length");
            length = inputobj.nextInt();
            log.info("Enter Breadth");
            breadth = inputobj.nextInt();
        	}
        	catch(InputMismatchException e)
    		{
    			log.info(String.valueOf(e));
    			System.exit(0);
    		}
            break;

        case 2:
        	try {
            log.info("Enter Base");
            base = inputobj.nextInt();
            log.info("Enter height");
            height = inputobj.nextInt();
            log.info("Enter side");
            side = inputobj.nextInt();
        	}
        	catch(InputMismatchException e)
    		{
    			log.info(String.valueOf(e));
    			System.exit(0);
    		}
            break;

        case 3:
        	try {
            log.info("Enter radius");
            radius = inputobj.nextInt();
        	}
        	catch(InputMismatchException e)
    		{
    			log.info(String.valueOf(e));
    			System.exit(0);
    		}
            break;

        default:
            log.info("You have entered invalid shapename ");
            break;

    }
    	
    }
    
    void perimeterIs() {
        switch (choice) {
            case 1:
                perimeter = 2 * (length + breadth);
                log.log(Level.INFO,()->"Permeter of Rectangle is" +perimeter);
                break;

            case 2:
                perimeter = height + base + side;
                log.log(Level.INFO,()->"Permeter of Triangle is" +perimeter);
                
                break;

            case 3:
                perimeter = 2 * pie * radius;
                log.log(Level.INFO,()->"Permeter of Circle is" +perimeter);
                break;
		
		default:
			log.info("Invalid");
			break;
        }
    }

    void areaIs() {
        switch (choice) {
            case 1:
                area = length * breadth;
                log.log(Level.INFO,()->"Area of Rectangle is"+area);
                break;

            case 2:
                area = half * (base * height);
                log.log(Level.INFO,()->"Area of Triangle is"+area);
                break;

            case 3:
                area = radius * radius;
                log.log(Level.INFO,()->"Area of Circle is"+area);
                break;
		
            default:
            	log.info("Invalid");
            	break;
        }
    }
}
