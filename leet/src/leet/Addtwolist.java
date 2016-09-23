package leet;

public class Addtwolist {
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode next=null;
	ListNode prev=null;
	while(l1!=null&&l2!=null)
	{
		l1.val=l1.val+l2.val;
		l2=l2.next;
		next=l1.next;
		l1.next=prev;
		prev=l1;
		l1=next;
		
		
	}
	
			
	
	return prev;
        
    }
public static void main(String[] args)
{
	ListNode l1=new ListNode(20);
	ListNode l2=new ListNode(4);
	ListNode l3=new ListNode(3);
	l1.next=l2;
	l2.next=l3;
	ListNode i = l1;
	ListNode l4=new ListNode(90);
	ListNode l5=new ListNode(6);
	ListNode l6=new ListNode(4);
	l4.next=l5;
	l5.next=l6;
	Addtwolist a=new Addtwolist();
	ListNode l7=a.addTwoNumbers(l1, l4);
	ListNode prev=null;
	ListNode next=null;
	while(l7!=null)
	{
		next=l7.next;
		l7.next=prev;
		prev=l7;
		l7=next;
	}
	while (prev!=null)
	{
		System.out.println(prev.val);
		prev=prev.next;
	}
	
}


}
