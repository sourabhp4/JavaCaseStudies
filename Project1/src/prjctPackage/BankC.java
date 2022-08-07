package prjctPackage;

public class BankC extends Bank{
	int balance;
	BankC(int bal){
		balance = bal;
	}
	void getBalance() {
		System.out.println("Sourabh : Balance : $" + balance);
	}
}
