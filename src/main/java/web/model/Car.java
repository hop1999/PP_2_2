package web.model;

public class Car {
    private String color;

    private String model;

    private String priceInDollars;

    public Car(){}

    public Car(String priceInDollars, String model, String color) {
        this.color = color;
        this.model = model;
        this.priceInDollars = priceInDollars;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getPriceInDollars() {
        return priceInDollars;
    }

    public void setPriceInDollars(String priceInDollars) {
        this.priceInDollars = priceInDollars;
    }
}
