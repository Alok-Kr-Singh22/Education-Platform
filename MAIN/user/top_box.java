package MAIN.user;
import java.io.*;
import java.util.*;
import java.text.*;
public class top_box
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    public top_box(String file_name) {
        try {
            Thread.sleep(1000);
            System.out.print("\f");
            Date dt = new Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("MMM dd, Y"), sdf2 = new SimpleDateFormat("hh : mm a");
            String date=sdf1.format(dt), time=sdf2.format(dt);
            BufferedReader br = new BufferedReader(new FileReader("files/top box/"+file_name+".txt"));
            String line;
            for(int i=1;(line = br.readLine())!=null;i++) {
                System.out.print(line);
                if(i!=2 && i!=3)
                    System.out.println();
                if(i==2)
                    System.out.println("DATE : "+date);
                else if(i==3)
                    System.out.println("TIME : "+time);
                Thread.sleep(150);
            }
            br.close();
        } catch(Exception e){System.out.println("Error : "+e);}
    }
}