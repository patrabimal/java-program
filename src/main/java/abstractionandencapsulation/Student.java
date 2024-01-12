package main.java.abstractionandencapsulation;

public class Student {

    private String name;
    private int totalMark;
    private int rollNumber;

    public Student(String studentName,int studentTotalMark,int studentRollNumber){
        this.name=studentName;
        this.totalMark = studentTotalMark;
        this.rollNumber = studentRollNumber;
    }

//    public void setName(String studentName) {
//        this.name = studentName;
//    }
//
//    public void setTotalMark(int studentTotalMark) {
//        this.totalMark = studentTotalMark;
//    }
//
//    public void setRollNumber(int studentRollNumber) {
//        this.rollNumber = studentRollNumber;
//    }

    public void printStudentInfo() {
        System.out.println("I am " + name + " with roll number " + rollNumber + " and total mark " + totalMark);
    }

    public String getRank() {
        if (totalMark >= 600) {
            return "First Rank";
        } else if (totalMark >= 500 & totalMark < 600) {
            return "Second Rank";
        } else if (totalMark >= 400 & totalMark < 500) {
            return "Third Rank";
        } else {
            return "Fail";
        }
    }
}
