package objectCreation;


public class Student {
	String name;
	int age ;
	String clgName;

	
	public Student(String n,int e ,String s) {
		name=n;
		age=e;
		clgName=s;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj1 = new Student("Anshul",19,"LNCT");
		Student obj2 = new Student("Arpit",20,"LNCT");
		Student obj3 = new Student("Prateek",21,"LNCT");
		Student obj4 = new Student("Arpan",22,"LNCT");
		System.out.println(obj1.name + "  " + obj1.age );
		System.out.println(obj2.name + "  " + obj2.age );
		System.out.println(obj3.name + "  " + obj3.age );
		System.out.println(obj4.name + "  " + obj4.age );
		
		A obj5 = new A();
		
		
		
		B obj6 = new B();
		
		
		
//		System.out.println(Arrays.toString(obj5.arr));
	}

}
class B{
	
}
class A{
	int[] arr = {43,35,7,45,3,0};
}
