package MAIN.tutorial;
import MAIN.user.*;
import MAIN.animation.*;
import java.io.*;
class module
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    module(String topic) {
        try {
            A: for(;;) {
                anime_interface ai = new diamond();
                ai.anime();
                top_box tbx = new top_box(topic);
                Thread.sleep(1000);
                System.out.println("\n\n   Things you must know before proceeding ...:\n\n-> Keep pressing Enter to proceed through the contents");
                System.out.println("-> You can scroll through the contents whenever you wish\n-> Enter [0] whenever you wish to Go Back to Topic Menu");
                System.out.println("\n-> Press Enter to continue\n-> Enter [0] to Go Back");
                if(this.br.readLine().equals("0")) break;
                BufferedReader br = new BufferedReader(new FileReader("files/modules/"+topic+".txt"));
                String line;
                for(int n=1;(line=br.readLine())!=null;n++) {
                    System.out.println(line);
                    Thread.sleep(50);
                    if(n%25==0)
                        if(this.br.readLine().equals("0")) break A;
                }
                br.close();
                for(;;) {
                    System.out.println("\n\n\t\t\t\t\t\t-> Enter [1] to Proceed to QUESTIONS\n\t\t\t\t\t\t-> Enter [0] to Go Back");
                    String s=this.br.readLine();
                    if(guest.guest==false)
                        switch(s) {
                            case "1": questions qs = new questions(topic);
                            case "0": break A;
                            default: System.out.println("Invalid Input !!");
                                     Thread.sleep(1000); break;
                        }
                    else {
                        System.out.println("\n\nGUESTS ARE NOT ALLOWED TO ACCESS QUESTION & ANSWER SESSION OF ANY TOPIC\n\n-> Enter [1] to Go Back");
                        if(this.br.readLine().equals("1")) break A;
                        else {System.out.println("Invalid Input !!");Thread.sleep(1000);}
                    }
        }
            }
            topic_choice ob = new topic_choice();
            ob.ch();
        } catch(Exception e) {System.out.println("File not found");}
    }
}