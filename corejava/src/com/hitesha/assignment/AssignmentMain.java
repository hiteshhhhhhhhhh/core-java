package com.hitesha.assignment;
import java.util.Scanner;
import com.hitesha.assignment.employees.Developer;
import com.hitesha.assignment.employees.Manager;
import com.hitesha.assignment.utilities.EmployeeUtilities; 
/**
 * Main class to demonstrate the usage of Employee, Manager, and Developer
classes.
 */ 

public class AssignmentMain {
	public static void main(String[] args) {

		
		/*
		 * Scanner in = new Scanner(System.in); String nameM; int empidM; double salM;
		 * 
		 * 
		 * System.out.println("enter the name of Manager"); nameM = in.nextLine();
		 * 
		 * System.out.println("Enter the Employee ID of manager"); empidM =
		 * in.nextInt();
		 * 
		 * System.out.println("Enter the salary of manager"); salM = in.nextDouble();
		 */
		System.out.println("enter the number of employees ");
		int n;
		Scanner ip = new Scanner(System.in);
		n = ip.nextInt();
		Manager[] manager = new Manager[10];
		for(int i=0;i<n;i++)
		{
			Scanner in = new Scanner(System.in); String nameM; int empidM; double salM;
			System.out.println("enter the name of Manager"); nameM = in.nextLine();
		    System.out.println("Enter the Employee ID of manager"); empidM =
			in.nextInt();
			System.out.println("Enter the salary of manager"); salM = in.nextDouble();
		manager[i] = new Manager(nameM,empidM,salM,"IT");
		}
		
		 //Manager manager = new Manager("Hitesha",12,14000,"IT");
	
			/*
			 * // Using EmployeeUtilities to perform operations Scanner inn = new
			 * Scanner(System.in); String nameD; int empidD; double salD;
			 * 
			 * System.out.println("Enter the Employee ID of developer"); empidD =
			 * inn.nextInt();
			 * 
			 * System.out.println("Enter the salary of developer"); salD = inn.nextDouble();
			 * 
			 * System.out.println("enter the name Developer"); nameD = inn.nextLine();
			 */
			
			 Developer developer = new Developer("Abhi",12,1234, "Java");
		 System.out.println("-------Manager-------- ");
		 for(Manager manage : manager)
		 {
		 EmployeeUtilities.displayEmployeeDetails(manage);
		 double managerAnnualSalary =	EmployeeUtilities.calculateAnnualSalary(manage);
		 System.out.println("Manager Annual Salary: " +	managerAnnualSalary);
		 }
		 
		 System.out.println();
		 System.out.println();
		 
		 System.out.println("-------Developer-------- ");
		 EmployeeUtilities.displayEmployeeDetails(developer);		
		 double developerAnnualSalary =	EmployeeUtilities.calculateAnnualSalary(developer);
		 System.out.println("Developer Annual Salary: " +
		developerAnnualSalary);
		 }
		} 


	
