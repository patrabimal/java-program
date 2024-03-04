package Programs;

public class SplitNumberAlphabetSpecialsymbol {
    public static void main(String[] args) {
        String str = "Bimal@123&patra#*()";
        String alpha = "", num = "", special = "";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
                alpha = alpha + " " + str.charAt(i);
                //if((str.charAt(i)>='A'&&str.charAt(i)<='Z') || (str.charAt(i)>='a'&&str.charAt(i)<='z')){
            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                //else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                num = num + " " + str.charAt(i);
            } else {
                special = special + " " + str.charAt(i);
            }
        }
        //String result=temp1+temp2+temp3;
        System.out.println("Alphabates are : " + alpha);
        System.out.println("Numbers are : " + num);
        System.out.println("Special character are : " + special);
    }
}
