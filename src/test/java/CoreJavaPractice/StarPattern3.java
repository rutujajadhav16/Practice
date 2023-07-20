package CoreJavaPractice;

public class StarPattern3 {

	public static void main(String[] args) 
	{
		/* *
		 * **
		 * ***
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		int star=1;
		//int space=3;
		
		for(int i=0;i<7;i++)
		{
			for(int k=0;k<star;k++)
			{
				System.out.print("*");
			}
			
			if(i<3)
			{
				star++;
			}
			else
			{
				star--;
			}
			System.out.println();
		}

	}

}
