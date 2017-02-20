
import java.util.*;

/**
 * 
 */
public class Contact {

    /**
     * Default constructor
     */
    public Contact() {
    }

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public String company;

    /**
     * @param n 
     * @param c 
     * @return
     */
    public void setContact(String n, String c) {
        // TODO implement here
        name = n;
		company = c;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return ("(" + name + ", " + company + ")");
    }

}