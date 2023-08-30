package task1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class TradingHistory {
    public static void main(String[] args) {
        ArrayList<Computer> computers = Computer.createSomeComputers();
        ArrayList<User> users = User.createSomeUsers();
        ArrayList<Discount> discounts = Discount.createSomeDiscounts();
        Buying buying1 = new Buying(users.get(0), computers.get(0), discounts.get(0));

        System.out.println(buying1);
    }
    public static  ArrayList addDeal(Buying buying, Selling selling) {

        ArrayList<Object> deals = new ArrayList<>();
        deals.add(buying);
        deals.add(selling);
        return deals;
    }

}