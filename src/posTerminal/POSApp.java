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

public class POSApp {

	static String directoryFolder = "resources";
	static String fileName = "products.txt";

	public static void main(String[] args) {

		ArrayList<Products> menu = new ArrayList<>();

		TVSets tv1 = new TVSets("Samsung", "LED", "TV", 849.99);
		tv1.setDisplaySize(65);
		tv1.setResolution(2160);

		TVSets tv2 = new TVSets("Vizio", "LED", "TV", 899.99);
		tv2.setDisplaySize(70);
		tv2.setResolution(2160);

		TVSets tv3 = new TVSets("Insignia", "LCD", "TV", 299.99);
		tv3.setDisplaySize(55);
		tv3.setResolution(1080);

		Computer cpu1 = new Computer("Apple", "MacBook Pro", "Computer", 2099.99);
		cpu1.setStorage(64);

		Computer cpu2 = new Computer("HP", "A6 Series", "Computer", 399.99);
		cpu2.setStorage(8);

		Phones phone1 = new Phones("Apple", "iPhone XR", "Phones", 749.99);
		phone1.setDisplaySize(5.8);
		phone1.setMemory(64);

		Phones phone2 = new Phones("Samsung", "Galaxy S8", "Phones", 549.99);
		phone2.setDisplaySize(5.8);
		phone2.setMemory(64);

		Electronics game1 = new Electronics("Microsoft", "XBOX One", "Gaming", 299.99);
		game1.setMemory(1);
		game1.setProcessor("AMD Custom");

		Electronics game2 = new Electronics("Sony", "Playstation 4", "Gaming", 299.99);
		game2.setMemory(1);
		game2.setProcessor("AMD Custom 8 Core");

		Appliances app1 = new Appliances("Samsung", "Washer", "Appliance", 899.99);
		app1.setCubicFeet(4.5);

		Appliances app2 = new Appliances("Samsung", "Dryer", "Appliance", 899.99);
		app2.setCubicFeet(7.5);

		Appliances app3 = new Appliances("Frigidaire", "Refrigerator", "Appliance", 689.99);
		app3.setCubicFeet(18);

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
		//writeToFile(directoryFolder, fileName, menu);
		
		
		System.out.println("Welcome Best Butt");
		System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", "BRAND", "MODEL", "CATEGORY", "PRICE", "DESCRIPTION");
		System.out.println("=======================================================================================");
		for (Products products : menu) {
			System.out.println(products);
		}
		

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
