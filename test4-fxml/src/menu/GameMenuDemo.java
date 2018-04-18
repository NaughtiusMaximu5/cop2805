package menu;

import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
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
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Font;

public class GameMenuDemo extends Application {

    final int NO_OF_PLAYERS = 5;
    private List<String> list = new ArrayList<String>();
    ArrayList<Player> players = new ArrayList<>();
    private Menu gameMenu;

    int image = 0;
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
        gameMenu.setVisible(true);

        root.getChildren().addAll(imgView, gameMenu);

        Scene scene = new Scene(root);
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

        primaryStage.setScene(scene);
        primaryStage.show();

        //scene.onKeyPressedProperty().bind(gameMenu.onKeyPressedProperty());
    }

    private class Player {

        private String name;
        private Image[] image;
        private int bettingAmount;

        public Player() {
        }

//        //Setters
//        public void setName(String name) {this.name = name;}
//        public void setImage(Image[] image) {this.image = image;}
//        public void setBettingAmount(int bettingAmount) {this.bettingAmount = bettingAmount;}
//        //Getters
//        public String getName() {return name;}
//        public Image[] getImage() {return image;}
//        public int getBettingAmount() {return bettingAmount;
    }

    private class Menu extends Parent {

        public Menu() {
            VBox menu0 = new VBox(10);
            VBox menu1 = new VBox(10);
            Pane menu2 = new Pane();
            menu2.setPrefSize(600, 600);
            VBox menu3 = new VBox(10);

            menu0.setTranslateX(100);
            menu0.setTranslateY(200);

            menu1.setTranslateX(100);
            menu1.setTranslateY(200);

//            menu2.setTranslateX(100);
//            menu2.setTranslateY(200);
            menu3.setTranslateX(100);
            menu3.setTranslateY(200);
            
            DropShadow drop = new DropShadow(50, Color.WHITE);
            drop.setInput(new Glow());

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

            list.add("ferrari.png");
            list.add("lamborghini.png");
            list.add("mustang.png");
            list.add("corvette.png");
            list.add("chevy.png");

            Image images[] = new Image[list.size()];
            for (int i = 0; i < list.size(); i++) {
                images[i] = new Image(getClass().getResource(list.get(i)).toExternalForm());
            }

            imageView = new ImageView(images[image]);
            imageView.setCursor(Cursor.CLOSED_HAND);

            imageView.setFitHeight(230);
            imageView.setFitWidth(305);
            imageView.setLayoutX(36.0);
            imageView.setLayoutY(200.0);

            
            TextField nameField = new TextField();
            nameField.setEffect(drop);
            Text text0 = new Text();
            TextField bettingAmtField = new TextField();
            Text selectCarText = new Text();
            Text text2 = new Text();
            
//            Text text = new Text();
//            text.setLayoutX(36.0);
//            text.setLayoutY(73.0);
//            text.setFill(Color.WHITE);
//            text.setStrokeWidth(0.0);
//            text.setText("PLAYER ");
////            text.setWrappingWidth(184.415);
//            text.setFont(new Font(31.0));
            Playground p = new Playground();
            p.selectPlayer();

            nameField.setLayoutX(36);
            nameField.setLayoutY(88);
            nameField.setOpacity(0.7);
            nameField.setPrefHeight(27);
            nameField.setPrefWidth(209);
            nameField.setPromptText("ENTER YOUR NAME");

            text0.setLayoutX(36.0);
            text0.setFill(Color.WHITE);
            text0.setLayoutY(480.0);
            text0.setText("ENTER BETTING AMOUNT");
            text0.setWrappingWidth(279.021484375);
            text0.setFont(new Font(16.0));

            bettingAmtField.setLayoutX(36.0);
            bettingAmtField.setLayoutY(502.0);
            bettingAmtField.setOpacity(0.7);
            bettingAmtField.setPrefHeight(27.0);
            bettingAmtField.setPrefWidth(209.0);
            bettingAmtField.setPromptText("Maximun $1000");

            selectCarText.setFill(Color.WHITE);
            selectCarText.setLayoutX(36.0);
            selectCarText.setLayoutY(152.0);
            selectCarText.setStrokeWidth(0.0);
            selectCarText.setText("SELECT YOUR CAR");
            selectCarText.setWrappingWidth(279.021484375);
            selectCarText.setFont(new Font(16.0));

            text2.setFill(Color.RED);
            text2.setLayoutX(36.0);
            text2.setLayoutY(184.0);
            text2.setStrokeWidth(0.0);
            text2.setText("Change car with arrow keys. Press Enter to select your car.");
            text2.setWrappingWidth(334.021484375);
            text2.setFont(new Font(11.0));

            Playground nameNxtBtn = new Playground();
            nameNxtBtn.addButton("Next", 281, 83);

            Playground bAmountNxtBtn = new Playground();
            bAmountNxtBtn.addButton("Next", 281, 492);

            //Create an event when press the NEXT button for name
            nameNxtBtn.setOnMouseClicked(event -> {
                nameField.setEffect(null);
                selectCarText.setEffect(drop);

//                if(players.isEmpty()){
//                    players.get(0).name = text1.getText();
//                }
                System.out.println(nameField.getText());

                nameNxtBtn.setFocusTraversable(false);
                imageView.requestFocus();

                //Create events to select car with keys 
                imageView.setOnKeyPressed(e -> {// Move to the next car RIGHT
                    
                    if (e.getCode() == KeyCode.RIGHT) {
                        image += 1;
                        if (image == list.size()) {
                            image = 0;
                        }
                        imageView.setImage(images[image]);
                    }

                    if (e.getCode() == KeyCode.LEFT) {// Move to the next car LEFT
                        image -= 1;
                        if (image == -1) //if image is index -1 set the last image
                        {
                            image = list.size() - 1;
                        }
                        imageView.setImage(images[image]);
                    }

                    if (e.getCode() == KeyCode.ENTER) {
                        
                        selectCarText.setEffect(drop);
                        imageView.setEffect(drop);
                        bettingAmtField.setEffect(drop);
                        System.out.println("I pressed enter");
                        imageView.setFocusTraversable(false);
                        bettingAmtField.requestFocus();
                        bettingAmtField.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                        bettingAmtField.textProperty().addListener((observable,oldValue,newValue)-> {
                            if(newValue.length() > 4) bettingAmtField.setText(oldValue);
                        });
                        
                        bAmountNxtBtn.setOnMouseClicked(e1 -> {
                            if (Integer.parseInt(bettingAmtField.getText()) >= 1000) {
                                bettingAmtField.setStyle("-fx-background-color: red;");
                                bettingAmtField.requestFocus();
                            }
                            bettingAmtField.setOnMouseEntered(e2 -> {
                                    bettingAmtField.setStyle("-fx-background-color: white;");
                                    bettingAmtField.clear();
                        });
                        });
                        
//                        bettingAmtField.setOnMouseClicked (e2 -> {
//                                    bettingAmtField.setStyle("-fx-background-color: white;");
//                                    bettingAmtField.clear();
//                        });
                    }
                });

            });

            Playground information = new Playground("INFORMATION");
            information.createText("This game is a Robot Race animation with betting capabilities.\n"
                    + "Every robot represent a car, that you will choose to bet in the race.");
            Playground information1 = new Playground("HOW TO PLAY");
            information1.createText("Select the car you want to use for the race.\n"
                    + "Then enter your name and the betting amout.");
            Playground information2 = new Playground("COPYRIGHT");
            information2.createText("2018 © AAA Group. COP 2805c.");

            menu0.getChildren().addAll(btnPlay, btnResume, btnOptions, btnExit);
            menu1.getChildren().addAll(btnBack, information, information1, information2);
            menu2.getChildren().addAll(imageView/*, text*/, nameField, text0, selectCarText,
                    text2, bettingAmtField, bAmountNxtBtn, nameNxtBtn
            );

            Rectangle bg = new Rectangle(800, 600);
            bg.setFill(Color.GREY);
            bg.setOpacity(0.4);

            getChildren().addAll(bg, menu0);

        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
