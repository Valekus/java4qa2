package LR_6_hw.Associations;

public class Association {
    public static void main(String[] args) {
        Bank bank = new Bank("Privat");
        Employee hum = new Employee("Slava");

        System.out.println(hum.geteName() + " is employee of " + bank.getBankName());
    }
}
