package posTerminal;

import java.util.Scanner;

// this is a concrete class that can be used over and over again
// you can also add your own validation methods here
public class Validator {
	
	public static String getCardString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.nextLine(); // read user entry
		return s;
	}
	
	
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static String getString(Scanner sc, String prompt, String cashCredCheck) {
		System.out.print(prompt);
		// read user entry
		cashCredCheck = sc.nextLine();
		boolean isValid = false;
		while (!isValid) {
			if (!cashCredCheck.equalsIgnoreCase("cash") && !cashCredCheck.equalsIgnoreCase("credit") && !cashCredCheck.equalsIgnoreCase("check")) {
				System.out.println("We only accept cash, credit, or checks! ");
				cashCredCheck = sc.nextLine();
				isValid = false;
			} else {
				isValid = true;
			}
		}
		return cashCredCheck;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getDouble(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return d;
	}

	public static String getStringMatchingRegex(Scanner scan, String prompt, String regex) {
		boolean isValid = false;
		String input;
		

		do {
			input = getCardString(scan, prompt); // this is calling the getString() method above
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the right format: ");
				isValid = false;
			}
		} while (!isValid);

		return input;
	}
	
	public static String getCat(Scanner sc, String prompt) {
        System.out.print(prompt);
        String s = sc.next(); // read user entry
        if (s.equalsIgnoreCase("Televison")|| s.equalsIgnoreCase("Appliance") || s.equalsIgnoreCase("Computer") || s.equalsIgnoreCase("Game Console") || s.equalsIgnoreCase("Phone")) {
        sc.nextLine();
        return s;// discard any other data entered on the line
        }
        else {
            System.out.println("That is not a valid entry. Please try again.");
            System.out.print(prompt);
            s = sc.next();
            
        }return s;
    }
}