package FirstProj;


public class Customer {

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    private String name;
    private String phoneNumber;
    private String email;

    @Override
    public String toString() {
        return super.toString();
    }

    public Customer(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
