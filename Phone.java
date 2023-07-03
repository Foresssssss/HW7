package HW7;

public class Phone implements Comparable<Phone> {

    String manufacture;
    String model;
    Double price;

    public Phone(String manufacture, String model, Double price) {
        this.manufacture = manufacture;
        this.model = model;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public int compareTo(Phone o) {
        return Double.compare(price, o.price);
    }
}

