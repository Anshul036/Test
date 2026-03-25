package alphabet;

import java.util.Iterator;

public class Alphabet {
	
	public static void o(int row) {
		for (int r = 0; r <= row; r++) {
			for (int c = 0; c < row; c++) {
				if((r==0&&(c<row-1&&c>0))||(c==0&&(r>0&&r<row-1))||(r==row-1&&(c<row-1&&c>0))||(c==row&&(r>0&&r<row-1)))
					System.out.print("* ");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		o(7);
		
	}

}
