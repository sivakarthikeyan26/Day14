package day14;

public class Linked_func {
	Node head;
	
	/**
	 * Method to add the elements in linked list
	 */
	public void add() {
		int n = Linked_main.sc.nextInt();
		for(int i=0; i<n; i++) {
			int e = Linked_main.sc.nextInt();
			Node newNode = new Node(e);
			if(head==null) {
				head=newNode;
			}
			else {
				Node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
		}
		display();
	}
	
	public void addFirst() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("Enter no of element to add at first");
			int n = Linked_main.sc.nextInt();
			for(int i=0; i<n; i++) {
				int e = Linked_main.sc.nextInt();
				Node newNode = new Node(e);
				newNode.next=head;
				head=newNode;
			}
		}
	}
	/**
	 * Method to diplay the elements in the linked list.
	 */
	public void display() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
}
