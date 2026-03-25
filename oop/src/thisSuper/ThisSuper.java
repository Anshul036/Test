package thisSuper;

public class ThisSuper 
{
	int a;
	String m;
	int n;

    public ThisSuper(int a,String n) 
    {
		System.out.println("p");
	}
	
	public ThisSuper(int a,String n,int m) 
	{
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//			ThisSuper obj1= new ThisSuper(1, "mnn");
//			ThisSuper obj2= new ThisSuper(1, "mnn",2);
//			B obj3= new B(1, "mnn");
//			B obj4= new B(1, "mnn",2);
		
		B objB = new B();
		objB.print();
	}
	
}
		
class A{
	int b =8;
}


class B extends A
{
	
		
//		public B(int a,String b,int x) 
//		{
//			this(a,b);
//		}
//		public B(int a,String b) 
//		{
//			super(a, b);
//			System.out.println("c");
//		}
	
	public void print() {
		System.out.println(super.b);
	}
		
		
}