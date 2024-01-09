package oop.classes;

public class ChildClass extends ClassExample{
    int number=906;
    String address="Sarjapur";

    public static void main(String[] args) {
        ChildClass childClass=new ChildClass();

        System.out.println(childClass.id);
        System.out.println(childClass.name);
        System.out.println(childClass.place);
        System.out.println(childClass.number);
        System.out.println(childClass.address);
    }
}
