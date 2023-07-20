package CoreJavaPractice;

import java.util.ArrayList;

public class SameElementinarray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(4);
		al.add(3);
		al.add(7);
		
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(3);
		al1.add(8);
		al1.add(1);
		
		if(al.size()!=al1.size())
		{
			System.out.println("does not have same elemnts");
		}
		for(int i:al1)
		{
			//System.out.println(i);
			if(al.contains(i))
			{
				System.out.println("same element "+i);
			}
			else
			{
				System.out.println("not in al"+i);
			}
			
		}
		

	}

}
