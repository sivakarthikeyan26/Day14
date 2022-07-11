package day14;

import java.util.Scanner;
/*
 * main function to get user's choice.
 */
public class Linked_main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean choice=true;
		Linked_func lf = new Linked_func();
		while(choice) {
			System.out.println("1.Add elements\n2.Display elements\n3.Add elements at first\n4.Addbetween\n5.Delete at first\n6.Delete last element\n7.Exit program");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				lf.add();
				break;
			case 2:
				lf.display();
				break;
			case 3:
				lf.addFirst();
				break;
			case 4:
				lf.addBetween();
				break;
			case 5:
				lf.delAtFirst();
				break;
			case 6:
				lf.delLast();
				break;
			case 7:
				choice=false;
				break;
			default:
				System.out.println("Enter the correct choice");
			}
		}
		
	}

}
