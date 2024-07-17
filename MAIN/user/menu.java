package MAIN.user;
import MAIN.animation.*;
public class menu extends top_box {
    public menu() {
        super("home menu");
        guest.guest=false;
        A: for(;;) {
            try {
                Thread.sleep(1000);
                System.out.print("\n-> Enter your choice : ");
                int opt=Integer.parseInt(super.br.readLine());
                switch(opt) {
                    case 1: log_in ob1 = new log_in();
                        break A;
                    case 2: register ob2 = new register();
                        break A;
                    case 3: guest ob3 = new guest();
                        break A;
                    case 4: top_box tbx1 = new top_box("about us");
                            System.out.print("\n\n-> Press Enter to Go Back");super.sc.nextLine();
                            menu mn = new menu();
                        break A;
                    case 0: top_box tbx2 = new top_box("about us");
                            Thread.sleep(3000);
                            ascii_move am = new ascii_move();
                            am.anime("thank","you");
                        break A;
                    default: System.out.println("Input Not In Range !!");
                        break;
                }
            } catch(Exception e) {System.out.println("Invalid Input !!");}
        }
    }
}