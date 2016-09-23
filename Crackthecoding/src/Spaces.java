
public class Spaces {
public static void main(String[] args)
{
	String s="My name is smith lowder";
	char str[]=new char[100];
	//str=s.toCharArray();
	//System.out.println(str.length);
	int j=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			str[j]=s.charAt(i);
			j++;
		}
		else
		{
			str[j]='%';
			str[j+1]='2';
			str[j+2]='0';
			j=j+3;
			
		}
	}
	System.out.println(str);
}
}
