package calculatorServlets;

public class test_13{

    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run() {
                dianping();
            }
        };
        t.run();
        System.out.print("dazhong");
    }
    static void dianping() {
        System.out.print("dianping");
    }


    /*public test_13() {
        System.out.println("xx");
    }
    public static void main(String[] args) {
        test_13 cat = new test_13();
    }*/


    /*static boolean out(char c) {
        System.out.println(c);
        return true;
    }
    public static void main(String[] args) {
        int i = 0;
        for (out('A');out('B');out('C')) {
            i++;
            out('D');
        }
    }*/


    /*public static void main(String[] args) {
        int x = 20,y = 30;
        boolean b;
        b = x>50 && y>60 || x>50 && y<-60 || x<-50 && y>60 || x<-50 && y<-60;
        System.out.println(b);
    }*/
    /*public float am(float a,float b) {return 0;}
    private float am(int a,int b,int c) {return 0;}
    public float am(float a, float b) {}*/
}

abstract class Animal{
    abstract void say();
}