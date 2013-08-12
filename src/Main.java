import java.util.LinkedHashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        BookHandler bookHandler = new BookHandler();
        PriceCalculator priceCalculator = new PriceCalculator(bookHandler);
        System.out.println(bookHandler);
        System.out.println("Total Price: " + priceCalculator.getTotalPrice());
    }

}
