package CoreJavaPractice;

public class FindFrequencyOfEachNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {1,2,3,2,1};
		int count;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					//System.out.println(a[i]+" ");
					count++;
					
				}
				
			}
			System.out.println(a[i]+" "+count);
		}
		

	}

}
