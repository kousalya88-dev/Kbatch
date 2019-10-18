package org.cts.test;

public class ChildComp extends comp{
	
	 private void empRollno() {
		System.out.println("8823");

	}

	@Override
	public void empLoc() {
		System.out.println("india");
		
	}

	@Override
	public void empAdd() {
		
		System.out.println("chennai");
		
	}
	
	public static void main(String[] args) {
		
		ChildComp c = new ChildComp();
		c.empRollno();
		c.empId();
		c.empAdd();
		c.empLoc();
		
	}
	
	
	

}
