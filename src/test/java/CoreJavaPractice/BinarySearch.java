package CoreJavaPractice;

public class BinarySearch {

	public static int bsearch(int a[],int low,int high,int key)
	{
		int mid=(low+high)/2;
			while(low<=high)
			{
				if(a[mid]<key)
					low=mid+1;
				else if(a[mid]>key)
					high=mid-1;
				else if(a[mid]==key)
					return mid;
			}
			if(low>=high) {
				return -1;}
		
		
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,6,3,7,2,4,1};
		int key=bsearch(a,0,7,2);
		System.out.println(key);
		

	}

}
