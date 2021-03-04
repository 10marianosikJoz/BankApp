package scenes_init;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import textfields_formatters.ChangePinCardFieldsFormatter;

public class ChangePinCardScene {
    private Group group;
    private Scene scene;
    private PasswordField[] passwordFields = new PasswordField[3];
    private Pane panel = new Pane();
    private Button saveChanges = new Button("SAVE CHANGES");
    private Button backToMenu = new Button("BACK TO MENU");
    private ChangePinCardFieldsFormatter changePinCardFieldsFormatter = new ChangePinCardFieldsFormatter();

    private void addPasswordFieldsToArray() {
        for (int i = 0; i < passwordFields.length; i++) {
            passwordFields[i] = new PasswordField();
        }
    }

    private void setPasswordFieldsProparties() {
        textFieldCurrentPinValidation();
        textFieldNewPinValidation();
        textFieldAppPinValidation();
        for (int i = 0; i < passwordFields.length; i++) {
            passwordFields[0].setPrefSize(150, 40);
            passwordFields[0].setLayoutX(125);
            passwordFields[0].setLayoutY(30);
            passwordFields[0].setPromptText("Enter current PIN code");
            passwordFields[0].setAlignment(Pos.CENTER);
            passwordFields[0].setTextFormatter(changePinCardFieldsFormatter.getChangePinCardFormatter());

            passwordFields[1].setPrefSize(150, 40);
            passwordFields[1].setLayoutX(125);
            passwordFields[1].setLayoutY(100);
            passwordFields[1].setPromptText("Enter new PIN code");
            passwordFields[1].setAlignment(Pos.CENTER);
            passwordFields[1].setTextFormatter(changePinCardFieldsFormatter.getChangePinCardFormatter());

            passwordFields[2].setPrefSize(150, 40);
            passwordFields[2].setLayoutX(125);
            passwordFields[2].setLayoutY(170);
            passwordFields[2].setPromptText("Enter PIN application");
            passwordFields[2].setAlignment(Pos.CENTER);
            passwordFields[2].setTextFormatter(changePinCardFieldsFormatter.getChangePinCardFormatter());
        }
    }

    private PasswordField[] getPasswordFields() {
        addPasswordFieldsToArray();
        return passwordFields;
    }

    private Pane getPanel() {

        panel.getChildren().addAll(getPasswordFields());
        setPasswordFieldsProparties();
        buttonHandler();
        return panel;
    }

    private void setSaveChangesProparties() {
        saveChanges.setLayoutX(140);
        saveChanges.setLayoutY(270);
        saveChanges.setPrefSize(120, 30);
        saveChanges.setStyle("-fx-background-color: #CFB53B; ");
        saveChanges.setTextFill(Color.WHITE);
        saveChanges.setDisable(true);
        saveChanges.setOnAction(e -> clearTextFields());


    }

    private void clearTextFields() {
        for (PasswordField passwordField : passwordFields) {
            passwordField.clear();
        }

    }

    private Button getSaveChanges() {
        setSaveChangesProparties();
        return saveChanges;
    }

    private void buttonHandler() {
        for (PasswordField passwordField : passwordFields) {

            passwordField.textProperty().addListener((observableValue, s, t1) -> {

                if (!passwordFields[0].getText().isEmpty() && !passwordFields[1].getText().isEmpty() && !passwordFields[2].getText().isEmpty()) {
                    saveChanges.setDisable(false);
                } else {
                    saveChanges.setDisable(true);

                }

            });
        }
    }

    private void textFieldCurrentPinValidation() {

        passwordFields[0].textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d*")) {
                passwordFields[0].setText(s);
                saveChanges.setDisable(true);
            } else {
                saveChanges.setDisable(false);
            }
        });
    }

    private void textFieldNewPinValidation() {

        passwordFields[1].textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d*")) {
                passwordFields[1].setText(s);
                saveChanges.setDisable(true);
            } else {
                saveChanges.setDisable(false);
            }
        });
    }

    private void textFieldAppPinValidation() {

        passwordFields[2].textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d*")) {
                passwordFields[2].setText(s);
                saveChanges.setDisable(true);
            } else {
                saveChanges.setDisable(false);
            }
        });
    }

    private void setBackToMenuProparties() {
        backToMenu.setLayoutX(140);
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

    public Group getGroup() {
        return group = new Group();
    }

    public Scene getScene() {
        if (scene == null) {
            return scene = new Scene(group, 400, 500, Color.web("#380B61"));
        } else
            return scene;


    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getPanel(), getSaveChanges(), getBackToMenu());
    }
}
