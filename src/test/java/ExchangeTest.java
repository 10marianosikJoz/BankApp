import currencies.Currencies;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.Assertions.assertThat;

public class ExchangeTest {
    @Test
    public void exchange_should_return_exchange_value_when_multiply_euro_to_dolar_value(){

        //given
        Currencies currencies = new Currencies();
        //when
        BigDecimal result  = currencies.exchangeEuroToDolar(new BigDecimal(20),new BigDecimal(1.1).setScale(2,RoundingMode.DOWN));
        //then
        assertThat(result).isEqualByComparingTo(new BigDecimal(22));
    }


    @Test
    public void exchange_should_return_exchange_value_when_multiply_dolar_to_euro_value(){

        //given
        Currencies currencies = new Currencies();
        //when
        BigDecimal result  = currencies.exchangeDolarToEuro(new BigDecimal(20),new BigDecimal(0.9).setScale(2,RoundingMode.DOWN));
        //then
        assertThat(result).isEqualByComparingTo(new BigDecimal(18));
    }

    @Test
    public void subtract_should_return_subtract_value_when_we_subtract_the_amount_from_euro_account(){

        //given
        Currencies currencies = new Currencies();
        //when
        BigDecimal result  = currencies.subtractEuroMoneyFromAccount(new BigDecimal(3000),new BigDecimal(201).setScale(2,RoundingMode.DOWN));
        //then
        assertThat(result).isEqualByComparingTo(new BigDecimal(2799));
    }

    @Test
    public void exchange_should_return_exchange_value_when_we_subtract_the_amount_from_dolar_account(){

        //given
        Currencies currencies = new Currencies();
        //when
        BigDecimal result  = currencies.subtractDolarMoneyFromAccount(new BigDecimal(3000),new BigDecimal(500).setScale(2,RoundingMode.DOWN));
        //then
        assertThat(result).isEqualByComparingTo(new BigDecimal(2500));
    }
}


