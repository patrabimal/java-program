package Programs;

public class FindArmstrongNumber {
    public static void main(String[] args) {

        int num = 153; //1*1*1 + 5*5*5 + 3*3*3 //370
        int temp = num;
        int r, sum = 0;
        while (num > 0) {
            r = num % 10;
            num = num / 10;
            sum = sum + r * r * r;
        }
        if (temp == sum) {
            System.out.println("Its an Armstrong Number");
        } else {
            System.out.println("Its not an Armstrong Number");
        }

    }
}
