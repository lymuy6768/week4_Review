package week4_Review;

public class Primitive {

	public static void main(String[] args) {
		
		
		
		String x = "T32A345345C325234O";
		
		
		
	System.out.println(x.replaceAll("[0-9]", ""));//Remove 0-9
	System.out.println(x.replaceAll("[^0-9]", ""));	//to keep only 0-9
	
	
	String x2="234AZfr567jSDREFTj566";
	
	System.out.println(x2.replaceAll("[^A-Z]", "")); // to keep UpperCase A-Z
	System.out.println(x2.replaceAll("[^a-z]", ""));
	
	System.out.println(x2.replaceAll("[^A-z]", ""));
	
	String x10="hello556677worlddd";
	System.out.println(x10.replace("a", "b"));
	
	
	String result= "";
	for(int i=0;i<x10.length();i++) {
		
		String singlechar = Character.toString(x10.charAt(i));
		
		if(!result.contains(singlechar)) 
			result+=singlechar;
		}
		System.out.println(result);
	}
	
	
	
	
		
	}
			
		
	


