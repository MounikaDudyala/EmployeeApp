package com.employeeapp;
public class Employee {

	public String empName;
	public int empId;
	public int managerId;

	public Employee() {

	}

	public Employee(int empId, String empName, int managerId) {
		this.empName = empName;
		this.empId = empId;
		this.managerId = managerId;

	}

	public String getEmployeeName() {
		return empName;
	}

	public int getEmployeeId() {
		return empId;
	}

	public int getManagerId() {
		return managerId;
	}
	public String toString()
	{
		return "name:"+empName+" Id:"+empId+" ManagerId:"+managerId;
	}
}
