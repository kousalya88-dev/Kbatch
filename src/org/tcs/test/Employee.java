package org.tcs.test;

public class Employee {
	
	int a=78;
	
	public Employee() 
	{
		this(23);
		System.out.println("default cons");
		
	}
	
	public Employee(int age)
	{
		this("asbd");
		System.out.println(age);
	}
	
	public Employee(String name)
	{
		this(56.9f);
		System.out.println(name);
	}
	public Employee(float avg)
	{
		System.out.println(avg);
	}
	public static void main(String[] args) {
		
		Employee e = new Employee();
		Employee e1 = new Employee(23);
		Employee e2 = new Employee("adcd");
		Employee e3= new Employee("34.98f");
		
		
		
		
				
		
		
	}
	
}
