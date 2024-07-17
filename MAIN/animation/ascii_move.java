package MAIN.animation;
import java.io.*;
import javax.sound.sampled.*;
public class ascii_move implements anime_interface {
    String line;
    private void print(BufferedReader br,int space,int spd,String s) {
        try {
            while((line =br.readLine())!=null) {
                for(int j=1;j<space;j++)
                    System.out.print(" ");
                System.out.println(line);
            }
            Thread.sleep(spd);
            System.out.print(s);
        } catch (Exception e){}
    }
    public void anime() { // method overrided
        try {
            System.out.print("\f");
            BufferedReader br = new BufferedReader(new FileReader("files/animation/welcome1.txt"));
            for(int i=1;i<=6;i++) {
                while((line=br.readLine()).equals("")==false)
                    System.out.println(line);
                Thread.sleep(500);
                System.out.print("\f");
            }
            sound("welcome");
            for(int i=1;i<=40;i++)
                print(new BufferedReader(new FileReader("files/animation/welcome2.txt")),i,75,"\f");
            for(int i=1;i<=60;i++) {
                print(new BufferedReader(new FileReader("files/animation/welcome2.txt")),40,0,"");
                print(new BufferedReader(new FileReader("files/animation/to.txt")),i,75,"\f");
            }
            for(int i=1;i<=15;i++) {
                print(new BufferedReader(new FileReader("files/animation/welcome2.txt")),40,0,"");
                print(new BufferedReader(new FileReader("files/animation/to.txt")),60,0,"");
                String s="\f";
                if(i==15) s="";
                print(new BufferedReader(new FileReader("files/animation/pcm.txt")),i,75,s);
            }
        } catch (Exception e){System.out.println("File Not Found");}
    }
    public void anime(String file1,String file2) { // method overloaded
        try {
            if(file1.equals("thank")) sound("exit");
            System.out.print("\f");
            for(int i=1;i<=30;i++)
                print(new BufferedReader(new FileReader("files/animation/"+file1+".txt")),i,50,"\f");
            for(int i=1;i<=45;i++) {
                print(new BufferedReader(new FileReader("files/animation/"+file1+".txt")),30,0,"");
                String s="\f";
                if(i==45) s="";
                print(new BufferedReader(new FileReader("files/animation/"+file2+".txt")),i,50,s);
            }
        } catch(Exception e){System.out.println("File Not Found");}
    }
    private void sound(String file) {
        try {
            File sound = new File("files/"+file+".wav");
            AudioInputStream AIS = AudioSystem.getAudioInputStream(sound);
            Clip cp = AudioSystem.getClip();
            cp.open(AIS);
            cp.start();
        } catch(Exception e){e.printStackTrace();}
    }
}