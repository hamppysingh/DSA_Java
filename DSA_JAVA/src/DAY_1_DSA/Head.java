package DAY_1_DSA;

public class Head {
	private Node head;

	public Node getN() {
		return head;
	}

	public void setN(Node n) {
		this.head = n;
	}
	public Head()
	{
		this.head=null;
	}
	@SuppressWarnings("unused")
	public boolean insert(int data)
	{
		Node newnode=new Node(data);
		if(newnode==null)
		{
			return false;
		}
		if(head==null)
		{
			head=newnode;
			return true;
		}
		Node temp=head;
		while(temp.next()!=null)
		{
			temp=temp.next();
		}
		temp.setnext(newnode);
		return true;
	}
	  public void display() {//with loop printing

	        Node temp = head;

	        while(temp != null) {
	            System.out.print(temp.getData() + " ");
	            temp = temp.next();
	        }
	        System.out.println();
	   }
	  //Without loop is below one
	  public void display(Node firstNode) {

	        if(firstNode == null) {
	            System.out.println();
	            return;
	        }

	        System.out.print(firstNode.getData() + " ");
	        display(firstNode.next());
	    }
	  public void displayRev(Node firstNode) {

	        if(firstNode == null) {
	            System.out.println();
	            return;
	        }

	        displayRev(firstNode.next());
	        System.out.print(firstNode.getData() + " ");
	    }
	  @SuppressWarnings("unused")
	public boolean insert(int data, int position) {
	        if(position <= 0) {
	            return false;
	        }

	        Node newNode = new Node(data);
	        if(newNode == null) {
	            return false;
	        }

	        if(position == 1) {
	            newNode.setnext(head);
	            head = newNode;
	            return true;
	        }

	        //if the position is not 1

	        //locate the prev node
	        Node prev = head;
	        for(int i = 1; i < position - 1; i++) {
	            prev = prev.next();
	            //if the position is invalid, prev will become null
	            if(prev == null) {
	                return false;
	            }
	        }

	        //link the newnode to the prev node
	        newNode.setnext(prev.next());
	        prev.setnext(newNode);
	        return true;

	    }

}
