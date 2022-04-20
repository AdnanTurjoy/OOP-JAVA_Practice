abstract class Person{
    int op = 100;
 abstract String getName();
}
class Employee extends Person{
    String getName(){
        return "Not Abstruct 1";
    }
}
class Worker extends Person{
    String getName(){
        return "Not Abstruct 2";
    }
}
public class App {
    public static void main(String[] args) throws Exception {
      //  Person p = new Person() ;
      Person p;
      p = new Employee();
      System.out.println(p.getName());
      p = new Worker();
      System.out.println(p.getName());
      System.out.println(p.op);

    }
}
