package LR_2;

public class Contact {
    //конструктор с параметрами создаем через 'Generate'
    public Contact(String name, int phoneNumber, Address address) {
        Name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Contact(){

    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    String Name;
    int phoneNumber;
    Address address;

}
