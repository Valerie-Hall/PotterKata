import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PriceCalculator {
    BookHandler bookHandler;


    public PriceCalculator(BookHandler bookHandler) {
        this.bookHandler = bookHandler;
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (Integer number : bookHandler.getSetsOfDifferentBooks()) {
                totalPrice += 8 * number * getDiscount(number);

        }
        return totalPrice;
    }

    public double getDiscount(int number) {
        HashMap<Integer, Double> discountMap = new HashMap<Integer, Double>();
        discountMap.put(0, .0);
        discountMap.put(1, .0);
        discountMap.put(2, .05);
        discountMap.put(3, .10);
        discountMap.put(4, .15);
        discountMap.put(5, .25);
        discountMap.put(6, .30);
        discountMap.put(7, .35);


        return 1 - discountMap.get(number);
    }


}
