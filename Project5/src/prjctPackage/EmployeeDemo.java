package prjctPackage;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Sourabh : Enter number of Employees : ");
		n = sc.nextInt();
		Employee e[] = new Employee[n];
		for(int i = 0; i < n; i++) {
			e[i] = new Employee();
		}
		for(int i = 0; i < n; i++) {
			e[i].set(i + 1);
		}
		for(int i = 0; i < n; i++)
			e[i].get(i + 1);
		sc.close();
	}

}
