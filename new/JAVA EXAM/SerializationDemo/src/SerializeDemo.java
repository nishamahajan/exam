
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stud=new ArrayList<Student>();
		stud.add(new Student(1,1,"sush","pune"));
		stud.add(new Student(1,1,"sush","pune"));
		stud.add(new Student(1,1,"sush","pune"));
		try {
			FileOutputStream file=new FileOutputStream("test.txt");
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(stud);
			out.close();
			file.close();
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not success");
		}
	}

}
