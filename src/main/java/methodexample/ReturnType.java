package main.java.methodexample;

public class ReturnType {
    public static void main(String[] args) {
        System.out.println(getCitizenTypeAndGender(30, "Male"));
        System.out.println(getCitizenTypeAndGender(60, "Female"));
        System.out.println(getCitizenTypeAndGender(70, "Can not disclose"));
        System.out.println(getCitizenTypeAndGender(70, "Others"));

    }

    private static String getCitizenTypeAndGender(int age, String gender) {
        if (age < 60) {
            return "The person is Junior Citizen " + getGender(gender);
        } else {
            return "The person is Senior Citizen " + getGender(gender);
        }
    }

    private static String getGender(String gender) {
        if (gender.trim().equalsIgnoreCase("Male")) {
            return "Male";
        } else if (gender.trim().equalsIgnoreCase("Female")) {
            return "Female";
        } else {
            return "Others";
        }
    }
}
