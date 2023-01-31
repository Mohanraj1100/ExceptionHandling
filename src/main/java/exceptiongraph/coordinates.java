package exceptiongraph;
import java.util.logging.*;

public class Coordinates implements cloneable {
    Float x;
    Float y;
    Logger log = Logger.getLogger("hi");

    Coordinates(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    boolean equals() {
        return x.equals(y);
    }

    Coordinates co() {
    	try{
    		return (Coordinates)super.clone();
    		
    	}
    	catch(CloneNotSupportedException e)
    	{
    		log.info("Clowning error");
    		return this;
    	}
    }
}

