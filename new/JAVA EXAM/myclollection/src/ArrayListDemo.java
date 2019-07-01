import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> studs=new ArrayList<Student>();
		ArrayList<Integer> ints=new ArrayList<Integer>();
		
		ints.add(new Integer(40));
		ints.add(new Integer(50));
		ints.add(new Integer(60));
		ints.add(new Integer(40));
		ints.remove(3);
		
		System.out.println("Array of integers");
		Iterator<Integer> iter=ints.iterator();
		while(iter.hasNext())
		{
			Integer i=(Integer)iter.next();
			System.out.println(i);
		}
		try(Scanner sc=new Scanner(System.in)) {
		
			for(int i=0;i<3;i++)
			{
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter age");
				int age=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter city");
				String city=sc.next();
				
				Student s=new Student(id, age, name, city);
				studs.add(s);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

		System.out.println("Array of Students");
		Iterator<Student> iter1=studs.iterator();
		while(iter1.hasNext())
		{
		System.out.println(iter1.next().toString());
		}

	}

}
