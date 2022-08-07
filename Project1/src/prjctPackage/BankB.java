package prjctPackage;

public class BankB extends Bank{
	int balance;
	BankB(int bal){
		balance = bal;
	}
	void getBalance() {
		System.out.println("Sourabh : Balance : $" + balance);
	}
}
