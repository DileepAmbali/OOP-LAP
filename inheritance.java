import java.util.Scanner;

// Write a Java program which creates a
// class named'Employee'
// having the
// following members:Name,Age,
// Phone number, Address, Salary.
// It also
// has a method named'print-

// Salary( )' which prints the salary of the Employee. Two classes 'Officer' and 'Manager'
// inherits the 'Employee' class. The 'Officer' and 'Manager' classes have data members 'spe-
// cialization' and 'department' respectively. Now, assign name, age, phone number, address
// and salary to an officer and a manager by making an object of both of these classes and
// print the same. (Exercise to understand inheritance)

class employee {
	String name, address;
	int age, phone_number;
	float salary;

	void salary() {
		System.out.println("The salary of the employee is: " + salary);
	}
}

class Officer extends employee {
	String specialization;
}

class Manager extends employee {
	String department;
}

class inheritance {
	public static void main(String[] args) {
		Officer o = new Officer();
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);
		System.out.println("OFFICER");
		System.out.print("Enter name: ");
		o.name = sc.nextLine();
		System.out.print("Enter age: ");
		o.age = sc.nextInt();
		System.out.print("Enter address: ");
		sc.nextLine();
		o.address = sc.nextLine();
		System.out.print("Enter phone number: ");
		o.phone_number = sc.nextInt();
		System.out.print("Enter salary: ");
		o.salary = sc.nextFloat();
		System.out.print("Enter specialization: ");
		sc.nextLine();
		o.specialization = sc.nextLine();
		System.out.println("\nMANAGER");
		System.out.print("Enter name: ");
		m.name = sc.nextLine();
		System.out.print("Enter age: ");
		m.age = sc.nextInt();
		System.out.print("Enter address: ");
		sc.nextLine();
		m.address = sc.nextLine();
		System.out.print("Enter phone number: ");
		m.phone_number = sc.nextInt();
		System.out.print("Enter salary: ");
		m.salary = sc.nextFloat();
		System.out.print("Enter Department: ");
		sc.nextLine();
		m.department = sc.nextLine();

		System.out.println("\n\nOFFICER DETAIL");
		System.out.println("Name: " + o.name);
		System.out.println("Age: " + o.age);
		System.out.println("Address: " + o.address);
		System.out.println("Phone number: " + o.phone_number);
		o.salary();
		System.out.println("Specialization: " + o.specialization);

		System.out.println("\nMANAGER DETAIL");
		System.out.println("Name: " + m.name);
		System.out.println("Age: " + m.age);
		System.out.println("Address: " + m.address);
		System.out.println("Phone number: " + m.phone_number);
		m.salary();
		System.out.println("Department: " + m.department);
	}
}