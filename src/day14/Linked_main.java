package day14;

import java.util.Scanner;
/*
 * main function to get user's choice.
 */
public class Linked_main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Linked_func lf = new Linked_func();
		System.out.println("1.Add elements\n2.Display elements");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			lf.add();
			break;
		case 2:
			lf.display();
			break;
		default:
			System.out.println("Enter the correct choice");
		}
	}

}
