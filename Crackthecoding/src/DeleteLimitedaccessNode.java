
public class DeleteLimitedaccessNode {
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
	    traverse=traverse.next.next;
	    DeleteLimitedaccessNode d=new DeleteLimitedaccessNode();
	    LL now=d.deleteNode(traverse);
	    	     //traverse=traverse.removeDuplicates(head);
	     while(head!=null)
	     {
	    	 System.out.print(head.data);
	    	 head=head.next;
	     }
	     
	    
	
	}

	private LL deleteNode(LL traverse) {
		traverse=traverse.next;
		return traverse;
	}
}
