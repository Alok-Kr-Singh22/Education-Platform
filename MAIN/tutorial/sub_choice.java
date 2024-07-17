package MAIN.tutorial;
import MAIN.user.*;
import MAIN.animation.*;
public class sub_choice extends choice
{
    public void ch() {
        anime_interface ai = new marquee_time();
        ai.anime();
        try{Thread.sleep(2000);} catch(Exception e){}
        top_box tbx = new top_box("sub menu");
        for(;;) {
            try {
                Thread.sleep(1000);
                System.out.print("\n-> Enter your choice : ");
                i=Integer.parseInt(super.br.readLine());
                Thread.sleep(1000);
                if(i>3 || i<0) {
                    System.out.println("Input Not In Range !!");
                    continue;
                }
                else if(i==0) {
                    loading_linear ld = new loading_linear();
                    ld.anime("open","closed","Logging Out","Log Out Successful");
                    menu mn = new menu();
                    break;
                }
                else {
                    topic_choice ob = new topic_choice();
                    ob.ch();
                    break;
                }
            } catch(Exception e){System.out.println("Invalid Input !!");}
        }
    }
}