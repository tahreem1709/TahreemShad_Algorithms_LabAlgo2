package Currency;

import java.util.Arrays;
import java.util.Scanner;



public class DriverApp {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Number of notes in your Country!");
		int numberOfNotes=sc.nextInt();
		
		int currency[]=new int[numberOfNotes];
		
		System.out.println("Enter the "+numberOfNotes +" denomination values in any order");
		for (int i = 0; i < currency.length; i++) {
			currency[i]=sc.nextInt();
			
		}
		System.out.println("Before Sorting "+Arrays.toString(currency));
		
		MergeSort ms=new MergeSort();
		ms.sort(currency, 0, numberOfNotes-1);//array,firstIndex,lastIndex=size-1
		
		System.out.println("After Sorting "+Arrays.toString(currency));
		
		
		System.out.println("Please enter the amount to exchange");
		int amount=sc.nextInt();
		
		NoteCount nc=new NoteCount();
		nc.counting(currency,amount);
		
	}

}
