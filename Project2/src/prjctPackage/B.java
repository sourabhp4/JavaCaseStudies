package prjctPackage;

public class B extends Marks{
	int s1, s2, s3, s4;
	B(int s1, int s2, int s3, int s4){
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}
	double getPercentage() {
		return (s1 + s2 + s3 + s4) / 4.0;
	}
}
