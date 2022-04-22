class Aaa {
    public Aaa() {
        System.out.println("A");
    }

    public Aaa(int i) {
        //this();
        System.out.println(i);
    }
}

class Bbb extends Aaa {
    public Bbb() {
        System.out.println("B");
    }

    public Bbb(int i) {
       // this();
        System.out.println(i + 3);
    }
}

public class examVeda4 {
    public static void main(String[] args) {
       // new Bbb(5);
       Bbb b1= new Bbb(5);
    }
}