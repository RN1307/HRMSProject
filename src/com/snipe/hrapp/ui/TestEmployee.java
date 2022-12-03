package com.snipe.hrapp.ui;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


import com.snipe.hrapp.constants.Constants;
import com.snipe.hrapp.controller.EmpController;
import com.snipe.hrapp.exception.EmployeeException;

public class TestEmployee {
	public static void main(String[] args) {
		EmpController empController=new EmpController();
		Scanner scanner=null;
		try {

			scanner=new Scanner(System.in);
			System.out.println("LOGIN");
			System.out.println("Enter username: ");
			String uname=scanner.next();
			System.out.println("Enter password: ");
			String pwd=scanner.next();
			
			String role=empController.login(uname, pwd);
			if(role.equals("admin"))
			{   
				boolean flag=true;
				while(flag) {
					System.out.println("MENU");
					System.out.println("1.SAVE EMPLOYEE");
					System.out.println("2.DISPLAY ALL EMPLOYEES");
					System.out.println("3.DISPLAY EMPLOYEES BY DEPARTMENT");
					System.out.println("4.DISPLAY EMPLOYEES EMAIL");
					System.out.println("5.DISPLAY DEPARTMENT NAMES");
					System.out.println("6.DELETE EMPLOYEE");
					System.out.println("7.UPDATE EMPLOYEE");
					System.out.println("8.UPDATE DEPARTMENT");
					System.out.println("9.UPDATE PAYROLL");
					System.out.println("10.DISPLAY SALARY INFO FOR AN EMPLOYEE");
					System.out.println("11.ENTER 11 TO EXIT");
					int option=scanner.nextInt();

					if(option==1) {

						System.out.println("Enter First Name");
						String firstName=scanner.next();
						System.out.println("Enter Second Name");
						scanner.nextLine();
						String secondName=scanner.nextLine();
						System.out.println("Enter Designation");
						String desig=scanner.nextLine();
						System.out.println("Enter Salary");
						float salary=scanner.nextFloat();
						System.out.println("Enter Home Address");
						scanner.nextLine();
						String homeAddr=scanner.nextLine();
						System.out.println("Enter Contact Number");
						String contactnum=scanner.next();
						System.out.println("Enter email");
						String email=scanner.next();
						System.out.println("Enter Hired Date in  YYYY-MM-DD");
						//String toParse=scanner.next();
						//SimpleDateFormat s=new SimpleDateFormat("YYYY-MM-DD");
						Date hiredDate=Date.valueOf(scanner.next());
						System.out.println("Enter Location");
						String location=scanner.next();
						System.out.println("Enter Department Id");
						int deptId=scanner.nextInt();
						empController.addEmployee(firstName,secondName,desig,homeAddr,contactnum,hiredDate,location,deptId,salary,email);

					}
					else if (option==2)
					{
						empController.displayEmployeeDetails();
					}
					else if(option==3) {
						empController.displayEmployeesinDept();
					}
					else if(option==4) {
						empController.displayEmployeeEmail();
					}
					else if(option==5) {
						empController.displayDepartments();
					}
					else if(option==6) {
						empController.deleteEmployee();
					}
					else if(option==7) {
						empController.modifyEmployee();
					}
					else if(option==8) {
						empController.modifyDepartment();;
					}
					else if(option==9) {
						empController.modifyPayroll();
					}
					else if(option==10) {
						empController.displaySalary();
					}
					

					else if(option==11) {
					
						break;
					}
				}
			}
			else if(role.equals("user")) {
				boolean flag=true;
				while(flag) {
					System.out.println("MENU");
					System.out.println("1.DISPLAY ALL EMPLOYEES");
					System.out.println("2.DISPLAY EMPLOYEES BY DEPARTMENT");
					System.out.println("3.DISPLAY EMPLOYEES EMAIL");
					System.out.println("4.DISPLAY DEPARTMENT NAMES");
					System.out.println("5.GET SALARY INFO");
					System.out.println("6.ENTER 6 TO EXIT");
					int option=scanner.nextInt();


					if (option==1)
					{
						empController.displayEmployeeDetails();
					}
					else if(option==2) {
						empController.displayEmployeesinDept();
					}
					else if(option==3) {
						empController.displayEmployeeEmail();
					}
					else if(option==4) {
						empController.displayDepartments();
					}
					else if(option==5) {
						empController.displaySalary();
					}
					else if(option==6) {
						flag=false;
						break;
					}		
				}     

			}
			else if (role.equals("none"))
			{
				System.out.println("Enter a valid username and password");
			}

		}
		catch(InputMismatchException e) {
			System.out.println("Enter integer values");
			e.printStackTrace();
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
	}}
