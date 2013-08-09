import java.util.Collection;
import java.util.LinkedHashMap;

public class PotterKata {


    private LinkedHashMap<String, Integer> bookNames = new LinkedHashMap<String, Integer>();

    public static void main(String[] args) {
        PotterKata potterKata = new PotterKata();
        System.out.println(potterKata.getBookNames());
        System.out.println(potterKata.getQuantities());
    }

    public PotterKata(){
        initializeBookNames();
        initializeQuantities();
    }

    public String getBookNames() {
        return bookNames.keySet().toString();
    }

    public Collection<Integer> getQuantities(){
        return bookNames.values();
    }

    private void initializeBookNames(){
        for(int i=0; i<7; i++){
           bookNames.put("Book " + (i + 1), 0);
        }
    }

    private void initializeQuantities(){
       bookNames.put("Book 1", 1);
       bookNames.put("Book 2", 2);
       bookNames.put("Book 3", 2);
       bookNames.put("Book 4", 2);
       bookNames.put("Book 5", 2);
       bookNames.put("Book 6", 1);
       bookNames.put("Book 7", 0);
    }

    public Integer getTotalNumberOfBooks() {
        Integer totalBooks=0;
        for(Integer quantity: getQuantities()){
            totalBooks += quantity;
        }
        return totalBooks;
    }


}
