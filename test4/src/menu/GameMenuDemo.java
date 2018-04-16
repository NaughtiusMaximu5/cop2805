package menu;

import java.util.ArrayList;
import java.util.List;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class GameMenuDemo extends Application {

    final int NO_OF_PLAYERS = 5;
    private Menu gameMenu;
     private List<String> list = new ArrayList<String>();
    int image = 0;
    double orgCliskSceneX, orgReleaseSceneX;
    ImageView imageView;

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
        root.setPrefSize(600, 600);

        ImageView imgView = new ImageView();
        imgView.setFitWidth(605);
        imgView.setFitHeight(605);
        imgView.setImage(new Image(getClass().getResource("background.png").toExternalForm()));

        gameMenu = new Menu();
        gameMenu.setVisible(false);

        root.getChildren().addAll(imgView, gameMenu);

        Scene scene = new Scene(root);
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ESCAPE) {
                if (!gameMenu.isVisible()) {
                    FadeTransition ft = new FadeTransition(Duration.seconds(0.5), gameMenu);
                    ft.setFromValue(0);
                    ft.setToValue(1);

                    gameMenu.setVisible(true);
                    ft.play();
                }
                else {
                    FadeTransition ft = new FadeTransition(Duration.seconds(0.5), gameMenu);
                    ft.setFromValue(1);
                    ft.setToValue(0);
                    ft.setOnFinished(evt -> gameMenu.setVisible(false));
                    ft.play();
                }
            }
        });
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private class Menu extends Parent {
        public Menu() {
            VBox menu0 = new VBox(10);
            VBox menu1 = new VBox(10);
            Pane  menu2 = new Pane();
            VBox menu3 = new VBox(10);

            menu0.setTranslateX(100);
            menu0.setTranslateY(200);
           
            menu1.setTranslateX(100);
            menu1.setTranslateY(200);
            
            menu2.setTranslateX(100);
            menu2.setTranslateY(200);
            
            menu3.setTranslateX(100);
            menu3.setTranslateY(200);
            
            

            final int offset = 600;

            menu1.setTranslateX(offset);
            
            
            MenuButton btnPlay = new MenuButton("PLAY NOW");
            btnPlay.setOnMouseClicked(event -> {
                getChildren().add(menu2);

                TranslateTransition tt = new TranslateTransition(Duration.seconds(0.25), menu0);
                tt.setToX(menu0.getTranslateX() - offset);

                TranslateTransition tt1 = new TranslateTransition(Duration.seconds(0.5), menu2);
                tt1.setToX(menu0.getTranslateX());

                tt.play();
                tt1.play();

                tt.setOnFinished(evt -> {
                    getChildren().remove(menu0);
                });
            });
            
            
            MenuButton btnResume = new MenuButton("RESUME");
            btnResume.setOnMouseClicked(event -> {
                FadeTransition ft = new FadeTransition(Duration.seconds(0.5), this);
                ft.setFromValue(1);
                ft.setToValue(0);
                ft.setOnFinished(evt -> setVisible(false));
                ft.play();
            });


            MenuButton btnOptions = new MenuButton("OPTIONS");
            btnOptions.setOnMouseClicked(event -> {
                getChildren().add(menu1);

                TranslateTransition tt = new TranslateTransition(Duration.seconds(0.25), menu0);
                tt.setToX(menu0.getTranslateX() - offset);

                TranslateTransition tt1 = new TranslateTransition(Duration.seconds(0.5), menu1);
                tt1.setToX(menu0.getTranslateX());

                tt.play();
                tt1.play();

                tt.setOnFinished(evt -> {
                    getChildren().remove(menu0);
                });
            });
            
           
            
            MenuButton btnExit = new MenuButton("EXIT");
            btnExit.setOnMouseClicked(event -> {
                System.exit(0);
            });

            MenuButton btnBack = new MenuButton(" ⬅ BACK");
            btnBack.setOnMouseClicked(event -> {
                getChildren().add(menu0);

                TranslateTransition tt = new TranslateTransition(Duration.seconds(0.25), menu1);
                tt.setToX(menu1.getTranslateX() + offset);

                TranslateTransition tt1 = new TranslateTransition(Duration.seconds(0.5), menu0);
                tt1.setToX(menu1.getTranslateX());

                tt.play();
                tt1.play();

                tt.setOnFinished(evt -> {
                    getChildren().remove(menu1);
                });
            });
            
            

        Text text;
        TextField textField;

        text = new Text();
        textField = new TextField();

        text.setLayoutX(40);
        text.setLayoutY(83);
        
        text.setText("ENTER YOUR NAME");
        text.setFont(text.getFont().font(20));
        text.setFill(Color.WHITE);
        textField.setLayoutX(40);
        textField.setLayoutY(100);
        textField.setStyle(
                "-fx-background-color: #f56151;" +
                " -fx-border: none;"
        );
            DropShadow drop = new DropShadow(50, Color.valueOf("#f56151"));
            drop.setInput(new Glow());
            textField.setEffect(drop);
        
        Rectangle rectangle = new Rectangle();    
        BoxBlur boxBlur = new BoxBlur();
        Text text0 = new Text();
        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(Color.valueOf("#f56151"));
        rectangle.setHeight(45.0);
        rectangle.setLayoutX(167);
        rectangle.setLayoutY(170);
        rectangle.setOpacity(0.15);
        rectangle.setStrokeWidth(0.0);
        rectangle.setWidth(130.0);

        rectangle.setEffect(boxBlur);
        
        text0.setFill(Color.WHITE);
        text0.setLayoutX(200);
        text0.setLayoutY(200);
        text0.setStrokeWidth(0);
        text0.setText("NEXT");
        
            
                list.add("ferrari.png");
                list.add("lamborghini.png");
                list.add("mustang.png");
                list.add("corvette.png");
                list.add("chevy.png");
                
//                GridPane root = new GridPane();
//                root.setAlignment(Pos.CENTER);
                
                Image images[] = new Image[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    images[i] = new Image(getClass().getResource(list.get(i)).toExternalForm());
                }
                
                imageView = new ImageView(images[image]);
                imageView.setCursor(Cursor.CLOSED_HAND);   

                imageView.setFitHeight(300);
                imageView.setFitWidth(400);
                
                
                
            CenterContent information = new CenterContent("INFORMATION");
            information.addContent("This game is a Robot Race animation with betting capabilities.\n"
                    + "Every robot represent a car, that you will choose to bet in the race.");
            CenterContent information1 = new CenterContent("HOW TO PLAY");
            information1.addContent("Select the car you want to use for the race.\n"
                    + "Then enter your name and the betting amout.");
            CenterContent information2 = new CenterContent("COPYRIGHT");
            information2.addContent("2018 © AAA Group. COP 2805c.");

            menu0.getChildren().addAll(btnPlay, btnResume, btnOptions, btnExit);
            menu1.getChildren().addAll(btnBack, information, information1, information2);
            //menu2.getChildren().addAll(text, textField, rectangle, text0);
            menu2.getChildren().addAll(imageView);

            Rectangle bg = new Rectangle(800, 600);
            bg.setFill(Color.GREY);
            bg.setOpacity(0.4);

            getChildren().addAll(bg, menu0);
            
            setOnKeyPressed(e ->{/* Move to the next car RIGHT*/
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
        }
    }
    
    private static class CenterContent extends Pane{
        
        private Text text, text1;
        public CenterContent(String title) {
            
            /* Effect to the title */
            text = new Text(title);
            text.setFont(text.getFont().font(20));
            text.setFill(Color.WHITE);
            Rectangle bg = new Rectangle(280, 30);
            bg.opacityProperty().set(0);
            getChildren().addAll(bg, text);
            text.setTranslateX(0);
            text.setTranslateY(20);
        }
        
        void addContent(String content){
            /* Effect to the content */
            text1 = new Text(content);
            text1.setFont(Font.font(15));
            text1.setFill(Color.WHITE);
            Rectangle bg = new Rectangle(280, 80);
            bg.opacityProperty().set(0);
            getChildren().addAll(bg, text1);
            text1.setTranslateX(0);
            text1.setTranslateY(50);
        }
    }
    private static class MenuButton extends StackPane {
        private Text text;

        public MenuButton(String name) {
            text = new Text(name);
            text.setFont(text.getFont().font(20));
            text.setFill(Color.WHITE);

            Rectangle bg = new Rectangle(250, 30);
            bg.setOpacity(0.6);
            bg.setFill(Color.BLACK);
            bg.setEffect(new GaussianBlur(3.5));

            setAlignment(Pos.CENTER_LEFT);
            setRotate(-0.5);
            getChildren().addAll(bg, text);

            setOnMouseEntered(event -> {
                bg.setTranslateX(10);
                text.setTranslateX(10);
                bg.setFill(Color.WHITE);
                text.setFill(Color.BLACK);
            });

            setOnMouseExited(event -> {
                bg.setTranslateX(0);
                text.setTranslateX(0);
                bg.setFill(Color.BLACK);
                text.setFill(Color.WHITE);
            });

            DropShadow drop = new DropShadow(50, Color.WHITE);
            drop.setInput(new Glow());

            setOnMousePressed(event -> setEffect(drop));
            setOnMouseReleased(event -> setEffect(null));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}