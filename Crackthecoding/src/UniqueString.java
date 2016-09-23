
public class UniqueString {
	public static void main(String[] args)
	{
		String s="hello";
	 
		boolean[] b=new boolean[256];
	   for(int i=0;i<s.length();i++)
	   {
		   int val=s.charAt(i);
		   if(b[val])
			   System.out.println("not unique");
		   b[val]=true;
	   }
	   System.out.println("unique");
	
	}

}
