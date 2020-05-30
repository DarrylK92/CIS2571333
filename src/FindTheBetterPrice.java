import java.util.Scanner;

/**
 * Homework2 - 3.33: Finds the better price given the weight and price of two items
 * 
 * CIS2571-002
 * @author Darryl Karney
 * @version 10Jun2018
 */

public class FindTheBetterPrice {

	public static void main(String[] args) {
		//Initiate variables
		Scanner input = new Scanner(System.in);
		int weightOne, weightTwo;
		double priceOne, priceTwo;
		
		//Get user input
		System.out.println("Enter weight and price for package 1: ");
		weightOne = input.nextInt();
		priceOne = input.nextDouble();
		System.out.println("Enter weight and price for package 2: ");
		weightTwo = input.nextInt();
		priceTwo = input.nextDouble();
		
		//Calculate better price
		priceOne = priceOne / weightOne;
		priceTwo = priceTwo / weightTwo;
		
		//Display results
		if (priceOne < priceTwo) {
			System.out.println("Package 1 has a better price.");
		} else if (priceTwo < priceOne) {
			System.out.println("Package 2 has a better price.");
		} else {
			System.out.println("Two packages have the same price.");
		}
	}

}
