package CoreJavaPractice;

public class StringPalindrome {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String s="madam";
		char ch;
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			rev=rev+ch;
			
			
		}
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
			System.out.println("Not palondrome");
	}

}
