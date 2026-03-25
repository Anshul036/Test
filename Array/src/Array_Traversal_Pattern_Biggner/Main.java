package Array_Traversal_Pattern_Biggner;

public class Main {

	
	/*
	Que 1. Write a program to declare, initialize, and display the
	elements of an integer array.
	*/

	public static void q1(){
        System.out.println();
		System.out.println();
		System.out.println("Question no 1");

        int[] arr = {1,2,3,4,5,6};

        for(int i=0; i<arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }

		System.out.println();
		System.out.println();
    }



	/*
	Que 2. Write a program to take an array of integers and
	traverse it from start to end. Display all the elements of the
	array.
	Input: arr = {1, 2, 3, 4, 5}
	Output: 1 2 3 4 5
	*/
	
	
	public static void q2(){
        System.out.println();
		System.out.println();
		System.out.println("Question no 2");

        int[] arr = {1, 2, 3, 4, 5};

        for(int i=0; i<arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }

		System.out.println();
		System.out.println();
    }
	
	
	/*
	Que 3. Write a program to take an array of integers and
	traverse it from end to start. (also known as ReverseTraversing)
	Input: arr = {1, 2, 3, 4, 5}
	Output: 5 4 3 2 1
	*/

	
	public static void q3(){
        System.out.println();
		System.out.println();
		System.out.println("Question no 3");

        int[] arr = {1, 2, 3, 4, 5};

        for(int i=arr.length-1; 0<=i; i--) {
        	System.out.print(arr[i] + " ");
        }

		System.out.println();
		System.out.println();
    }
	
	
	/*
	Que 4. Write a program to take an array and traverse it from
	start to half.
	Input: arr = {1, 2, 3, 4, 5, 6}
	Output: 1 2 3
	*/
	
	
	public static void q4(){
        System.out.println();
		System.out.println();
		System.out.println("Question no 4");

        int[] arr = {1, 2, 3, 4, 5, 6};

        for(int i=0; i<arr.length/2; i++) {
        	System.out.print(arr[i] + " ");
        }

		System.out.println();
		System.out.println();
    }


	/*
	Que 5. Write a program to take an array and traverse it from
	end to half.
	Input: arr = {1, 2, 3, 4, 5, 6}
	Output: 6 5 4
	*/

	
	public static void q5(){
        System.out.println();
		System.out.println();
		System.out.println("Question no 5");

        int[] arr = {1, 2, 3, 4, 5, 6};

        for(int i=arr.length-1; arr.length/2<=i; i--) {
        	System.out.print(arr[i] + " ");
        }

		System.out.println();
		System.out.println();
    }
	
	
	/*
	Que 6. Write a program to take an array and traverse it from
	half to start.
	Input: arr = {1, 2, 3, 4, 5, 6}
	Output: 3 2 1
	*/

	
	public static void q6(){
        System.out.println();
		System.out.println();
		System.out.println("Question no 6");

        int[] arr = {1, 2, 3, 4, 5, 6};

        for(int i=arr.length/2; 0<=i; i--) {
        	System.out.print(arr[i] + " ");
        }

		System.out.println();
		System.out.println();
    }
	
	
	/*
	Que 7. Write a program to take an array and traverse it from
	half to end.
	Input: arr = {1, 2, 3, 4, 5, 6}
	Output: 4 5 6
	*/


	
	public static void q7(){
        System.out.println();
		System.out.println();
		System.out.println("Question no 7");

        int[] arr = {1, 2, 3, 4, 5, 6};

        for(int i=arr.length/2; arr.length>i; i++) {
        	System.out.print(arr[i] + " ");
        }

		System.out.println();
		System.out.println();
    }
	
	
	
	
	
	public static void main(String[] args) {
		
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		
	}

}
