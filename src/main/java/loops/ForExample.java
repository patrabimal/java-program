package main.java.loops;

public class ForExample {
    public static void main(String[] args) {
        String[] names = {"Avishek", "Bimal", "Hima"};
       // printNamesUsingFor(names);
        printNamesUsingForEach(names);
    }

    // Print all the names in the array
    static void printNamesUsingFor(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    static void printNamesUsingForEach(String[] names) {
        for (String name : names) {
            System.out.println(name);
            
        }
    }
}
