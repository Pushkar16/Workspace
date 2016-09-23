
public class CircularLinkedList {
	public static void main(String[] args)
	{
		LL head=new LL(1);
		head.add(3);
		head.add(4);
		head.add(5);
		
	    LL traverse=head;
	     
	     while(traverse.next!=null)
	     {
	    	 //System.out.println(traverse.data);
	    	 traverse=traverse.next;
	     }
	     traverse.next=head.next;
	     LL print =head;
	     while(print.next!=null)
	     {
	    	 System.out.println(print.data);
	    	 print=print.next;
	     }
	     
	    
	
	}

}
