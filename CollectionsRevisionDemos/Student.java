
public class Student implements Comparable <Student>
{

	String studeId;
	String studName;
	String studCity;
	int studScore;
	
	
	
	public Student() {
		super();
	}



	public Student(String studeId, String studName, String studCity, int studScore) {
		super();
		this.studeId = studeId;
		this.studName = studName;
		this.studCity = studCity;
		this.studScore = studScore;
	}



	@Override
	public String toString() {
		return "Student [studeId=" + studeId + ", studName=" + studName + ", studCity=" + studCity + ", studScore="
				+ studScore + "]";
	}



	/*@Override
	public int compareTo(Student stud) {
		// TODO Auto-generated method stub
		if(this.studName.compareTo(stud.studName) > 0)
		{
			return 1;
		}
		else if(this.studName.compareTo(stud.studName) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}*/
	
/*	@Override
	public int compareTo(Student stud) {
		// TODO Auto-generated method stub
		if(this.studCity.compareTo(stud.studCity) > 0)
		{
			return 1;
		}
		else if(this.studCity.compareTo(stud.studCity) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}*/
	@Override
	public int compareTo(Student stud) {
		// TODO Auto-generated method stub
		if(this.studScore > stud.studScore)
		{
			return 1;
		}
		else if(this.studScore < stud.studScore)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
