package com.tvdat.dpComposite;

import java.util.ArrayList;

public class Leader extends Employee {

	private ArrayList<Employee> lstEmployee = new ArrayList<>();
	public Leader(String name, int age, int salary) {
		super(name, age, salary);
	}

	@Override
	public void add(Employee emmployee) {
		lstEmployee.add(emmployee);
		
	}

	@Override
	public void remove(Employee emmployee) {
		lstEmployee.remove(emmployee);
		
	}

	@Override
	public void print() {
		System.out.println("------------------------");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Salary: " + this.salary);
		for (Employee employee : lstEmployee) {
			employee.print();
		}
		
	}

}
