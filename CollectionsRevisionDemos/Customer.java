import java.util.Comparator;

public class Customer {
	String customerId;
	String customerName;
	String customerCity;
	int purchaseValue;
	
	public Customer() {
		super();
	}
	public Customer(String customerId, String customerName, String customerCity, int purchaseValue) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.purchaseValue = purchaseValue;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", purchaseValue=" + purchaseValue + "]";
	}
	
}
class CitySorter implements Comparator <Customer>
{

	@Override
	public int compare(Customer cust1, Customer cust2) {
		// TODO Auto-generated method stub
		if(cust1.customerCity.compareTo(cust2.customerCity) > 0)
		{
			return 1;
		}
		else if(cust1.customerCity.compareTo(cust2.customerCity) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}
class NameSorter implements Comparator <Customer>
{

	@Override
	public int compare(Customer cust1, Customer cust2) {
		// TODO Auto-generated method stub
		if(cust1.customerName.compareTo(cust2.customerName) > 0)
		{
			return 1;
		}
		else if(cust1.customerName.compareTo(cust2.customerName) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}
class PValueSorter implements Comparator <Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if (o1.purchaseValue > o2.purchaseValue)
		{
			return 1;
		}
		else if(o1.purchaseValue < o2.purchaseValue)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}
