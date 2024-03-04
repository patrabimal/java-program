package Programs;

public class FindUpperAndLowerCaseCount {

    public static void main(String[] args) {

        String givenstring="WelCome To AutoMatioN";
        int upper=0;
        int lower=0;

        for(int i=0;i<givenstring.length();i++){
            char character=givenstring.charAt(i);
            if(character>=65 && character<=90){
                upper++;
            }
            else {
                lower++;
            }
        }
        System.out.println("Upper Case character = " + upper);
        System.out.println("Lower Case character = " + lower);
    }
}
