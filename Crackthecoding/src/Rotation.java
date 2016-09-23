import java.util.Arrays;

public class Rotation {
	
	public boolean isSubstring(String s1,String s2)
	{
		if(s1.contains(s2))
		return true;
	 return false;	
		
	}
	public static void main(String[] args)
	{
		Rotation r=new Rotation();
		String s="waterbottle";
		String a="erbottlewat";
		s=r.sort(s);
		a=r.sort(a);
		//System.out.println(s+","+a);
		boolean b=r.isSubstring(s, a);
		System.out.println(b);
				
	}
	private  String sort(String s) {
		char a[]=s.toCharArray();
		Arrays.sort(a);
		String s1=new String(a);
		
		return s1;
	}

}
