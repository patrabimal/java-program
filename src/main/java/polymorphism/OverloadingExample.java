package main.java.polymorphism;

public class OverloadingExample {
    public void calculate(int a, int b){ //Number of parameter
        System.out.println(a+b);
    }

    public void calculate(int a, int b, int c){ ////Number of parameter
        System.out.println(a+b+c);
    }

    public void calculate(int a, String name){ //Type of datatype
        System.out.println(a+name);
    }

    public void calculate(String name, int a){ //sequence of datatype
        System.out.println(name+a);
    }
}
