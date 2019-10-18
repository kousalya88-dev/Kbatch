package org.cts.test;

public class BankRide extends HdfcBank {

	public void bankLoc()
	{
		System.out.println("chennai");
	}
public void rateOfInterst()
{
	System.out.println("7%");
}
public void fixedDeposit()
{
	System.out.println("6%");
}
public static void main(String[] args) {
	
	BankRide b = new BankRide();
	b.bankLoc();
	b.rateOfInterst();
	b.fixedDeposit();
}

}

