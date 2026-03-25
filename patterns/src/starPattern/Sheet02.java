package starPattern;



public class Sheet02 {
	
	
	public static void q11(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 11");
		System.out.println();
		for (int r = 0; r < row; r++) {
			for (int i = 0; i < row-1-r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < 1+r; i++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for (int r = 0; r < row-1; r++) {
			for (int i = 0; i <r+1 ; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < row-1-r; i++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	
	
	
	public static void q12(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 12");
		System.out.println();
		for (int r = 0; r < row; r++) {
			
			for (int i = 0; i < 1+r; i++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for (int r = 0; r < row-1; r++) {
			
			for (int i = 0; i < row-1-r; i++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	

	
	public static void q13(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 13");
		System.out.println();
		for (int r = 0; r < row; r++) {
			for (int i = 0; i < r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < row-r; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int r = 0; r < row-1; r++) {
			for (int i = 0; i < row-2-r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < r+2; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
	
	
	
	public static void q14(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 14");
		System.out.println();	
		for (int r = 0; r < row; r++) {
			for (int i = 0; i < row-r; i++) {
				System.out.print("* ");
			}
		
			System.out.println();
		}
		for (int r = 0; r < row; r++) {
			
			for (int i = 0; i < r+1; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
	
	
	
	public static void q15(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 15");
		System.out.println();	
		for (int r = 0; r < row; r++) {
			for(int s=0;s<r;s++) {
				System.out.print("  ");
			}
			for (int c = 0; c < (row-r); c++) {
				System.out.print("* ");
			}
			for (int c = 0; c < (row-r); c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		for(int r=0;r<row;r++) {
				for(int s=0;s<row-1-r;s++) {
					System.out.print("  ");
				}
				for (int c = 0; c < r+1; c++) {
					System.out.print("* ");
				}
				for (int c = 0; c < r+1; c++) {
					System.out.print("* ");
				}
				System.out.println();
		}
	}
	
	
	public static void q16(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 16");
		System.out.println();
		for (int i = 0; i <row; i++) {
			for (int j = 0; j < row-i; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < row-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void q17(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 17");
		System.out.println();
		for(int r=0;r<row;r++) {
			for(int s=0;s<row-1-r;s++) {
				System.out.print("  ");
			}
			for (int c = 0; c < r+1; c++) {
				System.out.print("* ");
			}
			for (int c = 0; c < r; c++) {
				System.out.print("* ");
			}
			System.out.println();
	}
		for (int r = 0; r < row; r++) {
			for(int s=0;s<r+1;s++) {
				System.out.print("  ");
			}
			for (int c = 0; c < (row-r-1); c++) {
				System.out.print("* ");
			}
			for (int c = 0; c < (row-r-2); c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void q18(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 18");
		System.out.println();
		for (int r = 0; r < row; r++) {
			
			for (int i = 0; i < 1+r; i++) {
				System.out.print("* ");
			}
			for (int i = 0; i < row-r-1; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < row-r-1; i++) {
				System.out.print("  ");
			}for (int i = 0; i < 1+r; i++) {
				System.out.print("* ");
			}
			System.out.println();
			
			
		}
		for (int r = 0; r < row-1; r++) {
			
			for (int i = 0; i < row-1-r; i++) {
				System.out.print("* ");
			}
			for (int j = 0; j < r+1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < r+1; j++) {
				System.out.print("  ");
			}
			for (int i = 0; i < row-1-r; i++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	
	
	public static void q19(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 19");
		System.out.println();
		
		for (int r = 0; r < 5; r++) {
			for (int i = 0; i < row-r; i++) {
				System.out.print("* ");
			}
			for (int i = 0; i < r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < row-r; i++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j < row-i-1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < row-i-1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void q20(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 20");
		System.out.println();	
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < 2*row-1-2*i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < row-1; i++) {
			
			for (int j = 0; j <row-2-i; j++) {
				System.out.print("  ");
			}
			for(int j=0;j< (3+(2*i));j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void q21(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 21");
		System.out.println();
		for(int r=0;r<row;r++) {
			for(int s=0;s<row-1-r;s++) {
				System.out.print("  ");
			}
			for (int c = 0; c < r+1; c++) {
				System.out.print("* ");
			}
			for (int c = 0; c < r; c++) {
				System.out.print("* ");
			}
			for (int c = 0; c < (row-r-1); c++) {
				System.out.print("  ");
			}
			for (int c = 0; c < (row-r-1); c++) {
				System.out.print("  ");
			}
			for (int c = 0; c < r+1; c++) {
				System.out.print("* ");
			}
			for (int c = 0; c < r; c++) {
				System.out.print("* ");
			}
			System.out.println();
	}
		for (int r = 0; r < row; r++) {
			for(int s=0;s<r+1;s++) {
				System.out.print("  ");
			}
			for (int c = 0; c < (row-r-1); c++) {
				System.out.print("* ");
			}
			for (int c = 0; c < (row-r-2); c++) {
				System.out.print("* ");
			}
			for (int c = 0; c < r+1; c++) {
				System.out.print("  ");
			}
			for (int c = 0; c < r+1; c++) {
				System.out.print("  ");
			}
			for (int c = 0; c < (row-r-1); c++) {
				System.out.print("* ");
			}
			for (int c = 0; c < (row-r-2); c++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	
	public static void q22(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 22");
		System.out.println();
		for (int r = 0; r < 5; r++) {
			for (int i = 0; i < row-r; i++) {
				System.out.print("* ");
			}
			for (int i = 0; i < r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < row-r; i++) {
				System.out.print("* ");
			}
			for (int i = 0; i < row-r; i++) {
				System.out.print("* ");
			}
			for (int i = 0; i < r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < r; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < row-r; i++) {
				System.out.print("* ");
			}	
			System.out.println();
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j < row-i-1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < row-i-1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j < row-i-1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < row-i-1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		q11(5);
		q12(5);
		q13(5);
		q14(5);
		q15(5);
		q16(5);
		q17(5);
		q18(5);
		q19(5);
		q20(5);
		q21(5);
		q22(5);
	}

}
