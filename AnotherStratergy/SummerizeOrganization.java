
import java.util.*;

/**
 * 
 */
public class SummerizeOrganization implements SummerizeStrategy {

    /**
     * Default constructor
     */
    public SummerizeOrganization() {
    }

    /**
     * @param a 
     * @return
     */
    public void summarize(List<Contact> a) {
        // TODO implement here
        		System.out.println("Summerize by organizastion");
		Collections.sort(a, new Comparator<Contact>(){
			public int compare(Contact o1, Contact o2){
				return o1.company.compareTo(o2.company);
			}
		});
		System.out.println(Arrays.asList(a));	
    }

}