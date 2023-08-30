package task1;

import java.util.ArrayList;

public class TradingHistory {
    public static void main(String[] args) {
        ArrayList<Computer> computers = Computer.createSomeComputers();
        ArrayList<User> users = User.createSomeUsers();
        ArrayList<Trading> usersWithBying = new ArrayList<>();
        float discount =0f;
        int userId = 1;

        Trading trading1 = new Buying(users.get(userId),computers.get(0), new Discount(userId, discount));
        usersWithBying.add(trading1);

        userId = 1;
        if (usersWithBying.contains(usersWithBying.g)) {
            discount =5f;
        }
        else {
            discount = 0;
        }
        Trading trading2 = new Buying(users.get(userId),computers.get(0), new Discount(userId, discount));
        System.out.println(trading2);




        ArrayList<Computer> computers = Computer.createSomeComputers();
        ArrayList<User> users = User.createSomeUsers();
        //  ArrayList<Discount> discounts = Discount.createSomeDiscounts();
        Discount discount = new Discount(0, 0f);

        HashMap<User,Discount> hashMap = new HashMap<>();


        //   discount.setUserId(1);
        Discount discount1 = new Discount(1, 0);
        discount1.setUserId(1);
        Buying buying1 = new Buying(users.get(1), computers.get(0), discount1);
        buying1.calculeteDiscount(discount);
        hashMap.put(buying1.user, buying1.discount);

        //   discount.setUserId(2);
        Discount discount2 = new Discount(1, 0);
        discount1.setUserId(1);
        Buying buying2 = new Buying(users.get(1), computers.get(1), discount2);
        buying2.calculeteDiscount(discount);
        hashMap.put(buying2.user, buying2.discount);

        //    Buying buying2 = new Buying(users.get(2), computers.get(1), discounts.get(1));
        //    discounts.add(buying2.user.getId(), buying2.calculeteDiscount(discounts.get(1)));
        //    hashMap.put(buying2.user, buying2.discount);

        //    Buying buying2 = new Buying(users.get(0), computers.get(1), buying1.calculeteDiscount(buying1.discount));
        //  buying1.calculeteDiscount(buying1.discount);



        System.out.println(hashMap);
    }
    public static  ArrayList addDeal(Buying buying, Selling selling) {

        ArrayList<Object> deals = new ArrayList<>();
        deals.add(buying);
        deals.add(selling);
        return deals;
    }
    }
}