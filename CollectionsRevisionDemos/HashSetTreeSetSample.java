import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetTreeSetSample {

	HashSet <String> hSet;
	TreeSet <String> tSet;
	public void populateHashSet()
	{
		hSet = new HashSet();
		hSet.add("Faridabad");
		hSet.add("Mumbai");
		hSet.add("Ahmedabad");
		hSet.add("Ernakulam");
		hSet.add("Gandhinagar");
		hSet.add("Chandigarh");
		hSet.add("Bangalore");
		
	}
	public void fetchHashSet()
	{
		Iterator <String> hsIter = hSet.iterator();
		while(hsIter.hasNext())
		{
			String hsItem = hsIter.next();
			System.out.println(hsItem);
		}
	}
	public void populateTreeSet()
	{
		tSet = new TreeSet();
		tSet.add("Faridabad");
		tSet.add("Mumbai");
		tSet.add("Ahmedabad");
		tSet.add("Ernakulam");
		tSet.add("Gandhinagar");
		tSet.add("Chandigarh");
		tSet.add("Bangalore");
	}
	public void fetchTreeSet()
	{
		Iterator <String> tsIter = tSet.iterator();
		while(tsIter.hasNext())
		{
			String tsItem = tsIter.next();
			System.out.println(tsItem);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetTreeSetSample hsts = new HashSetTreeSetSample();
		hsts.populateHashSet();
		hsts.fetchHashSet();
		System.out.println("-------------------");
		hsts.populateTreeSet();
		hsts.fetchTreeSet();
		System.out.println("-----------------");
		ArrayList <String> aList = new ArrayList();
		aList.add("Faridabad");
		aList.add("Mumbai");
		aList.add("Ahmedabad");
		aList.add("Ernakulam");
		aList.add("Gandhinagar");
		aList.add("Chandigarh");
		aList.add("Bangalore");
		//System.out.println(aList);
		for(String e:aList)
		{
			System.out.println(e);
		}
		ArrayList <Employee> eList = new ArrayList();
		
	}

}
