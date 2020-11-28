package object;

public class test6 {
    /*public static void main(String[] args) {
        boolean b = true?false:          true==true ? false:true;
        System.out.println(b);
    }*/


    /*public test6 (){
        System.out.println("I am A class");
    }
    static {
        System.out.println("static A");
    }*/


    public static void main(String[] args) {
        int num = 10;
        System.out.println(test(num));
    }
    public static int test(int b) {
        try{
            b += 10;
            return b;
        } catch (RuntimeException e) {

        }
        catch (Exception e2) {

        }
        finally {
            b += 10;
            return b;
        }
    }
}


class Hello extends test6 {
    public Hello (){
        System.out.println("I am B class");
    }
    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new Hello();
    }

}
