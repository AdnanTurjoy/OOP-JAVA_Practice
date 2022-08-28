

class A{
      int i = 10;
      public void printValue(){
            System.out.print("Value-A");
      }
}

class B extends A{
      int i = 12;
      public void printValue(){
            System.out.print("Value-B");
      }
}
               
public class Test{
      public static void main(String args[]){
            A a = new B();
            a.printValue();
            System.out.print(a.i);
      }
}

// If you create object of subclass with reference of super class like ( A a = new B();) then subclass method and super class variable will be executed.
