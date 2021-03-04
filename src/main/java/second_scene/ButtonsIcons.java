package second_scene;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonsIcons {
    private Image imageMoney = new Image("money_icon2.png", 150, 100, true, true);
    private ImageView imageViewMoney = new ImageView(imageMoney);
    private Image imageExchangeMoney = new Image("exchange_money.png", 150, 100, true, true);
    private ImageView imageViewExchange = new ImageView(imageExchangeMoney);
    private Image imageTransferMoney = new Image("transfer_money.jpg", 150, 100, true, true);
    private ImageView imageViewTransfer = new ImageView(imageTransferMoney);
    private Image imageTransportTickets = new Image("public_transport.png", 150, 100, true, true);
    private ImageView imageViewTransportTickets = new ImageView(imageTransportTickets);
    private Image imageSmartphonePay = new Image("smartphone-payment.png", 150, 100, true, true);
    private ImageView imageViewSmartphonePay = new ImageView(imageSmartphonePay);
    private Image phoneAccountMoney = new Image("phone_account.png", 150, 100, true, true);
    private ImageView imageViewPhoneAccountMoney = new ImageView(phoneAccountMoney);
    private Image imageBlockedCard = new Image("blocked_card.png", 150, 100, true, true);
    private ImageView imageViewBlockedCard = new ImageView(imageBlockedCard);
    private Image imageChangePinCard = new Image("change_pin.png", 150, 100, true, true);
    private ImageView imageViewChangePinCard = new ImageView(imageChangePinCard);
    private Image imageHigwayButton = new Image("streets_pay.png", 150, 100, true, true);
    private ImageView imageViewHighway = new ImageView(imageHigwayButton);

    public ImageView getImageViewMoney() {
        return imageViewMoney;
    }

    public ImageView getImageViewExchange() {
        return imageViewExchange;
    }

    public ImageView getImageViewTransfer() {
        return imageViewTransfer;
    }

    public ImageView getImageViewTransportTickets() {
        return imageViewTransportTickets;
    }

    public ImageView getImageViewSmartphonePay() {
        return imageViewSmartphonePay;
    }

    public ImageView getImageViewPhoneAccountMoney() {
        return imageViewPhoneAccountMoney;
    }

    public ImageView getImageViewBlockedCard() {
        return imageViewBlockedCard;
    }

    public ImageView getImageViewChangePinCard() {
        return imageViewChangePinCard;
    }

    public ImageView getImageViewHighway() {
        return imageViewHighway;
    }
}
