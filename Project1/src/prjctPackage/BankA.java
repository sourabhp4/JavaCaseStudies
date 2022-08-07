package prjctPackage;

public class BankA extends Bank{
	int balance;
	BankA(int bal){
		balance = bal;
	}
	void getBalance() {
		System.out.println("Sourabh : Balance : $" + balance);
	}
}
