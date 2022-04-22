class Base {
    int value = 0;

    Base() {
        addValue();
    }

    void addValue() {
        value += 10;
    }

    int getValue() {
        return value;
    }
}

class Derived extends Base {
    Derived() {
        addValue();
    }

    void addValue() {
        value += 20;
    }
}

public class examVeda {
    public static void main(String[] args) {
        Derived b = new Derived();
        System.out.println(b.getValue());
    }
}