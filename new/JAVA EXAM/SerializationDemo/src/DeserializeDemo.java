import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> stud=null;
		try {
			FileInputStream file=new FileInputStream("test.txt");
			ObjectInputStream inp=new ObjectInputStream(file);
			stud=(ArrayList<Student>) inp.readObject();
			inp.close();
			file.close();
			for(Student s:stud)
			{
				System.out.println(s);	
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}

	}

}
