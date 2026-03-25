package hollowPatterns;

public class Sheet01 {
	
	public static void q1(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 1");
		System.out.println();
		for(int i=1; i<=row; i++){
		    for(int j=1; j<=row+1; j++){
		        if(i==1 || i==row )
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
	}
	

	public static void q2(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 2");
		System.out.println();
		for(int i=1; i<=row; i++){
		    for(int j=1; j<=row+1; j++){
		        if(j==1 || j==row+1 )
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
	}
	
//	public static void q3(int row) {
//		System.out.println();
//		System.out.println();
//		System.out.println("Question no 3");
//		System.out.println();
//	    for(int i = 1; i <= row; i++) {
//	        for(int j = 1; j <= row; j++) {
//	            if(i == 1 || i == row || j == 1 || j == row) {
//	                System.out.print("* ");
//	            } else {
//	                System.out.print("  ");
//	            }
//	        }
//	        System.out.println();
//	    }
//
//	}
	
	private static void q3 (int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 4");
		System.out.println();
		for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if ( i == 0 || i == row - 1 || j == 0 || j == row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }

	}
	
	
	private static void q4 (int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 4");
		System.out.println();
		for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if ( i == row - 1 || j == 0 || j == row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }

	}
	
	public static void q5(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 5");
		System.out.println();
		for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == 0 || j == 0 || j == row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
        
	}
	
	public static void q6(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 6");
		System.out.println();
		for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == j ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

	}

	
	public static void q7(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 7");
		System.out.println();
		for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (j == row - i + 1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

	}
	
	public static void q8(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 8");
		System.out.println();
		for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == j || j == row - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

	}
	
	public static void q9(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 9");
		System.out.println();
		for(int i=1; i<=row; i++){
		    for(int j=1; j<=row+1; j++){
		        if(i==1 || i==row || j == row - i + 1 )
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
		
	}
	
	
	public static void q10(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 10");
		System.out.println();
		for(int i=1; i<=row; i++){
		    for(int j=1; j<=row+1; j++){
		        if(i==1 || i==row || i == j  )
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
		
	}
	
	
	public static void q11(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 11");
		System.out.println();
		for(int i=1; i<=row; i++){
		    for(int j=1; j<=row+1; j++){
		        if(i==row/2+1 || j ==row/2+1 )
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
		
	}
	
	public static void q12(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 12");
		System.out.println();
		for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == 1 || i == row || j == 1 || j == row || j==row/2+1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
	    
	}
	
	public static void q13(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 13");
		System.out.println();
	    for(int i = 1; i <= row; i++) {
	        for(int j = 1; j <= i; j++) {
	            if(j == 1 ||i== 1|| i == row || i == j ) {
	                System.out.print("* ");
	            } else {
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
	}
	
	
	public static void q14(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 14");
		System.out.println();
	    for(int i = 1; i <= row; i++) {
	        for(int j = 1; j <= i; j++) {
	            if( i == 1 || i == j ) {
	                System.out.print("* ");
	            } else {
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
	}
	
	
	
	public static void q15(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 15");
		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if(i==row-1 ||(i==row-j-1&&j==row-i-1) ||j==row-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
	
	
	public static void q16(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 16");
		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if(i==0 ||(i==j&&j==i) ||j==row-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
	
	
	
	public static void q17(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 17");
		System.out.println();
		for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == 1 || i == row || j == 1 || j == row || i==row/2+1 || j ==row/2+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
	    
	}
	
	public static void q18(int row) {
		System.out.println();
		System.out.println();
		System.out.println("Question no 18");
		System.out.println();
		for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == 1 || i == row || j == 1 || j == row || i == j || i + j == row + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
	    
	}

	public static void main(String[] args) {
		q1(5);
		q2(5);
		q3(5);
		q4(5);
		q5(5);
		q6(5);
		q7(5);
		q8(5);
		q9(5);
		q10(5);
		q11(7);
		q12(7);
		q13(5);
		q14(7);
		q15(7);
		q16(7);
		q17(7);
		q18(7);
	}

}
