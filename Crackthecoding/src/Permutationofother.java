import java.util.Arrays;

public class Permutationofother {
	public boolean ispermu(String a,String b)
	{
		char a1[]=sort(a);
		char b1[]=sort(b);
		System.out.println(a1);
		System.out.println(b1);
		if(Arrays.equals(a1, b1))
		{
			return true;
		}
		return false;
		
	}
	private char[] sort(String a) {
		char b[]=a.toCharArray();
		for(int i=0;i<b.length-1;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					char temp=b[i];
					b[i]=b[j];
					b[j]=temp;
					
				}
			}
		}
		return b;
	}
	public static void main(String[] args)
	{
		Permutationofother ot=new Permutationofother();
		
		boolean b=ot.ispermu("abcd", "cdba");
		System.out.println(b);
	}

}
