package com.tvdat.dpComposite;

public class BusinessAnalyst extends Employee {

	public BusinessAnalyst(String name, int age, int salary) {
		super(name, age, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Employee emmployee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Employee emmployee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println("------------------------");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Salary: " + this.salary);
	}

}
