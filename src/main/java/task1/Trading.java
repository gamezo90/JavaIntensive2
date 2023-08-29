package task1;

public abstract class Trading implements DiscountInterface {

    User user;

    Computer computer;

    Discount discount;

    @Override
    public float getDiscount() {
        return 0;
    }

    public User getUser() {
        return user;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void makeDeal(User user, Computer computer, Discount discount) {

    }

}
