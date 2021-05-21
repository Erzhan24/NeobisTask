public class Customers {
    private int id;
    private String email;
    private String name;
    private String number;
    private String address;

    public Customers(){

    }

    public Customers(int id, String email, String name, String number, String address) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

}