package test4;

import com.sun.deploy.config.JREInfo;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.paint.*;
import javafx.scene.image.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class RobotRace extends Application {

    private final double WIDTH = 600;
    private final double HEIGHT = 600;
    private Menu gameMenu;
//    private Race race;

    @Override
    public void start(final Stage primaryStage) {
        ////Group root = new Group();
        Pane root = new Pane();
        root.setPrefSize(WIDTH, HEIGHT);
        
        
        Features f = new Features();
        ImageView i = f.background(1);
        Pane welcome = f.introduction();
        
        gameMenu = new Menu();
//        race = new Race();
        gameMenu.setVisible(false);
        
        Scene scene = new Scene(root);
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                Platform.runLater(() -> root.getChildren().add(welcome));
            }
        }, 2000);
        timer.schedule(new TimerTask() {
            public void run() {
                Platform.runLater(() -> root.getChildren().remove(welcome));
            }
        }, 5000);
        timer.schedule(new TimerTask(){
            public void run(){
                Platform.runLater(() -> gameMenu.setVisible(true));
            }
        }, 7000);

        
        //gameMenu.setVisible(true);
        root.getChildren().addAll(i, gameMenu);
        
        //scene.onKeyPressedProperty().bind(gameMenu.onKeyPressedProperty());
        
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] a) {
        launch(a);
    }

}

/**
 * Class that add some features to the project 
 * like Introduction and set background of the game
 * 
 */
class Features{

    /**
     * Creates a pane with Welcome text, that will be the 
     * introduction of the game.
     * 
     * @return introduction pane
     */
    Pane introduction(){
        
        Pane pane = new Pane();
        Text text = new Text();
        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(77.0);
        text.setLayoutY(282.0);
        text.setOpacity(0.70);
        text.setStroke(Color.BLACK);
        text.setStrokeWidth(2);
        text.setText("Java's RACE");
        text.setFont(new Font("Comic Sans MS Bold", 76.0));

        Reflection reflection = new Reflection();
        reflection.setFraction(0.68);
        reflection.setTopOpacity(0.24);
        text.setEffect(reflection);

        Text text0 = new Text();
        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setLayoutX(227.0);
        text0.setLayoutY(555.0);
        text0.setText("A COP 2805c Prodution.");

        pane.getChildren().addAll(text, text0);
        
        return pane;
    }
    
    /**
     * Returns the background images of the game.
     * 
     * @param Background 
     *       <b>1</b> Menu Background
     *       <b>2</b> Race Background
     * @return image that will be the background
     */
    ImageView background(int Background){
        ImageView imgView = new ImageView();
        imgView.setFitWidth(610);
        imgView.setFitHeight(610);
        if(Background == 1)
            imgView.setImage(new Image(getClass().getResource("background.png").toExternalForm()));
        else if(Background == 2)
            imgView.setImage(new Image(getClass().getResource("backgroundRace.png").toExternalForm()));
            
        return imgView;
    }
}

