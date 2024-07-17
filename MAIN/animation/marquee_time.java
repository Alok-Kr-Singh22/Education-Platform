package MAIN.animation;
import java.util.*;
import java.text.*;
public class marquee_time implements anime_interface {
    public void anime() {
        for(int i=1;i<=280;i++) {
            Date dt = new Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("MMM dd, Y"), sdf2 = new SimpleDateFormat("hh : mm : ss a");
            String date=sdf1.format(dt), time=sdf2.format(dt);
            System.out.println("\f\t\t\t\t\t\t\tDirecting to Tutorial Home Page ...\n");
            if(i<=140)
                for(int j=1;j<=i;j++)
                    System.out.print(" ");
            else
                for(int j=280;j>=i;j--)
                    System.out.print(" ");
            System.out.println(date);
            if(i<=140)
                for(int j=140;j>=i;j--)
                    System.out.print(" ");
            else
                for(int j=141;j<=i;j++)
                    System.out.print(" ");
            System.out.println(time);
            try{Thread.sleep(50);}catch(Exception e){}
        }
    }
}