package calculatorServlets;

public class test_15 {

    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
        test_15 ex = new test_15();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.println(ex.ch);
    }
    public void change(String str,char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }

    /*private float f = 1.0f;
    int m = 12;
    static int n = 1;
    public static void main(String[] args) {
        test_15 t = new test_15();

        int a = 10;
        double b = 3.14;
        System.out.println(a+b);

        String f1 = args[1];
        String f2 = args[2];
        String f3 = args[3];
    }*/


    /*public static void main(String[] args) {
        A classa = new A("he");
        A classb = new A("he");
        System.out.println(classa==classb);
    }*/
}

class A{
    public A(String str){}
}
