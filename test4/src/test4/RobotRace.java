package test4;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;    //
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.paint.*;
import javafx.scene.image.*;

public class RobotRace extends Application {

    private final double SCENE_WIDTH = 600;
    private final double SCENE_HEIGHT = 600;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        scene.setFill(Color.GREEN);

        Button btnStart = new Button();
        btnStart.setLayoutX(5);
        btnStart.setLayoutY(5);
        btnStart.setText("Start");
        root.getChildren().add(btnStart);

        Button btnRestart = new Button();
        btnRestart.setLayoutX(60);
        btnRestart.setLayoutY(5);
        btnRestart.setText("Restart");
        root.getChildren().add(btnRestart);

        primaryStage.setScene(scene);
        primaryStage.show();

        ImageView cirtoenSide = new ImageView();
        cirtoenSide.setFitHeight(42);
        cirtoenSide.setFitWidth(111);
        cirtoenSide.setLayoutX(0);
        cirtoenSide.setLayoutY(500);
        cirtoenSide.setImage(new Image(getClass().getResource("citroenSideView.png").toExternalForm()));
        root.getChildren().add(cirtoenSide);

        ImageView corvetteSide = new ImageView();
        corvetteSide.setFitHeight(33);
        corvetteSide.setFitWidth(111);
        corvetteSide.setLayoutX(0);
        corvetteSide.setLayoutY(460);
        corvetteSide.setImage(new Image(getClass().getResource("corvetteSideView.png").toExternalForm()));
        root.getChildren().add(corvetteSide);

        ImageView mustangSide = new ImageView();
        mustangSide.setFitHeight(35);
        mustangSide.setFitWidth(111);
        mustangSide.setLayoutX(0);
        mustangSide.setLayoutY(420);
        mustangSide.setImage(new Image(getClass().getResource("mustangSideView.png").toExternalForm()));
        root.getChildren().add(mustangSide);

        ImageView lamborghiniSide = new ImageView();
        lamborghiniSide.setFitHeight(32);
        lamborghiniSide.setFitWidth(111);
        lamborghiniSide.setLayoutX(0);
        lamborghiniSide.setLayoutY(380);
        lamborghiniSide.setImage(new Image(getClass().getResource("lamborghiniSideView.png").toExternalForm()));
        root.getChildren().add(lamborghiniSide);

        ImageView ferrariSide = new ImageView();
        ferrariSide.setFitHeight(38);
        ferrariSide.setFitWidth(111);
        ferrariSide.setLayoutX(0);
        ferrariSide.setLayoutY(340);
        ferrariSide.setImage(new Image(getClass().getResource("ferrariSideView.png").toExternalForm()));
        root.getChildren().add(ferrariSide);

        // Create tasks
        Runnable car1 = new CarsMovement(cirtoenSide, 5);
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
                RobotRace rr=new RobotRace();
                try {
                    rr.start(primaryStage);
                } catch (Exception ex) {
                    Logger.getLogger(RobotRace.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        

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
                    car.setX(car.getX() + Math.random()*1.2);

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

