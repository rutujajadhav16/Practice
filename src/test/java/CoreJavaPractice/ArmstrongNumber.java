package CoreJavaPractice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter number to check armstrong");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String s=Integer.toString(num);
		int digit=s.length();
		int orgnum=num;
		int res=0;
		int rem;
		while(num!=0)
		{
			rem=num%10;
			res=(int) (res+Math.pow(rem,digit));
			num=num/10;
		}
		if(res==orgnum)
		{
			System.out.println("Armsrtng num : "+res);
		}
		else
		{
			System.out.println("Not armsrtong");
		}

	}

}
