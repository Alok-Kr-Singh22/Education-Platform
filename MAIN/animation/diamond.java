package MAIN.animation;
public class diamond implements anime_interface
{
    public void anime() {
        int i,j,k,l;
        try {Thread.sleep(1000);} catch(Exception e){}
        for(int n=1;n<=15;n++) {
            System.out.println("\f\t\t\t\t\t\t\t\tLoading Contents ...");
            for(int line=15;line>=n;line--)
                    System.out.print("\n");
            for(i=1;i<=n;i++) {
                for(int space=35;space>=n;space--)
                    System.out.print("  ");
                for(j=n;j>=i;j--)
                System.out.print("  ");
                for(k=3;k<=4*i-1;k++)
                    if(k==3 || k==4*i-1)
                        System.out.print("*");
                    else if(n!=1 && i==n && k==(3+(4*i-1))/2)
                        System.out.print((int)(i*6.67)+"%");
                    else if(n!=1 && i==n && (k==(((3+(4*i-1))/2)+1) || k==(((3+(4*i-1))/2)+2) || ((int)(i*6.67)==100 && k==(((3+(4*i-1))/2)+3))))
                        System.out.print("");
                    else
                        System.out.print(" ");
                System.out.println();
            }
            for(i=1;i<=4*(n-1);i+=4) {
                for(int space=35;space>=n;space--)
                    System.out.print("  ");
                System.out.print("  ");
                for(j=1;j<=i;j+=4)
                    System.out.print("  ");
                for(l=4*(n-2)-1;l>=(i-2);l--)
                    if(l==4*(n-2)-1 || l==i-2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                System.out.println();
            }
            try {Thread.sleep(400);} catch(Exception e){}
        }
        try {Thread.sleep(1000);} catch(Exception e){}
    }
}