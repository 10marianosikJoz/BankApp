package operations;

import javafx.scene.control.TextField;
import scenes_init.AccountInfoScene;
import scenes_init.MoneyToPhoneAccountScene;

import java.math.BigDecimal;

public class MoneyToPhoneAccountOperation {
    private static AccountInfoScene accountInfoScene = new AccountInfoScene();
    private static MoneyToPhoneAccountScene moneyToPhoneAccountScene = new MoneyToPhoneAccountScene();
    private BigDecimal convertAmount;

    private TextField getAccountInfoTotalAmountField() {
        return accountInfoScene.getTotalAmount();
    }

    private String getTextFromField() {
        return moneyToPhoneAccountScene.getAmountFields().get(0).getText();
    }

    private BigDecimal convertToBigDecimal() {
        String mountValue = getAccountInfoTotalAmountField().getText();
        convertAmount = new BigDecimal(mountValue);

        return convertAmount;
    }

    public void Operations() {
        BigDecimal convert = new BigDecimal(getTextFromField());
        BigDecimal score = convertToBigDecimal().subtract(convert);

        if (convertAmount.compareTo(convert) == 0) {
            accountInfoScene.getTotalAmount().setText(score.toString());
        } else if (convertAmount.compareTo(convert) > 0) {
            accountInfoScene.getTotalAmount().setText(score.toString());
        }

    }
}