package project4.urlImage;

import javafx.animation.*;
import javafx.application.Application;
import javafx.beans.property.*;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BeatingHeart extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        ImageView heart = new ImageView(URL);

        animateUsingTimeline(heart);
//        animateUsingScaleTransition(heart);

        StackPane layout = new StackPane(heart);
        layout.setPrefWidth(heart.getImage().getWidth() * 2);
        layout.setPrefHeight(heart.getImage().getHeight() * 2);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    private void animateUsingTimeline(ImageView heart) {
        DoubleProperty scale = new SimpleDoubleProperty(1);
        heart.scaleXProperty().bind(scale);
        heart.scaleYProperty().bind(scale);

        Timeline beat = new Timeline(
            new KeyFrame(Duration.ZERO,         event -> scale.setValue(1)),
            new KeyFrame(Duration.seconds(0.5), event -> scale.setValue(1.1))
        );
        beat.setAutoReverse(true);
        beat.setCycleCount(Timeline.INDEFINITE);
        beat.play();
    }

    private void animateUsingScaleTransition(ImageView heart) {
        ScaleTransition scaleTransition = new ScaleTransition(
            Duration.seconds(1), heart
        );
        scaleTransition.setFromX(1);
        scaleTransition.setFromY(1);
        scaleTransition.setFromZ(1);
        scaleTransition.setToX(1.1);
        scaleTransition.setToY(1.1);
        scaleTransition.setToZ(1.1);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setCycleCount(Animation.INDEFINITE);
        scaleTransition.play();
    }

    private static final String URL = "https://wefork.ga/assets/icons/visual-studio.png";
            //"http://icons.iconarchive.com/icons/mirella-gabriele/valentine/128/Heart-red-icon.png";
    // icon obtained from: http://www.iconarchive.com/show/valentine-icons-by-mirella-gabriele/Heart-red-icon.html
    // icon license: Free for non-commercial use, commercial use not allowed.
    private static final String BADAGE = "https://wefork.ga/assets/icons/visual-studio.png";
}

