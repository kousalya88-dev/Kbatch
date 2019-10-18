package org.cts.test;

public class methodOver {
	
	public void findEmployee(int empId)
	{
		System.out.println(empId);
	}
public void findEmployee(int empId, String name)
{
	System.out.println("Empid: " +empId + "name: " +name );
}
public void findEmployee(String name, int empId)
{
	System.out.println("Name: " +name + "id : " +empId);
}
public void findEmployee(String name, int empId, long phonNo)
{
	System.out.println("Name: " +name + "id : " +empId+ "number : " +phonNo);
}
public static void main(String[] args) {
	
	methodOver m = new methodOver();
	m.findEmployee(5562);
	m.findEmployee(3456, "kousi");
	m.findEmployee("koki", 8823);
	m.findEmployee("sumi", 2233, 9566232823l);
}

}
