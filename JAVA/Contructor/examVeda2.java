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

/* Overriding in Java simply means that the particular method would be called based on the run time type of the object and
not on the compile time type. But in the above case the methods are static which means access to them is always resolved 
during compile time only using the compile time type information.
Accessing them using object references is just an extra liberty given by the designers of Java. */
