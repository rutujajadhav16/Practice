package CoreJavaPractice;

public class FibseriesUsingRecursion {

	public static int Fib(int num)
	{
		if(num<=1)
			return num;
		else
			return Fib(num-1)+Fib(num-2);
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count=10;
		for(int i=0;i<10;i++)
		{
			System.out.println(Fib(i));
		}
		

	}

}
