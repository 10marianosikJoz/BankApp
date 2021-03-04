package operations;

import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import scenes_init.AccountInfoScene;
import scenes_init.HighwayPaymentScene;

import java.math.BigDecimal;
import java.util.ArrayList;


public class HighwayPayementOperation {
    private static AccountInfoScene accountInfoScene = new AccountInfoScene();
    private HighwayPaymentScene highwayPaymentScene = new HighwayPaymentScene();
    private BigDecimal firstTicket = new BigDecimal(45);
    private BigDecimal secondTicket = new BigDecimal(50);
    private BigDecimal thirdTicket = new BigDecimal(60);
    private BigDecimal fourthTicket = new BigDecimal(50);
    private BigDecimal fifthTicket = new BigDecimal(70);
    private BigDecimal convertAmount;

    private TextField getAccountInfoTotalAmountField() {
        return accountInfoScene.getTotalAmount();
    }

    private BigDecimal convertToBigDecimal() {
        String amountValue = getAccountInfoTotalAmountField().getText();
        convertAmount = new BigDecimal(amountValue);

        return convertAmount;
    }

    private ArrayList<ToggleButton> toggleButton() {

        return highwayPaymentScene.getToggleButtons();
    }


    public void Operations() {
        BigDecimal firstResult = convertToBigDecimal().subtract(firstTicket);
        BigDecimal secondResult = convertToBigDecimal().subtract(secondTicket);
        BigDecimal thirdResult = convertToBigDecimal().subtract(thirdTicket);
        BigDecimal fourthResult = convertToBigDecimal().subtract(fourthTicket);
        BigDecimal fifthResult = convertToBigDecimal().subtract(fifthTicket);

        if (toggleButton().get(0).isSelected()) {
            accountInfoScene.getTotalAmount().setText(firstResult.toString());

        } else if (toggleButton().get(1).isSelected()) {
            accountInfoScene.getTotalAmount().setText(secondResult.toString());
        } else if (toggleButton().get(2).isSelected()) {
            accountInfoScene.getTotalAmount().setText(thirdResult.toString());
        } else if (toggleButton().get(3).isSelected()) {
            accountInfoScene.getTotalAmount().setText(fourthResult.toString());
        } else if (toggleButton().get(4).isSelected()) {
            accountInfoScene.getTotalAmount().setText(fifthResult.toString());
        }

    }
}
