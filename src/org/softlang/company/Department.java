package org.softlang.company;

import java.util.ArrayList;
import java.util.List;

public class Department extends Unity {

	private static final long serialVersionUID = 1L;

	private Employee manager;
	private List<Unity> unities;

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public List<Unity> getUnities() {
		return unities;
	}

	public void setUnities(List<Unity> unities) {
		this.unities = unities;
	}
	
	public void addUnity(Unity unity) {
		if(unities == null) {
			unities = new ArrayList<Unity>();
		}
		unities.add(unity);
	}

}
