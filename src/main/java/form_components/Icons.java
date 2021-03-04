package form_components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Icons {
    private Image passwordImage = new Image("pass.png");
    private ImageView passwordImageView = new ImageView(passwordImage);
    private Image logImage = new Image("user.png");
    private ImageView logImageView = new ImageView(logImage);

    public void setPasswordImageView() {
        passwordImageView.setX(115);
        passwordImageView.setY(254);
        passwordImageView.setFitHeight(45);
        passwordImageView.setFitWidth(50);
        passwordImageView.setPreserveRatio(true);
    }

    public ImageView getPasswordImageView() {
        return passwordImageView;
    }


    public void setLogImageView() {
        logImageView.setX(115);
        logImageView.setY(200);
        logImageView.setFitHeight(45);
        logImageView.setFitWidth(50);
        logImageView.setPreserveRatio(true);
    }

    public ImageView getLogImageView() {
        return logImageView;
    }

}


