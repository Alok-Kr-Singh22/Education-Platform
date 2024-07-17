package MAIN.animation;
public class loading_circle implements anime_interface {
    public void anime() {
        int spd=100;
        String s="\t\t\t\t\t\t\t", hd="Creating Your Account ...", ln="\n\n\n\n\n\n\n\n\n";
        try {
            for(int i=1;i<=5;i++) {
                System.out.println("\f"+s+"   "+hd+"\n\n\n\n"+s+"       *");                                                        Thread.sleep(spd);
                System.out.println("\f"+s+"   "+hd+"\n\n\n"+s+"        *\n"+s+"       *");                                          Thread.sleep(spd);
                System.out.println("\f"+s+"   "+hd+"\n\n"+s+"          *\n"+s+"        *\n"+s+"       *");                          Thread.sleep(spd);
                System.out.println("\f"+s+"   "+hd+"\n\n"+s+"          *   *\n"+s+"        *");                                     Thread.sleep(spd);
                System.out.println("\f"+s+"   "+hd+"\n\n"+s+"          *   *\n"+s+"                *");                             Thread.sleep(spd);
                System.out.println("\f"+s+"   "+hd+"\n\n"+s+"              *\n"+s+"                *\n"+s+"                 *");    Thread.sleep(spd);
                System.out.println("\f"+s+"   "+hd+"\n\n\n"+s+"                *\n"+s+"                 *\n"+s+"                *");Thread.sleep(spd);
                System.out.println("\f"+s+"   "+hd+"\n\n\n\n"+s+"                 *\n"+s+"                *\n"+s+"              *");Thread.sleep(spd);
                System.out.println("\f"+s+"   "+hd+"\n\n\n\n\n"+s+"                *\n"+s+"          *   *");                       Thread.sleep(spd);
                System.out.println("\f"+s+"   "+hd+"\n\n\n\n\n"+s+"        *\n"+s+"          *   *");                               Thread.sleep(spd);
                System.out.println("\f"+s+"   "+hd+"\n\n\n\n"+s+"       *\n"+s+"        *\n"+s+"          *");                      Thread.sleep(spd);
                System.out.println("\f"+s+"   "+hd+"\n\n\n\n"+s+"       *\n"+s+"        *");                                        Thread.sleep(spd);
                System.out.println("\f"+s+"   "+hd+"\n\n\n\n"+s+"       *");                                                        Thread.sleep(spd);
                System.out.print("\f");
            }
        } catch(Exception e){}
    }
}