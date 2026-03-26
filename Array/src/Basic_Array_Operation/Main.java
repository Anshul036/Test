package Basic_Array_Operation;

import java.util.Arrays;
import java.util.Scanner;

//import jdk.internal.misc.InnocuousThread;

public class Main {
	
	/*
	 * Que 8. Write a program to print minimum element of an
array.
Input: arr = {5, 7, 3, 9, 4}
Output: 3
	 */
	
	public static void q8() {
		System.out.println("Question no 8");
		int[] arr = {5, 7, 3, 9, 4};
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min =arr[i];
			}
		}
		System.out.println("minmum = "+min);
		System.out.println();
		System.out.println();
		
	}
	
	
	
	/*
	 * Que 9. Write a program to print maximum element of an
array.
Input: arr = {5, 7, 3, 9, 4}
Output: 9
	 */
	
	public static void q9() {
		System.out.println("Question no 8");
		int[] arr = {5, 7, 3, 9, 4};
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max =arr[i];
			}
		}
		
		System.out.println("maximum = "+max);
		System.out.println();
		System.out.println();
		
	}
	
	
	
	/*
	 * Que 10. Write a program to print span of an array.
Input: arr = {5, 7, 3, 9, 4}
Output: maximum element: 9, minimum element: 3
span = 9-3 = 6
	 */
	
	public static void q10() {
		System.out.println("Question no 10");
		int[] arr = {5, 7, 3, 9, 4};
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max =arr[i];
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min =arr[i];
			}
		}
		System.out.println("span = "+(max-min));
		System.out.println();
		System.out.println();
		
	}
	
	
	
	/*
	 * Que 11. Write a program to print 2 arrays together using
single for loop.
Input: arr1 = {1, 2, 3, 4} arr2 = {5, 6, 7, 8}
Output: 1 5
2 6
3 7
4 8
	 */
	
	public static void q11() {
		System.out.println("Question no 11");
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {5, 6, 7, 8};
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]+"  "+arr2[i]);
		}
		
		
		System.out.println();
		System.out.println();
		
	}
	
	
	/*
	 * Que 12. Write a program to print the sum of all elements in a
given array.
Input: arr = {1, 2, 3, 4, 5}
Output: 15
	 */
	
	public static void q12() {
		System.out.println("Question no 11");
		int[] arr = {1, 2, 3, 4, 5};
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum =  "+sum);
		System.out.println();
		System.out.println();
		
	}
	
	
/*
 * Que 13. Write a program to create a new array containing only the
even elements of a given array. The program should:
1. Take an input array of integers.
2. Create a new array to store only the even elements from
the input array.
3. Return the new array and display its contents.
Input: arr = {14, 9, 6, 20, 35}
Output: evenArr = {14, 6, 20}
 */
	public static int[] q13() {
		int count = 0;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int s =scanner.nextInt();
		int [] in = new int [s];
		for (int i = 0; i < s; i++) {
			System.out.println("Enter the number of the array");
			int temp = scanner.nextInt();
			in[i] = temp;
		}
		for (int i = 0; i < in.length; i++) {
			if (in[i]%2==0) {
				count++;
			}
			
		}
		int c =0;
		int [] arr = new int[count]; 
		for (int i = 0; i < in.length; i++) {

			if (in[i]%2==0) {
				arr[c] = in[i];
				c++;
			}
		}
		return arr;
	}
	
	/*
	 * Que 14. Write a program to create a new array containing
only the odd elements of a given array. The program should:
1. Take an input array of integers.
2. Create a new array to store only the odd elements from
the input array.
3. Return the new array and display its contents.
Input: arr = {14, 9, 6, 20, 35}
Output: oddArr = {9, 35}
	 */
	
	
	public static int[] q14() {
		int count = 0;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int s =scanner.nextInt();
		int [] in = new int [s];
		for (int i = 0; i < s; i++) {
			System.out.println("Enter the number of the array");
			int temp = scanner.nextInt();
			in[i] = temp;
		}
		for (int i = 0; i < in.length; i++) {
			if (in[i]%2!=0) {
				count++;
			}
			
		}
		int c =0;
		int [] arr = new int[count]; 
		for (int i = 0; i < in.length; i++) {

			if (in[i]%2!=0) {
				arr[c] = in[i];
				c++;
			}
		}
		return arr;
	}
	
	
/*
 * Que 15. Write a program to print Sum of only even elements
of an array.
Input : arr = {1, 2, 3, 4, 5}
Output: sum = 6

 */
	
	public static void q15() {
		System.out.println("Question no 15");
		int[] arr = {1, 2, 3, 4, 5};
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				sum += arr[i];
			}
		}
		
		System.out.println("sum =  "+sum);
		System.out.println();
		System.out.println();
		
	}
	
	
	/*
	 * Que 16. Write a program to print Sum of only odd elements
of an array.
Input : arr = {1, 2, 3, 4, 5}
Output: sum = 9
	 */
	
	public static void q16() {
		System.out.println("Question no 16");
		int[] arr = {1, 2, 3, 4, 5};
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				sum += arr[i];
			}
		}
		
		System.out.println("sum =  "+sum);
		System.out.println();
		System.out.println();
		
	}
	
/*
 * Que 17. Write a program to print product of only even
elements of an array.
Input : arr = {1, 2, 3, 4, 5}
Output: product = 8

 */
	
	public static void q17() {
		System.out.println("Question no 17");
		int[] arr = {1, 2, 3, 4, 5};
		int pro=1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				pro *= arr[i];
			}
		}
		
		System.out.println("product =  "+pro);
		System.out.println();
		System.out.println();
		
	}
	
	/*
	 * Que 18. Write a program to print product of only odd
elements of an array.
Input : arr = {1, 2, 3, 4, 5}
Output: product = 15
	 */
	
	public static void q18() {
		System.out.println("Question no 18");
		int[] arr = {1, 2, 3, 4, 5};
		int pro=1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				pro *= arr[i];
			}
		}
		
		System.out.println("product =  "+pro);
		System.out.println();
		System.out.println();
		
	}
	
	
	/*
	 * Que 19. Write a program to count the number of even and
odd elements in an array.
Input: arr = {1, 2, 3, 4, 5}
Output: even=2, odd=3
	 */
	
	public static void q19() {
		System.out.println("Question no 18");
		int[] arr = {1, 2, 3, 4, 5};
		int odd =0;
		int even=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				odd++;
			}
			else if (arr[i]%2==0) {
				even++;
			}
		}
		
		System.out.println("odd =  "+odd+"  even = "+even);
		System.out.println();
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q8();
		q9();
		q10();
		q11();
		q12();
//		System.out.println("even array = "+Arrays.toString(q13()));
//		System.out.println("even array = "+Arrays.toString(q14()));
		q15();
		q16();
		q17();
		q18();
		q19();	
	}

}
