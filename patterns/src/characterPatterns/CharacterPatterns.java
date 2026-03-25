package characterPatterns;

import java.util.Iterator;

public class CharacterPatterns {

	public static void q1() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 1");
		System.out.println();
		System.out.println();

		int nor =5;
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print((char)(65)+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void q2() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 2");
		System.out.println();
		int nor =5;
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void q3() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 3");
		System.out.println();
		int nor =5;
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < nor-i; j++) {
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void q4() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 4");
		System.out.println();
		int nor =5;
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print((char)(65+25-j)+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void q5() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 5");
		System.out.println();
		int nor =5;
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print((char)(65+i)+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void q6() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 6");
		System.out.println();
		int nor =5;
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print((char)(69-j)+" ");
			}
			System.out.println();
		}
	}
	
	public static void q7() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 7");
		System.out.println();
		int nor=5;
		for (int r = 0; r < nor; r++) {
			for (int c = 0; c < (nor-r-1); c++) {
				System.out.print(" ");
			}
			for(int s=0;s<1+r;s++) {
				System.out.print((char)(65+s)+" ");
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
		int num= 65;
		for (int r = 0; r < nor; r++) {
			num = (65+r);
			for (int c = 0; c < (nor-r-1); c++) {
				System.out.print("  ");
			}
			for(int s=0;s<1+r;s++) {
				System.out.print((char)(num-s)+" "+"  ");
			}
			
			System.out.println();
		}
	}
	
	
	public static void q9() {
		int nor = 7;
		System.out.println();
		System.out.println();
		System.out.println("Question no 9");
		System.out.println();
		for (int r = 0; r < nor; r++) {
			for (int i = 0; i < r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < nor-r; i++) {
				System.out.print((char)(65+i)+" ");
			}
			System.out.println();
		}
		for (int r = 0; r < nor-1; r++) {
			for (int i = 0; i < nor-2-r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < r+2; i++) {
				System.out.print((char)(65+i)+" ");
			}
			System.out.println();
		}
	
	}
	
	
	
	public static void q10() {
		int nor =7;
		System.out.println();
		System.out.println();
		System.out.println("Question no 10");
		System.out.println();	
	
		for(int r=0;r<nor;r++) {
				for(int s=0;s<nor-1-r;s++) {
					System.out.print("  ");
				}
				for(int s=0;s<1+r;s++) {
					System.out.print((char)(65+s)+" "+"  ");
				}
				System.out.println();
		}
		for(int r=0;r<nor;r++) {
			for(int s=0;s<r+1;s++) {
				System.out.print("  ");
			}
			for(int s=0;s<nor-r-1;s++) {
				System.out.print((char)(65+s)+" "+"  ");
			}
			System.out.println();
	}
		
	}
	
	
	
	
	public static void q11() {
		int nor = 5;
		System.out.println();
		System.out.println();
		System.out.println("Question no 11");
		System.out.println();
		int num=65;
		for (int i = 0; i < nor; i++) {
			num=65+i;
			for (int j = 0; j < i+1; j++) {
				System.out.print((char)(65+j)+" ");
					
			}
			for(int s=0;s<nor-i-1;s++) {
				System.out.print("  ");
			}
			for(int s=0;s<nor-i-1;s++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print((char)(num-j)+" ");
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void q12() {
		int nor =5;
		System.out.println();
		System.out.println();
		System.out.println("Question no 12");
		System.out.println();	
	int num=65;
		for(int r=0;r<nor;r++) {
			num=65+r;
				for(int s=0;s<nor-1-r;s++) {
					System.out.print("  ");
				}
				for(int s=0;s<1+r;s++) {
					System.out.print((char)(num)+" "+"  ");
				}
				System.out.println();
		}
		
		for(int r=0;r<nor;r++) {
			for(int s=0;s<r+1;s++) {
				System.out.print("  ");
			}
			for(int s=0;s<nor-r-1;s++) {
				System.out.print((char)(69+r)+" "+"  ");
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
	}

}
