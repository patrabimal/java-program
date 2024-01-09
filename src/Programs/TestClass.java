package Programs;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Enter a string to reverse");
		
		Scanner sc=new Scanner(System.in);
		String str="Bimal";
		String revstr="";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			revstr=revstr+str.charAt(i);
		}
		System.out.println("Reverse string is: "+revstr);
	}

}
