package object;

public class test9 {

    /*public static void main(String[] args) {
        ((test9)null).testMethod();
    }
    private static void testMethod() {
        System.out.println("testMethod");
    }*/


    /*public static void main(String[] args) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }*/


    String str = new String("hello");
    char[] ch = {'a','b'};
    public static void main(String[] args) {
        test9 ex = new test9();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str+" and ");
        System.out.println(ex.ch);

        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j);
        System.out.println(j.equals(i));

        String x = "fmn";
        x.toUpperCase();
        String y = x.replace('f','F');
        y = y + "wxy";
        System.out.println(y);
    }
    public void change(String str,char ch[]) {
        str = "test ok";
        ch[0] = 'c';
    }
}


/*class Person{
    String name = "No name";
    public Person(String nm) {
        name = nm;
    }
}

class Employee extends Person{
    String empID = "0000";
    public Employee(String id) {
        empID = id;
    }
}*/

