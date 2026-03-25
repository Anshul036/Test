package relationalOperator;

public class relationalOperator 
{

	public static void main(String[] args) 
	{
		int num1 = 23;
		int num3 = 23;
		int num2 = 26;
		
		//Grater than >
		Boolean ans = num2>num1;
		System.out.println(ans);
		
		
		//less than >
		ans = num1<num2;
		System.out.println(ans);
				
		//Grater than OR equal to >=
		Boolean ans1 = num2>=num3;
		System.out.println(ans);
		
		boolean ans2 = num2>=num1;
		System.out.println(ans);
		
		//less than OR equal to >=
		ans1 = num1<=num3;
		System.out.println(ans);
				
		ans2 = num2<=num1;
		System.out.println(ans);
		
		
		//Grater than OR equal to >=
		ans1 = num2>=num3;
		System.out.println(ans);
				
		ans2 = num2>=num1;
		System.out.println(ans);
		
        //Not equal to		
		ans = num1 != num2;
		System.out.println(ans);
		
		
		
	}

}
