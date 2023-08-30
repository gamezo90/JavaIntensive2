package task1;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Computer {

    int id;

    String manufacturer;

    String model;

    BigDecimal price;

    public Computer(int id, String manufacturer, String model, BigDecimal price){
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public static ArrayList createSomeComputers() {

        ArrayList<Computer> computers = new ArrayList<>();
        Computer comp1 = new Computer(1, "Asus", "Rog", BigDecimal.valueOf(800));
        computers.add(comp1);
        Computer comp2 = new Computer(2, "Acer", "Aspire", BigDecimal.valueOf(600));
        computers.add(comp2);
        Computer comp3 = new Computer(3, "Dell", "AlienWare", BigDecimal.valueOf(2000));
        computers.add(comp3);
        Computer comp4 = new Computer(4, "Hp", "Pavilion", BigDecimal.valueOf(1000));
        computers.add(comp4);
        Computer comp5 = new Computer(5, "Lenovo", "Ideadpad", BigDecimal.valueOf(1200));
        computers.add(comp5);
        return computers;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
