package MAIN.user;
import MAIN.animation.*;
import MAIN.tutorial.*;
public class guest extends top_box
{
    public static boolean guest=false;
    guest() {
        super("guest user");
        try {
            Thread.sleep(1000);
            System.out.println("\n Before continuing as a GUEST, things you must know :\n --------------------------------------------------");
            System.out.println("-> Your speed of surfing in the tutorial will be reduced (Loading and other stuffs)");
            System.out.println("-> You will not be allowed to access the Question & Answer Sections of all the topics");
            System.out.println("\n-> To avoid all these, try becoming a member by REGISTERING");
            A:for(;;) {
                System.out.println("\n-> Enter [1] to continue as a GUEST\n-> Enter [0] to Go Back to Home Page and REGISTER");
                String opt=super.sc.nextLine();
                Thread.sleep(1000);
                switch(opt) {
                    case "1": System.out.print("\nEnter your name : ");
                              guest gs1 = new guest(super.sc.nextLine());
                        break A;
                    case "0": menu mn = new menu();
                        break A;
                    default: System.out.println("Invalid Input !!\nPlease try again");
                        Thread.sleep(1000);
                        break;
                }
            }
        } catch (Exception e){}
    }
    private guest(String name) { // constructor overloaded
        super("welcome");
        System.out.println("\n\t\t\t\t\t\t\t\t\t"+name);
        try{Thread.sleep(2000);}catch(Exception e){}
        System.out.println("\n-> Press ENTER to continue\n-> Press [0] to Log Out");
        if(super.sc.nextLine().equals("0")) {
            loading_linear ld = new loading_linear();
            ld.anime("open","closed","Logging Out","Log Out Successful");
            menu mn = new menu();
        }else {
            guest=true;
            try{Thread.sleep(1000);} catch(Exception e){}
            sub_choice ob = new sub_choice();
            ob.ch();
        }
    }
}