package exceptiondatabase;
import java.sql.*;
import java.util.logging.*;

public class Storing 
{
	String database;
    String username;
    String password;
    Connection con;
	Logger log = Logger.getLogger("hi");

    private Storing(String database, String username, String password) {
        this.database = database;
        this.username = username;
        this.password = password;
    }

    public static Storing in(String database,String username,String password) {
        return new Storing(database, username, password);
    }

    void connection()

    {
        try {
            con = DriverManager.getConnection(database, username, password);
            log.info("Connection established");
        } catch (Exception e) {
            log.info(e);
        }
    }

    void terminate() {
    	try {
        con.close();
        log.info("Closed");
    }
    	catch(Exception e)
    	{
    		log.info(e);
    	}
    }
    
}
