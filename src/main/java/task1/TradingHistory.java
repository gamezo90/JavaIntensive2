package task1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class TradingHistory {


    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setId(1);
        computer.setManufacturer("fsdf");
        computer.setModel("fsdaf");
        computer.setPrice(BigDecimal.valueOf(34));

        User user = new User(423, 43, "fsdf", "fsdf");

        Discount discount = new Discount(534, 5353f);

        Buying buying =new Buying(user, computer, discount);

        Selling selling = new Selling();
      //  addDeal(buying, selling).toArray();
        System.out.println(buying);
    }
    public static  ArrayList addDeal(Buying buying, Selling selling) {

        ArrayList<Object> deals = new ArrayList<>();
        deals.add(buying);
        deals.add(selling);
        return deals;
    }

}