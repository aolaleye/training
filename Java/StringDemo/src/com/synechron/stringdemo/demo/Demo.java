package com.synechron.stringdemo.demo;

public class Demo {


	public static void main(String[] args) {
		
		String str=new String ("Teckpix");
		str.concat("Solution");
		System.out.println( str );
		
		StringBuffer Sb= new StringBuffer ("Teckpix");
		Sb.append("Solution");
		System.out.println( Sb );
		
		String fl = "Florida";
		System.out.println(fl.length());
		System.out.println(fl.charAt(2));
		System.out.println(fl.substring(3));
		System.out.println(fl.substring(0, 3));
		
		String s1 = "Sunshine";
		String s2 = "State";
		System.out.println(s1.concat(s2));
		
		String s3 = "Learn Share Learn";
		int output = s3.indexOf("Share");
		System.out.println(output);
		System.out.println(s3.indexOf("a", 3));
		System.out.println(s3.lastIndexOf("a"));
		
		System.out.println("Geeks".equals("Geeks"));
		System.out.println("Geeks".equals("geeks"));
		
		System.out.println("Geeks".equalsIgnoreCase("Geeks"));
		System.out.println("Geeks".equalsIgnoreCase("geeks"));
		
		int c1 = s1.compareTo(s2);
		System.out.println(c1);
		int c2 = "Geek".compareTo("Geek");
		System.out.println(c2);
		int c3 = "Geek".compareTo("geek");
		System.out.println(c3);
		int c4 = "Geek".compareToIgnoreCase("geek");
		System.out.println(c4);
		
		System.out.println("GEEKS".toLowerCase());
		System.out.println("geeks".toUpperCase());
		System.out.println("Geeks for geeks".trim());
		
//		String r1 = “feeksforfeeks“; 
//		String r2 = r1.replace(‘f’ ,’g’); 
		
		System.out.println("---------------------------");
		
		 StringBuffer s=new StringBuffer("GeeksGeeks");
	        s.insert(5, "for");
	        System.out.println(s); // returns GeeksforGeeks
	         
	        s.insert(0, 5);
	        System.out.println(s); // returns 5GeeksforGeeks
	         
	        s.insert(3, true);
	        System.out.println(s); // returns 5GetrueeksforGeeks
	         
	        s.insert(5, 41.35d);
	        System.out.println(s); // returns 5Getr41.35ueeksforGeeks
	         
	        s.insert(8, 41.35f);
	        System.out.println(s); // returns 5Getr41.41.3535ueeksforGeeks
	         
	        char geeks_arr[] = { 'p', 'a', 'w', 'a', 'n' };
	       
	        // insert character array at offset 9
	        s.insert(2, geeks_arr);
	        System.out.println(s); // returns 5Gpawanetr41.41.3535ueeksforGeeks


		
	}

}
