package Programs;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("Before swapping values are.."+a+" "+b);
		
		//Logic1- Third variable
		/*
		 * int t=a; a=b; b=t;
		 */
		
		//Logic2- use + & - whith out using third variable
		
		//a=a+b; //10+20=30
		//b=a-b; //30-20=10
		//a=a-b; //30-10=20
		
		//Logic3- use * and / - whith out using third variable
		//here a and b value should not be zero
		
		//a=a*b; //10*20=200
		//b=a/b; //200/20=10
		//a=a/b; //200/10=20
		
		//Logic4- use bitwise operator XOR (^)
		//Binary to decimal / Decimal to Binary
		
		//a=a^b; //10^20=30
		//b=a^b; //30^20=10
		//a=a^b; //30^10=20
		
		//Logic5- use bitwise operator XOR (^)
		//a=10, b=20;
		b=a+b-(a=b);
		System.out.println("After swapping values are.."+a+" "+b);

	}

}
