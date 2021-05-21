import java.util.Date;

public class Cars {
    private int id;
    private String mark;
    private String model;
    private Date yearOfCar;
    private double capacity;
    private String color;
    private double price;

    public Cars(){

    }

    public Cars(int id, String mark, String model, Date yearOfCar, double capacity, String color, double price) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearOfCar = yearOfCar;
        this.capacity = capacity;
        this.color = color;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setYearOfCar(Date yearOfCar) {
        this.yearOfCar = yearOfCar;
    }

    public Date getYearOfCar() {
        return yearOfCar;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}