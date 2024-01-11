package main.java.conditionals;

public class IfElseAndSwitch {
    public static void main(String[] args) {
        IfElseAndSwitch ifElseAndSwitch=new IfElseAndSwitch();
        //ifElseAndSwitch.getEmployeeExperience();
        ifElseAndSwitch.getEmployeeExperienceusingswitch();
    }
        double experience=1.5;
//    public void  getEmployeeExperience(){
//        if(experience>6){
//            System.out.println("Senior Employee");
//        } else if (experience>2 & experience<6) {
//            System.out.println("Junior Employee");
//        } else if (experience>0 & experience<2) {
//            System.out.println("Fresher Employee");
//        }else{
//            System.out.println("Not an Employee");
//        }
//    }

    public void getEmployeeExperienceusingswitch(){
        switch((int) experience){
            case 7:
                System.out.println("Senior Employee");
                break;
            case 3:
                System.out.println("Junior Employee");
                break;
            case 1:
                System.out.println("Fresher Employee");
                break;
            default:
                System.out.println("Not an employee");
        }
    }
}
