package Test1;

public class test_17 extends X{

    static boolean paddy;
    private int count;
    public String name = "abc";

    test_17(int a) {
        count = a;
    }

    Y y = new Y();
    public test_17() {
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new test_17();

        System.out.println(paddy);

        test_17 test = new test_17(88);
        System.out.println(test.count);

        test_17 test1 = new test_17();
        test_17 test2 = new test_17();
        System.out.println(test1.equals(test2)+","+test1.name.equals(test2.name));
    }
}

class X{
    Y y = new Y();
    public X() {
        System.out.println("X");
    }
}
class Y {
    public Y() {
        System.out.println("Y");
    }
}
