class examVeda7{
    examVeda7(){
                System.out.print("Base");
        }
}
public class Derived extends examVeda7{
        public Derived(){
                this("Examveda");
                System.out.print("Derived");
        }
        public Derived(String s){
                System.out.print(s);
        }
        public static void main(String[] args){
                new Derived();
        }
}