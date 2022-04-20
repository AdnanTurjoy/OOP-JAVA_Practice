class Bank{
    String getString(){return "Some Bank In BD";}
}
class SBL extends Bank{
    String getString(){return "Sonali Bank Limited";}
}
class DBBL extends Bank{
    String getString(){return "Dutch Bangla Bank Limited";}
}
class IBBL extends Bank{
    String getString(){return "Islami Bank Limited";}
}

public class App {
    public static void main(String[] args) throws Exception {
        Bank bank;               // onek gula k ak object dia call korte chaile evabe korte hobe (Like Refference Variables)
        bank = new DBBL();
        System.out.println(bank.getString());
        bank = new IBBL();
        System.out.println(bank.getString());
        bank = new Bank();
        System.out.println(bank.getString());


    }
}
