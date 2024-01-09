package main.java.abstractexample;

public class Son extends Father {
    public static void main(String[] args) {

        Son childAbstract=new Son();
        childAbstract.add(5,6);
        System.out.println(childAbstract.multiply(5, 5));

    }

    @Override
    public int multiply(int i, int j) {
        return i * j;
    }
}
