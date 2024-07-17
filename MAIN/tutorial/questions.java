package MAIN.tutorial;
import MAIN.user.*;
import MAIN.animation.*;
import java.io.*;
class questions {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    questions(String topic) {
        try {
            A: for(;;) {
                anime_interface ai = new loading_linear();
                ai.anime();
                top_box tbx = new top_box(topic);
                Thread.sleep(1000);
                BufferedReader br = new BufferedReader(new FileReader("files/modules/questions/"+topic+".txt"));
                String line;
                while((line=br.readLine())!=null) {
                    if(line.substring(0,2).equals(" Q")) {
                        System.out.println("\n\t\t\t\t\t\t-> Press Enter to continue to NEXT QUESTION\n\t\t\t\t\t\t-> Enter [0] to Go Back\n");
                        if(this.br.readLine().equals("0")) break A;
                    }
                    else if(line.substring(0,8).equals(" Answer:")) {
                        System.out.println("\n\t\t\t\t\t\t-> Press Enter to view the ANSWER\n\t\t\t\t\t\t-> Enter [0] to Go Back\n");
                        if(this.br.readLine().equals("0")) break A;
                    }
                    System.out.println(line);
                    Thread.sleep(50);
                }
                br.close();
                for(;;) {
                    System.out.println("\n\n\t\t\t\t\t\t-> Enter [0] to Go Back");
                    if(this.br.readLine().equals("0")) break A;
                    else {System.out.println("Invalid Input !!");Thread.sleep(1000);}
                }
            }
        } catch(Exception e) {System.out.println("File not found ");}
    }
}