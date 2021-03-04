package form_components;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FormField extends Application {
    private final TextField log = new TextField();
    private final Button logButton = new Button("LOGIN ");
    private PasswordField password = new PasswordField();

    public static void main(String[] args) {
        launch(args);
    }

    public TextField getLog() {
        return log;
    }

    public PasswordField getPassword() {
        return password;
    }

    public Button getLogButton() {
        return logButton;
    }

    public void setPromptForLogin(TextField log) {
        this.log.setPromptText("Client ID");
    }

    public void setLogFieldLocation() {
        log.setLayoutX(175);
        log.setLayoutY(210);
    }

    public void setPromptForPassword(PasswordField password) {
        this.password.setPromptText("Password");
    }

    public void setPasswordFieldLocation() {
        password.setLayoutX(175);
        password.setLayoutY(265);
    }

    public void buttonLogFiledLocation() {

        logButton.setLayoutX(225);
        logButton.setLayoutY(345);
    }

    public String getLoginText() {
        String loginTextField = log.getText().trim();
        return loginTextField;
    }

    public String getPasswordText() {
        String passwordTextField = password.getText().trim();
        return passwordTextField;

    }

    public void LoginFieldListener() {
        getLog().textProperty().addListener((observableValue, s, t1) -> {
            if (!(getLog().getText().trim().isEmpty())) {
                getLogButton().setDisable(false);
            } else {
                getLogButton().setDisable(true);
            }
        });
    }

    public void PasswordFieldListener() {
        getPassword().textProperty().addListener((observableValue, s, t1) -> {
            if (!(getPassword().getText().trim().isEmpty())) {
                getLogButton().setDisable(false);
            } else {
                getLogButton().setDisable(true);
            }
        });
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
