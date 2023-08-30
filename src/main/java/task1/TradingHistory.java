package task1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class TradingHistory {
    public static void main(String[] args) {
        Computer.createSomeComputers();
        User.createSomeUsers();


    }
    public static  ArrayList addDeal(Buying buying, Selling selling) {

        ArrayList<Object> deals = new ArrayList<>();
        deals.add(buying);
        deals.add(selling);
        return deals;
    }

}