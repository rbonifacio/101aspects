package org.softlang.features;

import org.softlang.company.Company;
import org.softlang.company.Unity;
import org.softlang.company.Department;
import org.softlang.company.Employee;

public privileged aspect Cut {

	public abstract void Unity.cut();
	
	public void Company.cut() {
		for(Department d: departments) {
			d.cut();
		}
	}
	
	public void Department.cut() {
		manager.cut();
		for(Unity u: unities) {
			u.cut();
		}
	}
	
	public void Employee.cut() {
		salary = salary / 2.0;
	}
}
