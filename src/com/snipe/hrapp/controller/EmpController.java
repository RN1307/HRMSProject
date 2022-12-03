package com.snipe.hrapp.controller;


import java.sql.Date;

import com.snipe.hrapp.exception.EmployeeException;
import com.snipe.hrapp.service.Hrservice;
import com.snipe.hrapp.service.HrserviceImpl;

public class EmpController {

	Hrservice hrs=new HrserviceImpl();
	public String login(String user, String pwd) throws EmployeeException {
		String s1=hrs.login(user, pwd);
		return s1;
	}
	public void addEmployee( String fname, String lname, String desig, String homeAdd, String contactnum,
			Date hired, String location,int deptid,float salary,String email) throws EmployeeException {

		hrs.addEmployee(fname, lname, desig, homeAdd, contactnum, hired, location, deptid,salary,email);

	}
	public void modifyEmployee() throws EmployeeException{
		hrs.modifyEmployee();
	}

	public void modifyDepartment() throws EmployeeException{
		hrs.modifyDepartment();
	}
	public void modifyPayroll() throws EmployeeException{
		hrs.modifyPayroll();
	}
	public void displayEmployeeDetails() throws EmployeeException {

		hrs.displayEmployeeDetails();

	}
	public void displayEmployeesinDept() throws EmployeeException{

		hrs.displayEmployeesinDept();
	}
	public void displayEmployeeEmail() throws EmployeeException{

		hrs.displayEmployeeEmail();;
	}
	public void displayDepartments() throws EmployeeException {
		hrs.displayDepartments();
	}
	public void deleteEmployee() throws EmployeeException{
		hrs.deleteEmployee();
	}
	public void  displaySalary() throws EmployeeException{
		hrs.displaySalary();
	}

}
