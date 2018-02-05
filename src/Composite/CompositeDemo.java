package Composite;

public class CompositeDemo {
	public static void main(String[] args) {
		Employee CEO = new Employee("CEO", 1);
		Employee e1 = new Employee("1",1000);
		Employee e2 = new Employee("2",1000);
		Employee e3 = new Employee("3",1000);
		Employee e4 = new Employee("4",1000);
		CEO.add(e1);
		e1.add(e2);
		e1.add(e3);
		e1.add(e4);
		System.out.println(CEO.toString());
		for(Employee employee : CEO.getEmployees()){
			System.out.println(employee.toString());
			for(Employee employee2 : employee.getEmployees()) {
				System.out.println(employee2.toString());
				try{for(Employee employee3 : employee2.getEmployees()) {
					employee3.toString();
				}}
				catch (Exception e) {
					System.out.println("exc!!!!!!!!!");
				}
			}
		}
	}
}
