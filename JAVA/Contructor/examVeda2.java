class A {
    static void method() {
        System.out.println("Class A method");
    }
}

class B extends A {
    int v=10;
    static void method() {
        System.out.println("Class B method");
    }
}

public class examVeda2 {
    public static void main(String args[]) {
        A a = new B();
        a.method();
    }
}