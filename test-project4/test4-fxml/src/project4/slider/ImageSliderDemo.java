package project4.slider;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ImageSliderDemo extends Application {

    private List<String> list = new ArrayList<String>();
    int image = 0;
    double orgCliskSceneX, orgReleaseSceneX;
    Button lbutton, rButton;
    ImageView imageView;

@Override
public void start(Stage primaryStage) {
    // images in src folder.
    try {
        list.add("ferrari.png");
        list.add("lamborghini.png");
        list.add("mustang.png");
        list.add("corvette.png");
        list.add("chevy.png");

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);

        Image images[] = new Image[list.size()];
        for (int i = 0; i < list.size(); i++) {
            images[i] = new Image(getClass().getResource(list.get(i)).toExternalForm());
        }
        
        imageView = new ImageView(images[image]);
        imageView.setCursor(Cursor.CLOSED_HAND);   

        imageView.setFitHeight(300);
        imageView.setFitWidth(400);

        HBox hBox = new HBox();
        hBox.setSpacing(15);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(imageView);

        root.add(hBox, 1, 1);
        Scene scene = new Scene(root, 600, 600);
        
        scene.setOnKeyPressed(e ->{/* Move to the next car RIGHT*/
            if(e.getCode() == KeyCode.RIGHT){ 
                 image += 1;
                 if(image == list.size())
                        image=0;
                    imageView.setImage(images[image]);
             }
             
            if(e.getCode() == KeyCode.LEFT){///* Move to the next car LEFT*/
                    image -=1;
                if(image == -1) //if image is index -1 set the last image
                    image = list.size() -1;
                imageView.setImage(images[image]);
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public static void main(String[] args) {
    launch(args);
}
}