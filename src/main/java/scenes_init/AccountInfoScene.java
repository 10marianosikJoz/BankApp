package scenes_init;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import operations.*;

import java.util.ArrayList;


public class AccountInfoScene {


    private static TextField totalAmount = new TextField();
    private static TextField totalAmountInEuro = new TextField();
    private Pane panel = new Pane();
    private Group groupA;
    private Scene sceneA;
    private Button backToMenu = new Button("BACK TO MENU");
    private ArrayList<Label> labels = new ArrayList<>(5);
    private Separator firstSeparator = new Separator();
    private Separator secondSeparator = new Separator();
    private Separator thirdSeparator = new Separator();
    private Separator fourthSeparator = new Separator();
    private Separator fiftthSeparator = new Separator();
    private MoneyToPhoneAccountScene moneyToPhoneAccountScene = new MoneyToPhoneAccountScene();
    private MoneyToPhoneAccountOperation moneyToPhoneAccountOperation = new MoneyToPhoneAccountOperation();
    private TransferBankSceneOperation transferBankSceneOperation = new TransferBankSceneOperation();
    private TransfersBankScene transfersBankScene = new TransfersBankScene();
    private HighwayPaymentScene highwayPaymentScene = new HighwayPaymentScene();
    private HighwayPayementOperation highwayPayementOperation = new HighwayPayementOperation();
    private PublicTransportTicketsScene publicTransportTicketsScene = new PublicTransportTicketsScene();
    private PublicTransportOperation publicTransportOperation = new PublicTransportOperation();
    private ExchangeMoneyOperation exchangeMoneyOperation = new ExchangeMoneyOperation();
    private ExchangeMoneyScene exchangeMoneyScene = new ExchangeMoneyScene();

    public Group getGroup() {
        return groupA = new Group();
    }

    public Scene getScene() {


        if (sceneA == null) {
            return sceneA = new Scene(groupA, 450, 550, Color.web("#380B61"));
        } else
            return sceneA;


    }

    private void setTotalAmountProparties() {
        totalAmount.setPrefSize(130, 30);
        totalAmount.setLayoutX(260);
        totalAmount.setLayoutY(160);
        totalAmount.setText("3000.00");
        totalAmount.setEditable(true);
        totalAmount.setAlignment(Pos.CENTER);
        totalAmount.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        setTopYourAccountButtonTask();
        setSendTransferButtonTask();
        setPaymentButtonTask();
        setBuyTicketButtonTask();
        setExchangeButtonTask();
    }

    public TextField getTotalAmount() {
        setTotalAmountProparties();
        return totalAmount;
    }


    private void setTotalAmountInEuroProparties() {
        totalAmountInEuro.setPrefSize(130, 30);
        totalAmountInEuro.setLayoutX(260);
        totalAmountInEuro.setLayoutY(210);
        totalAmountInEuro.setText("3000.00");
        totalAmountInEuro.setEditable(true);
        totalAmountInEuro.setAlignment(Pos.CENTER);
        totalAmountInEuro.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
    }

    public TextField getTotalAmountInEuro() {
        setTotalAmountInEuroProparties();
        return totalAmountInEuro;
    }

    private void addLabelsToList() {
        for (int i = 0; i < 5; i++) {
            labels.add(new Label());
        }
    }

    private void setLabelsProparties() {
        for (int i = 0; i < 5; i++) {

            labels.get(0).setText("Client ID: 1997123");
            labels.get(0).setLayoutX(140);
            labels.get(0).setLayoutY(10);
            labels.get(0).setTextFill(Color.WHITE);
            labels.get(0).setFont(Font.font(20));


            labels.get(1).setText("Name: Marcin");
            labels.get(1).setLayoutX(160);
            labels.get(1).setLayoutY(60);
            labels.get(1).setTextFill(Color.WHITE);
            labels.get(1).setFont(Font.font(20));

            labels.get(2).setText("Surname: Jóźwiak");
            labels.get(2).setLayoutX(140);
            labels.get(2).setLayoutY(110);
            labels.get(2).setTextFill(Color.WHITE);
            labels.get(2).setFont(Font.font(20));

            labels.get(3).setText("Avaiable Balance $:");
            labels.get(3).setLayoutX(70);
            labels.get(3).setLayoutY(160);
            labels.get(3).setTextFill(Color.WHITE);
            labels.get(3).setFont(Font.font(20));

            labels.get(4).setText("Avaiable Balance €:");
            labels.get(4).setLayoutX(70);
            labels.get(4).setLayoutY(210);
            labels.get(4).setTextFill(Color.WHITE);
            labels.get(4).setFont(Font.font(20));
        }
    }

