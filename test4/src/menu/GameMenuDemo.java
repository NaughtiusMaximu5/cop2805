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

            Text text = new Text();
            TextField nameField = new TextField();
            Text text0 = new Text();
            TextField bettingAmtField = new TextField();
            Text text1 = new Text();
            Text text2 = new Text();
            
            
            text.setLayoutX(36.0);
            text.setLayoutY(73.0);
            text.setFill(Color.WHITE);
            text.setStrokeWidth(0.0);
            text.setText("PLAYER ");
            text.setWrappingWidth(184.41796875);
            text.setFont(new Font(31.0));

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

            text1.setFill(Color.WHITE);
            text1.setLayoutX(36.0);
            text1.setLayoutY(152.0);
            text1.setStrokeWidth(0.0);
            text1.setText("SELECT YOUR CAR");
            text1.setWrappingWidth(279.021484375);
            text1.setFont(new Font(16.0));

            text2.setFill(Color.RED);
            text2.setLayoutX(36.0);
            text2.setLayoutY(184.0);
            text2.setStrokeWidth(0.0);
            text2.setText("Change car with arrow keys. Press Enter to select your car.");
            text2.setWrappingWidth(334.021484375);
            text2.setFont(new Font(11.0));

            Content nameNxtBtn = new Content();
            nameNxtBtn.addButton("Next", 281, 83);

            Content bAmountNxtBtn = new Content();
            bAmountNxtBtn.addButton("Next", 281, 492);

            //Create an event when press the NEXT button for name
            nameNxtBtn.setOnMouseClicked(event -> {

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
                        DropShadow drop = new DropShadow(50, Color.WHITE);
                        drop.setInput(new Glow());

                        imageView.setEffect(drop);
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

            Content information = new Content("INFORMATION");
            information.addContent("This game is a Robot Race animation with betting capabilities.\n"
                    + "Every robot represent a car, that you will choose to bet in the race.");
            Content information1 = new Content("HOW TO PLAY");
            information1.addContent("Select the car you want to use for the race.\n"
                    + "Then enter your name and the betting amout.");
            Content information2 = new Content("COPYRIGHT");
            information2.addContent("2018 © AAA Group. COP 2805c.");

            menu0.getChildren().addAll(btnPlay, btnResume, btnOptions, btnExit);
            menu1.getChildren().addAll(btnBack, information, information1, information2);
            menu2.getChildren().addAll(imageView, text, nameField, text0, text1,
                    text2, bettingAmtField, bAmountNxtBtn, nameNxtBtn
            );

            Rectangle bg = new Rectangle(800, 600);
            bg.setFill(Color.GREY);
            bg.setOpacity(0.4);

            getChildren().addAll(bg, menu0);

        }
    }

    private static class Content extends Pane {

        private Text text, text1;
        private Text text2;
        private Rectangle rectangle;

        public Content() {
        }

        public Content(String title) {

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

        void addContent(String content) {
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

        void addButton(String title, double x, double y) {

            text2 = new Text(title);
            text2.setLayoutX(x + 21);
            text2.setLayoutY(y + 23);
            text2.setFill(Color.WHITE);

            rectangle = new Rectangle();
            rectangle.setArcHeight(5.0);
            rectangle.setArcWidth(5.0);
            rectangle.setFill(Color.GRAY);
            rectangle.setHeight(37.0);
            rectangle.setLayoutX(x);
            rectangle.setLayoutY(y);
            rectangle.setOpacity(0.5);
            rectangle.setStrokeWidth(0.0);
            rectangle.setWidth(69.0);

            rectangle.setOnMouseEntered(event -> {
                rectangle.setFill(Color.WHITE);
                text2.setFill(Color.BLACK);
            });

            rectangle.setOnMouseExited(event -> {
                rectangle.setFill(Color.BLACK);
                text2.setFill(Color.WHITE);
            });

            DropShadow drop = new DropShadow(50, Color.WHITE);
            drop.setInput(new Glow());

            rectangle.setOnMousePressed(event -> setEffect(drop));
            rectangle.setOnMouseReleased(event -> setEffect(null));

            getChildren().addAll(text2, rectangle);
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
