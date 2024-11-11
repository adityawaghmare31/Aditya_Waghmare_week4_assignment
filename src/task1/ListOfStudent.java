package task1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfStudent {
	ArrayList<Student> list = new ArrayList<>(); //create object of arraylist to store student data
	Scanner sc = new Scanner(System.in);

	public void addStudent() {
		System.out.print("Enter Student Id: ");
		int id = sc.nextInt();
		for (Student student : list) {
			if (student.getId() == id) { //If student id exist then it ask to enter different id
				System.out.println(id + " is Already Exist");
				System.out.print("Enter Student Id: ");
				id = sc.nextInt();
			}
		}
		System.out.print("Enter Student Name: ");
		String name = sc.next();
		System.out.print("Enter Student age: ");
		int age = sc.nextInt();
		System.out.print("Enter Student Percentage: ");
		double percentage = sc.nextDouble();
		list.add(new Student(id, name, age, percentage));

		System.out.println("Student added !!!");
	}

	public void removeStudent(int id) {
		// System.out.print("Enter Student Id: ");
		// int removableId = sc.nextInt();
		for (Student student : list) {
			if (student.getId() == id) { //checks id with data exist in list, if exist then will remove else gives message with not found
				list.remove(student);
				System.out.println("Student Removed Sucessfully");
				break;
			} else {
				System.out.println("Student with " + id + " is not found");
			}
		}
	}

	public void findStudent(int id) {
		for (Student student : list) {
			if (student.getId() == id) {
				System.out.println(student);
				break;
			} 
			System.out.println("Not Found");
		}
	}

	public void displayStudent() {
		if (list.isEmpty()) {
			System.out.println("Student List is Empty");
		} else {

			for (Student student : list) {
				System.out.println(student);
			}
		}
	}
}
