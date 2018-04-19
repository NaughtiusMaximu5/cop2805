package test4;

import java.net.URL;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;

public class GameMenuDemo extends Application {

    final int NO_OF_PLAYERS = 5;
    ArrayList<Player> players = new ArrayList<>();
    private Menu gameMenu;
    

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
        root.setPrefSize(600, 600);

        ImageView imgView = new ImageView();
        imgView.setFitWidth(605);
        imgView.setFitHeight(605);
        imgView.setImage(new Image(getClass().getResource("background.png").toExternalForm()));

        gameMenu = new Menu();
        gameMenu.setVisible(true);

        root.getChildren().addAll(imgView, gameMenu);

        Scene scene = new Scene(root);
        scene.onKeyPressedProperty().bind(gameMenu.onKeyPressedProperty());
//        scene.setOnKeyPressed(event -> {
//            if (event.getCode() == KeyCode.ESCAPE) {
//                // This will bind all the key press events taking place on the Scene to the Menu.
//                scene.onKeyPressedProperty().bind(gameMenu.onKeyPressedProperty());
//
//                if (!gameMenu.isVisible()) {
//                    FadeTransition ft = new FadeTransition(Duration.seconds(0.5), gameMenu);
//                    ft.setFromValue(0);
//                    ft.setToValue(1);
//
//                    gameMenu.setVisible(true);
//                    ft.play();
//                } else {
//                    FadeTransition ft = new FadeTransition(Duration.seconds(0.5), gameMenu);
//                    ft.setFromValue(1);
//                    ft.setToValue(0);
//                    ft.setOnFinished(evt -> gameMenu.setVisible(false));
//                    ft.play();
//                }
//            }
//        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

class Player {

    String name;
    String imagesURLs;
    String carNames;
}