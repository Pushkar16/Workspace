package leet;

import java.util.ArrayList;
import java.util.Collections;

public class LongestPalindrome {
	public boolean isPalindrome(String s)
	{
		
	
		int i=0;
		int j=s.length()-1;
		char a[]=s.toCharArray();
		while(i<j)
		{
		if(a[i]!=a[j])
		{
			return false;
		}
		else{
			i++;
			j--;
		}
		}
		
		return true;
	}
	public String longestPalindrome(String s)
	{
		
		int maxlength=0;
		String answer = null;
		
		Boolean b;
		/*for( int i=0;i<s.length();i++)
		{
			for(int j=s.length()-1;j>=i;j--)
			{
			b=isPalindrome(s.substring(i, j+1));
			if((b==true)&&(s.substring(i,j+1).length()>maxlength))
			{ 
				maxlength=s.substring(i,j+1).length();
				answer=s.substring(i, j+1);
			
			}
			
			}
		}*/
		int i=0;
		int j=s.length()-1;
		while(i<=j)
		{
			if(isPalindrome(s.substring(i, j+1)))
			{
				if(s.substring(i, j+1).length()>maxlength)
				{
				answer=s.substring(i, j+1);
				maxlength=s.substring(i,j+1).length();
				}
				i=i+1;
				j=s.length()-1;
			}
			else{
				j=j-1;
				
			}
		}
		
		
		
		return answer;
	}
	
		
		




	public static void main(String[] args)
	{
		LongestPalindrome lp=new LongestPalindrome();
		Boolean b=lp.isPalindrome("");
		String a=lp.longestPalindrome("abcba");
		System.out.println(a);
		
	}

}
