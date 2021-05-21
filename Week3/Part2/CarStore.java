import java.util.Date;

public class CarStore{
    private int id;
    private Cars cars;
    private Customers customers;
    private Date saleDate;

    public CarStore(){
    }

    public CarStore(int id, Cars cars, Customers customers, Date saleDate) {
        this.id = id;
        this.cars = cars;
        this.customers = customers;
        this.saleDate = saleDate;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }
    public Date getSaleDate() {
        return saleDate;
    }

}