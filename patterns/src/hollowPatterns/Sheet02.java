package hollowPatterns;

public class Sheet02 {

	
	public static void q1() {
		System.out.println();
		System.out.println();
		System.out.println("Question no 1");
		System.out.println();
		int nor =6;
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < 2*nor-1; j++) {
				if (j==nor-i&&j==nor+i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		 q1();
		
	}

}
