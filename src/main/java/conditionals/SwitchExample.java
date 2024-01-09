package main.java.conditionals;

public class SwitchExample {

    public static void main(String[] args) {
        SwitchExample switchExample = new SwitchExample();
        switchExample.printBrowser("chrome ");
        switchExample.printBrowserUsingSwitch("Firefox");
    }


    public void printBrowser(String browserName) {
        if (browserName.trim().equalsIgnoreCase("Safari")) {
            System.out.println("It is Safari browser");
        } else if (browserName.trim().equalsIgnoreCase("Chrome")) {
            System.out.println("It is Chrome browser");
        } else if (browserName.trim().equalsIgnoreCase("firefox")) {
            System.out.println("It is firefox browser");
        } else {
            System.out.println("Invalid browser name");
        }
    }

    public void printBrowserUsingSwitch(String browserName) {
        switch (browserName.trim()) {
            case "safari":
                System.out.println("It is Safari browser");
                break;
            case "chrome":
                System.out.println("It is Chrome browser");
                break;
            case "firefox":
                System.out.println("It is firefox browser");
                break;
            default:
                System.out.println("Invalid browser name");
        }
    }

    
}