/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Race extends Pane{
    
    Race(){
    
        ImageView imageView = new ImageView();
        imageView.setFitWidth(600);
        imageView.setFitHeight(600);
        imageView.setImage(new Image(getClass().getResource("backgroundRace.png").toExternalForm()));
//        imageView.setVisible(false);
        getChildren().add(imageView);
        

        Button btnStart = new Button();
        btnStart.setLayoutX(5);
        btnStart.setLayoutY(5);
        btnStart.setText("Start");
//        btnStart.setVisible(false);
        getChildren().add(btnStart);

//        Button btnRestart = new Button();
//        btnRestart.setLayoutX(60);
//        btnRestart.setLayoutY(5);
//        btnRestart.setText("Restart");
//        btnRestart.setVisible(false);
//        getChildren().add(btnRestart);

        ImageView citroenSide = new ImageView();
        citroenSide.setFitHeight(42);
        citroenSide.setFitWidth(111);
        citroenSide.setLayoutX(-100);
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
        
//        if(gameMenu.isDisable()){
//            
//        imageView.setVisible(false);
//        btnStart.setText("Start");
//        btnStart.setVisible(false);
//        btnRestart.setVisible(false);
//        citroenSide.setVisible(false);
//        corvetteSide.setVisible(false);
//        mustangSide.setVisible(false);
//        lamborghiniSide.setVisible(false);
//        ferrariSide.setVisible(false);
//
//        }
        
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
    }
}