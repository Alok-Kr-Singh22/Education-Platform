package MAIN.animation;
import java.io.*;
public class loading_linear implements anime_interface
{
    public void anime() { // method overrided
        try{Thread.sleep(1000);}catch(Exception e){}
        for(int i=1;i<=100;i++) {
            System.out.print("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t    Loading Questions ...");
            System.out.print("\n\t\t\t|----------------------------------------------------------------------------------------------------|");
            System.out.print("\n\t\t\t|");
            for(int j=1;j<=i;j++)
                System.out.print("#");
            for(int k=1;k<=100-i;k++)
                System.out.print(" ");
            System.out.println("|\n\t\t\t|----------------------------------------------------------------------------------------------------|");
            System.out.println("\t\t\t                                                 ["+i+"%]");
            try {Thread.sleep(50);} catch(Exception e){}
        }
        try{Thread.sleep(1000);}catch(Exception e){}
    }
    public void anime(String lock1,String lock2,String hd1,String hd2) { // method overloaded
        try{Thread.sleep(1500);} catch(Exception e){}
        for(int i=0;i<=100;i+=5) {
            System.out.print("\f");
            String lock=lock1;
            if(i==100)lock=lock2;
            try {
                BufferedReader br = new BufferedReader(new FileReader("files/animation/lock "+lock+".txt"));
                String line;
                while((line = br.readLine())!=null)
                    System.out.println(line);
                br.close();
            } catch(Exception e){System.out.println("Error : "+e);}
            if(i==100) System.out.print("\n\t\t\t\t\t\t\t\t\t   "+hd2);
            else System.out.print("\n\t\t\t\t\t\t\t\t\t      "+hd1+" ...");
            System.out.println("\n\t\t\t\t|----------------------------------------------------------------------------------------------------|");
            System.out.print("\t\t\t\t|");
            for(int j=1;j<=i;j++)
                System.out.print("#");
            for(int k=1;k<=100-i;k++)
                System.out.print(" ");
            System.out.println("|\n\t\t\t\t|----------------------------------------------------------------------------------------------------|");
            System.out.println("\t\t\t\t                                                 ["+i+"%]");
            try{Thread.sleep(500);}catch(Exception e){}
        }
        try{Thread.sleep(3000);} catch(Exception e){}
    }
}