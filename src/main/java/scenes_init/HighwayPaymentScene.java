package scenes_init;

import higway_scene_icons.HighwayButtonsIcons;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.ArrayList;


public class HighwayPaymentScene {
    private static ArrayList<ToggleButton> toggleButtons = new ArrayList<>(5);
    private static Button payment = new Button("Payment");
    private static ToggleGroup toggleGroup = new ToggleGroup();
    private Group group;
    private Scene scene;
    private Button backToMenu = new Button("BACK TO MENU");
    private Pane pane = new Pane();
    private HighwayButtonsIcons highwayButtonsIcons = new HighwayButtonsIcons();


    private Pane getPane() {
        pane.getChildren().addAll(getToggleButtons());
        addToggleButtonsToGroup();
        return pane;
    }

    private void createToggleButtons() {
        for (int i = 0; i < 5; i++) {
            toggleButtons.add(new ToggleButton());

        }
    }

    private void addToggleButtonsToGroup() {
        for (int i = 0; i < 5; i++) {
            toggleButtons.get(i).setToggleGroup(toggleGroup);

        }
    }

    private void setToggleButtonsProperties() {
        for (int i = 0; i < 5; i++) {
            toggleButtons.get(i).setPrefSize(150, 80);
        }
        toggleButtons.get(0).setLayoutY(50);
        toggleButtons.get(0).setLayoutX(15);
        toggleButtons.get(0).setText("S7 Highway: 45$");
        toggleButtons.get(0).setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        toggleButtons.get(0).setTextFill(Color.BLACK);
        toggleButtons.get(0).setContentDisplay(ContentDisplay.TOP);
        toggleButtons.get(0).setGraphic(highwayButtonsIcons.getFirstImageView());


        toggleButtons.get(1).setLayoutY(50);
        toggleButtons.get(1).setLayoutX(200);
        toggleButtons.get(1).setText("S19 Highway 50.0$");
        toggleButtons.get(1).setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        toggleButtons.get(1).setTextFill(Color.BLACK);
        toggleButtons.get(1).setContentDisplay(ContentDisplay.TOP);
        toggleButtons.get(1).setGraphic(highwayButtonsIcons.getSecondImageView());

        toggleButtons.get(2).setLayoutY(50);
        toggleButtons.get(2).setLayoutX(390);
        toggleButtons.get(2).setText("A3 Highway 60.0$");
        toggleButtons.get(2).setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        toggleButtons.get(2).setTextFill(Color.BLACK);
        toggleButtons.get(2).setContentDisplay(ContentDisplay.TOP);
        toggleButtons.get(2).setGraphic(highwayButtonsIcons.getThirdImageView());

        toggleButtons.get(3).setLayoutY(240);
        toggleButtons.get(3).setLayoutX(300);
        toggleButtons.get(3).setText("A5 Highway: 50.0$");
        toggleButtons.get(3).setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        toggleButtons.get(3).setTextFill(Color.BLACK);
        toggleButtons.get(3).setContentDisplay(ContentDisplay.TOP);
        toggleButtons.get(3).setGraphic(highwayButtonsIcons.getFourthImageView());

        toggleButtons.get(4).setLayoutY(240);
        toggleButtons.get(4).setLayoutX(115);
        toggleButtons.get(4).setText("S3 Highway: 70.0$");
        toggleButtons.get(4).setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        toggleButtons.get(4).setTextFill(Color.BLACK);
        toggleButtons.get(4).setContentDisplay(ContentDisplay.TOP);
        toggleButtons.get(4).setGraphic(highwayButtonsIcons.getFifthImageView());
    }

    public ArrayList<ToggleButton> getToggleButtons() {
        createToggleButtons();
        setToggleButtonsProperties();
        return toggleButtons;
    }

    private void setPaymentButton() {

        payment.setLayoutX(215);
        payment.setLayoutY(480);
        payment.setPrefSize(120, 30);
        payment.setStyle("-fx-background-color: #CFB53B; ");
        payment.setTextFill(Color.WHITE);


    }

    public Button getPayment() {
        setPaymentButton();

        return payment;
    }

    private void setBackToMenuProperties() {
        backToMenu.setLayoutX(215);
        backToMenu.setLayoutY(540);
        backToMenu.setStyle("-fx-background-color: #7E807F; ");
        backToMenu.setPrefSize(120, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);
    }

    public Button getBackToMenu() {
        setBackToMenuProperties();
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
        getGroup().getChildren().addAll(getPane(), getPayment(), getBackToMenu());
    }

}
