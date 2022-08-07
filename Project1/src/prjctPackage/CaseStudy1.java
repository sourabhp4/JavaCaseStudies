package prjctPackage;

public class CaseStudy1 {
	public static void main(String args[]) {
		BankA objA = new BankA(100);
		BankB objB = new BankB(150);
		BankC objC = new BankC(200);
		objA.getBalance();
		objB.getBalance();
		objC.getBalance();
	}
}
