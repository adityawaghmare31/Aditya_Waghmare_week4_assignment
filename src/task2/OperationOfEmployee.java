package task2;

import java.util.HashMap;

public class OperationOfEmployee {
	HashMap<Integer, Employee> map=new HashMap<>();  // create object of hashmap to stored employee data
	public void addEmployee(int id, String name,String Department, double Experience, double salary) {
		map.put(id, new Employee(id, name, Department, Experience, salary));  //in map put method is used to store data in map
		System.out.println("Employee Inserted Sucessfully");
	}
	
	public void getEmployeeById(int id) {
		Employee employee = map.get(id); //holds employee data whose given id by user
		if(employee!=null) {
			System.out.println(employee);
		}
		else {
			System.out.println("Id not found");
		}
	}
}
