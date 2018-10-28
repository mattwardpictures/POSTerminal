package posTerminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class POSApp {

	static String directoryFolder = "resources";
	static String fileName = "products.txt";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String cont;
		int selection;

		ArrayList<Products> cart = new ArrayList<>(); // Shopping Cart Array (empty)
		ArrayList<Products> menu = new ArrayList<>(); // Menu Array or Inventory List

		/*
		 * ======================== INVENTORY (ArrayList menu) ========================
		 */

		// TELEVISIONS
		TVSets tv1 = new TVSets("Samsung", "NU7100 Series", "LED TV", 849.99);
		tv1.setDisplaySize(65);
		tv1.setResolution(2160);
		tv1.setPrice(849.99);

		TVSets tv2 = new TVSets("Vizio", "E-Series E70-F3", "LED TV", 899.99);
		tv2.setDisplaySize(70);
		tv2.setResolution(2160);

		TVSets tv3 = new TVSets("Insignia", "NS-55D510NA19", "LCD TV", 299.99);
		tv3.setDisplaySize(55);
		tv3.setResolution(1080);

		// COMPUTERS
		Computer cpu1 = new Computer("Apple", "MacBook Pro 15\"", "Computer", 2099.99);
		cpu1.setStorage(64);
		cpu1.setMemory(16);
		cpu1.setCpuInfo("Intel Core i7");
		cpu1.setGpuInfo("Radeon Pro 560X 4GB GDDR5");

		Computer cpu2 = new Computer("HP", "A6 Series", "Computer", 399.99);
		cpu2.setCpuInfo("Intel Core i3");
		cpu2.setGpuInfo(" ");
		cpu2.setStorage(0.5);
		cpu2.setMemory(8);

		// SMARTPHONES
		Phones phone1 = new Phones("Apple", "iPhone XR", "Phones", 749.99);
		phone1.setCpuInfo("A12 Bionic");
		phone1.setDisplaySize(5.8);
		phone1.setMemory(64);

		Phones phone2 = new Phones("Samsung", "Galaxy S8", "Phones", 549.99);
		phone2.setDisplaySize(5.8);
		phone2.setCpuInfo("Qualcomm Snapdragon 835");
		phone2.setMemory(64);

		// GAME CONSOLES
		GameConsole game1 = new GameConsole("Microsoft", "XBOX One X", "Gaming", 299.99);
		game1.setMemory(8);
		game1.setResolution(2160);
		game1.setStorage(1);
		game1.setGpuInfo("Scorpio 12GB GDDR5");
		game1.setCpuInfo("AMD Custom 8-Core");

		GameConsole game2 = new GameConsole("Sony", "Playstation 4", "Gaming", 299.99);
		game2.setMemory(8);
		game2.setResolution(2160);
		game2.setStorage(1);
		game2.setGpuInfo("AMD Radeon 8GB GDDR5");
		game2.setCpuInfo("AMD Jaguar 8-Core");

		// APPLIANCES
		Appliances app1 = new Appliances("Samsung", "Washer", "Appliance", 899.99);
		app1.setCubicFeet(4.5);

		Appliances app2 = new Appliances("Samsung", "Dryer", "Appliance", 899.99);
		app2.setCubicFeet(7.5);

		Appliances app3 = new Appliances("Frigidaire", "Refrigerator", "Appliance", 689.99);
		app3.setCubicFeet(18);

		// Adding inventory to the Menu List...
		menu.add(tv1);
		menu.add(tv2);
		menu.add(tv3);
		menu.add(cpu1);
		menu.add(cpu2);
		menu.add(phone1);
		menu.add(phone2);
		menu.add(game1);
		menu.add(game2);
		menu.add(app1);
		menu.add(app2);
		menu.add(app3);

//		createDirectory();
//		createFile(directoryFolder, fileName);
		// writeToFile(directoryFolder, fileName, menu);

		/*
		 * =============================== GREETING ===============================
		 */

		System.out.println(" ");
		System.out.println("        /BBBBBBBBBBB\\          ");
		System.out.println("      /BBBBBBBBBBBBBBB\\        ");
		System.out.println("    /BBBBBBBBBBBBBBBBBBB\\      ");
		System.out.println("   /BBBBBBBBBBBBBBBBBBBBB\\      ===============");
		System.out.println("  /BB\\ \\BBBBBBBBBBBBBBBBBB\\       Welcome To");
		System.out.println(" /BBBB/ TBB/ TBB/ TBB/ BBBB\\        TINA'S");
		System.out.println("|BBBB/======== ========\\BBBB|     MICRO GOODS");
		System.out.println("|BBBB||      |=|      ||BBBB|   ===============");
		System.out.println("|BBBB||   @  | |  @   ||BBBB|    ");
		System.out.println("|BBBB|\\_____/   \\_____/|BBBB|   ");
		System.out.println("|BBBB\\      \\___/      /BBBB|   ");
		System.out.println(" ");
		System.out.println("               How can we help you today?\n");
		int userChoice = Validator.getInt(scan,
				"1.Show our most current inventory, and start your order. \n2.Add to our inventory.\n3.Exit the store.\n",
				1, 3);
		System.out.println(" ");

		if (userChoice == 1) { // CHOICE #1: SHOW INVENTORY LIST

			// INVENTORY LIST HEADER
			System.out.printf("%-3s %-25s \n", " ", "STORE DIRECTORY:");
			System.out.println(" ");
			System.out.printf("%-3s %-15s %-20s %-15s %-15s %-15s \n", " ", "BRAND", "MODEL", "CATEGORY", "PRICE",
					"ITEM SPECIFICATIONS");

			for (int i = 0; i < 190; i++) { // HEADER BORDER: We used a for loop instead
				System.out.print("="); // of just leaning on the "=" key for the width of
			} // the list. 190 is approximate.

			System.out.println(" ");

			int counter = 1;

			// INVENTORY LIST PRINTOUT
			for (Products products : menu) {
				System.out.printf("%-3s %-175s \n", counter++ + ".", products);
			}

			do {
				selection = Validator.getInt(scan, "\nPlease enter the number associated with your item choice!\n");
				selection -= 1;

				cart.add(menu.get(selection));

				System.out.println("\nGreat! We've added the following item(s) to your cart! \n" + menu.get(selection));

				cont = Validator.getString(scan, "\nWould you like to purchase anything else? Y/N\n");

			} while (cont.equalsIgnoreCase("Y"));

			double total = 0;

			System.out.println("Here is your cart: \n"); // Printing user's cart
			for (int i = 0; i < cart.size(); i++) {
				System.out.println(cart.get(i));
				total += cart.get(i).getPrice();

			}
			System.out.printf("\nYour total is: %.2f", total);
			System.out.printf("\nYour tax is: %.2f ", Math.getTax(total));
			System.out.printf("\nYour grand total is: %.2f", Math.getGrandTotal(total));

			String payment = Validator.getString(scan, "\nHow would you like to pay? (Cash/Credit/Check)\n");

			if (payment.equalsIgnoreCase("Cash")) {

				payCash(scan, cart, total);

			} else if (payment.equalsIgnoreCase("Credit")) {

				creditPay(scan, cart, total);

			} else if (payment.equalsIgnoreCase("Check")) {

				checkFormat(scan, cart, total);

			}

		}
//		else if (userChoice == 2) {
//			
//			//add to the arraylist.
//			//writeToFile method and reprint out the txtfile. 
//		}
		else {

			System.out.println("Thank you and come again!");
		}

	}

	/*
	 * =============================== CHECK OUT ===============================
	 */

	// CASH PAY: If the user pays cash...
	private static void payCash(Scanner scan, ArrayList<Products> cart, double total) {
		Double userCash = Validator.getDouble(scan, "How much would you like to pay in cash?\n"); // Paying with Cash

		if (userCash < Math.getGrandTotal(total)) {

			System.out.println("Sorry, thats not enough cash!");

		} else if (userCash == Math.getGrandTotal(total)) {

			// RECEIPT BLOCK
			System.out.println("Perfect! Here is your receipt!");

			for (int i = 0; i < cart.size(); i++) {
				System.out.println(cart.get(i));
			}
			System.out.println("\nSub-total: " + total);
			System.out.printf("\nTax: %.2f ", Math.getTax(total));
			System.out.printf("\nGrand total: %.2f", Math.getGrandTotal(total));
			System.out.println(" ");

		} else if (userCash > Math.getGrandTotal(total)) {

			System.out.printf("Thanks for shopping with us, here's your change! %.2f",
					Math.giveChange(Math.getGrandTotal(total), userCash));

			// RECEIPT BLOCK
			System.out.println("\nPerfect! Here is your receipt!");
			for (int i = 0; i < cart.size(); i++) {
				System.out.println(cart.get(i));
			}
			System.out.println("\nSub-total: " + total);
			System.out.printf("\nTax: %.2f ", Math.getTax(total));
			System.out.printf("\nGrand total: %.2f", Math.getGrandTotal(total));
			System.out.println("Thank you and come again.");
		}

	}

	// CREDIT PAY: If the user pays credit...
	private static void creditPay(Scanner scan, ArrayList<Products> cart, double total) {

		// We're getting the user's name, credit card number, expiration date, and CVV.
		String cardName = Validator.getString(scan, "Please enter the name on the card: \n");
		String ccNum = Validator.getStringMatchingRegex(scan, "Please enter credit card number.", "\\d{16}");
		String cardExp = Validator.getStringMatchingRegex(scan, "Please enter credit card expiration date. mm/yy",
				"^(0[1-9]|1[012])[- /.](18|19|20|21|22|23|24)");
		String cvv = Validator.getStringMatchingRegex(scan, "Please enter 3 digit CVV.", "\\d{3}");

		// Printing out the user's credit card info
		System.out.println("Card info: " + cardName + " " + ccNum + " " + cardExp + " " + cvv);
		System.out.println(" ");

		// RECEIPT BLOCK
		System.out.println("Your payment was approved here is your receipt: ");

		for (int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i));

		}
		System.out.println("\nSub-total: " + total);
		System.out.printf("\nTax: %.2f ", Math.getTax(total));
		System.out.printf("\nGrand total: %.2f", Math.getGrandTotal(total));
		System.out.println(" ");
		String lastFour = ccNum.substring(11, 15);
		System.out.println("");
		System.out.println(cardName);
		System.out.println("\nxxxxxxxxxxxx" + lastFour + " " + cardExp + " " + cvv);
		System.out.println("Approved.\nThank you and come again!");
	}

	// CHEQUE PAY: If the user pays with check...
	private static void checkFormat(Scanner scan, ArrayList<Products> cart, double total) {

		// We're getting the user's name, routing#, bank#, and check#.
		String checkName = Validator.getString(scan, "Please enter the name on the check: ");
		String routing = Validator.getStringMatchingRegex(scan, "Please enter routing number: ", "\\d{9}");
		String bankNum = Validator.getStringMatchingRegex(scan, "Please enter bank account number:", "\\d{9}");
		String checkNum = Validator.getStringMatchingRegex(scan, "Enter check number: ", "\\d{4}");
		System.out.println("Check info: " + checkName + " " + routing + " " + bankNum + " " + checkNum);

		// RECEIPT BLOCK
		System.out.println("Here is your recipt: ");
		for (int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i));

		}
		System.out.println("\nSub-total: " + total);
		System.out.printf("\nTax: %.2f ", Math.getTax(total));
		System.out.printf("\nGrand total: %.2f", Math.getGrandTotal(total));
		System.out.println("Name : " + checkName + ", " + checkNum);
		System.out.println("Your check will be processed within 2-5 business days.");
		System.out.println("Thank you for shopping at our store.");
	}

	public static void createDirectory() {

		String dirPath = "resources";

		Path folder = Paths.get(dirPath);

		if (Files.notExists(folder)) {
			try { // This is an example of a checked exception.
				Files.createDirectories(folder);
				System.out.println("Folder was created successfully!");
			} catch (IOException e) {
				System.out.println("Something went wrong with the folder creation.");
			}
		}
	}

	public static void createFile(String directoryFolder, String fileName) {

		Path filePath = Paths.get(directoryFolder, fileName);

		if (Files.notExists(filePath)) {
			try {
				Files.createFile(filePath);
				System.out.println("File was created successfully!");
			} catch (IOException e) {
				System.out.println("Something went wrong!");
			}
		} else {
			System.out.println("File already exists!");
		}
	}

	public static void writeToFile(String directoryFolder, String fileName, ArrayList<Products> array) {

		Path filePath = Paths.get(directoryFolder, fileName);

		File file = filePath.toFile();

		try {

			for (Products m : array) {

				PrintWriter outW = new PrintWriter(new FileOutputStream(file, true));

				outW.println(m);

				outW.close();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File was not found!");
		}

	}

}
