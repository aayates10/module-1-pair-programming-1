package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	String input = "";

	//program asks user for the total amount of the bill
		double Bill = 0;
	//user inputs the total amount
		System.out.println("Total Bill");
		input = keyboard.nextLine();
		Bill = Double.parseDouble(input);

	//program asks user for the amount tendered
		double Tendered = 0;

	//user inputs the amount tendered
		System.out.println("Amount Tendered");
		input = keyboard.nextLine();
		Tendered = Double.parseDouble(input);

		double Change = 0;

		//program calculates and prints

		Change = (Tendered - Bill);
		System.out.printf("Bill total $%.2f  ",Bill);
		System.out.printf("Amount tendered $%.2f  ",Tendered);
		System.out.printf("Change Amount $%.2f",Change);
	}

}
