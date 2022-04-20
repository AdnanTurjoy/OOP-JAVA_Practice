class Employee{
    int salary=90000;
    void msg(){
        System.out.println("Employee");
    }
    Employee(){
        System.out.println("Employee Contructor");
    }
}

public class Programmer extends Employee{
    int bonus =1500;
    void msg(){
        System.out.println("Programmer");
    }
    Programmer(){
        System.out.println("Programmer Contructor");
    }
    public static void main(String[] args) throws Exception {
        Programmer p1 = new Programmer();
        System.out.println(p1.salary);
        System.out.println(p1.bonus);
        p1.msg();
        Employee p2 = new Employee();
        p2.msg();
    }
}
