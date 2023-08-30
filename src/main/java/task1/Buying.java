package task1;

public class Buying extends Trading {

    public Buying(User user, Computer computer, Discount discount) {
        this.user = user;
        this.computer = computer;
        this.discount =discount;
    }

    public Discount  calculeteDiscount (Discount discount) {
        if (discount.getSize() == 0) {
            discount.setSize(5f);
        }
        else if (discount.getSize() == 5f) {
            discount.setSize(10f);
        }
        else if (discount.getSize() == 15f) {
            discount.setSize(15f);
        }
        return discount;
    }

    @Override
    public void makeDeal(User user, Computer computer, Discount discount) {
        super.makeDeal(user, computer, discount);
    }

    @Override
    public String toString() {
        return user.toString() + computer.toString() + discount.toString();
    }
}
