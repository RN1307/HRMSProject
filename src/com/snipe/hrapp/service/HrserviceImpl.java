package com.snipe.hrapp.service;

import java.sql.Date;
import java.util.List;

import com.snipe.hrapp.domain.Employee;
import com.snipe.hrapp.exception.EmployeeException;
import com.snipe.hrapp.repository.Dao;
import com.snipe.hrapp.repository.DaoImpl;

public class HrserviceImpl  implements Hrservice{

	Dao d=new DaoImpl();

	@Override
	public void addEmployee(String fname, String lname, String desig, String homeAdd, String contactnum, Date hired,
			String location, int deptid,float salary,String email) throws EmployeeException {
		// TODO Auto-generated method stub
		d.addEmployee(fname, lname, desig, homeAdd, contactnum, hired, location, deptid,salary,email);
	}

	@Override
	public void modifyEmployee() throws EmployeeException {
		// TODO Auto-generated method stub
         d.modifyEmployee();
	}

	@Override
	public void displayEmployeeDetails() throws EmployeeException {
		// TODO Auto-generated method stub
		d.displayEmployeeDetails();
		//d.dataRows().forEach(System.out::println);
	}

	@Override
	public void displayEmployeesinDept() throws EmployeeException {
		// TODO Auto-generated method stub
           d.displayEmployeesinDept();
	}

	@Override
	public void displayDepartmentDetails() throws EmployeeException {
		// TODO Auto-generated method stub
          //d.displayDepartmentDetails();
	}

	@Override
	public List<Employee> dataRows() throws EmployeeException {
		return d.dataRows();
	}

	@Override
	public void displayEmployeeEmail() throws EmployeeException {
		// TODO Auto-generated method stub
		d.displayEmployeeEmail();
	}

	@Override
	public void displayDepartments() throws EmployeeException {
		// TODO Auto-generated method stub
		d.displayDepartments();
	}

	@Override
	public void deleteEmployee() throws EmployeeException {
		// TODO Auto-generated method stub
		d.deleteEmployee();
	}

	@Override
	public void modifyDepartment() throws EmployeeException {
		// TODO Auto-generated method stub
		d.modifyDepartment();
	}

	@Override
	public void modifyPayroll() throws EmployeeException {
		// TODO Auto-generated method stub
		d.modifyPayroll();
	}

	@Override
	public String login(String user, String pwd) throws EmployeeException {
		// TODO Auto-generated method stub
		String s=d.login(user, pwd);
		return s;
	}

	@Override
	public void displaySalary() throws EmployeeException {
		// TODO Auto-generated method stub
		d.displaySalary();
	}

}
