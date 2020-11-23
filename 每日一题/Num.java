package org.example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Num {
    /*public static boolean isAdmin(String userId) {
        return userId.toLowerCase()=="admin";
    }

    public static void main(String[] args) {
        System.out.println(isAdmin("Admin"));
    }*/

    /*public static void main(String[] args) {
        Test test = null;
        test.hello();
        System.out.println(test.add());
    }*/

    /*public static void main(String[] args) {
        new Num();
        new Base();
    }*/

    /*public int aMethod() {
        int i = 0;
        i++;
        return i;
    }

    public static void main(String[] args) {
        Num num = new Num();
        num.aMethod();
        int j = num.aMethod();
        System.out.println(j);
    }*/

    public static void main(String[] args) {
        A a0 = new A();
        A a1 = new B();
        A a2 = new C();
    }
}

class A{}
class B extends A{}
class C extends B{}

abstract class MyClass {
    public int constInt = 5;
    //constInt = constInt + 5;
    // public int method();
    public abstract void method(int a);
    public void method() {};
}

class Base {
    Base() {
        System.out.println("Base");
    }
}

class Test {
    public static void hello() {
        System.out.println("hello");
    }
    public int add() {
        return 1;
    }
}