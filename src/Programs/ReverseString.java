package Programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//1- Using string concatenation operator
		String str="Bimal";
		String rstr="";
		
		 int len=str.length();
		 
		 for(int i=len-1; i>=0;i--) 
		 { 
			 rstr=rstr+str.charAt(i); 
			 }
		 System.out.println("Reverse string = " + rstr);
		 
		
		//2- Using character array
		
		/*
		 * char a[]=str.toCharArray(); int len=a.length;
		 * 
		 * for(int i=len-1;i>=0;i--) { rstr=rstr+a[i]; }
		 * System.out.println("Reverse string is: "+rstr);
		 */
		
		//3- Using string buffer class
		
		//StringBuffer sb=new StringBuffer(str);
		//System.out.println("Reverse string is:"+ sb.reverse());

	}

}
