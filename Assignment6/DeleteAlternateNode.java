

//import java.util.LinkedList;


	class Node{
		
	
	Node head;
	int data;
	Node next;
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	public void show()
	{
		Node node=head;
		{
			while(node.next!=null)
			{
				System.out.print(node.data+" ");
				node=node.next;
				
			}
			System.out.println(node.data+" ");
			
		}
	}
	public void deletealt()
	{
		Node prev=head;
		Node now=head.next;
		while(prev!=null && now!=null)
		{
			prev.next=now.next;
			now=null;
			prev=prev.next;
			if(prev!=null)
			{
				now=prev.next;
			}
		}
	}
	
}


public class DeleteAlternateNode {
	public static void main(String[] args)
	{
		Node v=new Node();
		v.insert(2);
		v.insert(5);
		v.insert(1);
		v.insert(7);
		v.insert(9);
		v.insert(4);
		v.show();
		v.deletealt();
		v.show();
	}

}
