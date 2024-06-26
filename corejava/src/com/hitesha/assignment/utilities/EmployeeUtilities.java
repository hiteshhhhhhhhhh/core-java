package com.hitesha.assignment.utilities;

import com.hitesha.assignment.employees.Employee;
/**
 * Utility class for performing operations on Employee objects.
 */
public class EmployeeUtilities {
	
	 public static double calculateAnnualSalary(Employee employee) {
	 return employee.getSalary() * 12;
	 }
	 
	 public static void displayEmployeeDetails(Employee employee) {
	 System.out.println("Name: " + employee.getName());
	 System.out.println("Employee ID: " + employee.getEmployeeId());
	 System.out.println("Salary: " + employee.getSalary());
	 
	 }
}


