package sheet02;

public class Sheet02 {
	
	
	
	    
	    public static String printWeekday(int weekNumber) {
	        if (weekNumber == 1) {
	            return "Monday";
	        } else if (weekNumber == 2) {
	            return "Tuesday";
	        } else if (weekNumber == 3) {
	            return "Wednesday";
	        } else if (weekNumber == 4) {
	            return "Thursday";
	        } else if (weekNumber == 5) {
	            return "Friday";
	        } else if (weekNumber == 6) {
	            return "Saturday";
	        } else if (weekNumber == 7) {
	            return "Sunday";
	        } else {
	            return "Invalid week number";
	        }
	    }
	
	    
	    
	    public static String printMonthName(int monthNumber) {
	        if (monthNumber == 1) {
	            return "January";
	        } else if (monthNumber == 2) {
	            return "February";
	        } else if (monthNumber == 3) {
	            return "March";
	        } else if (monthNumber == 4) {
	            return "April";
	        } else if (monthNumber == 5) {
	            return "May";
	        } else if (monthNumber == 6) {
	            return "June";
	        } else if (monthNumber == 7) {
	            return "July";
	        } else if (monthNumber == 8) {
	            return "August";
	        } else if (monthNumber == 9) {
	            return "September";
	        } else if (monthNumber == 10) {
	            return "October";
	        } else if (monthNumber == 11) {
	            return "November";
	        } else if (monthNumber == 12) {
	            return "December";
	        } else {
	            return "Invalid month number";
	        }
	    }
	    
	    public static String calculateTotalAmount(int notesOf100, int notesOf500, int notesOf2000) {
	        int totalAmount = (notesOf100 * 100) + (notesOf500 * 500) + (notesOf2000 * 2000);
	        
	        if (totalAmount > 10000) {
	            return "Amount exceeds 10,000";
	        } else {
	            return "Amount is within limit";
	        }
	    }
	    
	    
	    
	    public static String calculateTotalExpenses(int quantity, double pricePerItem) {
	        double totalAmount = quantity * pricePerItem;
	        
	        if (quantity > 100) {
	            double discount = totalAmount * 0.10;
	            double finalAmount = totalAmount - discount;
	            return "Total amount before discount: Rs." + totalAmount + 
	                   "\nDiscount applied: Rs." + discount + 
	                   "\nFinal amount after discount: Rs." + finalAmount;
	        } else {
	            return "No discount applicable. Total amount: Rs." + totalAmount;
	        }
	    }
	    
	    
	    
	    public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
	        if (angle1 + angle2 + angle3 == 180) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public static boolean isValidTriangleSides(int side1, int side2, int side3) {
	        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public static String checkTriangleType(int side1, int side2, int side3) {
	        
	        if (!isValidTriangleSides(side1, side2, side3)) {
	            return "Not a valid triangle";
	        }
	        
	        if (side1 == side2 && side2 == side3) {
	            return "Equilateral";
	        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
	            return "Isosceles";
	        } else {
	            return "Scalene";
	        }
	    }
	    
	    public static String calculateBonus(int currentYear, int joiningYear) {
	        int yearsServed = currentYear - joiningYear;
	        
	        if (yearsServed > 3) {
	            int bonus = 2500;
	            return "Years served: " + yearsServed + " years\nThe employee is eligible for a bonus of Rs. " + bonus;
	        } else {
	            return "Years served: " + yearsServed + " years\nNo bonus applicable";
	        }
	    }
	    
	    public static String calculateGrade(int marks1, int marks2, int marks3, int marks4, int marks5) {
	        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
	        double percentage = (totalMarks / 500.0) * 100;
	        
	        String grade;
	        if (percentage >= 90) {
	            grade = "A";
	        } else if (percentage >= 80) {
	            grade = "B";
	        } else if (percentage >= 70) {
	            grade = "C";
	        } else if (percentage >= 60) {
	            grade = "D";
	        } else if (percentage >= 40) {
	            grade = "E";
	        } else {
	            grade = "F";
	        }
	        
	        return "Total Marks = " + totalMarks + "\nPercentage = " + percentage + "%\nGrade: " + grade;
	    }
	    
	    
	    public static String calculateGrossSalary(double basicSalary) {
	        double hra, da;
	        
	        if (basicSalary <= 10000) {
	            hra = basicSalary * 0.20;
	            da = basicSalary * 0.80;
	        } else if (basicSalary <= 20000) {
	            hra = basicSalary * 0.25;
	            da = basicSalary * 0.90;
	        } else {
	            hra = basicSalary * 0.30;
	            da = basicSalary * 0.95;
	        }
	        
	        double grossSalary = basicSalary + hra + da;
	        
	        return "Basic Salary = Rs." + basicSalary + 
	               "\nHRA = Rs." + hra + 
	               "\nDA = Rs." + da + 
	               "\nGross Salary = Rs." + grossSalary;
	    }

	
	
	
	    public static void main(String[] args) {

	        System.out.println(printWeekday(7));
	        
	        System.out.println(printMonthName(12));
	        
	        System.out.println(calculateTotalAmount(10, 10, 5));
	        
	        System.out.println(calculateTotalExpenses(150, 20));
	        

	        System.out.println(isValidTriangle(80, 50, 60));
	        
	        System.out.println(isValidTriangleSides(10, 15, 25));
	        

	        System.out.println(checkTriangleType(7, 8, 9));
	        
	        System.out.println(calculateBonus(2024, 2022));
	        
	        System.out.println(calculateGrade(95, 85, 90, 80, 88));
	        
	        System.out.println(calculateGrossSalary(8000));
	    }

}
