import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PotterKataTest {
    PotterKata potterKata;

    @Before
    public void setUp(){
       potterKata = new PotterKata();
    }

    @Test
    public void shouldReturnPurchasedBookNames(){
        assertThat(potterKata.getBookNames(), is("[Book 1, Book 2, Book 3, Book 4, Book 5, Book 6, Book 7]"));
    }

    @Test
    public void shouldReturnBookQuantities(){
        assertThat(potterKata.getQuantities().toString(), is("[1, 2, 2, 2, 2, 1, 0]"));
    }

    @Test
    public void shouldGetTotalNumberOfBooks(){
        assertThat(potterKata.getTotalNumberOfBooks(), is(10));
    }

}
