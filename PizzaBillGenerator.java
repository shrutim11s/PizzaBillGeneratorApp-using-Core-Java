package pizza.abc;

import java.util.Scanner;

public class PizzaBillGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner scanner = new Scanner(System.in);
		        int choice;

		        System.out.println("Welcome to Pizza Mania!");

		        do {
		            System.out.println("\nSelect the type of pizza:");
		            System.out.println("1. Veg Pizza");
		            System.out.println("2. Non-Veg Pizza");
		            System.out.println("3. Deluxe Veg Pizza");
		            System.out.println("4. Deluxe Non-Veg Pizza");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice (1-5): ");
		            choice = scanner.nextInt();

		            if (choice >= 1 && choice <= 4) {
		                String pizzaType = "";
		                boolean extraCheese = false;
		                int extraToppings = 0;

		                switch (choice) {
		                    case 1:
		                        pizzaType = "Veg Pizza";
		                        break;
		                    case 2:
		                        pizzaType = "Non-Veg Pizza";
		                        break;
		                    case 3:
		                        pizzaType = "Deluxe Veg Pizza";
		                        break;
		                    case 4:
		                        pizzaType = "Deluxe Non-Veg Pizza";
		                        break;
		                }

		                
		                if (!pizzaType.contains("Deluxe")) {
		                    System.out.print("Do you want extra cheese? (yes/no): ");
		                    String cheeseChoice = scanner.next();
		                    extraCheese = cheeseChoice.equalsIgnoreCase("yes");

		                    System.out.print("Enter number of extra toppings: ");
		                    extraToppings = scanner.nextInt();
		                }

		              
		                Pizza pizza = new Pizza(pizzaType, extraCheese, extraToppings);

		                
		                System.out.println("\n--- Your Pizza Bill ---");
		                System.out.println(pizza.getBill());
		            } else if (choice == 5) {
		            	
		                System.out.println("Thank you for visiting Pizza Mania!");
		            } else {
		            	
		                System.out.println("Invalid choice. Please try again.");
		            }
		            
		        }
		              while (choice != 5);
	}

}
