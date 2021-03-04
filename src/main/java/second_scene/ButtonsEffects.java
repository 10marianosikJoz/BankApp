package second_scene;

import javafx.scene.control.Tooltip;

public class ButtonsEffects {
    private Tooltip accountInfoButton = new Tooltip();
    private Tooltip transferButton = new Tooltip();
    private Tooltip exchangeButton = new Tooltip();
    private Tooltip buyTicketsButton = new Tooltip();
    private Tooltip smartphonepaymentButton = new Tooltip();
    private Tooltip phoneAccountMoneyButton = new Tooltip();
    private Tooltip blockedCardButton = new Tooltip();
    private Tooltip changePinCardButton = new Tooltip();
    private Tooltip highwayPay = new Tooltip();

    private void setHighwayPayEffects() {
        highwayPay.setText("Highway Payment");
        highwayPay.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getHighwayPay() {
        setHighwayPayEffects();
        return highwayPay;
    }

    private void setChangePinCardButtonEffects() {
        changePinCardButton.setText("Changing PIN Card");
        changePinCardButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getChangePinCardButton() {
        setChangePinCardButtonEffects();
        return changePinCardButton;
    }

    private void setBlockedCardButtonEffects() {
        blockedCardButton.setText("Blocking Card");
        blockedCardButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getBlockedCardButton() {
        setBlockedCardButtonEffects();
        return blockedCardButton;
    }

    private void setPhoneAccountMoneyEffects() {
        phoneAccountMoneyButton.setText("Money To Phone Account");
        phoneAccountMoneyButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getPhoneAccountMoney() {
        setPhoneAccountMoneyEffects();
        return phoneAccountMoneyButton;
    }

    public Tooltip getAccountInfoButton() {
        setAccountInfoButtonEffects();
        return accountInfoButton;
    }

    private void setAccountInfoButtonEffects() {
        accountInfoButton.setText("Account Information");
        accountInfoButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getExchangeButton() {
        setExchangeButtonEffects();
        return exchangeButton;
    }

    private void setExchangeButtonEffects() {
        exchangeButton.setText("Exchange Money");
        exchangeButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getTransferButton() {
        setTransferButtonEffects();
        return transferButton;
    }

    private void setTransferButtonEffects() {
        transferButton.setText("Bank Transfer");
        transferButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getBuyTicketsButton() {
        setBuyTicketsButtonEffects();
        return buyTicketsButton;
    }


    private void setBuyTicketsButtonEffects() {
        buyTicketsButton.setText("Public Transport Tickets");
        buyTicketsButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    private void setSmatphonePaymentButtonEffects() {
        smartphonepaymentButton.setText("Smartphone Payment");
        smartphonepaymentButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getSmartphonepayment() {
        setSmatphonePaymentButtonEffects();
        return smartphonepaymentButton;
    }


}
