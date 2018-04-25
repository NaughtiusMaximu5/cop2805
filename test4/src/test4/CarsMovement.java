
package test4;

import java.util.ArrayList;
import javafx.application.Platform;
import javafx.scene.image.ImageView;

public class CarsMovement implements Runnable {

    // Store positions
     ArrayList<Integer> positions = new ArrayList<>();

    // Car to be moved
    ImageView car;

    // Car number
    int carNumber;
    double carP;
    // A car ImageView and a car number are passed to the constructor 
    CarsMovement(ImageView image, int carNumber) {

        car = image;
        this.carNumber = carNumber;
    }

    // Override run method
    public void run() {
        // If car is not at the finish line
        while (car.getX() < 600) {

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
        carP = car.getX();
        
    }
    
    
    //Return positions
    public  ArrayList<Integer> getPositions() {
        return positions;
    }
    
    public double getPosition(){
        return carP;
    }
    //Adding position
    synchronized private void addPos(int number) {
        positions.add(number);
    }

    //Reset Positions
    public void clearPositions() {
        positions.clear();
    }
}