package Programs;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		
		//Approach_1
		/*String str="Welcome to java"; // Original string
		String[] words=str.split(" "); //Splitting string into words
		
		String revstr="";
		
		for(String w:words) // welcome / to / java
		{
			String revword="";
			for(int i=w.length()-1;i>=0;i--) {
				revword=revword+w.charAt(i);
			}
			revstr=revstr+revword+" "; //emoclew ot avaj
		}
		
		System.out.println(revstr);*/
		
		//Approach_2
		
		String str="Welcome to java";
		String[] words=str.split("\\s");
		
		String revword="";
		for(String w:words) //welcome /to / java
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse(); //emoclew ot avaj
			revword=revword+sb.toString()+" ";
		}
		System.out.println(revword);

	}

}
