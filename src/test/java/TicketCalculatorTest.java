import org.example.TicketCalculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TicketCalculatorTest {

    @Test
    public void childPriceAndTotals() {
        Assert.assertEquals(10, TicketCalculator.priceByAge(0));
        assertEquals(10, TicketCalculator.priceByAge(12));
        assertEquals(10 * 1, TicketCalculator.totalPrice(12, 1));
        assertEquals(10 * 5, TicketCalculator.totalPrice(0, 5));
    }

    @Test
    public void adultPriceAndTotals() {
        assertEquals(30, TicketCalculator.priceByAge(13));
        assertEquals(30, TicketCalculator.priceByAge(59));
        assertEquals(30 * 2, TicketCalculator.totalPrice(13, 2));
        assertEquals(30 * 5, TicketCalculator.totalPrice(59, 5));
    }

    @Test
    public void seniorPriceAndTotals() {
        assertEquals(15, TicketCalculator.priceByAge(60));
        assertEquals(15 * 3, TicketCalculator.totalPrice(60, 3));
    }

    @Test
    public void errorWhenQuantityExceedsLimit() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> TicketCalculator.totalPrice(25, 6)
        );
        assertEquals("Quantidade excede o limite (máximo 5)", ex.getMessage());
    }

    @Test
    public void errorWhenQuantityNotPositive() {
        IllegalArgumentException ex1 = assertThrows(
                IllegalArgumentException.class,
                () -> TicketCalculator.totalPrice(25, 0)
        );
        assertEquals("Quantidade deve ser maior que zero", ex1.getMessage());

        IllegalArgumentException ex2 = assertThrows(
                IllegalArgumentException.class,
                () -> TicketCalculator.totalPrice(25, -1)
        );
        assertEquals("Quantidade deve ser maior que zero", ex2.getMessage());
    }

    @Test
    public void errorWhenAgeInvalid() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> TicketCalculator.priceByAge(-1)
        );
        assertEquals("Idade inválida", ex.getMessage());
    }
}
