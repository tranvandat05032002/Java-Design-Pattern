package com.tvdat.Domain.MODELS;

public class TeamMember extends EmployeeDecorator {
	 
    public TeamMember(EmployeeComponent employee) {
        super(employee);
    }
 
    public void reportTask() {
        System.out.println(this.employee.getName() + " is reporting his assigned tasks.");
    }
 
    public void coordinateWithOthers() {
        System.out.println(this.employee.getName() + " is coordinating with other members of his team.");
    }
 
    @Override
    public void doTask() {
        employee.doTask();
        reportTask();
        coordinateWithOthers();
    }
}
