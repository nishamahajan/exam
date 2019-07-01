import java.util.Comparator;

public class Student implements Comparable<Student>{
	
	private int id;
	private int age;
	private String name;
	private String city;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(int id, int age, String name, String city) {
		
		this.id = id;
		this.age = age;
		this.name = name;
		this.city = city;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", city=" + city + "]";
	}


	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(this.age>s.getAge())
		{
			return 1;
		}
		else if(this.age<s.getAge())
		{
			return -1;
		}
		else
		{
			return 0;	
		}
		
	}
	
	public boolean equals(Student s) {
		// TODO Auto-generated method stub
		if(this.id==s.getId())
		{
			return true;
		}
		return false;
	}


	
	
	

}
