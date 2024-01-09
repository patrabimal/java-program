package main.java.loops;

public class WhileExample {
    public static void main(String[] args) {
        //printName("bimal", 3);
        printNameForOddNumber("bimal",4);

    }
    static void printName(String name, int count) {
        int i = 0;
        while (i < count) {
            System.out.println(name);
            i++;
        }
    }
    // Print name atleast once irrespective of odd/even
    // Input a number, and loop till the count, print name if number is odd or else skip
    static void printNameForOddNumber(String name, int count){
       int i =1;
        do{
            System.out.println(name);
            i++;
        }
        while(i%2==0);
    }
}
