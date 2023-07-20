package CoreJavaPractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter number to check prime or not");
		Scanner sc=new Scanner(System.in);
		int num;
		num=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				
			}
			
		}
		if(flag==true)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("Number is prime");
		}
		

	}

}
