package CoreJavaPractice;

public class PrimeNumber1to10 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		boolean flag=false;
		for(int i=0;i<10;i++)
		{
			flag=false;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(" prime numbers: "+i);
			}
			
		}
		
	}

}
