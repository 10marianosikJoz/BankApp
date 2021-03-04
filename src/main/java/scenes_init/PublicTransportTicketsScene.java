package scenes_init;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.ArrayList;

public class PublicTransportTicketsScene {
    private static ArrayList<ToggleButton> toggleButtons = new ArrayList<>(3);
    private static ToggleGroup toggleGroup = new ToggleGroup();
    private static Button buyTicketButton = new Button("BUY");
    private static AccountInfoScene accountInfoScene = new AccountInfoScene();
    private Group group;
    private Scene scene;
    private Image transportTickets = new Image("transport_ticket.png");
    private ImageView imageViewTransportTickets = new ImageView(transportTickets);
    private Image secondTypeTransportTickets = new Image("transport_ticket.png");
    private ImageView imageViewSecondTypeTickets = new ImageView(secondTypeTransportTickets);
    private Image thirdTypeTransportTickets = new Image("transport_ticket.png");
    private ImageView imageViewThirdTypeTickets = new ImageView(thirdTypeTransportTickets);
    private Pane pane = new Pane();
    private Button backToMenu = new Button("BACK TO MENU");


    private void setBackToMenuButtonProparties() {
        backToMenu.setLayoutX(200);
        backToMenu.setLayoutY(400);
        backToMenu.setStyle("-fx-background-color: #7E807F; ");
        backToMenu.setPrefSize(150, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);

    }

    public Button getBackToMenuButton() {
        setBackToMenuButtonProparties();
        return backToMenu;
    }

    private void setBuyTicketButtonProparties() {
        buyTicketButton.setLayoutX(225);
        buyTicketButton.setLayoutY(330);
        buyTicketButton.setPrefSize(100, 40);
        buyTicketButton.setStyle("-fx-background-color: #CFB53B; ");
        buyTicketButton.setTextFill(Color.WHITE);

    }

    public Button getBuyTicketButton() {
        setBuyTicketButtonProparties();
        return buyTicketButton;
    }

    private Pane getPane() {
        pane.getChildren().addAll(getToggleButtons());
        addToggleButtonsToGroup();
        return pane;
    }

    private void createToggleButtons() {
        for (int i = 0; i < 3; i++) {
            toggleButtons.add(new ToggleButton());

        }
    }

    private void addToggleButtonsToGroup() {
        for (int i = 0; i < 3; i++) {
            toggleButtons.get(i).setToggleGroup(toggleGroup);

        }
    }

    private void setToggleButtonsProparties() {
        for (int i = 0; i < 3; i++) {

            toggleButtons.get(0).setLayoutY(50);
            toggleButtons.get(0).setLayoutX(15);
            toggleButtons.get(0).setText("30 min / 2.00 $");
            toggleButtons.get(0).setFont(Font.font("Verdana", FontWeight.BOLD, 12));
            toggleButtons.get(0).setTextFill(Color.BLACK);
            toggleButtons.get(0).setContentDisplay(ContentDisplay.TOP);


            toggleButtons.get(1).setLayoutY(50);
            toggleButtons.get(1).setLayoutX(200);
            toggleButtons.get(1).setText("1 h / 3.00 $");
            toggleButtons.get(1).setFont(Font.font("Verdana", FontWeight.BOLD, 12));
            toggleButtons.get(1).setTextFill(Color.BLACK);
            toggleButtons.get(1).setContentDisplay(ContentDisplay.TOP);

            toggleButtons.get(2).setLayoutY(50);
            toggleButtons.get(2).setLayoutX(390);
            toggleButtons.get(2).setText("4 h / 4.00 $");
            toggleButtons.get(2).setFont(Font.font("Verdana", FontWeight.BOLD, 12));
            toggleButtons.get(2).setTextFill(Color.BLACK);
            toggleButtons.get(2).setContentDisplay(ContentDisplay.TOP);
        }

    }

    private void setToggleButtonsImages() {
        for (int i = 0; i < 3; i++) {
            toggleButtons.get(0).setGraphic(getImageViewTransportTickets());
            toggleButtons.get(1).setGraphic(getImageViewSecondTypeTickets());
            toggleButtons.get(2).setGraphic(getImageViewThirdTypeTickets());
        }

    }

    public ArrayList<ToggleButton> getToggleButtons() {
        createToggleButtons();
        setToggleButtonsProparties();
        setToggleButtonsImages();
        return toggleButtons;
    }

    private void setImageViewTransportTickets() {
        imageViewTransportTickets.setFitWidth(130);
        imageViewTransportTickets.setFitHeight(150);
        imageViewTransportTickets.setPreserveRatio(true);


    }

    private void setImageViewSecondTypeTickets() {
        imageViewSecondTypeTickets.setFitWidth(130);
        imageViewSecondTypeTickets.setFitHeight(150);
        imageViewSecondTypeTickets.setPreserveRatio(true);


    }

    private void setImageViewThirdTypeTickets() {
        imageViewThirdTypeTickets.setFitWidth(130);
        imageViewThirdTypeTickets.setFitHeight(150);
        imageViewThirdTypeTickets.setPreserveRatio(true);


    }

    private ImageView getImageViewThirdTypeTickets() {
        setImageViewThirdTypeTickets();
        return imageViewThirdTypeTickets;
    }

    private ImageView getImageViewSecondTypeTickets() {
        setImageViewSecondTypeTickets();
        return imageViewSecondTypeTickets;
    }

    private ImageView getImageViewTransportTickets() {
        setImageViewTransportTickets();
        return imageViewTransportTickets;
    }

    public Group getGroup() {
        return group = new Group();
    }

    public Scene getScene() {
        if (scene == null) {
            return scene = new Scene(group, 550, 450, Color.web("#380B61"));

        } else
            return scene;

    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getPane(), getBuyTicketButton(), getBackToMenuButton());
    }
}

