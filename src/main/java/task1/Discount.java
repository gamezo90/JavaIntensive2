package task1;

import java.util.ArrayList;

public class Discount {

    int userId;

    float size;

    public Discount(int userId, float size) {
    }

    public int getUserId() {
        return userId;
    }

    public float getSize() {
        return size;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
                "userId=" + userId +
                ", size=" + size +
                '}';
    }
}
