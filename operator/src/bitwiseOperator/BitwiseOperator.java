package bitwiseOperator;

public class BitwiseOperator
{

	public static void main(String[] args) 
	{
     /*
      Bitwise AND (&)
      0 & 1 = 0		
      0 & 0 = 0	
      1 & 0 = 0	
      1 & 1 = 1	
      
      Bitwise OR (|)
      0 | 1 = 1		
      0 | 0 = 0	
      1 | 0 = 1	
      1 | 1 = 1	
      
      Bitwise NOT (~)
      ~1 =0
      ~0 =1
      
      Bitwise XOR (^)
      0 ^ 1 = 1		
      0 ^ 0 = 0	
      1 ^ 0 = 1	
      1 ^ 1 = 0
      
      */
		int num1 = 14;
		int num2 = 15;
		System.out.println(num1&num2);
		System.out.println(num1^num2);
		System.out.println(num1|num2);
		System.out.println(~num1);
		System.out.println(16<<5);
		System.out.println(14>>2);
	}

}
