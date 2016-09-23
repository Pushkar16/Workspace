import java.util.HashMap;

public class PermuString {
	public static void main(String[] args)
	{
		PermuString ot=new PermuString();
		
		String s="abcd";
		String ans=ot.reducedString(s);
		System.out.println(ans);
	}

	public String reducedString(String s) {
		boolean unique=true;
		String answer="";
		HashMap<Character, Integer> hm=new HashMap();
		for(int i=0;i<s.length();i++)
		{
		  if(!hm.containsKey(s.charAt(i)))	
		  hm.put(s.charAt(i),1);
		  else
		  {
			  int count=hm.get(s.charAt(i));
			  hm.put(s.charAt(i),++count);
		  }
			  
		  
		}
		//System.out.println(hm);
		for(int j:hm.values())
		{
			if(j!=1)
				unique=false;
		}
		if(unique)
		return s;
		for(Character ah:hm.keySet())
		{
			answer+=ah+""+hm.get(ah);
		}
	return answer;
		
		
	}
}
