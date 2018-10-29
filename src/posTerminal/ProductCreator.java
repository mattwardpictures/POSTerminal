package posTerminal;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductCreator {

	public static void addProduct(Products product, ArrayList<Products> menu, String choice) {
		Scanner scan = new Scanner(System.in);

		if (choice.equalsIgnoreCase("Television")) {
			product = new TVSets();
			TVSets tv = (TVSets) product;
			String model = Validator.getCardString(scan, "Please enter the brand: ");
			tv.setMake(model);
			String name = Validator.getCardString(scan, "Please enter the model name: ");
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
			String model = Validator.getCardString(scan, "Please enter the brand: ");
			app.setMake(model);
			String name = Validator.getCardString(scan, "Please enter the model name:  ");
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
			String model = Validator.getCardString(scan, "Please enter the brand: ");
			p.setMake(model);
			String name = Validator.getCardString(scan, "Please enter the model name: ");
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
			String model = Validator.getCardString(scan, "Please enter the brand: ");
			c.setMake(model);
			String name = Validator.getCardString(scan, "Please enter the model name: ");
			c.setName(name);
			c.setCategory(choice);
			Double price = Validator.getDouble(scan, "Please enter the price: ");
			c.setPrice(price);
			String gpu = Validator.getCardString(scan, "Enter GPU info: ");
			c.setGpuInfo(gpu);
			String cpu = Validator.getCardString(scan, "Please enter the processor info: ");
			c.setCpuInfo(cpu);
			int mem = Validator.getInt(scan, "Please enter the memory size: ");
			c.setMemory(mem);
			int storage = Validator.getInt(scan, "Please enter the storage size: ");
			c.setStorage(storage);
			
			

			menu.add(c);
			
		} else if (choice.equalsIgnoreCase("Game Console")) {
			product = new GameConsole();
			GameConsole g = (GameConsole) product;
			String model = Validator.getCardString(scan, "Please enter the brand: ");
			g.setMake(model);
			String name = Validator.getCardString(scan, "Please enter the model name: ");
			g.setName(name);
			g.setCategory(choice);
			Double price = Validator.getDouble(scan, "Please enter the price: ");
			g.setPrice(price);
			String gpu = Validator.getCardString(scan, "Enter GPU info: ");
			g.setGpuInfo(gpu);
			String cpu = Validator.getCardString(scan, "Please enter the processor info: ");
			g.setCpuInfo(cpu);
			int res = Validator.getInt(scan, "Please enter the resolution: ");
			g.setResolution(res);
			int mem = Validator.getInt(scan, "Please enter the memory size: ");
			g.setMemory(mem);
			int storage = Validator.getInt(scan, "Please enter the storage size: ");
			g.setStorage(storage);
			
			menu.add(g);

		} 
		
	

	}

}
