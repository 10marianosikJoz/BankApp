import form_components.FormField;
import form_components.Icons;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import login_data.UserLoginData;
import scenes_init.*;
import second_scene.SecondSceneInit;


public class FrameInit extends Application {
    private Group group;
    private Scene scene;
    private FormField formField = new FormField();
    private Icons icons = new Icons();
    private SecondSceneInit secondSceneInit = new SecondSceneInit();
    private AccountInfoScene accountInfoScene = new AccountInfoScene();
    private SmartphonePaymentScene smartphonePaymentScene = new SmartphonePaymentScene();
    private PublicTransportTicketsScene publicTransportTicketsScene = new PublicTransportTicketsScene();
    private TransfersBankScene transfersBankScene = new TransfersBankScene();
    private MoneyToPhoneAccountScene moneyToPhoneAccountScene = new MoneyToPhoneAccountScene();
    private BlockedCardScene blockedCardScene = new BlockedCardScene();
    private ChangePinCardScene changePinCardScene = new ChangePinCardScene();
    private HighwayPaymentScene highwayPaymentScene = new HighwayPaymentScene();
    private UserLoginData userLoginData = new UserLoginData();
    private ExchangeMoneyScene exchangeMoneyScene = new ExchangeMoneyScene();


    public static void main(String[] args) {
        launch(args);
    }

    public Group initGroupLayout() {
        return group = new Group();
    }//#35b28e //#ffc46b

    public Scene getScene() {

        if (scene == null) {
            return scene = new Scene(group, 600, 600, Color.web("#380B61"));

        } else
            return scene;
    }


    @Override
    public void start(Stage primaryStage) {

        initGroupLayout();
        secondSceneInit.getSecondGroupLayout();
        accountInfoScene.addNodesToLayout();
        smartphonePaymentScene.addNodesToGroup();
        publicTransportTicketsScene.addNodesToLayout();
        transfersBankScene.addNodesToLayout();
        secondSceneInit.addToSecondLayout();
        moneyToPhoneAccountScene.addNodesToLayout();
        blockedCardScene.addNodesToLayout();
        changePinCardScene.addNodesToLayout();
        highwayPaymentScene.addNodesToLayout();
        exchangeMoneyScene.addNodesToLayout();

        initGroupLayout().getChildren().addAll(formField.getLog(), formField.getPassword(), formField.getLogButton(), icons.getPasswordImageView(), icons.getLogImageView());

        formField.setLogFieldLocation();
        formField.setPromptForLogin(formField.getLog());
        formField.getLog().setAlignment(Pos.CENTER);
        formField.getLog().setPrefSize(250, 35);
        formField.getLog().setStyle("-fx-background-radius: 22");


        formField.setPasswordFieldLocation();
        formField.setPromptForPassword(formField.getPassword());
        formField.getPassword().setAlignment(Pos.CENTER);
        formField.getPassword().setPrefSize(250, 35);
        formField.getPassword().setStyle("-fx-background-radius: 22");

        icons.setPasswordImageView();
        icons.setLogImageView();


        formField.buttonLogFiledLocation();
        formField.getLogButton().setStyle("-fx-background-color: #7E807F; -fx-background-radius: 22 ");
        formField.getLogButton().setPrefSize(150, 35);
        formField.getLogButton().setTextFill(Color.WHITE);
       // formField.getLogButton().setDisable(true);
        formField.LoginFieldListener();
        formField.PasswordFieldListener();


        formField.getLogButton().setOnAction(e -> {

            if (formField.getLoginText().equals(userLoginData.getLogin()) && formField.getPasswordText().equals(userLoginData.getPassword())) {
                primaryStage.setScene(secondSceneInit.getScene2());
                primaryStage.centerOnScreen();
            }


        });


        accountInfoScene.getBackToMenuButton().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });

        publicTransportTicketsScene.getBackToMenuButton().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
           primaryStage.centerOnScreen();


        });
        blockedCardScene.getBackToMenu().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });
        changePinCardScene.getBackToMenu().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });
        exchangeMoneyScene.getBackToMenu().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });
        highwayPaymentScene.getBackToMenu().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });
        moneyToPhoneAccountScene.getBackToMenu().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });
        smartphonePaymentScene.getBackToMenu().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });
        transfersBankScene.getBackToMenu().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });


        for (int i = 0; i < secondSceneInit.getButtonsList().size(); i++) {
            secondSceneInit.getButtonsList().get(0).setOnAction(e -> {
                primaryStage.setScene(accountInfoScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(1).setOnAction(e -> {

                primaryStage.setScene(transfersBankScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(2).setOnAction(e -> {

                primaryStage.setScene(publicTransportTicketsScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(3).setOnAction(e -> {

                primaryStage.setScene(exchangeMoneyScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(4).setOnAction(e -> {
                primaryStage.setScene(smartphonePaymentScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(5).setOnAction(e -> {
                primaryStage.setScene(moneyToPhoneAccountScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(6).setOnAction(e -> {
                primaryStage.setScene(blockedCardScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(7).setOnAction(e -> {
                primaryStage.setScene(changePinCardScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(8).setOnAction(e -> {
                primaryStage.setScene(highwayPaymentScene.getScene());
                primaryStage.centerOnScreen();
            });

        }


        primaryStage.centerOnScreen();
        primaryStage.setScene(getScene());
        primaryStage.setTitle("Bank Application");
        primaryStage.setResizable(false);
        primaryStage.setFullScreen(false);
        primaryStage.show();


    }
}
