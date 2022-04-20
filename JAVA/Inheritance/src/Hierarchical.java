class Mother{
    String a="hello dear";
    void msg(){
        System.out.println("Mother");
    }
}

class child1 extends Mother{
    void msg(){
        System.out.println("child1");
    }
}
class child2 extends Mother{
    void msg(){
        System.out.println("child2");
    }
}
public class Hierarchical  {
    public static void main(String[] args) {
        Mother m =new child2(); 
        m.msg();
        child2 c = new child2();
       System.out.println(c.a);
    }
}



