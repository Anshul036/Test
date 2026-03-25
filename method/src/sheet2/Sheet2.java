package sheet2;

public class Sheet2 {

//	Question 1. A car travels 150 km in 3 hours. Calculate its Speed.
	public static int calcSpeed(int time ,int dist) {
		return dist/time;
	}
	
//	Question 2. A train moves at 80 km/h for 5 hours. Calculate the Distance covered.
	public static int calcDist(int time , int speed) {
		return speed*time;
	}
	
//	Question 3. A bike covers 180 km at 60 km/h. Calculate the Time taken.
	public static int calcTime(int dist , int speed) {
		return dist/speed;
	}
	
//	Question 4. Find the Area of a Rectangle with length 12 cm and breadth 8 cm.
	public static int areaRect(int l , int b) {
		return l*b;
	}
	
//	Question 5. Find the Perimeter of a Rectangle with length 15 cm and breadth 10 cm.
	public static int perimeterRect(int l , int b) {
		return 2*(l+b);
	}
	
//	Question 6. Find the Area of a Triangle with base 20 cm and height 12 cm.
	public static double areaTri(int h , int b) {
		return 0.5*h*b;
	}
	
//	Question 7. Find the Area of a Parallelogram with base 18 cm and height 7 cm.
	public static int areaParallelogram(int h , int b) {
		return h*b;
	}
	
//	Question 8. Find the Area of a Circle with radius 10 cm (take p = 3.14).
	public static double areaCircle(int r) {
		return 3.14*r*r;
	}
	
//	Question 9. Find the Circumference of a Circle with radius 14 cm.
	public static double circumferenceCircle(int r) {
		return 2*3.14*r;
	}
	
//	Question 10. Find the Area of a Square with side 9 cm.
	public static int areaSq(int s) {
		return s*s;
	}
	
//	Question 11. Find the Perimeter of a Square with side 25 cm.
	public static int perimeterSq(int s) {
		return 4*s;
	}
	
//	Question 12. Find the Sum of 345 and 278.
	public static int sum(int n1,int n2) {
		return n1+n2;
	}
	
//	Question 13. Find the Difference between 950 and 475
	public static int dif(int n1,int n2) {
		return n1-n2;
	}
	
//	Question 14. Find the Product of 48 and 15.
	public static int pro(int n1,int n2) {
		return n1*n2;
	}
	
//	Question 15. Find the Quotient when 144 is divided by 12.
	public static int quotient(int n1,int n2) {
		return n1/n2;
	}
	
//	Question 16. Find the Remainder when 100 is divided by 7.
	public static double remainder(int n1,int n2) {
		return n1%n2;
	}
	
//	Question 17. Find the Average of 56 and 84.
	public static int avg(int n1,int n2) {
		return (n1+n2)/2;
	}
	
//	Question 18. A body of mass 50 kg is moving with an acceleration of 3 m/s². Find the Force applied.
	public static int force(int m,int acc) {
		return m*acc;
	}
	
//	Question 19. A person deposits n5000 for 2 years at a rate of 10% per annum. Find the Simple Interest.
	public static int interest(int p,int r,int t) {
		return (p*r*t)/100;
	}
	
//	Question 20. A block has a mass of 200 g and a volume of 50 cm³. Find its Density.
	public static int density(int m,int v) {
		return m/v;
	}
	
//	Question 21. A force of 40 N is applied on an object and it moves 5 m. Find the Work Done.
	public static int workDone(int f,int d) {
		return f*d;
	}
	
//	Question 22. A force of 200 N acts on an area of 20 cm². Find the Pressure.
	public static int pressure(int f,int a) {
		return f/a;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Speed = "+calcSpeed(3, 150)+" kmph");
		
		System.out.println("Distance = "+calcDist(5, 80)+" km");

		System.out.println("Time = "+calcTime(180, 60)+" hours");
		
		System.out.println("Area of a Rectangle = "+areaRect(12, 8)+" cm.sq");
		
		System.out.println("Perimeter of a Rectangle = "+perimeterRect(15, 10)+" cm");
	
		System.out.println("Area of a Triangle = "+areaTri(12, 20)+" cm.sq");
		
		System.out.println("Area of a Parallelogram = "+areaParallelogram(7, 18)+" cm.sq");	
		
		System.out.println("Area of a Circle = "+areaCircle(10)+" cm.sq");
		
		System.out.println("Circumference of a Circle = "+circumferenceCircle(14)+" cm");

		System.out.println("Area of a Square = "+areaSq(9)+" cm.sq");

		System.out.println("Perimeter of a Square = "+perimeterSq(25)+" cm");
		
		System.out.println("sum = "+sum(345,278));
		
		System.out.println("Difference = "+dif(950,475));

		System.out.println("Product = "+pro(48,15));
		
		System.out.println("Quotient = "+quotient(144,12));
		
		System.out.println("Remainder = "+remainder(100,7));
		
		System.out.println("Average = "+avg(56,84));
		
		System.out.println("Force = "+force(50,3)+"N");
		
		System.out.println("Simple Interest = n"+interest(10,5000,2));
		
		System.out.println("Density = "+density(200,50)+"g/cm³");
		
		System.out.println("Density = "+density(40,5)+" j");
		
		System.out.println("Pressure = "+pressure(200,20)+" N/cm²");
	}
}
