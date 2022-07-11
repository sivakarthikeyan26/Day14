package day14;

public class Linked_func {
	Node head;
	
	/**
	 * Method to add the elements to the last of the linked list
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
	/**
	 * Method to add elements in front of the linked list
	 */
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
	/*
	 * Method to add elemnts in between the linked list.
	 */
	public void addBetween() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("Enter the element after which you want to insert new element");
			int ele = Linked_main.sc.nextInt();
			System.out.println("Enter the new element to be added");
			int ele1= Linked_main.sc.nextInt();
			Node temp = head;
			while(temp.next!=null) {
				if(temp.data==ele) {
					Node newNode = new Node(ele1);
					newNode.next=temp.next;
					temp.next=newNode;
					System.out.println("Node inserted at between succesfully");
					break;
				}
				temp=temp.next;
			}
		}
	}
	/*
	 * Method to delete the element at first.
	 */
	public void delAtFirst() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			Node temp= head.next;
			head.next=null;
			head=temp;
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
