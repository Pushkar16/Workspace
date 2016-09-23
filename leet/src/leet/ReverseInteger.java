package leet;

public class ReverseInteger {
	 public int reverse(int x) {
		 boolean negative=false;
		 if(x<0)
			 negative=true;
		 x=Math.abs(x);
		 double i=0;
		 while(x>0)
		 {
			if(i*10+(x%10)>Integer.MAX_VALUE)
				return 0;
			i=i*10+(x%10);
			x=x/10;
			//System.out.println(x);
		 };
		 
		 if(negative==true)
		i=-i;
		 
		return (int)i;
		 
		 
	    }
	 public static void main(String[] args)
	 {
		 ReverseInteger ri=new ReverseInteger();
		 int a=ri.reverse(1534236469);
		 System.out.println(a);
	 }
}
