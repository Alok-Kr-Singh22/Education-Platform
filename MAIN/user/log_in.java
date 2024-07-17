package MAIN.user;
import java.io.*;
class log_in extends top_box {
    log_in() {
        super("log in window");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.print("\nEnter your username : ");
        String user=super.sc.nextLine();
        String s1="",s2="";
        try {
            BufferedReader br = new BufferedReader(new FileReader("files/users/"+user+".txt"));
            s1=br.readLine();
            s2=br.readLine();
            br.close();
            pswd_verify ob = new pswd_verify(s2,s1,3); // chances = 3
        } catch(Exception e) {
            System.out.println("\nAccount is not registered.\nDo you wish to register now ?");
            System.out.println("\n-> Press Enter to coninue with Log In\n-> Press '0' to Go Back to Home Page and Register");
            if(super.sc.nextLine().equals("0")) {menu mn = new menu();}
            else {log_in li = new log_in();}
        }
    }
}