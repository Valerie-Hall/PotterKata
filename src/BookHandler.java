import java.util.LinkedHashMap;
import java.util.Map;

public class BookHandler {
    LinkedHashMap<String, Integer> bookNames = new LinkedHashMap<String, Integer>();

    public BookHandler() {
        initializeBooks();
    }

    private void initializeBooks() {
        bookNames.put("Book 1", 1);
        bookNames.put("Book 2", 2);
        bookNames.put("Book 3", 2);
        bookNames.put("Book 4", 2);
        bookNames.put("Book 5", 2);
        bookNames.put("Book 6", 1);
        bookNames.put("Book 7", 0);
    }

    public Integer getTotalNumberOfBooks() {
        Integer totalBooks = 0;
        for (Integer quantity : bookNames.values()) {
            totalBooks += quantity;
        }
        return totalBooks;
    }

    public double getTotalPrice() {
        double totalPrice = 8 * getTotalNumberOfBooks();
        return totalPrice;
    }

    public String toString() {
        String receipt = "";
        for (Map.Entry book : bookNames.entrySet()) {
            receipt += book.getKey() + " - " + book.getValue() + "\n";
        }
        return receipt;
    }


}
