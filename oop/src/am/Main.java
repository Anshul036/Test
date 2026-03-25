package am;

import am2.B;
import am3.C;

public class Main {

	public static void main(String[] args) {
		A obj= new A();
		System.out.println(obj.x+" "+obj.k+" "+obj.z);

		B obj2= new B();
		System.out.println(obj2.x+" ");
		
		C obj3= new C();
		System.out.println(obj3.x+" ");
		
	}

}


class A{
	public int x=33;
	private int y=46;
	protected int z=66;
	int k=55;
}