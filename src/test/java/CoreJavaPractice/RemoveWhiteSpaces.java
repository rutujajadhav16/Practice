package CoreJavaPractice;

public class RemoveWhiteSpaces {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s=" hi hello h r u there";
		
		StringBuilder sb=new StringBuilder();
		char ch[]=s.toCharArray();
		
		for(char c:ch)
		{
			if(!Character.isWhitespace(c))
			{
				sb.append(c);
			}
		}
		System.out.println(sb);
				

	}

	

}
