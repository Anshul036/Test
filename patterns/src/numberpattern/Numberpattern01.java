package numberpattern;


public class Numberpattern01 {

	
	public static void q1 () {
		System.out.println();
		System.out.println();
		System.out.println("Question no 1");
		System.out.println();
		int nor =1;
		for (int i = 0; i < 1; i++) {
			
			for (int j = 0; j < 5 ; j++) {
				System.out.print("1 ");
				
			}
			System.out.println();
		}
	}
	
	public static void q2 () {
		System.out.println();
		System.out.println();
		System.out.println("Question no 2");
		System.out.println();
		int nor =5;
		for (int i = 0; i < nor; i++) {
			
			for (int j = 0; j < 1 ; j++) {
				System.out.print("2 ");
				
			}
			System.out.println();
		}
	}
	
	
	public static void q3 () {
		System.out.println();
		System.out.println();
		System.out.println("Question no 3");
		System.out.println();
		int nor =5;
		for (int i = 0; i < nor; i++) {
			
			for (int j = 0; j < nor+1 ; j++) {
				System.out.print(nor+" ");
				
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
			
			for (int j = 0; j <i+ 1 ; j++) {
				System.out.print((j+1)+" ");
				
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
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <nor-i ; j++) {
				System.out.print((j+1+i)+" ");
				
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
			for (int j = 0; j < nor-1-i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <i+ 1 ; j++) {
				System.out.print((i+1)+" ");
				
			}
			System.out.println();
		}
	}
	
	
	
	public static void q7() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 7");
		System.out.println();
		int nor =5;
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <nor-i ; j++) {
				System.out.print((i+1)+" ");
				
			}
			System.out.println();
		}
	}
	
	
	
	public static void q8() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 8");
		System.out.println();
		int nor =7;
		for (int i = 0; i < nor; i++) {
			
			for (int j = 0; j <i+ 1 ; j++) {
				System.out.print((nor-j)+" ");
				
			}
			System.out.println();
		}
	}
	

	
	public static void q9 () {
		System.out.println();
		System.out.println();
		System.out.println("Question no 9");
		System.out.println();
		int nor =7;
		for (int i = 0; i < nor; i++) {
			
			for (int j = 0; j < nor -i; j++) {
				System.out.print((nor-j)+" ");
				
			}
			System.out.println();
		}
	}	
	
	
	public static void q10() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 10");
		System.out.println();
		int nor =7;
		int num=1;
		for (int i = 0; i < nor; i++) {
			num=1+i;
			for (int j = 0; j <i+1; j++) {
				System.out.print((num)+" ");
				num--;
			}
			System.out.println();
		}
	}	
	
	
	public static void q11 () {
		System.out.println();
		System.out.println();
		System.out.println("Question no 11");
		System.out.println();
		int nor =7;
		for (int i = 0; i < nor; i++) {
			int num= nor-i;
			for (int j = 0; j < nor -i; j++) {
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
	
	
	
	
	
	public static void q12() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 12");
		System.out.println();
		int nor =7;
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print((j+1)+" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print((i-j)+" ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void q13() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 13");
		System.out.println();
		int row =7;
		for (int r = 0; r < row; r++) {
			
			for (int i = 0; i < 1+r; i++) {
				System.out.print((i+1)+(" "));
			}
			System.out.println();
			
		}
		for (int r = 0; r < row-1; r++) {
			
			for (int i = 0; i < row-1-r; i++) {
				System.out.print((i+1)+" ");
			}
			System.out.println();
			
		}
	}
	
	
	public static void q14 () {
		System.out.println();
		System.out.println();
		System.out.println("Question no 14");
		System.out.println();
		int nor =7;
		for (int i = 0; i < nor; i++) {
			
			for (int j = 0; j < nor -i; j++) {
				System.out.print((1+j)+" ");
				
			}
			System.out.println();
		}
		for (int i = 0; i < nor; i++) {
			
			for (int j = 0; j <=i+1 ; j++) {
				System.out.print((j+1)+" ");
				
			}
			System.out.println();
		}
	}	
	
	
	
	public static void q15() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 15");
		System.out.println();
		int nor =7;
		int num=1;
		for (int i = 0; i < nor; i++) {
			num=1+i;
			for (int j = 0; j < nor-1-i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <i+ 1 ; j++) {
				System.out.print((num)+" ");
				num--;
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void q16 () {
		System.out.println();
		System.out.println();
		System.out.println("Question no 16");
		System.out.println();
		int nor =7;
		for (int i = 0; i < nor; i++) {
			int num= nor-i;
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < nor -i; j++) {
				System.out.print(num+" ");
				num--;
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
		q16();
	}

}
