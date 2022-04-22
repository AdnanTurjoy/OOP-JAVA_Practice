class Mammal {
    Mammal(){
        System.out.println("MAMMAL");
    }
    void eat(Mammal m) {
        System.out.println("Mammal eats food");
    }
}

class Cattle extends Mammal {
    Cattle(){
        System.out.println("CATTLE");
    }
    void eat(Cattle c) {
        System.out.println("Cattle eats hay");
    }
}

class Horse extends Cattle {
    Horse(){
        System.out.println("HORSE");
    }
    void eat(Horse h) {
        System.out.println("Horse eats hay");
    }
}

public class examVeda5 {
    public static void main(String[] args) {
        Mammal h = new Horse();
        Cattle c = new Horse();
        c.eat(h);                 
    }
}



// OUTPUT

/*

MAMMAL
CATTLE
HORSE
Mammal eats food

*/