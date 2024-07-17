package MAIN.user;
import MAIN.animation.*;
import java.util.*;
public class start {
    public start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\f-> Let's Start The Exploration.\n-> Press Enter");
        sc.nextLine();
        anime_interface ai = new ascii_move();
        ai.anime();
        try {
            Thread.sleep(2000);
            System.out.println("\n-> Press ENTER to continue");
            sc.nextLine();
            menu ob2 = new menu();
        } catch(Exception e){}
    }
}