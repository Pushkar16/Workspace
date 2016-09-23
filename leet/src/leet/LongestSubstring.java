package leet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class LongestSubstring {
	public boolean uniqueString(String s)
	{
		
		boolean unique = false;
		for(char c:s.toCharArray())
		{
			if(s.indexOf(c)==s.lastIndexOf(c))
           {
	            unique=true;
           }
			else{
				unique=false;
			}
			//System.out.println(s);
		}
		return unique;
		
	}
public int lengthOfLongestSubstring(String s) {

	int i=0;int j = 0;
	int n=s.length();
	int count=0;
	HashSet<Character> hs=new HashSet<Character>();
	char sa[]=s.toCharArray();
	
	while(i<n&&j<n)
	{
		if(!hs.contains(sa[j]))
		{
			
			hs.add(sa[j]);
			//System.out.println(s.toCharArray()[j]);
			j++;
			 count = Math.max(count, j-i);
		}
		else
		{
			hs.remove(s.toCharArray()[i]);
			//System.out.println(s.toCharArray()[i]);
			i++;
		}
		
	}
	//System.out.println(hs);
	return count;
	}
	
    
 public static void main(String[] args)
 {
	 Boolean s;
	 int answer;
     LongestSubstring l=new LongestSubstring();
     answer=l.lengthOfLongestSubstring("pwwkew");
     System.out.println(answer);
     //System.out.println("".length());

}
}
