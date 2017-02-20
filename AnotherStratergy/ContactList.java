
import java.util.*;

/**
 * 
 */
public class ContactList {

    /**
     * Default constructor
     */
    public ContactList(SummerizeStrategy s) {
        this.s = s;
    }

    /**
     * 
     */
    public SummerizeStrategy s;



    /**
     * @param a 
     * @return
     */
    public void doSummerize(List<Contact> a) {
        // TODO implement here
        s.summarize(a);
    }

}