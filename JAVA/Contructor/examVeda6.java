class A {
    public void method1() {
        System.out.print("Class A method1");
    }
}

class B extends A {
    public void method2() {
        System.out.print("Class B method2");
    }
}

class C extends B {
    public void method2() {
        System.out.print("Class C method2");
    }

    public void method3() {
        System.out.print("Class C method3");
    }
}

public class Test {
    public static void main(String args[]) {
        A a = new A();
        C c = new C();
        c.method2();
        a = c;
        a.method3();
    }
}
//method3() is defined in the class C which is a subclass of B and so A. Even the reference variable a refers to c, a can't access method3() as this method is unknown to class A.
