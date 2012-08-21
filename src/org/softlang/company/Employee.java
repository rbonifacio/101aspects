package org.softlang.company;

public class Employee extends Unity {
	
	private static final long serialVersionUID = 1L;
	
	private String address;
	private double salary;
	private Department department;
	
	public Employee(String name, Department department) {
		this.name = name;
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
