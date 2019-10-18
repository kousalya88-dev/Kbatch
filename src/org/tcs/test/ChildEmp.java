package org.tcs.test;

public class ChildEmp extends Employee{
	
	public ChildEmp()
	{
		super();
		
		System.out.println("Child default constructor");
		
	}
	
public ChildEmp(int empId)
{
	System.out.println(empId);
}
public static void main(String[] args) {
	
	ChildEmp c = new ChildEmp();
	ChildEmp c1 = new ChildEmp(8823);
	
}




}
