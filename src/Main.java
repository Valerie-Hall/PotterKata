
public class Main {

    public static void main(String[] args) {
        BookHandler bookHandler = new BookHandler();
        PriceCalculator priceCalculator = new PriceCalculator(bookHandler);
        System.out.println(bookHandler);
        System.out.println(bookHandler.getSetsOfDifferentBooks());
        System.out.println("Total Price: " + priceCalculator.getTotalPrice());
    }
}
