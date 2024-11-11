package task2;

//Employee is pojo class which holds employee data
public class Employee {
	private int id;
	private String name;
	private String Department;
	private double Experience;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String department, double experience, double salary) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
		Experience = experience;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public double getExperience() {
		return Experience;
	}

	public void setExperience(double experience) {
		Experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Department=" + Department + ", Experience=" + Experience
				+ ", salary=" + salary + "]";
	}

}
