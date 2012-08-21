package org.softlang.features;

import org.softlang.company.Company;
import org.softlang.company.Unity;
import org.softlang.company.Department;
import org.softlang.company.Employee;

public privileged aspect Total {
	public abstract double Unity.total();
	
	public double Company.total() {
		double total = 0;
		for(Department d : departments) {
			total += d.total();
		}
		return total;
	}
	
	
	public double Employee.total() {
		return salary;
	}
	
	public double Department.total() {
		double total = manager.total();	
		for(Unity u : unities) {
			total += u.total();
		}
		return total;
	}
	
}
