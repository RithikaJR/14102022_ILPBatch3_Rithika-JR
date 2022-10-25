package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class EmployeeDetailsScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String title = "  ********Welcome to ILP Program Day1***********\n";
		System.out.println("Enter employee name");
		String employeeName = scanner.nextLine();
		System.out.println("Enter employee age");
		int employeeAge =scanner.nextInt();
		System.out.println("Enter employee gender");
		char employeeGender = scanner.next().charAt(0);
		System.out.println("Enter employee CGPA");
		double employeeCgpa = scanner.nextDouble();
		System.out.println(title);
		System.out.println("Name\t\t\t\t" + "Age\t\t" + "Gender\t\t" + "CGPA\t\t");
		System.out.println(employeeName + "\t\t\t" + employeeAge + "\t\t" + employeeGender + "\t\t" + employeeCgpa);
		// TODO Auto-generated method stub

	}

}
