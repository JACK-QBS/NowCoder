package calculatorServlets;

public abstract class test_12 {

    public int c = 5;
    public void m() {}
    //public int m();
    public abstract  void m(int a);
    //public abstract void a() {}

    /*public static void main(String[] args) {
        try {

        } catch (java.io.FileNotFoundException ex) {
            System.out.println("FileNotFoundException!");
        } catch (java.io.IOException ex) {
            System.out.println("IOException!");
        } catch (java.lang.Exception ex) {
            System.out.println("Exception!");
        }
    }*/


    /*public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        String str3 = "he" + "llo";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

    }*/

    public static void main(String[] args) {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a+" ");
        add(b);
        System.out.println(b+" ");
    }
    public static void add(Byte b) {
        b = b++;
    }

}
