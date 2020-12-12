package Test1;

public class test_18 {

    private static int x = 100;
    public static void main(String[] args) {
        test_18 h1 = new test_18();
        h1.x++;
        test_18 h2 = new test_18();
        h2.x++;
        h1 = new test_18();
        h1.x++;
        test_18.x--;
        System.out.println(x);

    }


    /*public String str = "6";
    public static void main(String[] args) {
        test_18 sv = new test_18();
        sv.change(sv.str);
        System.out.println(sv.str);
    }
    public void change(String str) {
        str = "10";
    }*/


    /*public static void main(String[] args) {
        Integer a1 = 59;
        int a2 = 59;
        Integer a3 = Integer.valueOf(59);
        Integer a4 = new Integer(59);
        System.out.println(a1 == a3);
        System.out.println(a3 == a4);
        System.out.println(a2 == a4);
        System.out.println(a1 == a2);
    }*/
}
