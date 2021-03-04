package scenes_init;

import FirstThread.FirstThread;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class SmartphonePaymentScene {

    private static Button startButton = new Button("Start");
    private static ProgressBar progressBar = new ProgressBar();
    private static Label finishedLabel = new Label("DONE !");
    private Group group;
    private Scene scene;
    private Button backToMenu = new Button("BACK TO MENU");

    public Group getGroup() {
        return group = new Group();
    }

    public Scene getScene() {

        if (scene == null) {
            return scene = new Scene(group, 450, 450, Color.web("#380B61"));

        } else
            return scene;


    }

    private void setStartButtonProparties() {
        startButton.setPrefSize(80, 40);
        startButton.setLayoutX(185);
        startButton.setLayoutY(330);
        startButton.setStyle("-fx-background-color: #CFB53B; ");
        startButton.setOnAction(e -> new FirstThread().createThread());
    }

    public Button getStartButton() {
        setStartButtonProparties();
        return startButton;
    }

    private void setFinishedLabelProparties() {
        finishedLabel.setLayoutY(280);
        finishedLabel.setLayoutX(195);
        finishedLabel.setTextFill(Color.WHITE);
        finishedLabel.setFont(Font.font(20));
        finishedLabel.setVisible(false);
    }

    public Label getFinishedLabel() {
        setFinishedLabelProparties();
        return finishedLabel;
    }

    private void setProgressBarProparties() {
        progressBar.setPrefHeight(30);
        progressBar.setPrefWidth(200);
        progressBar.setLayoutX(125);
        progressBar.setLayoutY(150);
    }

    public ProgressBar getProgressBar() {
        setProgressBarProparties();
        return progressBar;
    }

    private void setBackToMenuProparties() {
        backToMenu.setLayoutX(165);
        backToMenu.setLayoutY(400);
        backToMenu.setStyle("-fx-background-color: #7E807F; ");
        backToMenu.setPrefSize(120, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);
    }

    public Button getBackToMenu() {
        setBackToMenuProparties();
        return backToMenu;
    }

    public void addNodesToGroup() {
        getGroup().getChildren().addAll(getStartButton(), getFinishedLabel(), getProgressBar(), getBackToMenu());
    }

}