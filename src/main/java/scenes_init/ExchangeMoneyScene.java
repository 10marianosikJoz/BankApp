package scenes_init;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import operations.ExchangeMoneyOperation;

import java.util.ArrayList;

public class ExchangeMoneyScene {
    private static ArrayList<TextField> textFields = new ArrayList<>(2);
    private static Button exchange = new Button("EXCHANGE");
    private static ExchangeMoneyOperation exchangeMoneyOperation = new ExchangeMoneyOperation();
    private Group groupA;
    private Scene sceneA;
    private Pane panel = new Pane();
    private Button backToMenu = new Button("BACK TO MENU");
    private Button recalculate = new Button("RECALCULATE");

    private void setRecalculateProperties() {

        recalculate.setLayoutX(215);
        recalculate.setLayoutY(220);
        recalculate.setStyle("-fx-background-color: #CFB53B; ");
        recalculate.setPrefSize(120, 35);
        recalculate.setTextFill(Color.WHITE);
        recalculate.setDisable(false);
        recalculate.setOnAction(e -> exchangeMoneyOperation.Operations());
    }

    private Button getRecalculate() {
        setRecalculateProperties();
        return recalculate;
    }


    private void addTextFieldsToList() {
        for (int i = 0; i < 2; i++) {
            textFields.add(new TextField());
        }
    }

    private void setAmountFieldsProparties() {
        for (TextField textField : textFields) {
            textField.setAlignment(Pos.CENTER);
        }
        textFieldEuroValidation();
        textFieldDollarValidation();
        buttonHandler();
        textFields.get(0).setPrefSize(220, 40);
        textFields.get(0).setPromptText("Enter the amount in €");
        textFields.get(0).setLayoutX(160);
        textFields.get(0).setLayoutY(50);

        textFields.get(1).setPrefSize(220, 40);
        textFields.get(1).setPromptText("Enter the amount in $");
        textFields.get(1).setLayoutY(110);
        textFields.get(1).setLayoutX(160);

    }


    private Pane getPanel() {

        addTextFieldsToList();
        setAmountFieldsProparties();
        for (TextField textField : textFields) {
            panel.getChildren().addAll(textField);
        }
        return panel;
    }

    private void setExchangeButtonProparties() {

        exchange.setLayoutX(215);
        exchange.setLayoutY(285);
        exchange.setStyle("-fx-background-color: #CFB53B; ");
        exchange.setPrefSize(120, 35);
        exchange.setTextFill(Color.WHITE);


    }

    public Button getExchange() {
        setExchangeButtonProparties();
        return exchange;
    }

    private void setBackToMenuProparties() {
        backToMenu.setLayoutX(215);
        backToMenu.setLayoutY(330);
        backToMenu.setStyle("-fx-background-color: #7E807F; ");
        backToMenu.setPrefSize(120, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);
    }

    public Button getBackToMenu() {
        setBackToMenuProparties();
        return backToMenu;
    }

    private void buttonHandler() {

        for (TextField textField : textFields) {
            textField.textProperty().addListener((observableValue, s, t1) -> {

                if ((textFields.get(0).getText().isEmpty() || textFields.get(1).getText().isEmpty())) {
                    exchange.setDisable(true);

                } else if ((textFields.get(0).getText().isEmpty())) {
                    exchange.setDisable(true);
                    recalculate.setDisable(true);

                } else {
                    textFields.get(1).setEditable(false);
                    exchange.setDisable(false);
                    recalculate.setDisable(false);
                }

            });
        }
    }

    public void textFieldEuroValidation() {
        textFields.get(0).textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d{0,7}([.]\\d{0,2})?")) {
                textFields.get(0).setText(s);
                exchange.setDisable(true);

            } else {
                exchange.setDisable(false);

            }
        });
    }

    private void textFieldDollarValidation() {
        textFields.get(1).textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d{0,7}([.]\\d{0,2})?")) {
                textFields.get(1).setText(s);
                exchange.setDisable(true);

            } else {
                exchange.setDisable(false);

            }
        });
    }

    public ArrayList<TextField> getTextFields() {
        return textFields;
    }

    public Group getGroup() {
        return groupA = new Group();
    }

    public Scene getScene() {
        if (sceneA == null) {
            return sceneA = new Scene(groupA, 550, 550, Color.web("#380B61"));
        } else
            return sceneA;

    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getPanel(), getBackToMenu(), getExchange(), getRecalculate());
    }

}
