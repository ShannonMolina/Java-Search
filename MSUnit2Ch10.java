/*******************************************************************************
*MSUnit2Ch10.java
*Molina
*
*This program generates random number between 1 and 100, then allows you to search for matching values.
*Output is printed for a sorted and unsorted list.
*******************************************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 public class MSUnit2Ch10
 {
	public static void main(String []args)//main
    {

//Declare an array list to hold random numbers.
        ArrayList<Integer> list = new ArrayList<Integer>(); //declare ArrayList of
     														//type Integer named list


//Get input for how many random numbers to use.
		Scanner scan = new Scanner(System.in);
		System.out.printf("How many random numbers between 1 and 100: ");
		int size = scan.nextInt(); //int entered will be size


//Using a “for loop”, add random numbers to the array list between 1 and 100.
		for (int i=0; i<size; i++)
		{
			list.add((int)((Math.random()*99)+1));//random numbers between 1-100
		}


//Get input for value to be searched.
		System.out.printf("Which random number are you searching for?: ");
		int num = scan.nextInt();//int entered will be num


//Using a “for-each loop” and a sequential search, search through the array list for the search term entered.
		int index = 1;
		for(Integer a : list)
		{
			if(a == num)
			{
				System.out.println("\nUnsorted List"); //seperate loop and break so that
				break;								// this title does not repeat
			}
		}

		for(Integer a : list)
		{
			if(a == num)
			{
				System.out.println(num + " found at location: " + index);
			}
			index++;
		}


//Use java collections to sort the array list.
		 Collections.sort(list); //sort list


//Using a “for-each loop” and a sequential search, search through the array list for the search term entered.
		 for(Integer a : list)
		 {
		 	if(a == num)
		 	{
		 		System.out.println("\nSorted List"); //seperate loop and break so that
		 		break;								// this title does not repeat
		 	}
		}

		 for(Integer a : list)
		 {
		 	if(a == num)
		 	{
		 		System.out.println(num + " found at location: " + index);
		 	}
		 	index++;
		}


//Print the total value of all random numbers added together after the search has complete.
		int sum = 0;
		for (Integer a : list)
		{
			sum += a;
		}
		System.out.println("\nTotal of all the numbers: " + sum);

	}//end main
}//end class
