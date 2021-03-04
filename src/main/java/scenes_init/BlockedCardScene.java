package scenes_init;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import textfields_formatters.BlockedCardFieldsFormatter;

import java.util.ArrayList;

public class BlockedCardScene {
    private Group group;
    private Scene scene;
    private ArrayList<TextField> textFields = new ArrayList<>(3);
    private Pane panel = new Pane();
    private Button cardLock = new Button("CARD LOCK");
    private BlockedCardFieldsFormatter blockedCardFieldsFormatter = new BlockedCardFieldsFormatter();
    private Button backToMenu = new Button("BACK TO MENU");


    private void setCardLockProparties() {
        cardLock.setLayoutX(190);
        cardLock.setLayoutY(300);
        cardLock.setPrefSize(120, 30);
        cardLock.setStyle("-fx-background-color: #CFB53B; ");
        cardLock.setTextFill(Color.WHITE);
        cardLock.setDisable(true);
        cardLock.setOnAction(e -> clearTextFields());


    }

    private Button getCardLock() {
        setCardLockProparties();
        return cardLock;
    }

    private void clearTextFields() {
        for (TextField textField : textFields) {
            textField.clear();
        }

    }

    private void addTextFieldsToList() {
        for (int i = 0; i < 3; i++) {
            textFields.add(new TextField());
        }
    }

    private void setTextFieldsPreferedSizes() {
        textFields.get(0).setPrefSize(200, 40);
        textFields.get(1).setPrefSize(200, 40);
        textFields.get(2).setPrefSize(180, 40);
    }

    private void setPromptTextsToFields() {
        for (TextField textField : textFields) {
            textField.setAlignment(Pos.CENTER);
        }
        textFieldNumberValidation();
        textFieldNumbeIdValidation();
        textFields.get(0).setPromptText("Enter the card number");
        textFields.get(1).setPromptText("Enter the person ID");
        textFields.get(2).setPromptText("Enter the card CVC number");
    }

    private void setTextFieldsProparties() {
        textFields.get(0).setLayoutX(150);
        textFields.get(0).setLayoutY(60);
        textFields.get(0).setTextFormatter(blockedCardFieldsFormatter.getBlockedCardNumberFormatter());


        textFields.get(1).setLayoutX(150);
        textFields.get(1).setLayoutY(130);
        textFields.get(1).setTextFormatter(blockedCardFieldsFormatter.getBlockedCardIdNumberFormatter());

        textFields.get(2).setLayoutX(160);
        textFields.get(2).setLayoutY(200);
        textFields.get(2).setTextFormatter(blockedCardFieldsFormatter.getBlockedCardCvcNumberFormatter());


    }

    private Pane getPanel() {
        addTextFieldsToList();
        for (TextField textField : textFields) {
            panel.getChildren().addAll(textField);
        }

        setPromptTextsToFields();
        setTextFieldsProparties();
        setTextFieldsPreferedSizes();
        buttonHandler();
        return panel;
    }

    private void buttonHandler() {
        for (TextField textField : textFields) {

            textField.textProperty().addListener((observableValue, s, t1) -> {

                if (!Validation()) {
                    cardLock.setDisable(true);
                } else {
                    cardLock.setDisable(false);

                }

            });
        }
    }

    private boolean Validation() {

        if (textFields.get(0).getText().isEmpty()) {
            return false;
        } else if (textFields.get(1).getText().isEmpty()) {
            return false;
        } else if (textFields.get(2).getText().isEmpty()) {
            return false;
        } else if (textFields.get(0).getText().matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}-\\d{4}$")) {
            return true;
        }

        return true;
    }

    private void textFieldNumberValidation() {

        textFields.get(0).textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d*")) {
                textFields.get(0).setText(s);
                cardLock.setDisable(true);
            } else {
                cardLock.setDisable(false);
            }
        });
    }

    private void textFieldNumbeIdValidation() {

        textFields.get(1).textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d*")) {
                textFields.get(1).setText(s);
                cardLock.setDisable(true);
            } else {
                cardLock.setDisable(false);
            }
        });
    }

    private void setBackToMenuProparties() {
        backToMenu.setLayoutX(190);
        backToMenu.setLayoutY(360);
        backToMenu.setStyle("-fx-background-color: #7E807F; ");
        backToMenu.setPrefSize(120, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);
    }

    public Button getBackToMenu() {
        setBackToMenuProparties();
        return backToMenu;
    }

    public Group getGroup() {
        return group = new Group();
    }

    public Scene getScene() {
        if (scene == null) {
            return scene = new Scene(group, 500, 500, Color.web("#380B61"));
        } else
            return scene;

    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getPanel(), getCardLock(), getBackToMenu());
    }
}
