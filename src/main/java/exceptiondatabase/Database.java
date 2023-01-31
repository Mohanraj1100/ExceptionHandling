package exceptiondatabase;
import java.util.*;
import java.util.logging.*;

public class Database {

	public static void main(String[] args) {
        String database;
        String username;
        String password;
        Scanner sc = new Scanner(System.in);
	Logger log = Logger.getLogger("hi");
        log.info("Enter database name");
        database = sc.next();
        log.info("Enter Username");
        username = sc.next();
        log.info("Enter Password ");
        password = sc.next();
        Storing obj1 = Storing.in(database,username,password);
        obj1.connection();
        obj1.terminate();
        sc.close();
    }
}
