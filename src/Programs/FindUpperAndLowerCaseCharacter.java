package Programs;

public class FindUpperAndLowerCaseCharacter {

    public static void main(String[] args) {

        String givenstring="WelCome To AutoMatioN";
        String upper="";
        String lower="";

        for(int i=0;i<givenstring.length();i++){
            char character=givenstring.charAt(i);
            if(character>=65 && character<=90){
                upper=upper+character;
            }
            else {
                lower=lower+character;
            }
        }
        System.out.println(upper);
        System.out.println(lower);

    }
}
