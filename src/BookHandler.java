import java.util.*;

public class BookHandler {
    LinkedHashMap<String, Integer> bookNames = new LinkedHashMap<String, Integer>();
    private boolean booksRemaining= true;

    public BookHandler() {
        initializeBooks();
    }

    private void initializeBooks() {
        bookNames.put("Book 1", 1);
        bookNames.put("Book 2", 2);
        bookNames.put("Book 3", 2);
        bookNames.put("Book 4", 1);
        bookNames.put("Book 5", 0);
        bookNames.put("Book 6", 0);
        bookNames.put("Book 7", 0);
    }

    public String toString() {
        String receipt = "";
        for (Map.Entry book : bookNames.entrySet()) {
            receipt += book.getKey() + " - " + book.getValue() + "\n";
        }
        return receipt;
    }

    public Integer getNumberOfDifferentBooks() {
        int numberOfBooks = 0;
        for (Map.Entry<String, Integer> book : bookNames.entrySet()) {
            if (book.getValue() > 0) {
                numberOfBooks++;
                bookNames.put(book.getKey(), book.getValue() - 1);
            }
        }
        if(numberOfBooks == 0 )
            booksRemaining = false;
        return numberOfBooks;
    }

    public List<Integer> getSetsOfDifferentBooks() {
        List<Integer> numberOfBooks = new ArrayList<Integer>();
        while (booksRemaining) {
            numberOfBooks.add(getNumberOfDifferentBooks());
        }
        return numberOfBooks;
    }



}
