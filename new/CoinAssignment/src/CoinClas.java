import java.util.Scanner;

public class CoinClas {
	String	Country;
	int	Denomination;
		int YearOfMinting;
		int CurrentValue;
		int AcquiredDate;
	
		public CoinClas()
		{
			
		}
		
		
		public CoinClas(String country, int denomination, int yearOfMinting, int currentValue, int acquiredDate) {
			super();
			this.Country = country;
			this.Denomination = denomination;
			this.YearOfMinting = yearOfMinting;
			this.CurrentValue = currentValue;
			this.AcquiredDate = acquiredDate;
		}

		public String getCountry() {
			return Country;
		}


		public void setCountry(String country) {
			Country = country;
		}


		public int getDenomination() {
			return Denomination;
		}


		public void setDenomination(int denomination) {
			Denomination = denomination;
		}


		public int getYearOfMinting() {
			return YearOfMinting;
		}


		public void setYearOfMinting(int yearOfMinting) {
			YearOfMinting = yearOfMinting;
		}


		public int getCurrentValue() {
			return CurrentValue;
		}


		public void setCurrentValue(int currentValue) {
			CurrentValue = currentValue;
		}


		public int getAcquiredDate() {
			return AcquiredDate;
		}


		public void setAcquiredDate(int acquiredDate) {
			AcquiredDate = acquiredDate;
		}


		public void add()
		{
			System.out.println("enter details");

			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter Country");
			this.Country =sc.nextLine();
			System.out.println("enter Denomination");
			this.Denomination =sc.nextInt();
			System.out.println("enter YearOfMinting");
			this.YearOfMinting =sc.nextInt();
			System.out.println("enter CurrentValue");
			this.CurrentValue =sc.nextInt();
			System.out.println("enter AcquiredDate");
			this.AcquiredDate =sc.nextInt();
		}


		public void display() {
			
			System.out.println("Country is :"+Country);
			System.out.println("Denomination is : "+Denomination);
			System.out.println("YearOfMinting is : "+YearOfMinting);
			System.out.println("CurrentValue"+ CurrentValue);
			System.out.println("AcquiredDate is :"+AcquiredDate);
		}
}
