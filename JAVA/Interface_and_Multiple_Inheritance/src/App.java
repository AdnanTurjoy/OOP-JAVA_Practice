interface Person{
 String getName();
}
class Employee implements Person{
    public String getName(){
        return "Not Abstruct 1";
    }
}
class Worker implements Person{
    public String getName(){         // must be public
        return "Not Abstruct 2";
    }
}
public class App {
    public static void main(String[] args) throws Exception {
      //  Person p = new Person() ;
      Person p;
      p=new Employee();
      System.out.println(p.getName());
       p=new Worker();
      System.out.println(p.getName());
      
     

    }
}
