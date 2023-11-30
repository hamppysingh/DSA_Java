package CirculerLinkedList;

public class CircularLinkedList {
	private Node head;

	public CircularLinkedList() {
		this.head = null;
	}
	public boolean insert(int data) {
		Node nn=new Node(data);
		if(nn==null)
			return false;
		if(head==null)
		{
			head=nn;
			nn.setNext(head);
			return true;
		}
		Node temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		temp.setNext(nn);
		nn.setNext(head);
		return true;
	}
	public boolean insert(int data,int position) {
		   if(position <= 0) {
	            return false;
	        }

	        Node newNode = new Node(data);
	        if(newNode == null) {
	            return false;
	        }

	        if(position == 1) {

	            if(head == null) {
	                head = newNode;
	                newNode.setNext(newNode);
	                return true;
	            }

	            newNode.setNext(head);
	            Node last = head;
	            while(last.getNext() != head) {
	                last = last.getNext();
	            }
	            last.setNext(newNode);
	            head = newNode;

	            return true;
	        }

	        Node prev = head;
	        for(int i= 1; i < position - 1; i++) {
	            prev = prev.getNext();
	            if(prev == head) {
	                return false;
	            }
	        }

	        newNode.setNext(prev.getNext());
	        prev.setNext(newNode);

	        return true;
	}
	public void display() {
		 if(head == null) {
	            return;
	        }

	        Node temp = head;
	        do {
	            System.out.print(temp.getData() + " ");
	            temp = temp.getNext();
	        }while(temp != head);

	        System.out.println();
		
	}
	
	
}
