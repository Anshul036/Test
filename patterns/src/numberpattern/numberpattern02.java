package numberpattern;

import java.util.Iterator;

public class numberpattern02 {
	
	public static void q1() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 1");
		System.out.println();
		int row=7;
		int num=1;
		for (int r = 0; r < row; r++) {
			num=r+1;
			for (int i = 0; i < r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < row-r; i++) {
				System.out.print((num)+" ");
				num++;
			}
			System.out.println();
		}
		for (int r = 0; r < row-1; r++) {
			num=row-r-1;
			for (int i = 0; i < row-2-r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < r+2; i++) {
				System.out.print((num)+" ");
				num++;
			}
			System.out.println();
		}
	
	}
	
	
	public static void q2() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 2");
		System.out.println();
		int nor=5;
		for (int i = 0; i < nor; i++) {
				for (int j = 0; j < i+1; j++) {
					if(j%2==0) {
						System.out.print("1 ");
					}
					
					else {
						System.out.print("0 ");
					}
				}
			
			  System.out.println();
			}
		}
	
	
	public static void q3() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 3");
		System.out.println();
		int nor=7;
		for (int i = 0; i < nor; i++) {
				for (int j = 0; j < 7; j++) {
					if(i%2==0) {
						System.out.print("1 ");
					}
					
					else {
						System.out.print("0 ");
					}
				}
			
			  System.out.println();
			}
		}
	
	
	public static void q4() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 4");
		System.out.println();
		int nor =7;
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < nor; j++) {
			   
				if (i%2==0&&j%2!=0) {
					System.out.print("0 ");
				}
				else if(i%2!=0&&j%2==0){
					System.out.print("0 ");
				}
				else {
					System.out.print("1 ");
				}
				
			}
			System.out.println();
		}
		}
	
	
	public static void q5() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 5");
		System.out.println();
		int nor =7;
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < nor-1-i; j++) {
				System.out.print("1 ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}
		}
	
	
	public static void q6() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 6");
		System.out.println();
		int nor =7;
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("0 ");
			}
			for (int j = 0; j < nor; j++) {
				if (i==j&&j==i) {
					System.out.print((i+1)+" ");
				}
			}
			for (int j = 0; j < nor-i-1; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		}
	
	
	
	public static void q7() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 7");
		System.out.println();
		int nor=7;
		
		for (int r = 0; r < nor; r++) {
			for (int c = 0; c < (nor-r-1); c++) {
				System.out.print(" ");
			}
			for(int s=0;s<1+r;s++) {
				System.out.print((1+s)+" ");
				
			}
			
			System.out.println();
		}
	}
	
	
	public static void q8() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 8");
		System.out.println();
		int nor=5;
		for (int r = 0; r < nor; r++) {
			for (int c = 0; c < (nor-r-1); c++) {
				System.out.print(" ");
			}
			for(int s=0;s<1+r;s++) {
				System.out.print((r+1+s)+" ");
			}
			
			System.out.println();
		}
	}
	
	
	
	public static void q9() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 9");
		System.out.println();
		int nor=7;
		int num;
		for (int r = 0; r < nor; r++) {
			num=nor-r;
			for (int c = 0; c < (nor-r-1); c++) {
				System.out.print(" ");
			}
			for(int s=0;s<1+r;s++) {
				System.out.print((num+s)+" ");
				
			}
			
			System.out.println();
		}
	}
	
	
	public static void q10() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 10");
		System.out.println();
		int nor=7;
		for (int r = 0; r < nor; r++) {
			for (int c = 0; c < (nor-r-1); c++) {
				System.out.print(" ");
			}
			for(int s=0;s<1+r;s++) {
				System.out.print(1+r+" ");
				
			}
			
			System.out.println();
		}
	}
	
	
	
	public static void q11() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 11");
		System.out.println();
		int nor=7;
		int num;
		for (int r = 0; r < nor; r++) {
			num=1+r;
			for (int c = 0; c < (r); c++) {
				System.out.print(" ");
			}
			for(int s=0;s<nor-r;s++) {
				System.out.print(num+s+" ");
				
			}
			
			System.out.println();
		}
	}
	
	
	
	public static void q12() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 12");
		System.out.println();
		int nor=7;
		int num;
		for (int r = 0; r < nor-1; r++) {
			num=1+r;
			for (int c = 0; c < (r); c++) {
				System.out.print(" ");
			}
			for(int s=0;s<nor-r;s++) {
				System.out.print(num+s+" ");
				
			}
			
			System.out.println();
		}
		for (int r = 0; r < nor; r++) {
			num=nor-r;
			for (int c = 0; c < (nor-r); c++) {
				System.out.print(" ");
			}
			for(int s=0;s<1+r;s++) {
				System.out.print((num+s)+" ");
				
			}
			
			System.out.println();
		}
	}
	
	
	
	public static void q13() {
		int nor =5;
		System.out.println();
		System.out.println();
		System.out.println("Question no 13");
		System.out.println();	
		int num = 6;
		for(int r=0;r<nor;r++) {
			
				for(int s=0;s<nor-1-r;s++) {
					System.out.print("  ");
				}
				for(int s=0;s<1+r;s++) {
					System.out.print(r+1+" "+"  ");
				}
				System.out.println();
		}
		
		for(int r=0;r<nor;r++) {
			for(int s=0;s<r+1;s++) {
				System.out.print("  ");
			}
			for(int s=0;s<nor-r-1;s++) {
				System.out.print(num+" "+"  ");
			}
			num++;
			System.out.println();
	}
		
	}
	
	
	public static void q14() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 14");
		System.out.println();
		int nor=5;
		int num=1;
		int temp=0;
		for (int i = 0; i < nor; i++) {
			temp = num+i;
				for (int j = 0; j < i+1; j++) {
					if(i%2==0) {
						System.out.print(num+" ");
					}
					
					else {
						System.out.print(temp+" ");
						temp--;
					}
					num++;
				}
			
			  System.out.println();
			}
		
		
		}
	

	public static void q15() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 15");
		System.out.println();
		int nor =5;
		
		int num=0;
		for (int i = 0; i < nor; i++) {
			int gap=4;
			num =i+1;
			
			for (int j = 0; j < i+1; j++) {
			   
				if (j==0) {
					System.out.print(num+" ");
				}
				else {
					num=num+gap;
					System.out.print(num+" ");
					gap--;
				}
				
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			q1();
			q2();
			q3();
			q4();
			q5();
			q6();
			q7();
			q8();
			q9();
			q10();
			q11();
			q12();
			q13();
			q14();
			q15();
	}

}
