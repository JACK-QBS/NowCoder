package object;

public class test5 {

    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a,b);
        System.out.println(a+"."+b);
    }
    static void operate (StringBuffer x,StringBuffer y) {
        x.append(y);
        y = x;
    }


    /*String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
        test5 ex = new test5();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.println(ex.ch);
    }
    public void change (String str,char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }*/


    /*public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("2");
            }
        });
        t.start();
        t.join();
        System.out.println("1");
    }*/


    /*public static void main(String[] args) {
        int x,y;
        x = 5 >> 2;
        y = x >>> 2;
        System.out.println(y);
    }*/


    /*public static void main(String[] args) {
        String s;
        System.out.println("s="+s);
    }*/

}
