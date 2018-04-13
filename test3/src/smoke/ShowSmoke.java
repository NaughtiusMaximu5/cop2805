/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smoke;

import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ShowSmoke extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 500);
        scene.setFill(Color.BLACK);

        Smoke smoke = new Smoke(180, 100, Color.WHITESMOKE);
        smoke.setOpacity(1);

        root.getChildren().add(smoke);

        primaryStage.setScene(scene);
        primaryStage.show();

        AnimationTimer gameloop = new AnimationTimer() {
            @Override
            public void handle(long arg0) {
                smoke.update();
            }
        };
        gameloop.start();       
    }   
}

class Smoke extends Group{
    WritableImage baseImg;
    ImageView[] lifeCycle;

    int FRAMES = 50;
    int FALLING_FRAMES = 32;
    int width = 60;
    int height = 60;
    double radius;
    Point2D midPoint;

    double xThrow = 0 ; 
    int xWobble = 1;
    double yThrow = 5;
    int yWobble = 10;

    Random random;
    int throttle;
    int throttleMax;

    public Smoke(int xLoc, int yLoc, Color color){   
        throttleMax = 4; // 4 ==> 15 fps animation rate
        random = new Random();

        midPoint = new Point2D(width/2, height/2);
        radius = width/2 - 1;
        lifeCycle = new ImageView[50];

        double topAlpha = 0.5; 
        double fadeAmount = topAlpha/FALLING_FRAMES;
        double fadeInAmount = 
                topAlpha/((FRAMES - FALLING_FRAMES) * 3);

        double pixR = color.getRed();
        double pixG = color.getGreen();
        double pixB = color.getBlue();
        double pixA = topAlpha;

        // Create the base image. 
        // The color is constant, the alpha is a
        // computed radial gradient.
        baseImg = new WritableImage(width, height); 
        PixelWriter baseRaster = baseImg.getPixelWriter();
        double distance;
        double gradientFactor; // between 0 and 1

        for (int jj = 0; jj < height; jj++){
            for (int kk = 0; kk < width; kk++){
                distance = midPoint.distance(jj, kk);
                if (distance > radius) gradientFactor = 0.0;
                else gradientFactor = (radius - distance) / radius;

                pixA =  topAlpha * gradientFactor;
                baseRaster.setColor(jj, kk, new Color(pixR, pixG, pixB, pixA));
            }   
        }   

        for (int i = 0; i < FRAMES; ++i){
            lifeCycle[i]= new ImageView();
            lifeCycle[i].setImage(baseImg);
            lifeCycle[i].setX(xLoc);
            lifeCycle[i].setY(yLoc);
            this.getChildren().add(lifeCycle[i]);
        }

        // alpha will rise and fall over course of lifeCycle
        for (int i = 0; i < FALLING_FRAMES; ++i){
            lifeCycle[i].setOpacity((i + 1) * fadeAmount);
        }

        for (int i = FALLING_FRAMES; i < FRAMES; i++){
            lifeCycle[i].setOpacity(
                    topAlpha - (i - FALLING_FRAMES + 1) * fadeInAmount);
        }
    }

    public void update() { 
        // Slow the animation by skipping cycles. 60 fps is overkill.
        if (throttle-- > 0) return;
        else throttle = throttleMax;

        // Propagate location of particles, while adding 
        //     'throw' and 'wobble'
        // lifeCycle[n] is stationary (origin of stream, visually)
        int n = FRAMES - 1; 
        for (int i = 0; i < n; i++) {
            lifeCycle[i].setX( lifeCycle[i+1].getX() 
                + xThrow + random.nextInt(xWobble));
            lifeCycle[i].setY( lifeCycle[i+1].getY() 
                + yThrow + random.nextInt(yWobble)); 
        }       
    }
}