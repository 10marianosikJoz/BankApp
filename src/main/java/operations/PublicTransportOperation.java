package operations;

import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import scenes_init.AccountInfoScene;
import scenes_init.PublicTransportTicketsScene;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PublicTransportOperation {
    private static AccountInfoScene accountInfoScene = new AccountInfoScene();
    private final BigDecimal firstTicket = new BigDecimal(2);
    private final BigDecimal secondTicket = new BigDecimal(3);
    private final BigDecimal thirdTicket = new BigDecimal(4);
    private PublicTransportTicketsScene publicTransportTicketsScene = new PublicTransportTicketsScene();
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

        return publicTransportTicketsScene.getToggleButtons();
    }

    public void Operations() {
        BigDecimal firstResult = convertToBigDecimal().subtract(firstTicket);
        BigDecimal secondResult = convertToBigDecimal().subtract(secondTicket);
        BigDecimal thirdResult = convertToBigDecimal().subtract(thirdTicket);

        if (toggleButton().get(0).isSelected()) {
            accountInfoScene.getTotalAmount().setText(firstResult.toString());

        } else if (toggleButton().get(1).isSelected()) {
            accountInfoScene.getTotalAmount().setText(secondResult.toString());
        } else if (toggleButton().get(2).isSelected()) {
            accountInfoScene.getTotalAmount().setText(thirdResult.toString());
        }

    }
}
