package homework4;

import java.math.BigDecimal;

public enum TarifWash {
   SMALL_PRICE(BigDecimal.valueOf(2000)),
    BIG_PRICE(BigDecimal.valueOf(4000));
    private BigDecimal price;


    TarifWash(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
