public class test5 {

    private float f = 1.0f;
    int m = 12;
    static int n = 1;

    String str = new String("hello");
    char[] ch = {'a','b'};

    public static void main(String[] args) {
        test5 t = new test5();
        t.change(t.str,t.ch);
        System.out.print(t.str+"and ");
        System.out.print(t.ch);

    }

    public void change(String str,char ch[]) {
        str = "test ok";
        ch[0] = 'c';
    }
}
