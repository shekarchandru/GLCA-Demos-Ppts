import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSample {

	HashMap <Integer,Employee> empHMap;
	Hashtable <Integer,Employee> empHTable;
	public void populateHashMap()
	{
		empHMap = new HashMap<Integer,Employee>();
		empHTable = new Hashtable<Integer,Employee>();
		empHMap.put(1, new Employee("E001","Kiran","RTNagar",1000,12.3f));
		empHMap.put(2, new Employee("E002","Suman","Koramangala",2000,12.3f));
		empHMap.put(3, new Employee("E003","Rajesh","Vijayanagar",3000,12.3f));
		empHMap.put(4, new Employee("E004","Sumesh","Jayanagar",4000,12.3f));
		empHMap.put(5, new Employee("E005","Mahesh","SGPalya",5000,12.3f));
		
		
	}
	public void getHashMapData()
	{
	Set <Entry<Integer,Employee>> myEntrySet =	empHMap.entrySet();
	
	Iterator <Entry <Integer,Employee>> entrySetIter = myEntrySet.iterator();
	
	while(entrySetIter.hasNext())
	{
		Entry <Integer,Employee> myEntry = entrySetIter.next();
		Integer myKey = myEntry.getKey();
		Employee employee = myEntry.getValue();
		System.out.println("The Key is "+myKey+" And value is "+employee);
	}
		
	}
	
	public void getHashMapValues()
	{
		Collection c = empHMap.values();
		Iterator <Employee> iter = c.iterator();
		while(iter.hasNext())
		{
			Employee emp =  iter.next();
			System.out.println("Value  is "+emp);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapSample hms = new HashMapSample();
		hms.populateHashMap();
		hms.getHashMapData();
		System.out.println("--------------");
		hms.getHashMapValues();
	}

}
