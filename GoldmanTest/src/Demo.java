import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;

public class Demo {
	public static int numberOfBreaches(String[] input)
	{
		//int number =Integer.parseInt(input[0]);
		
		int breaches=0;
		for(int i=2;i<input.length;i++)
		{
			double sum=0,avg=0,count=0;
			String[] str=input[i].split(",");
			
			//System.out.println(str[0]);
			for(int j=1;j<i;j++)
			{
				
			String[] internal=input[j].split(",");
			 
				 //System.out.println("in if");
				 if(Math.abs(Integer.parseInt(internal[2])-Integer.parseInt(str[2]))<5){
					 if(Integer.parseInt(internal[1])<=Integer.parseInt(str[1])){
						sum=sum+Double.parseDouble(internal[0]);
						count=count+1;
						avg=sum/count;
						//System.out.println("i :"+i);
						
					 }
					 
				 }
				 
				 
			 
			}
			if(Double.parseDouble(str[0])>avg)
			{
				System.out.println(str[0]+","+avg+"i"+i);
				breaches++;
			}
			
			
			
		}
		return breaches;
	}
 public static void main(String[] args)
 {
	String[] input={"6","1000,9,1","1000,10,2","1000,11,3","1000,12,4","1400,13,5","1000,9,6"};
	
	int number=Demo.numberOfBreaches(input);
	System.out.println(number);
	
 }
}
