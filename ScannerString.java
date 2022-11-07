package Data;

import java.util.Collection;
import java.util.Scanner;

public class ScannerString {

	// private static Collection<? extends String> str;

	public static void main(String[] args) {
		String name = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			// System.out.println("enter your name");

			if (str.equals("exit")) {

				break;
			}

			System.out.println("Enter your name");

			name += str;
		}

		System.out.println("  " + name);

	}
}
