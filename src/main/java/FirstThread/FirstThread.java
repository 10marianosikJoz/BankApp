package FirstThread;

import javafx.application.Platform;
import operations.SmartphonePaymentOperation;
import scenes_init.SmartphonePaymentScene;

public class FirstThread {
    private SmartphonePaymentScene smartphonePaymentScene = new SmartphonePaymentScene();
    private SmartphonePaymentOperation smartphonePaymentOperation = new SmartphonePaymentOperation();


    public void createThread() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                double progressValue = 0.01 * i;
                Platform.runLater(() -> smartphonePaymentScene.getProgressBar().setProgress(progressValue));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Platform.runLater(() -> smartphonePaymentScene.getFinishedLabel().setVisible(true));

        });

        smartphonePaymentScene.getStartButton().setOnAction(actionEvent -> {
            smartphonePaymentScene.getStartButton().setDisable(true);
            smartphonePaymentOperation.Operations();
            thread.start();
        });

    }
}
