
public class KlastElemet {
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
	    KlastElemet k=new KlastElemet();
	    traverse=k.reverse(head);
	    k.kelement(traverse,6);
	    	     //traverse=traverse.removeDuplicates(head);
	     while(traverse!=null)
	     {
	    	 System.out.print(traverse.data);
	    	 traverse=traverse.next;
	     }
	     
	    
	
	}

	private void kelement(LL head,int k) 
	{
	  LL current=head;
	  int a=0;
	  while(current!=null)
	  {
	//	 System.out.println(current.data);
		  
		  if(a==k)
			  System.out.println(current.data);
		  a++;
		  current=current.next;
	  }
	  if(a<k)
	  {
		  System.out.println("wrong index");
	  }
	}

	public LL reverse(LL head) {
		LL previous=null;
		LL current =head;
		LL nextnode=null;
		while(current!=null)
		{
			nextnode=current.next;
			current.next=previous;
			previous=current;
			current =nextnode;
		}
		return previous;
	}
}
