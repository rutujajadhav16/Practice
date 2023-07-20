package CoreJavaPractice;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {1,2,3,2,1,4};
		int count;
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
					//break;
				}
			}
			
		}
		for(int k=0;k<a.length;k++)
		{
			if(a[k]!=0)
			{
				b[k]=a[k];
				System.out.println(b[k]);
				
			}
			
		}

	}

}
