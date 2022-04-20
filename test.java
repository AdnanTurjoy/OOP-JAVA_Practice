import java.util.Scanner;

class test{
    int n;
    String st;
    test(){
        System.out.println("default constructor");
    }
    test(int a, int b){
        System.out.println("parameterize constrructor");;
    }
    test(test t){
        System.out.println("copy constructor");
    }
     public static void main(String[] args) {
        System.out.println("Hello world!");
        test t = new test();            // default constructor
        test t2 = new test(12,5); // parapeterize constructor
        test t3 = new test(t2);         // copy constructor
        
    }
}