package org.softlang.tests;

import org.junit.Before;
import org.softlang.company.Company;
import org.softlang.company.Department;
import org.softlang.company.Employee;

public class CompanyTest {
	protected Company company;

	@Before
	public void setUp() {
		Department dee = new Department();
	
		dee.setName("DEE");
			
		Employee rafael = new Employee("Rafael", dee);
		
		dee.setManager(rafael);	
		
		rafael.setSalary(500);
		
		Employee flavio = new Employee("Flavio", dee);
		Employee anderson = new Employee("Anderson", dee);
		
		flavio.setSalary(300);
		anderson.setSalary(300);
		
		dee.addUnity(flavio);
		dee.addUnity(anderson);
		
		company = new Company();
		company.setName("UnB");
		
		company.addDepartment(dee);	
	}
}
