package sheet03;

public class Sheet003 {


//	public static  String electricitybill(int unit) {
//		if (unit<=50) {
//			Double  charge=50 * 0.05;
//			Double tb=(charge)+50*0.20;
//			return tb+"";
//			
//		}
//		else if (unit>=51&&unit<=200) {
//			Double charge= 150*0.75+(50*0.50);
//			double tb=(charge)+
//			
//		}
//	}
	public static String q24(int bs) {
		if (bs<1500) {
			double gs=bs+(bs*0.10+bs*0.90);
			return (int)gs+"";		
		}else if (bs>=1500) {
			double gs=bs+(bs+500+bs*0.98);
			return (int)gs+"";
			
		}
		else {
			return bs+"";
		}
		
		
	}
	public static String q25(int m1,int m2,int m3,int m4,int m5) {
		double totalmarks=m1+m2+m3+m4+m5;
		double per=(totalmarks/500)*100;
		//return per+" ";
		if (per>=60) {
			return "The Student has obtained First Division with "+(int)per+"%";
			
		}else if (per>=50&&per<=59) {
			return "\"The Student has obtained Second division with "+(int)per+"%";
			
		}else if (per>=40&&per<=49) {
			return "Third division";
			
		}else {
			return "Fail";
		}
		
	}
	public static String q26(String g,String ms,int age ) {
		if (g.equalsIgnoreCase("m")) {
			if (ms.equalsIgnoreCase("Married")) {
				if (age>=30) {
					return "The driver is eligible for insurance.";
					
				}
				
				
			}else if (g.equalsIgnoreCase("f")) {
				if (ms.equalsIgnoreCase("Unmarried")) {
					if (age>=30) {
					return "The driver is eligible for insurance.";
					}
				}
			}
			
		}
		return " The driver is Not eligible for insurance;";
	}
	
	public static String q27 (String gs,int yos,String qf ) {
		if (gs.equalsIgnoreCase("m")) {
			if (yos>=10&&qf.equalsIgnoreCase("Post graduate")) {
				return "Salary = Rs 15000";
				
			}
			else if (yos>=10&& qf.equalsIgnoreCase("Graduate")) {
				return "Salary = Rs10000";
				
			}
			else if (yos<10&&qf.equalsIgnoreCase("Post graduate")) {
				return "Salary = Rs10000";
				
			}
			else if (yos<10&&qf.equalsIgnoreCase("Graduate")) {
				return"Salary = Rs7000";
				
			}
			 
			
		}
		if (gs.equalsIgnoreCase("f")) {
			if (yos>=10&&qf.equalsIgnoreCase("post graduate")) {
				return "Salary = Rs12000";
				
			}else if (yos>=10&&qf.equalsIgnoreCase("Graduate")) {
				return "Salary = Rs9000";
				
			}else if (yos<10&&qf.equalsIgnoreCase("Post graduate")) {
				return "Salary = Rs10000";
				
			}else if (yos<10&&qf.equalsIgnoreCase("graduate")) {
				return"Salary = Rs6000";
			}
			
		}
		return "Not found";
		
	}
	public static String q28(int pa) {
		if (pa<500) {
			return "Rs"+pa+"";
		}else if (pa>=500&&pa<1000) {
			Double  tp=pa-(pa*0.5)/100;
			return tp+"";
		}else if (pa>=1001&&pa<5000) {
			double tp=pa-(pa*0.10)/100;
			return tp+"";
			
		}else {
			double tp=pa-(pa*0.15)/100;
			return tp+"";
		}
		
		
	}
	public static String q29(int age ,String health) {
		if (age<30) {
			if (health.equalsIgnoreCase("good")) {
				return "Premium is ₹500.";
				
			}else if (health.equalsIgnoreCase("Poor")) {
				return "Premium is ₹1000.";
				
			}
		}if (age>=30&&age<50) {
				if (health.equalsIgnoreCase("good")) {
					return "Premium is ₹1200";
					
				}else if (health.equalsIgnoreCase("poor")) {
					return "Premium is ₹2000.";
					
				}
		
		}
		if(age>=50) {
					if (health.equalsIgnoreCase("good")) {
						return "Premium is ₹3000.";
						
					}//else if (health.equalsIgnoreCase("poor")) {
						//return "Not eligible for premium";
						
					//}
				}
				
			
	
		return "not eligible for premium";
			
		}
	public static String q30(int age ,String week) {
		if(age<5) {
			return "free";
		}
		if (age>=5&&age<18) {
			if (week.equalsIgnoreCase("Sunday")||week.equalsIgnoreCase("Saturday")) {
				return "₹1,500.";
				
				
			}else {
				return "₹1,000";
			}
		}if(age>=8&&age<60) {
				if (week.equalsIgnoreCase("Sunday")||week.equalsIgnoreCase("Saturday")) {
					return "₹2000";
					
				}else {
					return "₹1,500";
				}
			}
			if (age>=60) {
				if (week.equalsIgnoreCase("Sunday")||week.equalsIgnoreCase("Saturday")) {
					return "Free";
					
				}else {
					return "₹750";
				}
				
			}
			return "";
			
		}
	
	

		

		
		
		
	
				
	public static void main(String[] args) {
		//System.out.println(electricitybill(300));
	//	System.out.println(q24(1500));
		//System.out.println(q25(70, 80, 65, 75, 90));
		//System.out.println(q26("m", "married", 30));
		//System.out.println(q27("f", 6, "GRADUATE"));
		System.out.println(q28(10000));
		System.out.println(q29(25, "good"));
		System.out.println(q30(25, "sunday"));
	}

}