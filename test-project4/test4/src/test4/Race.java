
package test4;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Race extends Pane{
    
    Race(){
        
        Features f = new Features();
        getChildren().add(f.background(2));
        
        ImageView citroenSide = new ImageView();
        citroenSide.setFitHeight(42);
        citroenSide.setFitWidth(111);
        citroenSide.setLayoutX(-60);
        citroenSide.setLayoutY(520);

        citroenSide.setImage(new Image(getClass().getResource("citroenSideView.png").toExternalForm()));
        getChildren().add(citroenSide);

        ImageView corvetteSide = new ImageView();
        corvetteSide.setFitHeight(33);
        corvetteSide.setFitWidth(111);
        corvetteSide.setLayoutX(-60);
        corvetteSide.setLayoutY(460);
        corvetteSide.setImage(new Image(getClass().getResource("corvetteSideView.png").toExternalForm()));
        getChildren().add(corvetteSide);

        ImageView mustangSide = new ImageView();
        mustangSide.setFitHeight(35);
        mustangSide.setFitWidth(111);
        mustangSide.setLayoutX(-60);
        mustangSide.setLayoutY(420);;
        mustangSide.setImage(new Image(getClass().getResource("mustangSideView.png").toExternalForm()));
        getChildren().add(mustangSide);

        ImageView lamborghiniSide = new ImageView();
        lamborghiniSide.setFitHeight(32);
        lamborghiniSide.setFitWidth(111);
        lamborghiniSide.setLayoutX(-60);
        lamborghiniSide.setLayoutY(380);
        lamborghiniSide.setImage(new Image(getClass().getResource("lamborghiniSideView.png").toExternalForm()));
        getChildren().add(lamborghiniSide);

        ImageView ferrariSide = new ImageView();
        ferrariSide.setFitHeight(38);
        ferrariSide.setFitWidth(111);
        ferrariSide.setLayoutX(-60);
        ferrariSide.setLayoutY(340);
        ferrariSide.setImage(new Image(getClass().getResource("ferrariSideView.png").toExternalForm()));
        getChildren().add(ferrariSide);

        final Button btnStart = new Button();
        btnStart.setLayoutX(5);
        btnStart.setLayoutY(5);
        btnStart.setPrefHeight(10);
        btnStart.setPrefWidth(80);
        btnStart.setText("Start");
        getChildren().add(btnStart);
        // btnStart.setVisible(false);

        final Button btnRestart = new Button();
        btnRestart.setLayoutX(5);
        btnRestart.setLayoutY(5);
        btnRestart.setPrefHeight(10);
        btnRestart.setPrefWidth(80);
        btnRestart.setText("Restart");
        btnRestart.setVisible(false);
        getChildren().add(btnRestart);

        final Button results = new Button();
        results.setLayoutX(5);
        results.setLayoutY(5);
        results.setPrefHeight(10);
        results.setPrefWidth(80);
        results.setText("Results");
        results.setVisible(false);
        getChildren().add(results);
        
        // Create tasks
        Runnable car0 = new CarsMovement(ferrariSide, 0);
        Runnable car1 = new CarsMovement(lamborghiniSide, 1);
        Runnable car2 = new CarsMovement(mustangSide, 2);
        Runnable car3 = new CarsMovement(corvetteSide, 3);
        Runnable car4 = new CarsMovement(citroenSide, 4);

        // Create threads
        final Thread thread1 = new Thread(car0);
        final Thread thread2 = new Thread(car1);
        final Thread thread3 = new Thread(car2);
        final Thread thread4 = new Thread(car3);
        final Thread thread5 = new Thread(car4);
        // Start threads

        btnStart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                // Start threads
                thread1.start();
                thread2.start();
                thread3.start();
                thread4.start();
                thread5.start();
                
                
                
                // results.setDisable(false);
                btnStart.setVisible(false);
                results.setVisible(true);
                //results.setDisable(true);
            }
        });
        
       // TimeUnit.SECONDS.sleep(15);
        
         
        results.setOnAction(new EventHandler<ActionEvent>() {
            
            int racePosition;

            @Override
            public void handle(ActionEvent event) {
                
                for (int i = 0; i < CarsMovement.positions.size(); i++) {

                    if (Menu.carSelected == CarsMovement.positions.get(i)) {
                        racePosition = i;
                    }

                    System.out.println(CarsMovement.positions.get(i));

                }
                CarsMovement.clearPositions();
                
                System.out.println("Name: "+ Menu.name);
                
                System.out.println("Car selected:" +Menu.carSelected);
                switch (racePosition) {
                    case 0:
//                        firstplace.setVisible(true);
                        Menu.amountSelected *= 1000;
                        System.out.println("You wont fist place  " + Menu.amountSelected);
                        break;
                    case 1:
//                        secondplace.setVisible(true);
                        Menu.amountSelected *= 500;
                        System.out.println("You wont second place  " + Menu.amountSelected);
                        break;
                    case 2:
//                        thirdplace.setVisible(true);
                        Menu.amountSelected *= 250;
                        System.out.println("You wont third place  " + Menu.amountSelected);
                        break;
                    case 3:
                        System.out.println("4 place ");
                        break;
                    case 4:
                        System.out.println("5 place");
                        break;
                }

                results.setVisible(false);
                btnRestart.setVisible(true);

            }

        });
        
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
        

         while(thread1.isAlive()){
             btnRestart.setDisable(true);
             results.setDisable(true);
         }

    }
}
