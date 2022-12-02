import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CustomerSorter {

	
	ArrayList <Customer> customers = new ArrayList<Customer>();
	
	public void getCustomerData()
	{
		customers.add(new Customer("S003","Yamini","Bhubaneshwar",7600));
		customers.add(new Customer("S005","Chandu","Ernakulam",8600));
		customers.add(new Customer("S004","Emanuel","Ahmedabad",5600));
		customers.add(new Customer("S002","David","Faridabad",9600));
		customers.add(new Customer("S001","Faheem","Delhi",6600));
		
		System.out.println("---------------------City Sorted---------------");
		Collections.sort(customers,new CitySorter());
		
		Iterator <Customer> cCityIter = customers.iterator();
		while(cCityIter.hasNext())
		{
			Customer c = cCityIter.next();
			System.out.println(c);
		}
		System.out.println("---------------------Name Sorted---------------");
		Collections.sort(customers,new NameSorter());
		
		Iterator <Customer> cNameIter = customers.iterator();
		while(cNameIter.hasNext())
		{
			Customer c = cNameIter.next();
			System.out.println(c);
		}
		System.out.println("---------------------Purchase Value Sorted---------------");
		Collections.sort(customers,new PValueSorter());
		
		Iterator <Customer> pValueIter = customers.iterator();
		while(pValueIter.hasNext())
		{
			Customer c = pValueIter.next();
			System.out.println(c);
		}
		System.out.println("this was a sample for Sorting using Comparator");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerSorter cs = new CustomerSorter();
		cs.getCustomerData();

	}

}
