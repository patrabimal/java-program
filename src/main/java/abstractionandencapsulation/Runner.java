package main.java.abstractionandencapsulation;

public class Runner {
    public static void main(String[] args) {

        Student bimal = new Student("Bimal",630,23);

//        bimal.setName("Bimal");
//        bimal.setTotalMark(630);
//        bimal.setRollNumber(23);
        bimal.printStudentInfo();
        System.out.println("Bimal Rank is " + bimal.getRank());

        Student avishek = new Student("Avishek",540,12);

//        avishek.setName("Avishek");
//        avishek.setTotalMark(540);
//        avishek.setRollNumber(12);
        avishek.printStudentInfo();
        System.out.println("Avishek rank is " + avishek.getRank());
    }
}
