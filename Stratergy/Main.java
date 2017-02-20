import java.util.*;
import java.awt.List;

abstract class Contact{
	NameList name;
	public Contact(NameList nam)
	{
		this.name=nam;
	}
	int i=0;
	HashMap<Integer, ArrayList<String>> hmap = new HashMap<Integer, ArrayList<String>>();
	ArrayList<String> detail=new ArrayList<String>();
	public abstract void displayContact();
	
	
	  public  void add1(String s1,String s2)
	  {
		java.util.List<String> a = new ArrayList<String>();
	       a.add(s1.toString());
	       a.add(s2.toString());
	       detail.addAll(a);
	       hmap.put(i,(ArrayList<String>)a);
	       name.listOfDetails(hmap);
	       i=i+1;  
	  }
}
class ContactList1 extends Contact{
	public ContactList1(NameList nam)
	{
		super(nam);
		
	}
	public void displayContact()
	{
		name.Summerize();
	}
}

class ContactList2 extends Contact{
	public ContactList2(NameList nam) {
		super(nam);
	}
	public void displayContact()
	{
		name.Summerize();
	}
}

interface NameList {
	public void Summerize();
	public void listOfDetails(HashMap<Integer , ArrayList<String>> hmap);
}

class SummerizeName implements NameList {
	HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> key = new ArrayList<String>();
        String[] val;
	public void listOfDetails(HashMap<Integer, ArrayList<String>> hmap)
	{
		map=hmap;
		val = new String[map.size()];
		int j;	
		for (int i=0;i<map.size();i++)
		{
			j=0;
			key = map.get(i);
			val[i]=(key.get(j).toString());
		}	
	}
	public void Summerize()
	{
	    Arrays.sort(val);	
		for(int i=0;i<val.length;i++)
		{
			System.out.println(val[i]);	
		}
		
	}

}

class SummerizeOrganization implements NameList {
	ArrayList<Object> al = new ArrayList<Object>();
	  HashMap<Integer,ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		Object[] values = new Object[100];
		Object[] keys = new Object[100];
		  HashMap<String,ArrayList> map1 = new HashMap<String,ArrayList >();	

	public void listOfDetails(HashMap<Integer, ArrayList<String>> hmap)
	{
		map=hmap;
		values=map.values().toArray();
		keys = map.keySet().toArray();
	}
	
	
	public void Summerize()
	{
 
		for(Object key:keys){
		System.out.println(key);
		}
		
	}

}

public class Main {
	public static void main(String[] arg)
	{
		NameList nam =new SummerizeName();
		Contact a = new ContactList1(nam);
		a.add1("Ram", "Piper");
		a.add1("John","Company");
		a.add1("Suresh","Company2");
		a.add1("Abhi","Company2");
		a.displayContact();
	//Contact b =new ContactList2();
		//b.displayContact();
		
	}

}