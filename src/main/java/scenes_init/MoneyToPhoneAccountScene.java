package scenes_init;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import textfields_formatters.MoneyToPhoneFieldsFormatter;

import java.util.ArrayList;

public class MoneyToPhoneAccountScene {
    private static ArrayList<TextField> amountFields = new ArrayList<>(3);
    private static Button topYourAccount = new Button("TOP UP YOUR ACCOUNT");
    private Group group;
    private Scene scene;
    private Pane panel = new Pane();
    private Button backToMenu = new Button("BACK TO MENU");
    private MoneyToPhoneFieldsFormatter moneyToPhoneFieldsFormatter = new MoneyToPhoneFieldsFormatter();

    public ArrayList<TextField> getAmountFields() {
        return amountFields;
    }

    private void setTopYourAccountProparties() {
        topYourAccount.setPrefSize(150, 40);
        topYourAccount.setLayoutX(200);
        topYourAccount.setLayoutY(350);
        topYourAccount.setStyle("-fx-background-color: #CFB53B; ");
        topYourAccount.setTextFill(Color.WHITE);


    }


    public Button getTopYourAccount() {
        setTopYourAccountProparties();
        return topYourAccount;
    }

    private void addTextFieldsToList() {
        for (int i = 0; i < 3; i++) {
            amountFields.add(new TextField());
        }
    }

    private void setAmountFieldsProperties() {
        for (TextField amountField : amountFields) {
            amountField.setAlignment(Pos.CENTER);
        }
        textFieldNumberValidation();
        textFieldAmountValidation();
        buttonHandler();
        amountFields.get(0).setPrefSize(200, 40);
        amountFields.get(0).setPromptText("Enter amount");
        amountFields.get(0).setLayoutX(175);
        amountFields.get(0).setLayoutY(50);

        amountFields.get(1).setPrefSize(300, 40);
        amountFields.get(1).setPromptText("Enter phone number");
        amountFields.get(1).setLayoutY(125);
        amountFields.get(1).setLayoutX(125);
        amountFields.get(1).setTextFormatter(moneyToPhoneFieldsFormatter.getPhoneNumberFormatter());

        amountFields.get(2).setPrefSize(150, 40);
        amountFields.get(2).setPromptText("Enter SMS code");
        amountFields.get(2).setLayoutY(200);
        amountFields.get(2).setLayoutX(200);
        amountFields.get(2).setTextFormatter(moneyToPhoneFieldsFormatter.getCodeNumberFormatter());

    }

    private Pane getPanel() {

        addTextFieldsToList();
        setAmountFieldsProperties();
        for (TextField amountField : amountFields) {
            panel.getChildren().addAll(amountField);
        }
        return panel;
    }

    private String getFirstText() {
        String text;
        text = amountFields.get(0).getText();
        return text;
    }

    private String getSecondText() {
        String text;
        text = amountFields.get(1).getText();
        return text;
    }

    private String getThirdText() {
        String text;
        text = amountFields.get(2).getText();
        return text;
    }

    private void buttonHandler() {

        for (TextField amountField : amountFields) {
            amountField.textProperty().addListener((observableValue, s, t1) -> {

                if ((getFirstText().isEmpty() || getSecondText().isEmpty() || getThirdText().isEmpty())) {
                    topYourAccount.setDisable(true);
                } else {
                    topYourAccount.setDisable(false);

                }

            });
        }
    }

    private void textFieldAmountValidation() {
        amountFields.get(0).textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                amountFields.get(0).setText(s);
                topYourAccount.setDisable(true);
            } else {
                topYourAccount.setDisable(false);
            }
        });
    }

    private void textFieldNumberValidation() {
        amountFields.get(1).textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d*")) {
                amountFields.get(1).setText(s);
                topYourAccount.setDisable(true);
            } else {
                topYourAccount.setDisable(false);
            }
        });
    }

    private void setBackToMenuProparties() {
        backToMenu.setLayoutX(215);
        backToMenu.setLayoutY(420);
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
            return scene = new Scene(group, 550, 500, Color.web("#380B61"));
        } else
            return scene;

    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getPanel(), getTopYourAccount(), getBackToMenu());
    }


}
