import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookHandlerTest {

        BookHandler bookHandler;

        @Before
        public void setUp() {
            bookHandler = new BookHandler();
        }

        @Test
        public void shouldReturnPurchasedBookNames() {
            assertThat(bookHandler.bookNames.keySet().toString(), is("[Book 1, Book 2, Book 3, Book 4, Book 5, Book 6, Book 7]"));
        }

        @Test
        public void shouldReturnBookQuantities() {
            assertThat(bookHandler.bookNames.values().toString(), is("[1, 2, 2, 2, 2, 1, 0]"));
        }

        @Test
        public void shouldGetTotalNumberOfBooks() {
            assertThat(bookHandler.getTotalNumberOfBooks(), is(10));
        }

        @Test
        public void shouldGetTotalPriceOfBooks() {
            assertThat(bookHandler.getTotalPrice(), is(80.));
        }

        @Test
        public void shouldGetTotalNumberOfDifferentBooks(){

        }


    }

