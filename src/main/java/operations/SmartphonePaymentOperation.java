package operations;

import javafx.scene.control.TextField;
import scenes_init.AccountInfoScene;

import java.math.BigDecimal;

public class SmartphonePaymentOperation {
    private static AccountInfoScene accountInfoScene = new AccountInfoScene();
    private BigDecimal convertAmount;

    private TextField getAccountInfoTotalAmountField() {
        return accountInfoScene.getTotalAmount();
    }

    private BigDecimal convertToBigDecimal() {
        String mountValue = getAccountInfoTotalAmountField().getText();
        convertAmount = new BigDecimal(mountValue);

        return convertAmount;
    }

    public void Operations() {
        BigDecimal moneyValue = new BigDecimal(50);
        BigDecimal score = convertToBigDecimal().subtract(moneyValue);
        if (convertAmount.compareTo(moneyValue) == 0) {
            accountInfoScene.getTotalAmount().setText(score.toString());
        } else if (convertAmount.compareTo(moneyValue) > 0) {
            accountInfoScene.getTotalAmount().setText(score.toString());
        }

    }


}
