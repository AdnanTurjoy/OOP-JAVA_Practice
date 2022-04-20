class Employee{
    int salary=90000;
}

public class Programmer extends Employee{
    int bonus =1500;
    public static void main(String[] args) throws Exception {
        Programmer p1 = new Programmer();
        System.out.println(p1.salary);
        System.out.println(p1.bonus);
    }
}
