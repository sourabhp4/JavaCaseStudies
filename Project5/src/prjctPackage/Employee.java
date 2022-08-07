package prjctPackage;

import java.util.Scanner;

public class Employee {
	String firstName, lastName;
	double monthSal, yearSal;
	Employee(){
		firstName = "";
		lastName = "";
		monthSal = 0;
	}
	void set(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sourabh : Enter Details of Employee " + i);
		System.out.print("FirstName : ");
		firstName = sc.next();
		System.out.print("LastName : ");
		lastName = sc.next();
		System.out.print("Monthly Salary :");
		monthSal = sc.nextDouble();
		if(monthSal < 0)
			monthSal = 0;
		yearSal = 12 * monthSal;
	}
	void get(int i) {
		System.out.println("Sourabh : Details of Employee " + i);
		System.out.println("Sourabh : FirstName : " + firstName);
		System.out.println("Sourabh : LastName : " + lastName);
		System.out.println("Sourabh : Monthly Salary : " + monthSal);
		System.out.println("Sourabh : Yearly Salary : " + yearSal);
		System.out.println("Sourabh : After 10 % raise,\n\tYearly Salary is : " + (yearSal + 0.1 * yearSal));
	}
}
