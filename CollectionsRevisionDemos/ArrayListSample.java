import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class ArrayListSample {
	
	Hashtable <Integer,Employee> ht = new Hashtable<Integer,Employee>();
	ArrayList myList;
	ArrayList <Employee> employees;

	public void populateArrayList()
	{
		String str1 = new String("Harsha");
		int num1=10000;
		myList  = new ArrayList();
		myList.add(str1);
		myList.add(num1);
		myList.add(367477.56);
		myList.add(true);
		
	}
	public void populateArraylistEmployees()
	{
		employees = new ArrayList<Employee>();
		Employee e1 = new Employee("E001","Harsha","RTNagar",10000,12.34f);
		Employee e2 = new Employee("E002","SUman","JayaNagar",12000,12.34f);
		Employee e3 = new Employee("E003","Kiran","Koramangala",13000,12.34f);
		Employee e4 = new Employee("E004","Rajesh","KRPuram",14000,12.34f);
		Employee e5 = new Employee("E005","Sumanth","Malleswaram",15000,12.34f);
		
	//	Employee e6 = new Employee("E006","Anirudh","Malleswaram",15000,12.34f);
		employees.add(e4);
		employees.add(e5);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		
	//	employees.add(2, e6);
		
	}
	/*
	 * ArrayList <T> myList = new ArrayList<T>()
	 */
	public void fetchArrayList()
	{
		Iterator myIter = myList.iterator();
		while(myIter.hasNext())
		{
			//String str = myIter.next();
			Object obj = myIter.next();
			System.out.println(obj);
		}
	}
	public void fetchEmployees()
	{
		//Iterator empIter = employees.iterator();
		Iterator <Employee> empIter = employees.iterator();
		while(empIter.hasNext())
		{
			//Employee emp = (Employee)empIter.next();
			Employee emp = empIter.next();
			System.out.println(emp);// toString()
			
		}
	}
	public static void main(String[] args)
	{
		ArrayListSample als = new ArrayListSample();
	/*	als.populateArrayList();
		als.fetchArrayList();*/
		als.populateArraylistEmployees();
		als.fetchEmployees();
	}

}
