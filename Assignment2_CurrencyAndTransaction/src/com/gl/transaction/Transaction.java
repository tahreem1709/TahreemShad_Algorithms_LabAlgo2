package com.gl.transaction;

import java.util.Arrays;
import java.util.Scanner;

public class Transaction {
	public static void main(String[] args) {
		int nod;//nod=number of days
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of transactional days");//5
		nod=sc.nextInt();             
		
		int earnings[]=new int[nod];                                     //0   1   2   3   4
		System.out.println("Enter the transactions for "+nod+" days");   //100 200 300 400 500
		
		for(int i=0;i<nod;i++) {
			earnings[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(earnings));
		
		System.out.println("Enter Number of targets");//3
		int targets=sc.nextInt();
		
		Target tc=new Target();
		tc.targetCheck(targets,earnings);
		
	
	}

}
