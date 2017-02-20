
import java.util.*;

/**
 * 
 */
public class client {

    /**
     * Default constructor
     */
    public client() {
    }

   public static void main(String args[]){
       		// TODO Auto-generated method stub
		List<Contact> c = new ArrayList<Contact>();
		Contact c1 = new Contact();
		c1.setContact("Niran","Google");
		Contact c2 = new Contact();
		c2.setContact("Zoro", "Apple");
		c.add(c1);
		c.add(c2);
		ContactList cl = new ContactList(new SummarizeName());
		cl.doSummerize(c);
		cl = new ContactList(new SummerizeOrganization());
		cl.doSummerize(c);

   }

}