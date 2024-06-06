package com.tvdat.dpComposite;
import lombok.*;
@Data
@AllArgsConstructor
public abstract class Employee {
	protected String name;
	protected int age;
	protected int salary;
	
	
	// method
	public abstract void add(Employee emmployee);
	public abstract void remove(Employee emmployee);
	public abstract void print();
}