    private Pane getPanel() {
        addLabelsToList();
        for (int i = 0; i < 5; i++) {
            panel.getChildren().addAll(labels.get(i));
        }
        setLabelsProparties();
        return panel;
    }

    private void setFirstSeparator() {
        firstSeparator.setOrientation(Orientation.HORIZONTAL);
        firstSeparator.setPrefWidth(450);
        firstSeparator.setLayoutY(50);
        firstSeparator.setStyle("-fx-background-color:yellow; ");
    }

    private Separator getFirstSeparator() {
        setFirstSeparator();
        return firstSeparator;
    }

    private void setSecondtSeparator() {
        secondSeparator.setOrientation(Orientation.HORIZONTAL);
        secondSeparator.setPrefWidth(450);
        secondSeparator.setLayoutY(100);
        secondSeparator.setStyle("-fx-background-color:yellow; ");
    }

    private Separator getSecondSeparator() {
        setSecondtSeparator();
        return secondSeparator;
    }

    private void setThirdSeparator() {
        thirdSeparator.setOrientation(Orientation.HORIZONTAL);
        thirdSeparator.setPrefWidth(450);
        thirdSeparator.setLayoutY(150);
        thirdSeparator.setStyle("-fx-background-color:yellow; ");
    }

    private Separator getThirdSeparator() {
        setThirdSeparator();
        return thirdSeparator;
    }

    private void setFourthSeparator() {
        fourthSeparator.setOrientation(Orientation.HORIZONTAL);
        fourthSeparator.setPrefWidth(450);
        fourthSeparator.setLayoutY(200);
        fourthSeparator.setStyle("-fx-background-color:yellow; ");
    }

    private Separator getFourthSeparator() {
        setFourthSeparator();
        return fourthSeparator;
    }

    private void setFifthSeparator() {
        fiftthSeparator.setOrientation(Orientation.HORIZONTAL);
        fiftthSeparator.setPrefWidth(450);
        fiftthSeparator.setLayoutY(250);
        fiftthSeparator.setStyle("-fx-background-color:yellow; ");
    }

    private Separator getFiftthSeparator() {
        setFifthSeparator();
        return fiftthSeparator;
    }

    private void setButtonProparties() {
        backToMenu.setLayoutX(150);
        backToMenu.setLayoutY(350);
        backToMenu.setStyle("-fx-background-color: #7E807F; ");
        backToMenu.setPrefSize(150, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);


    }

    public Button getBackToMenuButton() {
        setButtonProparties();
        return backToMenu;
    }


    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getBackToMenuButton(), getPanel(), getFirstSeparator(), getSecondSeparator(), getThirdSeparator(), getFourthSeparator(), getFiftthSeparator(), getTotalAmount(), getTotalAmountInEuro());
    }

    private void setTopYourAccountButtonTask() {
        moneyToPhoneAccountScene.getTopYourAccount().setOnAction(e -> moneyToPhoneAccountOperation.Operations());
    }

    private void setSendTransferButtonTask() {
        transfersBankScene.getSendTransfer().setOnAction(e -> transferBankSceneOperation.Operations());
    }

    private void setPaymentButtonTask() {
        highwayPaymentScene.getPayment().setOnAction(e -> highwayPayementOperation.Operations());
    }

    private void setBuyTicketButtonTask() {
        publicTransportTicketsScene.getBuyTicketButton().setOnAction(e -> publicTransportOperation.Operations());
    }

    private void setExchangeButtonTask() {
        exchangeMoneyScene.getExchange().setOnAction(e -> exchangeMoneyOperation.exchangeButtonHandler());
    }

}
