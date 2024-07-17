package MAIN.tutorial;
import MAIN.user.*;
import MAIN.animation.*;
public class topic_choice extends choice
{
    void ch() {
        A[0][0]="phy"; A[0][1]="chem"; A[0][2]="maths";
        A[1][0]="NLM"; A[1][1]="projectile"; A[1][2]="friction";
        A[2][0]="thermo"; A[2][1]="bonding"; A[2][2]="organic";
        A[3][0]="h&d"; A[3][1]="GST"; A[3][2]="trigonometry";
        
        ascii_move am = new ascii_move();
        am.anime(A[0][i-1],"module");  // using the double dimension reference
        try{Thread.sleep(2000);} catch(Exception e){}
        top_box tbx = new top_box(A[0][i-1]+" menu");  // using the double dimension reference
        for(;;) {
            try {
                Thread.sleep(1000);
                System.out.print("\n-> Enter your choice : ");
                j=Integer.parseInt(super.br.readLine());
                Thread.sleep(1000);
                if(j>3 || j<0) {
                    System.out.println("Input Not In Range !!");
                    continue;
                }
                else if(j==0) {
                    sub_choice ob = new sub_choice();
                    ob.ch();
                    break;
                }
                else {
                    module ob = new module(A[i][j-1]); // using the double dimension reference
                    break;
                }
            } catch(Exception e){System.out.println("Invalid Input !!");}
        }
    }
}