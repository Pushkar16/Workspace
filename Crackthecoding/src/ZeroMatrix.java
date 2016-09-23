import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {
	public static void main(String[] args)
	{
		int[][] s=new int[][]{
			{1,3,2},{0,4,1}};
			int rows=s.length;
			boolean zero=false;
			List<Integer> row = new ArrayList();
			List<Integer> col=new ArrayList();
			int cols=s[0].length;
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					if(s[i][j]==0)
					{
					  	row.add(i);
					  	col.add(j);
					}
					
				}
			}
			//System.out.println(row);
			//System.out.println(col);
	
	
	
	for(int i:row)
	{
		for(int j=0;j<cols;j++)
		{
			s[i][j]=0;
		}
	}
	for(int j:col)
	{
		for(int i=0;i<rows;i++)
		{
			s[i][j]=0;
		}
	}
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
	System.out.println(s[i][j]);
		}
	}	

	}
}
