package test4;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class RobotRace extends Application {

    private final double WIDTH = 600;
    private final double HEIGHT = 600;
    private Menu gameMenu;

    @Override
    public void start(final Stage primaryStage) {
        ////Group root = new Group();
        Pane root = new Pane();
        root.setPrefSize(WIDTH, HEIGHT);
        
        Pane welcome = welcome();
        background(1);
        
        gameMenu = new Menu();
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

                    
        root.getChildren().addAll(background(1), gameMenu);
        
        
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ESCAPE) {
                // This will bind all the key press events taking place on the Scene to the Menu.
                scene.onKeyPressedProperty().bind(gameMenu.onKeyPressedProperty());

                if (!gameMenu.isVisible()) {
                    FadeTransition ft = new FadeTransition(Duration.seconds(0.5), gameMenu);
                    ft.setFromValue(0);
                    ft.setToValue(1);

                    gameMenu.setVisible(true);
                    ft.play();
                } else {
                    FadeTransition ft = new FadeTransition(Duration.seconds(0.5), gameMenu);
                    ft.setFromValue(1);
                    ft.setToValue(0);
                    ft.setOnFinished(evt -> gameMenu.setVisible(false));
                    ft.play();
                }
            }
        });

        ImageView imageView = new ImageView();
        imageView.setFitWidth(605);
        imageView.setFitHeight(605);
        imageView.setImage(new Image(getClass().getResource("backgroundRace.png").toExternalForm()));
        imageView.setVisible(false);
        root.getChildren().add(imageView);
        

        Button btnStart = new Button();
        btnStart.setLayoutX(5);
        btnStart.setLayoutY(5);
        btnStart.setText("Start");
        btnStart.setVisible(false);
        root.getChildren().add(btnStart);

        Button btnRestart = new Button();
        btnRestart.setLayoutX(60);
        btnRestart.setLayoutY(5);
        btnRestart.setText("Restart");
        btnRestart.setVisible(false);
        root.getChildren().add(btnRestart);

        ImageView citroenSide = new ImageView();
        citroenSide.setFitHeight(42);
        citroenSide.setFitWidth(111);
        citroenSide.setLayoutX(-50);
        citroenSide.setLayoutY(500);
        citroenSide.setImage(new Image(getClass().getResource("citroenSideView.png").toExternalForm()));
        citroenSide.setVisible(false);
        root.getChildren().add(citroenSide);

        ImageView corvetteSide = new ImageView();
        corvetteSide.setFitHeight(33);
        corvetteSide.setFitWidth(111);
        corvetteSide.setLayoutX(-50);
        corvetteSide.setLayoutY(460);
        corvetteSide.setImage(new Image(getClass().getResource("corvetteSideView.png").toExternalForm()));
        corvetteSide.setVisible(false);
        root.getChildren().add(corvetteSide);

        ImageView mustangSide = new ImageView();
        mustangSide.setFitHeight(35);
        mustangSide.setFitWidth(111);
        mustangSide.setLayoutX(-50);
        mustangSide.setLayoutY(420);
        mustangSide.setImage(new Image(getClass().getResource("mustangSideView.png").toExternalForm()));
        mustangSide.setVisible(false);
        root.getChildren().add(mustangSide);

        ImageView lamborghiniSide = new ImageView();
        lamborghiniSide.setFitHeight(32);
        lamborghiniSide.setFitWidth(111);
        lamborghiniSide.setLayoutX(-50);
        lamborghiniSide.setLayoutY(380);
        lamborghiniSide.setImage(new Image(getClass().getResource("lamborghiniSideView.png").toExternalForm()));
        lamborghiniSide.setVisible(false);
        root.getChildren().add(lamborghiniSide);

        ImageView ferrariSide = new ImageView();
        ferrariSide.setFitHeight(38);
        ferrariSide.setFitWidth(111);
        ferrariSide.setLayoutX(-50);
        ferrariSide.setLayoutY(340);
        ferrariSide.setImage(new Image(getClass().getResource("ferrariSideView.png").toExternalForm()));
        ferrariSide.setVisible(false);
        root.getChildren().add(ferrariSide);

        // Create tasks
        Runnable car1 = new CarsMovement(citroenSide, 5);
        Runnable car2 = new CarsMovement(corvetteSide, 4);
        Runnable car3 = new CarsMovement(ferrariSide, 3);
        Runnable car4 = new CarsMovement(lamborghiniSide, 2);
        Runnable car5 = new CarsMovement(mustangSide, 1);
        // Create threads
        final Thread thread1 = new Thread(car1);
        final Thread thread2 = new Thread(car2);
        final Thread thread3 = new Thread(car3);
        final Thread thread4 = new Thread(car4);
        final Thread thread5 = new Thread(car5);
        
        
        btnStart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                // Start threads
                thread1.start();
                thread2.start();
                thread3.start();
                thread4.start();
                thread5.start();

            }
        });

        btnRestart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RobotRace rr = new RobotRace();
                try {
                    rr.start(primaryStage);
                } catch (Exception ex) {
                    Logger.getLogger(RobotRace.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
    
    /**
     * Creates a pane with Welcome text, that will be the 
     * introduction of the game.
     * 
     * @return welcome pane texts
     */
    Pane welcome(){
        
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
        imgView.setFitWidth(605);
        imgView.setFitHeight(605);
        if(Background == 1)
            imgView.setImage(new Image(getClass().getResource("background.png").toExternalForm()));
        else if(Background == 2)
            imgView.setImage(new Image(getClass().getResource("backgroundRace.png").toExternalForm()));
            
        return imgView;
    }
    public static void main(String[] a) {
        launch(a);
    }

}

class CarsMovement implements Runnable {

    // Store positions
    private static ArrayList<Integer> positions = new ArrayList<Integer>();

    // Car to be moved
    ImageView car;

    // Car number
    int carNumber;

    // A car ImageView and a car number are passed to the constructor 
    CarsMovement(ImageView image, int carNumber) {

        car = image;
        this.carNumber = carNumber;
    }

    // Override run method
    public void run() {

        // If car is not at the finish line
        while (car.getX() < 480) {

            Platform.runLater(new Runnable() {

                public void run() {

                    //Increase x-coordinate by a random number, this determines the speed of the cars
                    car.setX(car.getX() + Math.random() * 1.2);

                }
            });

            try {
                //Pausing thread
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Add position of the car
        addPos(carNumber);
    }

    //Return positions
    public static ArrayList<Integer> getPositions() {
        return positions;
    }

    //Adding position
    synchronized private static void addPos(int number) {
        positions.add(number);
    }

    //Reset Positions
    public static void clearPositions() {
        positions.clear();
    }
}