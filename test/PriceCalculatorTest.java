import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriceCalculatorTest {
    BookHandler bookHandler = new BookHandler();
    PriceCalculator priceCalculator = new PriceCalculator(bookHandler);


    @Test
    public void shouldGetDiscount(){
        assertThat(priceCalculator.getDiscount(6), is(.70));
    }

    @Test
    public void shouldGetTotalPriceOfBooks() {
        assertThat(priceCalculator.getTotalPrice(), is(60.8));
    }


}
