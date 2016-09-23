import java.util.HashSet;
import java.util.Hashtable;

public class LinkedListDuplicates {
	public static void main(String[] args)
	{
		LL head=new LL(1);
		head.add(3);
		head.add(4);
		head.add(5);
		head.add(3);
		head.add(5);
		head.add(1);
		head.add(2);
		head.add(4);
	    LL traverse=head;
	     traverse=traverse.removeDuplicates(head);
	     while(traverse!=null)
	     {
	    	 System.out.println(traverse.data);
	    	 traverse=traverse.next;
	     }
	     
	    
	
	}

}
class LL
{
	int data;
	LL next=null;
	LL(int data)
	{
		this.data=data;
	}
	
	public LL removeDuplicates(LL head) {
		HashSet<Integer> h=new HashSet<Integer>();
		LL current=head;
		LL previous=null;
		while(current!=null)
		{
			if(h.contains(current.data))
			{
			   previous.next=current.next;
			}
			else{
				 h.add(current.data);
				 previous=current;
				 
			}
			current=current.next;
		}
		return head;
		
		
	}

	public void add(int d)
	{
		LL n=new LL(d);
		LL current=this;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=n;
		
	}

	
}
