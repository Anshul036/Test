package starPattern;

public class Sheet01 {
	
	public static void q1(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 1");
		for (int r = 0; r < 5; r++) {
			System.out.print("* ");
		}
	}

	public static void q2(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 2");
		for (int r = 0; r < 5; r++) {
			System.out.println("* ");
		}
	}

	public static void q3(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 3");
		for (int r = 0; r < row; r++) {
			for (int c = 0; c <= (row+1); c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void q4(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 4");
		for (int r = 0; r < row; r++) {
			for (int c = 0; c <= row; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void q5(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 5");
		for (int r = 0; r < row; r++) {
			for (int c = 0; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void q6(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 6");
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < (row-r); c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void q7(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 7");
		for (int r = 0; r < row; r++) {
			for(int s=0;s<r;s++) {
				System.out.print("  ");
			}
			for (int c = 0; c < (row-r); c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void q8(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 8");
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < (row-r-1); c++) {
				System.out.print("  ");
			}
			for(int s=0;s<=r;s++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	
	public static void q9(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 9");
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < (row-r-1); c++) {
				System.out.print("  ");
			}
			for(int s=0;s<=r;s++) {
				System.out.print("* ");
			}
			for(int s=0;s<r;s++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void q10(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 10");
		for (int r = 0; r < row; r++) {
			for(int s=0;s<r;s++) {
				System.out.print("  ");
			}
			for (int c = 0; c < (row-r); c++) {
				System.out.print("* ");
			}
			for (int c = 0; c < (row-r-1); c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		q1(1);
		q2(5);
		q3(5);
		q4(5);
		q5(5);
		q6(5);
		q7(5);
		q8(5);
		q9(5);
		q10(5);
	}
	

}
