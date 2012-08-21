package org.softlang.features;

import org.softlang.company.Unity;

public aspect Logging {

	pointcut cut(Unity o) : 
		target (o) && call(public void Unity.cut());
	
	void around(Unity o) : cut(o) {
		System.out.println("Cutting the salary of " + o.getName());
		System.out.println("Current salary is " + o.total());
		proceed(o);
		System.out.println("Salary after cutting is " + o.total());
	}
}
