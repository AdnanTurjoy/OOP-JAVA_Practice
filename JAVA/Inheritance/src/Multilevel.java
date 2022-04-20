class level1{
    void msg(){
        System.out.println("level-1");
    }
}
class level2 extends level1{
    void msg(){
        System.out.println("level-2");
    }
}
public class Multilevel extends level2 {
    void msg(){
        System.out.println("Multilevel");
    }
    public static void main(String[] args) {
        level1 l1 = new level2();           /// parent er object create korle tar child visit kora jabe
        l1.msg();
    }
}
