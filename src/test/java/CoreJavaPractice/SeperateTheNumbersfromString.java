package CoreJavaPractice;

public class SeperateTheNumbersfromString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="abc123r";
		char ch[]=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				sb.append(ch[i]);
			}
			
		}
		System.out.println(sb);

	}

}
