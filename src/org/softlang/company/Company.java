package org.softlang.company;

import java.util.ArrayList;
import java.util.List;

public class Company extends Unity {

	private static final long serialVersionUID = 1L;

	private String name;
	private List<Department> departments;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Department> getDepartments() {
		return departments;
	}
	
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	
	public void addDepartment(Department department) {
		if(departments == null) {
			departments = new ArrayList<Department>();
		}
		
		departments.add(department);
	}
}
