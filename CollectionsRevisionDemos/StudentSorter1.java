import java.util.ArrayList;
import java.util.Iterator;

public class StudentSorter1 {

	ArrayList <Student> students;
	public void getStudentData()
	{
		students = new ArrayList<Student>();
		students.add(new Student("S003","Yamini","Bhubaneshwar",76));
		students.add(new Student("S005","Chandu","Ernakulam",86));
		students.add(new Student("S004","Emanuel","Ahmedabad",56));
		students.add(new Student("S002","David","Faridabad",96));
		students.add(new Student("S001","Faheem","Delhi",66));
		
		students.sort(null);
		
		Iterator <Student> studIter = students.iterator();
		while(studIter.hasNext())
		{
			Student student = studIter.next();
			System.out.println(student);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSorter1 ss1 = new StudentSorter1();
		ss1.getStudentData();
	}

}
