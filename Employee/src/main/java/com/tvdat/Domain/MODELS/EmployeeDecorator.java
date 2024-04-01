package com.tvdat.Domain.MODELS;

import java.util.Date;

public abstract class EmployeeDecorator implements EmployeeComponent {

	protected EmployeeComponent employee;
	
	public EmployeeDecorator(EmployeeComponent employee) {
		this.employee = employee;
	}
	@Override
	public String getName() {
		return this.employee.getName();
	}

	@Override
	public void doTask() {
		// Unassigned task
	}

	@Override
	public void join(Date joinDate) {
		this.employee.join(joinDate);
	}

	@Override
	public void terminate(Date terminateDate) {
		this.employee.terminate(terminateDate);
	}

}
