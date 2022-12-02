
public class Employee {

	private	String empId;
	private	String empName;
	private	String empAddress;
	private	int salary;
	private	float profTax;
		
		public Employee() {
			super();
		}

		public Employee(String empId, String empName, String empAddress, int salary, float profTax) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empAddress = empAddress;
			this.salary = salary;
			this.profTax = profTax;
		}

		public String toString()
		{
			String str = "Employee with Id "+empId+"With Name"+empName+" Resides at "+empAddress+"Draws a salary of "+salary+"Is liable for a tax of "+profTax;
			return str;
		}

		public String getEmpId() {
			return empId;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public String getEmpAddress() {
			return empAddress;
		}

		public void setEmpAddress(String empAddress) {
			this.empAddress = empAddress;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public float getProfTax() {
			return profTax;
		}

		public void setProfTax(float profTax) {
			this.profTax = profTax;
		}
		
		
		
		
}
