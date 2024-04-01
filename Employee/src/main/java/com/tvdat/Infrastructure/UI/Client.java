package com.tvdat.Infrastructure.UI;

import com.tvdat.Domain.MODELS.EmployeeComponent;
import com.tvdat.Domain.MODELS.EmployeeConcreteComponent;
import com.tvdat.Domain.MODELS.Manager;
import com.tvdat.Domain.MODELS.TeamLeader;
import com.tvdat.Domain.MODELS.TeamMember;

public class Client {
	public static void employeeDecoratorTest() {
		System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee_id_1 = new EmployeeConcreteComponent("Trần Văn Đạt");
        employee_id_1.showBasicInformation();
        employee_id_1.doTask();
        EmployeeComponent employee_id_2 = new EmployeeConcreteComponent("Hoàng Hạnh Diệu Anh");
        employee_id_2.showBasicInformation();
        employee_id_2.doTask();
        EmployeeComponent employee_id_3 = new EmployeeConcreteComponent("Chi chi chành chành");
        employee_id_2.showBasicInformation();
        employee_id_2.doTask();
        
        System.out.println("\nTEAM LEADER: ");
        EmployeeComponent teamLeader = new TeamLeader(employee_id_1);
        teamLeader.showBasicInformation();
        teamLeader.doTask();
        
        System.out.println("\nMANAGER: ");
        EmployeeComponent teamManager = new Manager(employee_id_2);
        teamManager.showBasicInformation();
        teamManager.doTask();
        
        System.out.println("\nTEAM MEMBER: ");
        EmployeeComponent teamMember = new TeamMember(employee_id_3);
        teamMember.showBasicInformation();
        teamLeader.doTask();
        
        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
	}
	public static void main(String[] args) {
		employeeDecoratorTest();
	}

}
