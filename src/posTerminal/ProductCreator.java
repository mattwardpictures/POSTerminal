package posTerminal;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductCreator {

	public static void addProduct(Products product, ArrayList<Products> menu, String choice) {
		Scanner scan = new Scanner(System.in);

		if (choice.equalsIgnoreCase("Television")) {
			product = new TVSets();
			TVSets tv = (TVSets) product;
			String model = Validator.getCardString(scan, "Please enter the model: ");
			tv.setMake(model);
			String name = Validator.getCardString(scan, "Please enter the brand: ");
			tv.setName(name);
			tv.setCategory(choice);
			double price = Validator.getDouble(scan, "Please enter the price: ");
			tv.setPrice(price);
			int screen = Validator.getInt(scan, "Please enter the screen size: ");
			tv.setDisplaySize(screen);
			int res = Validator.getInt(scan, "Please enter the resolution: ");
			tv.setResolution(res);

			menu.add(tv);

		} else if (choice.equalsIgnoreCase("Appliance")) {

			product = new Appliances();
			Appliances app = (Appliances) product;
			String model = Validator.getCardString(scan, "Please enter the model: ");
			app.setMake(model);
			String name = Validator.getCardString(scan, "Please enter the brand: ");
			app.setName(name);
			app.setCategory(choice);
			Double price = Validator.getDouble(scan, "Please enter the price: ");
			app.setPrice(price);
			Double cuft = Validator.getDouble(scan, "Please enter the size (cubic feet): ");
			app.setCubicFeet(cuft);
			menu.add(app);
			
		} else if (choice.equalsIgnoreCase("Phone")) {
			
			product = new Phones();
			Phones p = (Phones) product;
			String model = Validator.getCardString(scan, "Please enter the model: ");
			p.setMake(model);
			String name = Validator.getCardString(scan, "Please enter the brand: ");
			p.setName(name);
			p.setCategory(choice);
			Double price = Validator.getDouble(scan, "Please enter the price: ");
			p.setPrice(price);
			String cpu = Validator.getCardString(scan, "Please enter the processor make: ");
			p.setCpuInfo(cpu);
			int mem = Validator.getInt(scan, "Please enter the memory size: ");
			p.setMemory(mem);
			double display = Validator.getDouble(scan, "Please enter the display size: ");
			p.setDisplaySize(display);
			
			menu.add(p);
			
		} else if (choice.equalsIgnoreCase("Computer")) {
			product = new Computer();
			Computer c = (Computer) product;
			String model = Validator.getCardString(scan, "Please enter the model: ");
			c.setMake(model);
			String name = Validator.getCardString(scan, "Please enter the brand: ");
			c.setName(name);
			c.setCategory(choice);
			Double price = Validator.getDouble(scan, "Please enter the price: ");
			c.setPrice(price);

			menu.add(c);
			
		} else if (choice.equalsIgnoreCase("Game Console")) {
			product = new GameConsole();
			GameConsole g = (GameConsole) product;
			String model = Validator.getCardString(scan, "Please enter the model: ");
			g.setMake(model);
			String name = Validator.getCardString(scan, "Please enter the brand: ");
			g.setName(name);
			g.setCategory(choice);
			Double price = Validator.getDouble(scan, "Please enter the price: ");
			g.setPrice(price);

			menu.add(g);

		}

	}

}
