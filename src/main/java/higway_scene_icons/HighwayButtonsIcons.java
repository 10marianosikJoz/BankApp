package higway_scene_icons;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class HighwayButtonsIcons {
    private ArrayList<Image> images = new ArrayList<>();
    private ImageView firstImageView = new ImageView();
    private ImageView secondImageView = new ImageView();
    private ImageView thirdImageView = new ImageView();
    private ImageView fourthImageView = new ImageView();
    private ImageView fifthImageView = new ImageView();

    private void addImagesToList() {
        for (int i = 0; i < 5; i++) {
            images.add(new Image("highway.png"));
        }

    }

    private ArrayList<Image> getImages() {
        addImagesToList();
        return images;
    }

    private void setFirstImageViews() {
        getImages();
        firstImageView.setFitWidth(130);
        firstImageView.setFitHeight(150);
        firstImageView.setPreserveRatio(true);
        firstImageView.setImage(images.get(0));
    }

    private void setSecondImageViews() {
        secondImageView.setFitWidth(130);
        secondImageView.setFitHeight(150);
        secondImageView.setPreserveRatio(true);
        secondImageView.setImage(images.get(1));
    }

    private void setThirdImageViews() {
        thirdImageView.setFitWidth(130);
        thirdImageView.setFitHeight(150);
        thirdImageView.setPreserveRatio(true);
        thirdImageView.setImage(images.get(2));
    }

    private void setFourthImageViews() {
        fourthImageView.setFitWidth(130);
        fourthImageView.setFitHeight(150);
        fourthImageView.setPreserveRatio(true);
        fourthImageView.setImage(images.get(3));
    }

    private void setFifthImageViews() {
        fifthImageView.setFitWidth(130);
        fifthImageView.setFitHeight(150);
        fifthImageView.setPreserveRatio(true);
        fifthImageView.setImage(images.get(4));
    }

    public ImageView getFirstImageView() {
        setFirstImageViews();
        return firstImageView;
    }

    public ImageView getSecondImageView() {
        setSecondImageViews();
        return secondImageView;
    }

    public ImageView getThirdImageView() {
        setThirdImageViews();
        return thirdImageView;
    }

    public ImageView getFourthImageView() {
        setFourthImageViews();
        return fourthImageView;
    }

    public ImageView getFifthImageView() {
        setFifthImageViews();
        return fifthImageView;
    }
}

