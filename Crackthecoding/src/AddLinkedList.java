
public class AddLinkedList {
	public static void main(String[] args)
	{
		AddLinkedList l=new AddLinkedList();
		LL head=new LL(7);
		//head.add(7);
		head.add(1);
		head.add(6);
		LL head1=new LL(5);
		head1.add(9);
		head1.add(2);
		head1.add(3);
		int a=l.getNum(head);
		
		int b=l.getNum(head1);
		
	    LL traverse=l.getList(a+b);
	     //traverse=traverse.removeDuplicates(head);
	     while(traverse!=null)
	     {
	    	 System.out.println(traverse.data);
	    	 traverse=traverse.next;
	     }
	     
	    
	
	}

	private LL getList(int i) {
		LL node=new LL(i%10);
		i=i/10;
		
		while(i!=0)
		{
			node.add(i%10);
			i=i/10;
			
		}
		return node;
	}

	private int getNum(LL head) {
		LL current=head;
		int sum=0;
		int i=1;
		while(current!=null)
		{
			sum+=i*current.data;
			i=i*10;
			current=current.next;
			
		}
		return sum;
	}

}
