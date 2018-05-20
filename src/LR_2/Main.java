package LR_2;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.setName("Valentin");
        contact.setPhoneNumber(123123);

        Address address = new Address(); // создаем адресс
        address.setIndex(465465);
        address.setStreet("Bocharova");
        contact.setAddress(address);

    }
}
