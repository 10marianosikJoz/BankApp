package operations;

import currencies.Currencies;
import scenes_init.AccountInfoScene;
import scenes_init.ExchangeMoneyScene;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeMoneyOperation {
    private static AccountInfoScene accountInfoScene = new AccountInfoScene();
    private BigDecimal convert;
    private BigDecimal convertEuro;
    private BigDecimal convertAmount;
    private ExchangeMoneyScene exchangeMoneyScene = new ExchangeMoneyScene();
    private Currencies currencies = new Currencies();

    private String getAccountInfoTotalAmountField() {
        return accountInfoScene.getTotalAmount().getText();
    }

    private String getAccountInfoTotalAmountInEuroField() {
        return accountInfoScene.getTotalAmountInEuro().getText();
    }

    private BigDecimal convertAccountInfTotalAmount() {
        convert = new BigDecimal(getAccountInfoTotalAmountField());
        return convert;
    }

    private BigDecimal convertAccountInfTotalAmountInEuro() {
        convertEuro = new BigDecimal(getAccountInfoTotalAmountInEuroField());
        return convertEuro;
    }

    private String getTextFromEuroField() {
        return exchangeMoneyScene.getTextFields().get(0).getText();
    }

    private String getTextFromDollarField() {
        return exchangeMoneyScene.getTextFields().get(1).getText();
    }

    private BigDecimal convertEuroToBigDecimal() {
        String mountValue = getTextFromEuroField();
        convertAmount = new BigDecimal(mountValue);

        return convertAmount;
    }

    private BigDecimal convertDollarToBigDecimal() {
        String mountValue = getTextFromDollarField();
        convertAmount = new BigDecimal(mountValue);

        return convertAmount;
    }


    public void exchangeButtonHandler() {
        BigDecimal score = convertAccountInfTotalAmountInEuro().subtract(convertEuroToBigDecimal());
        BigDecimal score2 = convertAccountInfTotalAmount().add((convertDollarToBigDecimal()));


        if (convert.compareTo(convertAmount) == 0) {
            accountInfoScene.getTotalAmountInEuro().setText(score.toString());
            accountInfoScene.getTotalAmount().setText(score2.toString());
        } else if (convert.compareTo(convertAmount) > 0) {
            accountInfoScene.getTotalAmountInEuro().setText(score.toString());
            accountInfoScene.getTotalAmount().setText(score2.toString());
        }


    }


    public void Operations() {
        BigDecimal result = convertEuroToBigDecimal().multiply(currencies.getEURO().setScale(1, RoundingMode.HALF_DOWN));
        exchangeMoneyScene.getTextFields().get(1).setText(result.toString());

    }


}
