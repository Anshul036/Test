package inheritance;

class A{
	int a=49;
	String name = "Anshul";
	A(int a, String name){
//		System.out.println(a+ "  "+ name);
		this.a=a;
		this.name=name;
//		System.out.println(a+ "  "+ name);
//		System.out.println(a+ "  "+ name);
		a=a;
		name=name;
//		System.out.println(a+ "  "+ name);
		
		
		
	}
	A(boolean a,String name){
		a=a;
		name=name;
		System.out.println(a+ "  "+ name);
	}
}
public class Temp {
	public static void main(String[] args) {
		A objA = new A(3, "Error");
		A objb = new A(false, "nam");
	}
}
