package scenes_init;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import textfields_formatters.TransferBankFieldsFormatter;

import java.util.ArrayList;


public class TransfersBankScene {
    private static ArrayList<TextField> textFields = new ArrayList<>(5);
    private static Button sendTransfer = new Button("SEND");
    private Group group;
    private Scene scene;
    private TextArea transferSubject = new TextArea();
    private Button backToMenu = new Button("BACK TO MENU");
    private Pane panel = new Pane();
    private TransferBankFieldsFormatter transferBankFieldsFormatters = new TransferBankFieldsFormatter();


    private void addTextFieldsToList() {
        for (int i = 0; i < 5; i++) {
            textFields.add(new TextField());
        }
    }

    private void setTextFieldsPreferredSizes() {
        for (TextField textField : textFields) {
            textField.setPrefSize(200, 40);
        }
    }

    private void setPromptTextsToFields() {
        for (TextField textField : textFields) {
            textField.setAlignment(Pos.CENTER);
        }
        textFields.get(0).setPromptText("Enter the recipient's name");
        textFields.get(1).setPromptText("Enter the recipient's surnname");
        textFields.get(2).setPromptText("Enter the recipient' address");
        textFields.get(3).setPromptText("Enter the amount");
        textFields.get(4).setPromptText("Enter account number");
    }

    private void setTextFieldsProperties() {
        textFields.get(0).setLayoutX(175);
        textFields.get(0).setLayoutY(60);
        textFields.get(0).setTextFormatter(transferBankFieldsFormatters.getNameFormatter());

        textFields.get(1).setLayoutX(175);
        textFields.get(1).setLayoutY(130);
        textFields.get(1).setTextFormatter(transferBankFieldsFormatters.getSurnameFormatter());

        textFields.get(2).setLayoutX(175);
        textFields.get(2).setLayoutY(200);
        textFields.get(2).setTextFormatter(transferBankFieldsFormatters.getAddressFormatter());

        textFields.get(3).setLayoutX(175);
        textFields.get(3).setLayoutY(270);


        textFields.get(4).setLayoutX(175);
        textFields.get(4).setLayoutY(340);
        textFields.get(4).setTextFormatter(transferBankFieldsFormatters.getAccountNumberFormatter());


    }

    private Pane getPanel() {
        addTextFieldsToList();
        for (TextField textField : textFields) {
            panel.getChildren().addAll(textField);
        }
        numberFieldValidation();
        amountFieldValidation();
        buttonHandler();
        setPromptTextsToFields();
        setTextFieldsProperties();
        setTextFieldsPreferredSizes();
        return panel;
    }

    private void setTransferSubjectProperties() {
        transferSubject.setLayoutX(125);
        transferSubject.setLayoutY(400);
        transferSubject.setPrefSize(300, 100);
        transferSubject.setPromptText("Transfer subject / Not required");
        transferSubject.setWrapText(true);

    }

    private TextArea getTransferSubject() {
        setTransferSubjectProperties();
        return transferSubject;
    }

    private void setSendTransferProperties() {
        sendTransfer.setLayoutX(240);
        sendTransfer.setLayoutY(520);
        sendTransfer.setPrefSize(70, 30);
        sendTransfer.setStyle("-fx-background-color: #CFB53B; ");
        sendTransfer.setTextFill(Color.WHITE);
        sendTransfer.setDisable(true);

    }

    public void clearTextFields() {
        for (TextField textField : textFields) {
            textField.clear();
        }
    }

    public ArrayList<TextField> getTextFields() {
        return textFields;
    }

    public Button getSendTransfer() {
        setSendTransferProperties();
        return sendTransfer;
    }

    private void buttonHandler() {
        for (TextField textField : textFields) {
            textField.textProperty().addListener((observableValue, s, t1) -> {

                if (textFields.get(0).getText().isEmpty() || textFields.get(1).getText().isEmpty() || textFields.get(2).getText().isEmpty() || textFields.get(3).getText().isEmpty() || textFields.get(4).getText().isEmpty()) {
                    getSendTransfer().setDisable(true);
                } else {
                    sendTransfer.setDisable(false);
                }

            });
        }
    }

    private void amountFieldValidation() {
        textFields.get(3).textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d{0,7}([.]\\d{0,4})?")) {
                textFields.get(3).setText(s);
                getSendTransfer().setDisable(true);
            } else {
                getSendTransfer().setDisable(false);
            }
        });
    }

    private void numberFieldValidation() {
        textFields.get(4).textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d*")) {
                textFields.get(4).setText(s);
                getSendTransfer().setDisable(true);
            } else {
                getSendTransfer().setDisable(false);
            }
        });
    }

    private void setBackToMenuProparties() {
        backToMenu.setLayoutX(215);
        backToMenu.setLayoutY(560);
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
            return scene = new Scene(group, 550, 600, Color.web("#380B61"));

        } else
            return scene;

    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getPanel(), getTransferSubject(), getSendTransfer(), getBackToMenu());
    }


}

