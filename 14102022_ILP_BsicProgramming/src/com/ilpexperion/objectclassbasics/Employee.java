package com.ilpexperion.objectclassbasics;

public class Employee {

	String employeeName = "Rithika J R";
	int employeeAge = 22;
	char employeeGender = 'F';
	double employeeCgpa = 9.11;

	public void displayEmployeeDetails() {
		System.out.println("Name\t\t\t\t" + "Age\t\t" + "Gender\t\t" + "CGPA\t\t");
		System.out.println(employeeName + "\t\t\t" + employeeAge + "\t\t" + employeeGender + "\t\t" + employeeCgpa);
	}

}
