class Aa {
    int i = 10;

    public void printValue() {
        System.out.print("Value-A");
    }
}

class Bb extends Aa {
    int i = 12;

    public void printValue() {
        System.out.print("Value-B");
    }
}

public class examVeda3 {
    public static void main(String args[]) {
        Aa a = new Bb();                       // override er jei object k reference korce oi method e call hobe ,
                                               // bt variable er jnno age parent er age call hobe
        a.printValue();
        System.out.print(a.i);
    }
}