package test4;

import java.awt.BorderLayout;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Race extends Pane{
    
    Race(){
        
        Features f = new Features();
        getChildren().add(f.background(2));
        

        Button btnStart = new Button();
        btnStart.setLayoutX(5);
        btnStart.setLayoutY(5);
        btnStart.setText("Start");
//        btnStart.setVisible(false);
        getChildren().add(btnStart);

        ImageView citroenSide = new ImageView();
        citroenSide.setFitHeight(42);
        citroenSide.setFitWidth(111);
        citroenSide.setLayoutX(-50);
        citroenSide.setLayoutY(500);
        citroenSide.setImage(new Image(getClass().getResource("citroenSideView.png").toExternalForm()));
//        citroenSide.setVisible(false);
        getChildren().add(citroenSide);

        ImageView corvetteSide = new ImageView();
        corvetteSide.setFitHeight(33);
        corvetteSide.setFitWidth(111);
        corvetteSide.setLayoutX(-50);
        corvetteSide.setLayoutY(460);
        corvetteSide.setImage(new Image(getClass().getResource("corvetteSideView.png").toExternalForm()));
//        corvetteSide.setVisible(false);
        getChildren().add(corvetteSide);

        ImageView mustangSide = new ImageView();
        mustangSide.setFitHeight(35);
        mustangSide.setFitWidth(111);
        mustangSide.setLayoutX(-50);
        mustangSide.setLayoutY(420);
        mustangSide.setImage(new Image(getClass().getResource("mustangSideView.png").toExternalForm()));
//        mustangSide.setVisible(false);
        getChildren().add(mustangSide);

        ImageView lamborghiniSide = new ImageView();
        lamborghiniSide.setFitHeight(32);
        lamborghiniSide.setFitWidth(111);
        lamborghiniSide.setLayoutX(-50);
        lamborghiniSide.setLayoutY(380);
        lamborghiniSide.setImage(new Image(getClass().getResource("lamborghiniSideView.png").toExternalForm()));
//        lamborghiniSide.setVisible(false);
        getChildren().add(lamborghiniSide);

        ImageView ferrariSide = new ImageView();
        ferrariSide.setFitHeight(38);
        ferrariSide.setFitWidth(111);
        ferrariSide.setLayoutX(-50);
        ferrariSide.setLayoutY(340);
        ferrariSide.setImage(new Image(getClass().getResource("ferrariSideView.png").toExternalForm()));
//        ferrariSide.setVisible(false);
        getChildren().add(ferrariSide);
        
        
        Button btnRestart = new Button();
        btnRestart.setLayoutX(60);
        btnRestart.setLayoutY(5);
        btnRestart.setText("Restart");
        btnRestart.setVisible(true);
        getChildren().add(btnRestart);
        
        btnRestart.setOnAction(e ->{
            
            // Set the imagesreference to null  to be 
            // collected and deleted by the Garbage Collector
            citroenSide.setImage(null);
            corvetteSide.setImage(null);
            mustangSide.setImage(null); 
            lamborghiniSide.setImage(null);
            ferrariSide.setImage(null);
        
        getChildren().add(new Race()); 
        });
        
//        citroenSide = null;
//        corvetteSide = null;
//        mustangSide= null;
//        lamborghiniSide= null;
//        ferrariSide= null;
//        
//        getChildren().add(new Race()); 
        
        // Create tasks
        Runnable car1 = new CarsMovement(citroenSide, 5);
        Runnable car2 = new CarsMovement(corvetteSide, 4);
        Runnable car3 = new CarsMovement(ferrariSide, 1);
        Runnable car4 = new CarsMovement(lamborghiniSide, 2);
        Runnable car5 = new CarsMovement(mustangSide, 3);
        
        
        // Create threads
        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);
        Thread thread4 = new Thread(car4);
        Thread thread5 = new Thread(car5);
        
        btnStart.setOnAction(e -> {
                
                // Start threads
                thread1.start();
                thread2.start();
                thread3.start();
                thread4.start();
                thread5.start();
        });
        
        
        ///We got serius problems here 
//        try{
//            btnRestart.setOnAction(e ->{
//            btnStart.fire();
//        });
//        }catch(Exception e){
//            System.out.println("We couldn't start the race again");
//        }
    }
}