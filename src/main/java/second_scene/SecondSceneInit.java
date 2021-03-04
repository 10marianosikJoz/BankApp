package second_scene;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;


public class SecondSceneInit {

    private Group secondGroupLayout;
    private Scene duplicateScene;
    private Scene scene;
    private FlowPane panel = new FlowPane(Orientation.VERTICAL, 60, 30);
    private ButtonsIcons buttonsIcons = new ButtonsIcons();
    private ButtonsEffects buttonsEffects = new ButtonsEffects();
    private static ArrayList<Button> buttonsList = new ArrayList<>(9);



    private void set() {
        duplicateScene = scene;
    }

    public ArrayList<Button> getButtonsList() {
        return buttonsList;
    }

    private void addButtonsToList() {
        for (int i = 0; i < 9; i++) {
            buttonsList.add(new Button());
        }

    }

    private Pane getPanel() {
        addButtonsToList();
        for (Button button : buttonsList) {
            button.setPrefSize(150, 100);
            button.setStyle("-fx-base: #83c5eb");
            panel.getChildren().add(button);
            panel.setPadding(new Insets(110, 0, 0, 215));
        }
        setButtonsEffects();
        return panel;
    }

    private void setButtonsEffects() {
        for (int i = 0; i < buttonsList.size(); i++) {


            buttonsList.get(0).setGraphic(buttonsIcons.getImageViewMoney());
            buttonsList.get(0).setTooltip(buttonsEffects.getAccountInfoButton());

            buttonsList.get(1).setGraphic(buttonsIcons.getImageViewExchange());
            buttonsList.get(1).setTooltip(buttonsEffects.getTransferButton());

            buttonsList.get(2).setGraphic(buttonsIcons.getImageViewTransportTickets());
            buttonsList.get(2).setTooltip(buttonsEffects.getBuyTicketsButton());

            buttonsList.get(3).setGraphic(buttonsIcons.getImageViewTransfer());
            buttonsList.get(3).setTooltip(buttonsEffects.getExchangeButton());

            buttonsList.get(4).setGraphic(buttonsIcons.getImageViewSmartphonePay());
            buttonsList.get(4).setTooltip(buttonsEffects.getSmartphonepayment());

            buttonsList.get(5).setGraphic(buttonsIcons.getImageViewPhoneAccountMoney());
            buttonsList.get(5).setTooltip(buttonsEffects.getPhoneAccountMoney());

            buttonsList.get(6).setGraphic(buttonsIcons.getImageViewBlockedCard());
            buttonsList.get(6).setTooltip(buttonsEffects.getBlockedCardButton());

            buttonsList.get(7).setGraphic(buttonsIcons.getImageViewChangePinCard());
            buttonsList.get(7).setTooltip(buttonsEffects.getChangePinCardButton());

            buttonsList.get(8).setGraphic(buttonsIcons.getImageViewHighway());
            buttonsList.get(8).setTooltip(buttonsEffects.getHighwayPay());
        }

    }


    public Group getSecondGroupLayout() {
        return secondGroupLayout = new Group();
    }

    public void addToSecondLayout() {
        secondGroupLayout.getChildren().addAll(getPanel());
    }


    public Scene getScene2() {

        if (scene == null) {
            return scene = new Scene(secondGroupLayout, 1000, 600, Color.web("#380B61"));

        } else
            return scene;

    }

    public Scene getDuplicateScene() {
      set();
      return duplicateScene;
    }
}
