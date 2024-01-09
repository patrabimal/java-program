package main.java.conditionals;

public class TernaryOperator {

    public static void main(String[] args) {
        findMax();
    }

    static void findMax() {
        int a = 10, b = 20, max;
        int x = 3, y = 4, z;
        max = (a > b) ? a : b;
        z = (x == 3 ? (y == 4 ? 6 : 8) : 9);
        System.out.println(max);
        System.out.println(z);
    }
}
