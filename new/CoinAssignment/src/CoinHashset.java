import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CoinHashset {
	public static void main(String[] args) {

		int choice;
		HashSet<CoinClas> c = new HashSet();
		while (true) {
			System.out.println("Enter the choice");
			System.out.println("1.add");
			System.out.println("2.Disaply");
			System.out.println("3.display country");
			System.out.println("4.Display Year of minting");
			System.out.println("5.Display current value ");
			System.out.println("6.Display country and denomination");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			int[] value;
			switch (choice) {
			case 1:
				CoinClas coin = new CoinClas();
				coin.add();
				c.add(coin);
				break;
			case 2:
				Iterator<CoinClas> iter = c.iterator();
				while (iter.hasNext()) {
					CoinClas ref = iter.next();
					ref.display();
				}
				break;
			case 3:
				Iterator<CoinClas> iter1 = c.iterator();
				// while(iter1.hasNext())
				// {
				// CoinClas ref = iter1.next();
				// ref.getCountry();
				// System.out.println(ref.getCountry());
				// }
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter Country You Want to Search");
				String temp = sc1.nextLine();
				while (iter1.hasNext()) {
					CoinClas ref = iter1.next();
					if (temp.equals(ref.getCountry())) {
						ref.display();
					}
				}

				break;
			case 4:
				Iterator<CoinClas> iter2 = c.iterator();
				System.out.println("Enter	Year of Minting You Want to Search");
				int yearTemp = sc.nextInt();
				while (iter2.hasNext()) {
					CoinClas ref = iter2.next();
					if (yearTemp == ref.getYearOfMinting()) {
						ref.display();
					}

				}
				break;
			case 5:
				Iterator<CoinClas> iter3 = c.iterator();
				value = new int[20];
				while (iter3.hasNext()) {
					CoinClas ref = iter3.next();
					for (int i = 0; i < c.size(); i++) {

						value[i] = ref.getCurrentValue();
					}
					for (int j = 0; j < c.size(); j++) {
						for (int k = 0; k < c.size() - 1; k++) {
							if (value[k] > value[k + 1]) {
								int temp1 = value[k];
								value[k] = value[k + 1];
								value[k + 1] = temp1;
							}
						}
					}

					for (int j = 0; j < value.length; j++) {
						System.out.println(value[j]);
					}
					// System.out.println(ref.getCurrentValue());
				}
				break;

			case 7: {

				Iterator<CoinClas> iter10 = c.iterator();
				String temp10[] = new String[10];
				int i = 0;

				while (iter10.hasNext()) {
					CoinClas ref = iter10.next();
					temp10[i] = ref.getCountry();

					if (i > 0) {
						if (temp10[i - 1].equals(ref.getCountry()))
							i--;
					} 
					i++;

				}

				for (int k = 0; k < i; k++) {
					System.out.println(temp10[k]);
				}
			

				break;

			}
			case 6:
				Iterator<CoinClas> iter4 = c.iterator();
				// CoinClas[] cTemp = {};

				CoinClas[] cTemp = new CoinClas[20];
				int i = 0;
				System.out.println("Enter Country You Want to Search");
				Scanner sc6 = new Scanner(System.in);
				String temp5 = sc6.nextLine();
				System.out.println(temp5);
				while (iter4.hasNext()) {
					CoinClas ref = iter4.next();
					if (temp5.equals(ref.getCountry())) {

						cTemp[i] = ref;
						i++;
					}
				}
				System.out.println(i);
				for (int j = 0; j < i; j++) {
					cTemp[j].display();
				}

				System.out.println("Enter d You Want to Search");
				int temp6 = sc.nextInt();
				for (int j = 0; j < i; j++) {
					if (temp6 == cTemp[j].Denomination) {
						cTemp[j].display();
						System.out.println("****************************");
					}
				}
				break;
			}
		}

	}

}
