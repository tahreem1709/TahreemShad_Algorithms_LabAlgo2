package com.gl.transaction;

import java.util.Scanner;

public class Target {

	public void targetCheck(int targets, int[] earnings) {

		Scanner sc=new Scanner(System.in);//ctrl+shift+O
		for(int i=1;i<=targets;i++)
		{
			System.out.println("please enter target "+ i);//350
			int target=sc.nextInt();
			
			int flag=0;//target not achieved
			int sum=0;//sum up the earnings to achieve desired output
			    
			    for( int j = 0;j<earnings.length;j++)
			    {
				sum+=earnings[j];//
				   if(sum>=target)
				   {
					   flag=1;
					   System.out.println("Target achieved on day "+(j+1));
					   System.out.println("remaining balance: "+(sum-target));
					   break;
				   }
			   }
			       if(flag==0)
			    	   System.out.println("Target not achieved ");
			
			
			}
		
	
		
	}
		
	}

	

	
	


