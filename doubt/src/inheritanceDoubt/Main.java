package inheritanceDoubt;

public class Main 
{

	public static void main(String[] args) 
	{
		A objA = new A();
		C objC = new C();
		A objA2 = new C(); // objA2 is a refrence variable and this variable can 
		// store the address of object Of Class A or its Child class.

	}

}

class A
{
	
}

class C extends A
{
	
}