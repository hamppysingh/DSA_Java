package CirculerLinkedList;

public class MainCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularLinkedList cll = new CircularLinkedList();cll.insert(10);
        cll.display();
        /*cll.deleteByVal(10);
        cll.display();*/

        cll.insert(20);
        cll.display();
        cll.insert(30);
        cll.display();
        cll.insert(40);
        cll.display();
        cll.insert(50);
        cll.display();

        cll.insert(60, 1);
        cll.display();
        cll.insert(70, 4);
        cll.display();
        cll.insert(80, 8);
        cll.display();
        cll.insert(90, 10);
        cll.display();
	}

}
