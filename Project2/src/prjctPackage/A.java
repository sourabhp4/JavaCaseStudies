package prjctPackage;

public class A extends Marks{
	int s1, s2, s3;
	A(int s1, int s2, int s3){
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	double getPercentage() {
		return (s1 + s2 + s3) / 3.0;
	}
}
