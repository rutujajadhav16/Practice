package CoreJavaPractice;

public class RemoveDuplicateWord {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="hello bye hi bye hello helo";
		String str[]=s.split(" ");
		boolean repeated;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length;i++)
		{
			repeated=false;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					repeated=true;
					break;
					
				}
			}
			if(repeated==false)
			{
				sb.append(str[i]+" ");
				
			}
		}
		System.out.println(sb);

	}

}
