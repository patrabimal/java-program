package Programs;

public class GetPrimeNumber {
    public static void main(String[] args) {
        int givennumber=4;
        int count=0;
        if(givennumber>1){
            for(int i=1;i<givennumber;i++){
                if(givennumber%i==0)
                    count++;
            }
            if(count==2){
                System.out.println("This is a prime number");
            }
            else {
                System.out.println("This is not a prime number");
            }
        }
    }
}
