package Models.Book;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Price {
    BigDecimal value;

    Price(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return NumberFormat.getCurrencyInstance().format(value);
    }
}
