/*
Name: <Your_name_here>
Roll Number: <Your_roll_number_here>
Class: <Your_class_here>

Program to demonstrate garbage collection in Java.
*/

public class MemoryDemo {
	public static void main(String[] args) {
		System.gc();
		long mem1, mem2, mem3;
		mem1 = Runtime.getRuntime().freeMemory();
		long[][] l = new long[100][100];
		mem2 = Runtime.getRuntime().freeMemory();
		l = null;
		System.gc();
		mem3 = Runtime.getRuntime().freeMemory();
		System.out.println("Initial memory: " + mem1);
		System.out.println("After matrix allocation: " + mem2);
		System.out.println("After nullification and garbage collection: " + mem3);
		System.out.println("Memory saved: " + (mem3 - mem2));
	}
}
