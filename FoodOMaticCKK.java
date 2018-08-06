/*
 * FOOD O MATIC!
 * @Claire Keenan-Kurgan
 * 
 * Plan:
 * Ask how many courses
 * Print out randomly generated meals
 * Allow user to create their own courses
 * 
 * Bonuses:
 * User can craft their own meals
 * Includes prices of items and meals
 * 
 */

package semester1;

import java.util.Random;
import java.util.Scanner;

public class FoodOMaticCKK {
	public static void main(String[] args) throws InterruptedException {

		Scanner scan= new Scanner (System.in);	
		Random gen = new Random();
		int number;
		int random1;
		int random2;
		int random3;
		int choice1;
		int choice2;
		int choice3;

		//menu items
		String[] adjective = new String[] {
				"Local", "Roasted", "Grilled", "Garlic mashed", "Oven dried", "Spiced", "Stewed", "Assorted", "Iced", "Sliced", "Braised", "Free-range", "Baby", "Teriyaki glazed", "Steamed"
		};

		String[] food = new String[] {
				"cauliflower", "tilapia fillet", "pork loin", "green beans", "jasmati rice", "rainbow carrots", "fingerling potatoes", "three color squash", "potatoes", "eggplant", "drumstick", "short rib", "duck breast", "eye round of beef", "baguette"
		};

		String[] side = new String [] {
				"with fennel", "gratin", "bengali style", "with peas", "pizza", "with balsamico", "with garlic and olive oil", "with pigeon peas", "with minted yogurt", "soup", "chutney", "salad", "with tropical fruit salsa", "over sticky rice", "au jus"		
		};

		//prices
		int [] price1 = new int [] {
				3, 0, 1, 2, 0, 1, 0, 0, 0, 0, 1, 5, 1, 2, 0 
		};	
		int [] price2 = new int [] {
				4, 15, 20, 5, 3, 4, 5, 3, 4, 6, 10, 17, 20, 25, 7
		};
		int [] price3 = new int [] {
				1, 2, 0, 1, 3, 0, 1, 3, 3, 0, 1, 0, 2, 1, 0
		};	

		//ask number of courses
		System.out.println("Welcome to the RANDOM school lunch generator!");
		System.out.println("First, I will design your recipes, and then, you will have a chance to do so yourself!");
		System.out.println("How many courses would you like in your meal?");
		number = scan.nextInt();
		scan.nextLine();

		//print out random courses
		for (int i = 0; i < number; i++) {
			random1 = gen.nextInt(15);
			random2 = gen.nextInt(15);
			random3 = gen.nextInt(15);
			System.out.println(adjective[random1] + " " + food[random2] + " " + side[random3] + ": $" + (price1[random1] + price2[random2] + price3[random3]));		
		}

		//build your own
		System.out.println("");
		System.out.println("Time to build your own courses! Type yes when ready");
		scan.nextLine();

		for (int x = 0; x < number; x++) {
			System.out.println("");
			System.out.println("Here is your first set of choices:");

			for (int i = 0; i < adjective.length; i++) {
				System.out.println(i+1 + ". " + adjective[i] + ": $" + price1[i]);
			}
			System.out.println("Please type the number of your selection.");
			choice1 = scan.nextInt();
			scan.nextLine();
			System.out.println("");

			System.out.println("Here is your second set of choices:");
			for (int i = 0; i< food.length; i++) {
				System.out.println(i+1 + ". " + food[i] + ": $" + price2[i]);
			}
			System.out.println("Please type the number of your selection.");
			choice2 = scan.nextInt();
			scan.nextLine();
			System.out.println("");

			System.out.println("Here is your third set of choices:");
			for (int i = 0; i < side.length; i++) {
				System.out.println(i+1 + ". " + side[i]+ ": $" + price3[i]);
			}
			System.out.println("Please type the number of your selection.");
			choice3 = scan.nextInt();
			scan.nextLine();

			System.out.println("");
			System.out.println("Generating course number " + (x+1));
			Thread.sleep(2000);
			System.out.println(adjective[choice1-1] + " " + food[choice2-1] + " " + side[choice3-1] + ": $" + (price1[choice1-1] + price2[choice2-1] + price3[choice3-1]));

			if (x<(number-1)){
				System.out.println("Ready to build the next course? Type yes");
				scan.nextLine();
				continue; 
			} 		
		}
		System.out.println("You've built all your courses! The end.");		
	}
}

