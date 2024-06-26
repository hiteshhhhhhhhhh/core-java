package com.test;
import com.hitesha.assignment.employees.Developer;
import com.hitesha.assignment.employees.Manager;
import com.hitesha.assignment.utilities.EmployeeUtilities; 
import java.util.Scanner;

public class info {
public static void Main(String []args)
{
	
	for(int i=0;i<3;i++)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the name ");
		String n = in.nextLine();
		Manager manager1= new Manager(n, 101, 90000, "IT");
		EmployeeUtilities.displayEmployeeDetails(manager1);

	}
	
}
		
	}