package currencies;

import java.math.BigDecimal;


public class Currencies {
    private BigDecimal EURO = new BigDecimal(0.9);
    private BigDecimal USD = new BigDecimal(1.11);

    public BigDecimal getEURO() {
        return EURO;
    }

    public BigDecimal getUSD() {
        return USD;
    }

    public BigDecimal exchangeEuroToDolar(BigDecimal value,BigDecimal currentValue){
        return value.multiply(currentValue);
    }

    public BigDecimal exchangeDolarToEuro(BigDecimal value,BigDecimal currentValue){
        return value.multiply(currentValue);
    }
    public BigDecimal subtractEuroMoneyFromAccount(BigDecimal value,BigDecimal currentValue){
            return value.subtract(currentValue);
    }

    public BigDecimal subtractDolarMoneyFromAccount(BigDecimal value,BigDecimal currentValue){
        return value.subtract(currentValue);
    }
}


