package dsagroupproject2;

import java.util.*;

public class skyscraper {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the total number floors in the building : ");
		int totalfloors = scanner.nextInt();

		int day[] = new int[totalfloors + 1];

		for (int i = 1; i <= totalfloors; i++) {

			System.out.println("Enter the floor size given on day : " + i);
			int size = scanner.nextInt();

			day[size] = i;
		}

		int temp = totalfloors;

		int flag;
		System.out.println("The order of construction is as follows ");

		for (int i = 1; i <= totalfloors; i++) {

			flag = 0;
			System.out.println("Day " + i + " :");

			while (temp >= 1 && day[temp] <= i) {

				flag = 1;

				System.out.print(temp + " ");

				temp--;
			}

			if (flag == 1)

				System.out.println();
		}
		scanner.close();
	}

}
