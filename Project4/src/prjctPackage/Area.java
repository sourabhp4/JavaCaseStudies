package prjctPackage;

public class Area extends Shape{
	void rectangleArea(int len, int breadth) {
		System.out.println("Sourabh : Area of Rectangle : " + (len * breadth));
	}
	void squareArea(int side) {
		System.out.println("Sourabh : Area of Square : " + (side * side));
	}
	void circleArea(int radius) {
		System.out.println("Sourabh : Area of Circle : " + (3.142 * radius * radius));
	}
}
