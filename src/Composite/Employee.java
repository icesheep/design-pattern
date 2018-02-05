package Composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private int salary;
	private List<Employee> employees;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		employees = new ArrayList<Employee>();
	}
	
	public void add(Employee employee) {
		employees.add(employee);
	}
	
	public void remove(Employee employee) {
		employees.remove(employee);
	}
	
	public List<Employee> getEmployees() {
		return this.employees;
	}
	
	public String toString() {
		return this.name + "---" + this.salary;
	}
}	
