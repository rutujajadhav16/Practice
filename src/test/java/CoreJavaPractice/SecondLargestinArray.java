package CoreJavaPractice;

import java.util.Scanner;

public class SecondLargestinArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] a=new int[5];
		System.out.println("Enter lement in array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			int j=sc.nextInt();
			a[i]=j;
		}
		System.out.println("Elements in array ");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		System.out.println();
		int temp;
		System.out.println("Sorted array ");
		for(int j=0;j<a.length;j++)
		{
			for(int l=j+1;l<a.length;l++)
			{
				if(a[j]<a[l])
				{
					temp=a[j];
					a[j]=a[l];
					a[l]=temp;
				}
			}
			System.out.print(a[j]+" ");
			
		}
		System.out.println("Second larest "+a[1]);
		
		

	}

}
