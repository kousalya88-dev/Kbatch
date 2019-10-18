package org.cts.test;

public class HdfcBank {
	
	public void fixedDeposit()
	{
		System.out.println("15%");
	}

	public void jointAcc()
	{
		System.out.println("8%");
	}
	
	public static void main(String[] args) {
		
	HdfcBank h = new HdfcBank();
	h.fixedDeposit();
	h.jointAcc();
	}
}
