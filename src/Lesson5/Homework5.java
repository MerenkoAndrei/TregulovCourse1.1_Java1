package Lesson5;

public class Homework5 {
    int id = 10;
    String name = "Andrey";
    double balance = 1000.50;

    void popolnenieScheta(double popolnenie) {
        System.out.println("\nБаланс до пополнения: " + balance);
        System.out.println("Баланс увеличивается на: " + popolnenie);
        balance += popolnenie;
        System.out.println("Осталось средств: " + balance);
    }

    void snytieSoScheta(double many) {
        System.out.println("\nБаланс до снятия: " + balance);
        System.out.println("Сумма снятия: " + many);
        balance -= many;
        System.out.println("Осталось средств: " + balance);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        Homework5 MyAccount = new Homework5();// объект
        MyAccount.popolnenieScheta(150000);
        MyAccount.snytieSoScheta(50000);
    }
}
