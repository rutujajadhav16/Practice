package CoreJavaPractice;

public class Find3rdLargestElement {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {2,41,1,5,6};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			System.out.println(a[i]);
			
		}
		for(int j=a.length-1;j>0;j--)
		{
			System.out.println(a[j-2]);
			break;
		}

	}

}
