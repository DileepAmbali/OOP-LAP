/*
	Name: <Your_name_here>
	Roll Number: <Your_roll_number_here>
	Class: <Your_class_here>

	* Program to check whether a string is palindrome or not
*/

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String S = sc.nextLine();
		int length = S.length();
		int i = 0;
		while (i < length / 2) {
			if (S.charAt(i) != S.charAt(length - i - 1)) {
				System.out.println("The string is not a palindrom");
				return;
			}
			i++;
		}
		System.out.println("The string is a palindrome! ");
	}
}
