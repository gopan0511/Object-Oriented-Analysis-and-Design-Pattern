
import java.util.*;

/**
 * 
 */
public class SummarizeName implements SummerizeStrategy {

    /**
     * Default constructor
     */
    public SummarizeName() {
    }

    /**
     * @param a 
     * @return
     */
    public void summarize(List<Contact> a) {
        // TODO implement here
        		System.out.println("Summerise by name");
		Collections.sort(a, new Comparator<Contact>(){
			public int compare(Contact o1, Contact o2){
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println(Arrays.asList(a));

    }

}