package CoreJavaPractice;

public class RemoveDuplicateChar {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s="Rutuja jadhav";
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='\0';
					
				}
			}
			System.out.print(ch[i]);
		}

	}

}
