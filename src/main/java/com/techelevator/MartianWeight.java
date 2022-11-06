package com.techelevator;

import java.util.Scanner;

/*
In case you've ever pondered how much you weigh on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

$ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth is 37 lbs. on Mars.
 235 lbs. on Earth is 88 lbs. on Mars.
 185 lbs. on Earth is 69 lbs. on Mars. 
 */
public class MartianWeight {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
/*program asks for a series of Earth Weights with spaces included
double Earth Weight1
double Earth Weight2
double Earth Weight3
**All Equal -0- and could amount to any number
*/
//user enters each weight
		double EarthWeight1 = 0;
		System.out.println("Enter Earth Weight #1");
		input = scan.nextLine();
		EarthWeight1 = Double.parseDouble(input);

		double EarthWeight2 = 0;
		System.out.println("Enter Earth Weight #2");
		input = scan.nextLine();
		EarthWeight2 = Double.parseDouble(input);


		double EarthWeight3  = 0;
		System.out.println("Enter Earth Weight #3");
		input = scan.nextLine();
		EarthWeight3 = Double.parseDouble(input);

/*solution is returned with value, Earth lbs + --is--. value, on Earth is Wm + " lbs.on Mars
/n=next line
%1f = on decimal place in float format
printf = flat format with more than one Data type
End return 3 seperate printout of earth lbs to Mars lbs. ----EarthWeight * .378 = MarsWeight
*/
		System.out.printf("%.1f Earth lbs.--is-- %.1f lbs. on Mars\n", EarthWeight1, (EarthWeight1 *.378) );
		System.out.printf("	%.1f lbs. on Earth --is-- %.1f lbs. on Mars \n", EarthWeight2, (EarthWeight2 * .378) );
		System.out.printf("		%.1f lbs. on Earth --is-- %.1f lbs. on Mars \n", EarthWeight3, (EarthWeight3 * .378) );
		}
	}



















