package creativescene;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 *
 * @author Adriel
 */
public class CreativeScene extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        
        //Creates main planet
        Ellipse ellipse1 = new Ellipse();
        ellipse1.centerXProperty().bind(pane.heightProperty().divide(2));
        ellipse1.centerYProperty().bind(pane.heightProperty().divide(1));
        ellipse1.setRadiusX(360);
        ellipse1.setRadiusY(110);
        ellipse1.setFill(Color.BROWN);
        
        
        //Creating stars
        Circle circle1 = new Circle(60, 60, 2);
        circle1.setFill(Color.rgb(242, 244, 255, 0.5));
        Circle circle2 = new Circle(534, 100, 2);
        circle2.setFill(Color.rgb(242, 244, 255, 0.5));
        Circle circle3 = new Circle(65, 321, 2);
        circle3.setFill(Color.rgb(242, 244, 255, 0.5));
        Circle circle4 = new Circle(365, 248, 2);
        circle4.setFill(Color.rgb(242, 244, 255, 0.5));
        Circle circle5 = new Circle(511, 382, 2);
        circle5.setFill(Color.rgb(242, 244, 255, 0.5));
        
        
        //Adding to the pane
        pane.getChildren().add(ellipse1);
        pane.getChildren().add(circle1);
        pane.getChildren().add(circle2);
        pane.getChildren().add(circle3);
        pane.getChildren().add(circle4);
        pane.getChildren().add(circle5);
        
        //Displaying the scene
        Scene scene = new Scene(pane, 650, 650);
        scene.setFill(Color.rgb(5,14,60));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
