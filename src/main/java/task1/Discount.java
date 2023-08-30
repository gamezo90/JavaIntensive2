package task1;

import java.util.ArrayList;

public class Discount {

    int id;

    float size;

    public Discount(int i, float v) {
    }

    public int getId() {
        return id;
    }

    public float getSize() {
        return size;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public static ArrayList createSomeDiscounts() {

        ArrayList<Discount> discounts = new ArrayList<>();
        Discount discount = new Discount(0, 0f);
        discounts.add(discount);
        return discounts;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "id=" + id +
                ", size=" + size +
                '}';
    }
}
