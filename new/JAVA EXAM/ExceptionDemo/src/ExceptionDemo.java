import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter age");
			int age=sc.nextInt();
			if (age<10)
			{
				throw new TooYoungExcep("You are too young");
			}
			else
			{
				System.out.println("hurrah!!");
			}
		}
		catch (TooYoungExcep te) {
			// TODO: handle exception
			//System.out.println(te.getMessage());
			te.printStackTrace();
		}
	}

}
