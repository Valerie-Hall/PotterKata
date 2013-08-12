import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 8/12/13
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 */
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
