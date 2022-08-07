
package prjctPackage;

import java.util.Scanner;

public class MarksDemo {

	public static void main(String[] args) {
		int s1, s2, s3, s4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 subjects marks of A : ");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		A objA = new A(s1, s2, s3);
		System.out.println("Enter 4 subjects marks of B : ");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		s4 = sc.nextInt();
		B objB = new B(s1, s2, s3, s4);
		System.out.println("Sourabh : Percentage of A : " + objA.getPercentage() + "%");
		System.out.println("Sourabh : Percentage of B : " + objB.getPercentage() + "%");
		sc.close();
	}

}
