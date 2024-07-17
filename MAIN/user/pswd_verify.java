package MAIN.user;
import MAIN.animation.*;
import MAIN.tutorial.*;
import java.util.*;
import java.io.*;
public class pswd_verify
{
    private String captcha() {
        int i=(int)(Math.random()*10);
        String captcha[]={"a9cd2k","qr67tx","m8nj%x","9dx5y3","vk1402","t9qn17","gob836","y39#zd","@u8k2b","f6r7te"};
        try {
            BufferedReader br = new BufferedReader(new FileReader("files/captcha/captcha"+(i+1)+".txt"));
            String line;
            while((line =br.readLine())!=null)
                System.out.println(line);
            br.close();
        } catch(Exception e) {System.out.println("Captcha not found");}
        return captcha[i];
    }
    pswd_verify(String name,String pswd,int chances) {
        Scanner sc = new Scanner(System.in);
        if(chances==0) {
            System.out.println("\nYou have ran out of chances. Try logging In later when you know the right password.");
            System.exit(0);
        }
        System.out.println();
        if(chances!=3) System.out.print("Re-");
        System.out.print("Enter your password ("+chances+" chances left) : ");
        String s2=sc.nextLine();
        if(s2.equals(pswd))
            try {
                for(;;) {
                    Thread.sleep(2000);
                    String cp1 = captcha();
                    System.out.print("Enter the captcha shown above (It is NOT case sensitive) : ");
                    String cp2=sc.nextLine();
                    if(cp2.equalsIgnoreCase(cp1)) break;
                    else System.out.println("\nCaptcha does not match !!");
                }
                Thread.sleep(1000);
                anime_interface ai = new verifying();
                ai.anime();
                System.out.println("\n\nPassword verified");
                loading_linear ld = new loading_linear();
                ld.anime("closed","open","Logging In","Log In Successful");
                top_box tbx = new top_box("welcome");
                System.out.println("\n\t\t\t\t\t\t\t\t\t"+name);
                Thread.sleep(2000);
                System.out.println("\n-> Press ENTER to continue\n-> Press [0] to Log Out");
                if(sc.nextLine().equals("0")) {
                    ld.anime("open","closed","Logging Out","Log Out Successful");
                    menu mn = new menu();
                }else {
                    Thread.sleep(1000);
                    sub_choice ob = new sub_choice();
                    ob.ch();
                }
            } catch(Exception e){}
        else {
            System.out.println("Incorrect password !!");
            try {Thread.sleep(1000);} catch(Exception e){}
            pswd_verify pv = new pswd_verify(name,pswd,chances-1);
        }
    }
}