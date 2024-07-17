package MAIN.animation;
public class verifying implements anime_interface {
    public void anime() {
        for(int i=0;i<=8;i++) {
            System.out.print("\fVerifying Password  ");
            for(int j=0;j<=i%3;j++)
                System.out.print("+ ");
            try {Thread.sleep(750);} catch(Exception e){}
        }
    }
}