package sheet01;

public class Sheet01 {
	
	
	public static String findMax(int n1,int n2) {
		if (n1>n2) {
			return n1+"";
		}
		else if (n2>n1) {
			return n2+"";
		}
		else {
			return "Both numbers are equal";
		}
	}

	public static String findMax(double n1,double n2,double n3) {
		if (n1>n2) {
			if (n1>n3) {
				return n1+"";
			}
		} 
		else if (n2>n1) {
			if (n2>n3) {
				return n2+"";
			}
		}
		else if (n3>n1) {
			if (n3>n2) {
				return n3+"";
			}
		}
		else {
			return "All numbers are equal";
		}
		return "";
		
	}
	
	
	
	public static String findyoung(double n1,double n2,double n3) {
		if (n1<n2) {
			if (n1<n3) {
				return "Rohan is the youngest with an age of"+ n1;
			}
		} 
		else if (n2<n1) {
			if (n2<n3) {
				return "Harsh is the youngest with an age of"+n2;
			}
		}
		else if (n3<n1) {
			if (n3<n2) {
				return "Anjali is the youngest with an age of"+n3;
			}
		}
		
		return "";
		
	}
	
	
	public static String checkNumber(int n) {
		if (n>0) {
			return " Posive number";
		}
		
		else if (n<0) {
			return "Negave number";
		}
		
		else {
			return "The number is zero";
		}
	}
	
	
	public static boolean isDivisible(int n) {
		if(n%5==0 && n%11==0) {
			return true;
		}
		else {
			return false;
		}
			
	}
	
	
	public static String checkEvenOdd(int n) {
		if(n%2==0) {
			return "Even number" ;
		}
		else {
			return "Odd number";
		}
	}
	
	
	public static String checkCharType(char ch) {
		if (ch>='a'&& ch<='Z') {
			return "Alphabet";
		}
		else if (ch>=0 && ch<=9) {
			return "Digit";
		}
		else {
			return "Special character";
		}
	}

	
	public static String checkVowelConsonant(char ch) {
		if(Character.isLetter(ch)) {
		
			ch = Character.toLowerCase(ch);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return "Vowel";
		}
		else {
			return "Consonant";
		}
		
		}
		else {
			return "not a latter" ;
		}
	}
	
	
	
	public static String checkCase(char ch) {
		if(ch>='A'&&ch<='Z') {
			return "Uppercase";
		}
		else if(ch>='a'&&ch<='z') {
			return "Lowercase";
		}
		else {
			return " Not an alphabet";
		}
	}
	
	
	public static String calculateProfitOrLoss(int cp,int sp) {
		if(cp>sp) {
			return "Loss :"+(cp-sp);
		}
		else if(cp<sp) {
			return "profit :"+(sp-cp);
		}
		else {
			return "No Profit, No Loss";
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(findMax(10, 20));
		System.out.println(findMax(10, 20, 15));
		System.out.println(findyoung(10, 20, 15));
		System.out.println(checkNumber(10));
		System.out.println(isDivisible(55));
		System.out.println(checkEvenOdd(4));
		System.out.println(checkCharType('c'));
		System.out.println(checkVowelConsonant('E'));
		System.out.println(checkCase('A'));
		System.out.println(calculateProfitOrLoss(600,900));
		
	}
	
	
}















