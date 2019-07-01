import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> studs = new HashSet<Student>();
		HashSet<Integer> ints = new HashSet<Integer>();
		boolean flag = true;

		ints.add(new Integer(40));
		ints.add(new Integer(50));
		ints.add(new Integer(60));
		ints.add(new Integer(40));

		System.out.println("Set of integers");
		Iterator<Integer> iter = ints.iterator();
		while (iter.hasNext()) {
			Integer i = (Integer) iter.next();
			System.out.println(i);
		}

		try (Scanner sc = new Scanner(System.in)) {

			for (int i = 0; i < 3; i++) {
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter city");
				String city = sc.next();

				Student s = new Student(id, age, name, city);
				if (studs.size() == 0) {
					studs.add(s);
				} else {
					for (Student stud : studs) {
						if (stud.equals(s)) {
							flag = false;
							break;
						}
					}
					if (flag == true) {
						studs.add(s);
					} else {
						System.out.println("Duplicate entries found"+s);
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Array of Students");
		Iterator<Student> iter1 = studs.iterator();
		while (iter1.hasNext()) {
			System.out.println(iter1.next().toString());
		}

	}

}
