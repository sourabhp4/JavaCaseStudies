package prjctPackage;

import java.util.Scanner;

public class AreaDemo {

	public static void main(String[] args) {
		Area obj = new Area();
		Scanner sc = new Scanner(System.in);
		int ch;
		while(true) {
			System.out.println("Sourabh : Enter\n1 - Area of Rectangle\n2 - Area of Square\n3 - Area of Circle\n4 - Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter length and breadth of Rectangle : ");
					int len = sc.nextInt();
					int breadth = sc.nextInt();
					obj.rectangleArea(len, breadth);
					break;
			case 2: System.out.println("Enter side of Square : ");
					int side = sc.nextInt();
					obj.squareArea(side);
					break;
			case 3: System.out.println("Enter raduis of Circle : ");
					int radius = sc.nextInt();
					obj.circleArea(radius);
					break;
			case 4: System.out.println("Sourabh : Thank You");
					System.exit(0);
			default:System.out.println("Sourabh : Invalid Choice");
			}
		}
	}
	
}
