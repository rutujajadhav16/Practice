package CoreJavaPractice;

public class SwapStringWithoutThirtVar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="Rutuja Jadhav";
		String s1="Sameer";
		
		s=s+s1;
		s1=s.substring(0,(s.length()-s1.length()));
		s=s.substring(s1.length());
		
		System.out.println(s);
		System.out.println(s1);
		

	}

}
