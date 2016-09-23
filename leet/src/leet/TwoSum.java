package leet;

public class TwoSum {
	  public int[] twoSum(int[] nums, int target) {
		  int[] a={-1,-1};
		  int k=0;
		  for(int i=0;i<nums.length;i++)
		  {
			for(int j=i+1;j<nums.length;j++)
			{
			  if(nums[i]+nums[j]==target)
			  {
				  a[k]=i;
				  a[k+1]=j;
				 k++;
			  }
			  
			}
		  }
		return a;
	        
	    }
       public static void main(String[] args)
       {
    	   TwoSum t=new TwoSum();
    	   int[] answer;
    	   int[] nums={2,3,5,7,9,12};
    	   answer=t.twoSum(nums,17);
    	   for(int i:answer)
    	   System.out.println(i);
       }
}

