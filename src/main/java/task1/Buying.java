package task1;

public class Buying extends Trading{

    public Buying(User user, Computer computer, Discount discount) {
        this.user = user;
        this.computer = computer;
        this.discount =discount;
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
