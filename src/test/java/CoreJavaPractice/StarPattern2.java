package CoreJavaPractice;

public class StarPattern2 {

	public static void main(String[] args) 
	{
		
		/*  *******
		 *   *****
		 *    ***
		 *     *
		 */
		
		int star=7;
		int space=0;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
			space=space+1;
		}

	}

}
