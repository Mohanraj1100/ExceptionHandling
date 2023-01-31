package exceptiongraph;
import java.util.*;
import java.util.logging*;

public class Coordinate 
{
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
		 Logger log = Logger.getLogger("hi");
	        log.info("Enter x-Coordonate");
	        Float x = sc.nextFloat();
	        log.info("Enter y-coordinate");
	        Float y = sc.nextFloat();

	        Coordinates in = new Coordinates(x, y);
	        Coordinates is = in.co();
	        log.info(is.equals());
}
}
