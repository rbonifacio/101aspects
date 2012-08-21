package org.softlang.features;

import org.softlang.company.Employee;

public aspect GlobalInvariant {

	public boolean checkConstraint(Employee e) {
		return e.getSalary() <= e.getDepartment().getManager().getSalary();
	}

	pointcut callSetSalary(Employee e) : 
		target(e) && call (void Employee.setSalary(double));
	
	after(Employee e) throws Error : callSetSalary(e)  {
		if(!checkConstraint(e)) {
			throw new Error("Global invariant fail. A manager of any department or sub-department is required to receive a salary that is higher than the salaries of " +
			" all employees of the department and all sub-departments");
		}
	}
}
