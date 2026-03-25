package inheritance;

public class Student {
	String name;
	int age;
	String clgName;

	public static void main(String[] args) {
		
		Rudra objRudra = new Rudra(12);
		System.out.println(objRudra.age);
	}

}


class Rudra extends Student{
	public Rudra(int a) {
		age=a;
	}
}
