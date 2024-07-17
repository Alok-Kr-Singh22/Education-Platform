package MAIN.user;
import MAIN.animation.*;
import java.io.*;
class register extends top_box implements payment
{
    String name, username, pswd, acc_num, cvv, phn, expire, otp_s;
    int otp_i= (int)(Math.random()*10000);
    register() {
        super("registration");
        try {
            Thread.sleep(1000);
            System.out.print("\n\nEnter your name : ");
            name=super.sc.nextLine();
            String u=username(), p=pswd(), p_star="";
            for(int i=1;i<=p.length();i++) p_star+="*";
            Thread.sleep(1000);
            pay();
            Thread.sleep(2000);
            String bar="\n\n=============================================\n\n";
            System.out.println("\f"+bar+"\tName : "+name+"\n\tUsername : "+u+"\n\tPassword : "+p_star+"\n\n\tBank Details -");
            System.out.println("\n\tAccount No. : ************"+acc_num+"\n\tCVV : ***\n\tExpire date : "+expire+"\n\tMobile Number : "+phn);
            System.out.print("\tOTP received : ****"+bar+"-> Enter '1' to MAKE PAYMENT and become a MEMBER\n-> Enter '0' to");
            System.out.println(" change your Account Details\n\n-> Else just Press Enter to discard the details and Go Back to Home Page");
            String s=super.sc.nextLine();
            switch(s) {
                case "1": PrintStream output = new PrintStream(new FileOutputStream("files/users/"+u+".txt"));
                          output.println(p);
                          output.println(name);
                          anime_interface lc = new loading_circle();
                          lc.anime();
                          Thread.sleep(1000);
                          System.out.println("\t\t\t\t\t\t\tAccount Created");
                          Thread.sleep(1000);
                          System.out.println("\n-> Press ENTER to proceed to LOG IN WINDOW");
                          super.sc.nextLine();
                          log_in li = new log_in();
                        break;
                case "0": register rg = new register();
                        break;
                default : menu mn = new menu();
            }
        }catch(Exception e){System.out.println("Error : "+e);}
    }
    public void pay() { // overrides interface payment method pay()
        A: for(;;) {
            String otp_dash="";
            for(int i=1;i<=100;i++)
                otp_dash+="-";
            System.out.println("\nTo Register and become a member, you require to pay Rs. 1000");
            System.out.println("\nEnter Mode of Payment :\n1 - Debit Card, 2 - Credit Card");
            switch(super.sc.nextLine()) {
                case "1":
                case "2": B:for(;;) {
                                System.out.println("Select your bank :\n1- SBI    2- PNB    3- Union Bank    4- BoI    5- Axis Bank    6- ICICI Bank");
                                switch(super.sc.nextLine()) {
                                    case "1": case "2": case "3": case "4": case "5": case "6":
                                        System.out.print("Enter your Account No. : ");
                                        String acc=super.sc.nextLine();
                                        if(acc.length()>=4) acc_num=acc.substring(acc.length()-4);
                                        else acc_num=acc;
                                        System.out.print("Enter your CVV No. (last 3 digits) : ");
                                        cvv=super.sc.nextLine();
                                        System.out.print("Enter your Card's Month and Year of expiry (format of entry : \"mm/yyyy\") : ");
                                        expire=super.sc.nextLine();
                                        System.out.print("Enter your 10 digit Mobile No. : ");
                                        phn=super.sc.nextLine();
                                        System.out.println(otp_dash+"Scroll Right to view your OTP "+otp_dash+"> "+otp_i);
                                        System.out.print("\nEnter the OTP you received : ");
                                        super.sc.nextLine();otp_s="****";
                                        System.out.println("\nVerifying ...");
                                        try{Thread.sleep(2000);}catch(Exception e){}
                                        System.out.println("Verified");
                                        break B;
                                    default: System.out.println("Invalid Input. Please try again");
                                             try{Thread.sleep(1500);}catch(Exception e){}
                                             break;
                                }
                            }
                            break A;
                default: System.out.println("Invalid Input. Please try again");
                         try{Thread.sleep(1500);}catch(Exception e){}
                         break;
            }
        }
    }
    private String username() {
        System.out.print("Create a new username (It should not contain spaces) : ");
        username=super.sc.nextLine();
        for(int i=0;i<=username.length()-1;i++)
            if(username.charAt(i)==' ') {
                System.out.println("Username should not have spaces !!\n");
                try{Thread.sleep(2500);}catch(Exception e){}
                username();
                break;
            }
        return username;
    }
    private String pswd() {
        System.out.print("\nCreate a new password (atleast 4 characters) : ");
        pswd=super.sc.nextLine();boolean a=true;
        String weak1[]={name,username,"abcd","dcba","abcdefgh","hgfedcba","aaaa","bbbb","cccc","dddd","abcde","edcba","","",""};
        String weak2[]={"1234","12345","123456","1234567","12345678","0000","00000","000000","0000000","00000000","4321","54321","654321","7654321","87654321"};
        for(int i=0;i<=weak2.length-1;i++)
            if(pswd.length()<4 || pswd.equalsIgnoreCase(weak1[i]) || pswd.equalsIgnoreCase(weak2[i])) {
                System.out.println("WEAK PASSWORD !!  Please try a strong one.");
                try{Thread.sleep(2500);}catch(Exception e){}
                a=false;
                pswd();
                break;
            }
        if(a==true) {
            System.out.print("Re-Enter your password : ");
            String re=super.sc.nextLine();
            if(re.equals(pswd)==false) {
                System.out.println("\nPassword does not match !!"); try{Thread.sleep(2000);}catch(Exception e){}
                pswd();
            }
            return pswd;
        }return pswd;
    }
}