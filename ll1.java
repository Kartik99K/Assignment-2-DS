class Node{
	int data;
	Node next;
	Node head=null;
	int c=0;


	Node(){
		this.data=0;
	}

	Node(int data){
		this.data=data;
	}

	public Node add(int data){
		Node n = new Node(data);
		Node temp=head;
		
		if (head == null) {
			head=n;
			
		}
		
		else{
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=n;
		}
	
		return head;
	}

	public Node insertBeg(int data){
		Node n = new Node(data);

		if(head == null){
			head=n;
		}
		else{
			n.next=head;
			head = n;
		}
		return head;
	}

	public void print(Node head){
		if(head == null){
			System.out.print("List is empty");
		}
		else{
			System.out.print("List elements are: ");
			for(Node i=head;i!=null;i=i.next){
				System.out.print(i.data+" ");
			}
		}
	}

	public void printrev(Node head){
		if(head == null){
			return;
		}
		else{	
			printrev(head.next);
			System.out.print(head.data+" ");
		}
	}

	public void printalt(Node head){
		while(head!=null){
			System.out.print(head.data+" ");

			head=head.next;
			if(head!=null){
				head=head.next;
			}
		}
	}

	public void printmid(Node head){
		Node slow=head;
		Node fast=head;
		while(fast != null){
			fast=fast.next;
			if(fast!=null){
				fast=fast.next;
				slow=slow.next;	
			}	
		}
		System.out.print(slow.data);
	}

	public void insertPos(Node head,int pos,int data){
		Node temp = head;
		Node prev = head;
		int c=1;
		while(temp != null){
			prev = temp;
			temp = temp.next;
			c++;
			if(c == pos){
				Node n = new Node(data);
				prev.next = n;
				n.next = temp;
			}

			if(pos > c || pos<0){
				System.out.println("Invalid Position");
				break;
			}
		}
	}

	public Node delBeg(Node head){

		if(head == null){
			System.out.println("List is empty");
		}
		else{
			Node temp = head; 
			head = temp.next;
			temp.next = null;
		}
		return head;
	}

	public void delEnd(Node head){
		if(head == null){
			System.out.println("List is Empty");
		}
		else{
			Node prev = head;
			Node curr = head;
			
			while(curr.next != null){
				prev = curr;
				curr = curr.next;
			}
			if(prev == curr){
				head = null;
			}
			prev.next=null;
		}
	}
}
public class ll1{
	public static void main(String[] args) {
		Node n = new Node();

		Node head= n.add(1);
		head = n.add(2);
		head = n.add(3);
		head = n.add(4);
		head = n.add(5);
		//head = n.insertBeg(0);
		//n.print(head);
		//n.printrev(head);
		//n.printalt(head);
		//n.insertPos(head,-1,8);	
		//head = n.delBeg(head);
		n.delEnd(head);
		n.print(head);
	}
}