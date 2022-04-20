

public class App {
    static int add(int a, int b){
        return a+b;
    }
    static int a=0;
    public static void main(String[] args) throws Exception {
        App A = new App();
      //System.out.println(A.add(10,6));    
      System.out.println(App.add(11, 10));
      System.out.println(a);
    }
}
