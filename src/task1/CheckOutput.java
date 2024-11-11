package task1;

import java.util.Scanner;

public class CheckOutput {

	public static void main(String[] args) {
		ListOfStudent listOfStudent = new ListOfStudent(); //create object of ListOfStudent class
		boolean operation = true;
		while (operation) {
			System.out.println("Choose Options");
			System.out.println("1. Add New Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Find Student By Id");
			System.out.println("4. Display All Students");
			System.out.println("5. Exit");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch (option) {
			case 1:
				listOfStudent.addStudent();
				break;

			case 2:
				System.out.print("Enter Id: ");
				int removableId = sc.nextInt();
				listOfStudent.removeStudent(removableId);
				break;

			case 3:
				System.out.print("Enter Id: ");
				int findById = sc.nextInt();
				listOfStudent.findStudent(findById);
				break;
			case 4:
				listOfStudent.displayStudent();
				break;

			case 5:
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
