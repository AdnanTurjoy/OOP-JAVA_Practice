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
    Programmer(int a){
        
        System.out.println("Programmer Contructor"+a);
        
    }
    public static void main(String[] args) throws Exception {
        Programmer p1 = new Programmer(5);
        // System.out.println(p1.salary);
        // System.out.println(p1.bonus);
        // p1.msg();
        // Employee p2 = new Employee();
        // p2.msg();
    }
}
