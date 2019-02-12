class Node{
	int data;
	Node prev;
	Node next;

	/*Node(){
		this.data=0; 
	}*/

	Node(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

class DoublyLL{

	Node head;
	Node tail;

	public void traverse(){
		if(head == null){
			System.out.println("List is empty");
		}
		else{
			Node curr;

			curr = head;

			while(curr != null){
				System.out.println(curr.data);
				curr = curr.next;
			}
		}		
	}

	public void traverseReverse(){
		if(tail == null){
			System.out.println("List is empty");
		}
		else{
			Node curr;
			curr = tail;

			while(curr != null){
				System.out.println(curr.data);
				curr = curr.prev;  
			}
		}
	}

	public void insertBeg(int data){
		Node n = new Node(data);

		if(head == null){
			head = n;
			tail = n;
		}
		else{
			head.prev = n;
			n.next = head;
			head = n;
		}
	}

	public void insertEnd(int data){
		Node n = new Node(data);

		if(head == null){
			head = n;
			tail = n;
		}
		else{
			tail.next = n;
			n.prev = tail;
			tail = n;
		}
	}

	public void deleteBeg(){
		if(head == null){
			System.out.println("List is Empty");
		}
		else{
			head = head.next;
			head.prev = null;
		}
		if(head == tail){
			head = null;
			tail = null;
		}		
	}

	public void deleteEnd(){
		Node prev = head;
		tail = head;
		if(head == null){
			System.out.println("List is Empty");
		}
		else{
			while(tail.next != null){
				prev = tail;
				tail = tail.next;
			}
			prev.next=null;
		}
		if(head == tail){
			head = null;
			tail = null;
		}
	}

	public void insertPos(int pos,int data){
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
				n.prev = prev;
				n.next = temp;

			}

			if(pos > c || pos<0){
				System.out.println("Invalid Position");
				break;
			}
		}
	}
}

public class dl1{
	public static void main(String[] args) {
		DoublyLL dl = new DoublyLL();	
		dl.insertEnd(1);
		dl.insertEnd(2);
		dl.insertEnd(3);
		dl.insertEnd(4);

		//dl.deleteEnd();
		dl.insertPos(2,5);
		dl.traverse();
	}
}