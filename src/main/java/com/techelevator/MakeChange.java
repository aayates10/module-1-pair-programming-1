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
	Scanner scan = new Scanner(System.in);
// input string format
	String input = "";

	//program asks user for the total amount of the bill
		double Bill = 0;
	//user inputs the total amount
		//parseDouble to input double
		System.out.println("Total Bill");
		input = scan.nextLine();
		Bill = Double.parseDouble(input);

	//program asks user for the amount tendered
		double Tendered = 0;

	//user inputs the amount tendered
		//parseDouble to input double
		System.out.println("Amount Tendered");
		input = scan.nextLine();
		Tendered = Double.parseDouble(input);

		double Change = 0;

		//program calculates and prints
		//change = tendered - Bill
		// $added for the dollar amount symbol
		//.2f=two decimal places in float format

		Change = (Tendered - Bill);
		System.out.printf("BILL TOTAL: $%.2f  ",Bill);
		System.out.printf("AMOUNT TOTAL: $%.2f  ",Tendered);
		System.out.printf("CHANGE TOTAL: $%.2f",Change);
	}

}
