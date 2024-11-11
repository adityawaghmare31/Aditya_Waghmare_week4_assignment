package task2;

import java.util.Scanner;

public class CheckEmployeeOutput {

	public static void main(String[] args) {
		OperationOfEmployee employee = new OperationOfEmployee(); //create object of OperationOfEmployee class
		boolean operation = true;
		while (operation) {
			System.out.println("Choose Options");
			System.out.println("1. Add New Employee");
			System.out.println("2. Get Employee By Id");
			System.out.println("3. Exit");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch (option) {
			case 1:
				// employee.addEmployee(101, "aditya", "Software", 10, 700000);
				System.out.print("Enter Id: ");
				int id = sc.nextInt();
				System.out.print("Enter Name: ");
				String name = sc.next();
				System.out.print("Enter Department: ");
				String department = sc.next();
				System.out.print("Enter Experience: ");
				double experience = sc.nextDouble();
				System.out.print("Enter Salary: ");
				double salary = sc.nextDouble();
				employee.addEmployee(id, name, department, experience, salary); // calls addEmployee method with given parameter
				break;

			case 2:
//				System.out.print("Enter Id: ");
//				int removableId = sc.nextInt();
				System.out.print("Enter Id: ");
				id = sc.nextInt();
				employee.getEmployeeById(id);
				break;

			case 3:
				operation = false;
				System.out.println("!!!See U Again!!!");
				break;
			default:
				System.out.println("Invalid Option, Please choose valid option");
				break;
			}
		}
	}

}
