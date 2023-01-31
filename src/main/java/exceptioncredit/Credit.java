package exceptioncredit;
import java.util.*;
import java.util.logging.*;
public class Credit 
{
	public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
	Logger log=Logger.getLogger("hi");

        log.info("Enter cardholder name");
        String cardholder = si.nextLine();
        log.info("Enter cardnumber");
        Long cardnumber = si.nextLong();
        log.info("Enter card's expiry daate");
        String expirydate = si.next();

        Long validcardno = 987654321l;

        Creditcard obj1 = new Creditcard(cardholder, cardnumber, expirydate);
        Creditcard obj2 = obj1.co();
        log.info(obj2.equals(validcardno));
	obj2.display();
    }

}
