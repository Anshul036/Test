package sheet03;

public class Sheet03 {
	
	public static double calculateElectricityBill(int units) {
	    double bill = 0;
	    
	    if (units <= 50) {
	        bill = units * 0.50;
	    } else if (units <= 200) {
	        bill = (50 * 0.50) + ((units - 50) * 0.75);
	    } else if (units <= 450) {
	        bill = (50 * 0.50) + (150 * 0.75) + ((units - 200) * 1.20);
	    } else {
	        bill = (50 * 0.50) + (150 * 0.75) + (250 * 1.20) + ((units - 450) * 1.50);
	    }
	    
	    double surcharge = bill * 0.20;
	    return bill + surcharge;
	}

	
	public static String calculateBonus(double salary, char performanceRang, Object... additionalParams) {
	    double bonus = 0;
	    
	    if (performanceRang == 'A') {
	        int yearsOfService = (int) additionalParams[0];
	        if (yearsOfService > 10) {
	            bonus = salary * 0.20;
	        } else if (yearsOfService >= 5) {
	            bonus = salary * 0.15;
	        }
	    } else if (performanceRang == 'B') {
	        String jobLevel = (String) additionalParams[0];
	        if (jobLevel.equalsIgnoreCase("senior")) {
	            bonus = salary * 0.12;
	        } else if (jobLevel.equalsIgnoreCase("junior")) {
	            bonus = salary * 0.08;
	        }
	    }
	    
	    double finalSalary = salary + bonus;
	    return "Bonus = " + bonus + " Final Salary = " + finalSalary;
	}

	
	public static String calculateTravelBill(int kilometers) {
	    int bill = 0;
	    
	    if (kilometers <= 10) {
	        bill = kilometers * 11;
	    } else if (kilometers <= 100) {
	        bill = (10 * 11) + ((kilometers - 10) * 10);
	    } else {
	        bill = (10 * 11) + (90 * 10) + ((kilometers - 100) * 9);
	    }
	    
	    return "Total Bill = Rs." + bill;
	}

	
	public static double calculateGrossSalary(double basicSalary) {
	    double hra, da;
	    
	    if (basicSalary < 1500) {
	        hra = basicSalary * 0.10;
	        da = basicSalary * 0.90;
	    } else {
	        hra = 500;
	        da = basicSalary * 0.98;
	    }
	    
	    return basicSalary + hra + da;
	}

	
	public static String calculateDivision(int marks1, int marks2, int marks3, int marks4, int marks5) {
	    int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
	    double percentage = (totalMarks / 500.0) * 100;
	    
	    String division;
	    if (percentage >= 60) {
	        division = "First Division";
	    } else if (percentage >= 50) {
	        division = "Second Division";
	    } else if (percentage >= 40) {
	        division = "Third Division";
	    } else {
	        division = "Fail";
	    }
	    
	    return "The student has obtained " + division + " with " + percentage + "% marks";
	}

	
	public static String checkInsuranceEligibility(String maritalStatus, String gender, int age) {
	    boolean eligible = false;
	    
	    if (maritalStatus.equalsIgnoreCase("married")) {
	        eligible = true;
	    } else if (maritalStatus.equalsIgnoreCase("unmarried")) {
	        if (gender.equalsIgnoreCase("male") && age > 30) {
	            eligible = true;
	        } else if (gender.equalsIgnoreCase("female") && age > 25) {
	            eligible = true;
	        }
	    }
	    
	    if (eligible) {
	        return "The driver is eligible for insurance.";
	    } else {
	        return "The driver is not eligible for insurance.";
	    }
	}

	
	public static int calculateEmployeeSalary(String gender, int yearsOfService, String qualification) {
	    int salary = 0;
	    
	    if (gender.equalsIgnoreCase("male")) {
	        if (yearsOfService >= 10) {
	            if (qualification.equalsIgnoreCase("post-graduate")) {
	                salary = 15000;
	            } else if (qualification.equalsIgnoreCase("graduate")) {
	                salary = 10000;
	            }
	        } else {
	            if (qualification.equalsIgnoreCase("post-graduate")) {
	                salary = 10000;
	            } else if (qualification.equalsIgnoreCase("graduate")) {
	                salary = 7000;
	            }
	        }
	    } else if (gender.equalsIgnoreCase("female")) {
	        if (yearsOfService >= 10) {
	            if (qualification.equalsIgnoreCase("post-graduate")) {
	                salary = 12000;
	            } else if (qualification.equalsIgnoreCase("graduate")) {
	                salary = 9000;
	            }
	        } else {
	            if (qualification.equalsIgnoreCase("post-graduate")) {
	                salary = 10000;
	            } else if (qualification.equalsIgnoreCase("graduate")) {
	                salary = 6000;
	            }
	        }
	    }
	    
	    return salary;
	}

	
	public static double calculateFinalBill(double purchaseAmount) {
	    double discount = 0;
	    
	    if (purchaseAmount < 500) {
	        discount = 0;
	    } else if (purchaseAmount <= 1000) {
	        discount = purchaseAmount * 0.05;
	    } else if (purchaseAmount <= 5000) {
	        discount = purchaseAmount * 0.10;
	    } else {
	        discount = purchaseAmount * 0.15;
	    }
	    
	    return purchaseAmount - discount;
	}

	
	public static String calculatePremium(int age, String health) {
	    if (age < 30) {
	        if (health.equalsIgnoreCase("good")) {
	            return "500";
	        } else if (health.equalsIgnoreCase("poor")) {
	            return "1000";
	        }
	    } else if (age < 50) {
	        if (health.equalsIgnoreCase("good")) {
	            return "1200";
	        } else if (health.equalsIgnoreCase("poor")) {
	            return "2000";
	        }
	    } else {
	        if (health.equalsIgnoreCase("good")) {
	            return "3000";
	        } else if (health.equalsIgnoreCase("poor")) {
	            return "Not eligible for insurance.";
	        }
	    }
	    
	    return "Invalid input";
	}

	
	public static String calculateTicketPrice(int age, String day) {
	    boolean isWeekend = day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday");
	    
	    if (age < 5) {
	        return "Free";
	    } else if (age < 18) {
	        if (isWeekend) {
	            return "1,500";
	        } else {
	            return "1,000";
	        }
	    } else if (age < 60) {
	        if (isWeekend) {
	            return "2,000";
	        } else {
	            return "1,500";
	        }
	    } else {
	        if (isWeekend) {
	            return "750";
	        } else {
	            return "Free";
	        }
	    }
	}
	
	
	
	public class TestConditionalStatementsPart3 {
	    public static void main(String[] args) {
	        
	        
	        System.out.println("Electricity Bill for 500 units: Rs." + calculateElectricityBill(500));
	        
	        System.out.println(calculateBonus(25000, 'C', "anything"));
	        

	        System.out.println(calculateTravelBill(5));
	        

	        System.out.println("Gross Salary for Rs.800: Rs." + calculateGrossSalary(800));
	        
	        System.out.println(calculateDivision(30, 25, 35, 40, 20));
	        
	        System.out.println(checkInsuranceEligibility("unmarried", "female", 30));
	        
	       
	        System.out.println("Male, 5 years, Post-Graduate: Rs." + calculateEmployeeSalary("male", 5, "post-graduate"));
	        
	        System.out.println("Final bill for Rs.6000: Rs." + calculateFinalBill(6000));
	        
	        System.out.println("Age 45, Good health: " + calculatePremium(45, "good"));
	        
	        System.out.println("Age 3, Friday: " + calculateTicketPrice(3, "Friday"));
	    }
	}
	
}
