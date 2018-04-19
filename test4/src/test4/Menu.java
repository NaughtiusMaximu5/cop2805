package test4;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.NodeOrientation;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Menu extends Parent {
        
    private List<String> list = new ArrayList<String>();
    private List<String> carNames = new ArrayList <String>();
    
    int image = 0;
    ImageView imageView;
        
        public Menu() {
            
            final URL resource = getClass().getResource("a.mp3");
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            //mediaPlayer.play();
            
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
                
                mediaPlayer.play();
                TranslateTransition tt = new TranslateTransition(Duration.seconds(0.25), menu0);
                tt.setToX(menu0.getTranslateX() - offset);

                TranslateTransition tt1 = new TranslateTransition(Duration.seconds(0.5), menu2);
                tt1.setToX(menu0.getTranslateX());

                tt.play();
                tt1.play();

                tt.setOnFinished(evt -> {
                    getChildren().remove(menu0);
                    mediaPlayer.stop();
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
            
            
            //Images
            list.add("ferrari.png");        carNames.add("FERRARRI");
            list.add("lamborghini.png");    carNames.add("LAMBORGHINI");
            list.add("mustang.png");        carNames.add("MUSTANG");
            list.add("corvette.png");       carNames.add("CORVETTE");
            list.add("chevy.png");          carNames.add("CHEVY 1958");

            Image images[] = new Image[list.size()];
            for (int i = 0; i < list.size(); i++) {
                images[i] = new Image(getClass().getResource(list.get(i)).toExternalForm());
            }

            imageView = new ImageView(images[image]);
//            imageView.setCursor(Cursor.CLOSED_HAND);
            imageView.setFitHeight(230);
            imageView.setFitWidth(305);
            imageView.setLayoutX(36);
            imageView.setLayoutY(200);

            
            //////////////////////////////MENU 2////////////////////////////////////////////////////////////////////////////???????????????
            
            TextField nameField = new TextField();
            nameField.setEffect(drop);
            
            Text redInstruction = new Text();
            
            Text playerLabel = new Text();
            playerLabel.setLayoutX(36.0);
            playerLabel.setLayoutY(73.0);
            playerLabel.setFill(Color.WHITE);
            playerLabel.setStrokeWidth(0.0);
            playerLabel.setFont(new Font(16.0));
            playerLabel.setText("ENTER PLAYER NAME");

            nameField.setLayoutX(36);
            nameField.setLayoutY(88);
            nameField.setOpacity(0.7);
            nameField.setPrefHeight(27);
            nameField.setPrefWidth(209);
            
            Playground nameNxtBtn = new Playground();
            nameNxtBtn.addButton("Next", 281, 83);
            
            Text selectCarText = new Text();
            selectCarText.setFill(Color.WHITE);
            selectCarText.setLayoutX(36.0);
            selectCarText.setLayoutY(152.0);
            selectCarText.setStrokeWidth(0.0);
            selectCarText.setText("SELECT YOUR CAR");
            selectCarText.setFont(new Font(16.0));

            redInstruction.setFill(Color.RED);
            redInstruction.setLayoutX(36.0);
            redInstruction.setLayoutY(184.0);
            redInstruction.setStrokeWidth(0.0);
            redInstruction.setText("Change car with arrow keys. Press Enter to select your car.");
            redInstruction.setFont(new Font(11.0));
            
            Text bettingAmtLabel = new Text();
            bettingAmtLabel.setLayoutX(36);
            bettingAmtLabel.setFill(Color.WHITE);
            bettingAmtLabel.setLayoutY(480);
            bettingAmtLabel.setText("ENTER BETTING AMOUNT");
            bettingAmtLabel.setFont(new Font(16));
            
            TextField bettingAmtField = new TextField();
            bettingAmtField.setLayoutX(36.0);
            bettingAmtField.setLayoutY(502.0);
            bettingAmtField.setOpacity(0.7);
            bettingAmtField.setPrefHeight(27.0);
            bettingAmtField.setPrefWidth(209.0);
            bettingAmtField.setPromptText("Maximun $1000");  
            
            Text carMark = new Text();
            carMark.setLayoutX(263.0);
            carMark.setLayoutY(420.0);
            carMark.setText("FERRARI");
            carMark.setFill(Color.WHITE);
            carMark.setFont(new Font(18));


            Playground bAmountNxtBtn = new Playground();
            bAmountNxtBtn.addButton("Next", 281, 492);

            //Create an event when press the NEXT button for name
            nameNxtBtn.setOnMouseClicked(event -> {
                mediaPlayer.play();
                nameField.setEffect(null);
                mediaPlayer.stop();
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
                        mediaPlayer.play();
                        image += 1;
                        if (image == list.size()) {
                            image = 0;
                        }
                        imageView.setImage(images[image]);
                        
                        carMark.setText(carNames.get(image));
                    }
                    
                    if (e.getCode() == KeyCode.LEFT) {// Move to the next car LEFT
                        mediaPlayer.play();
                        mediaPlayer.stop();
                        image -= 1;
                        //mediaPlayer.stop();
                        if (image == -1) //if image is index -1 set the last image
                        {
                            image = list.size() - 1;
                        }
                        imageView.setImage(images[image]);
                        carMark.setText(carNames.get(image));
                    }

                    if (e.getCode() == KeyCode.ENTER) {
                        mediaPlayer.play();
                        selectCarText.setEffect(drop);
                        mediaPlayer.stop();
                        imageView.setEffect(drop);
                        bettingAmtField.setEffect(drop);
                        imageView.setFocusTraversable(false);
                        bettingAmtField.requestFocus();
                        bettingAmtField.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                        bettingAmtField.setText("$"); 
//                        Set maximun value to $1000 when the user 
//                        bettingAmtField.textProperty().addListener((observable, oldValue, newValue)-> {
//                            if(newValue.length() > 5) {
//                                bettingAmtField.setText("$ 1000");
//                                bettingAmtField.setStyle("-fx-background-color: red;");
//                                    bettingAmtField.clear();
//                            }
//                        });
                        

                        //bettingAmtField.setTextFormatter(new TextFormatter<>(filter));
                        
                        
                        bAmountNxtBtn.setOnMouseClicked(e1 -> {
                            if (Integer.parseInt(bettingAmtField.getText()) >= 1000) {
                                bettingAmtField.requestFocus();
                            }
                            
                            bettingAmtField.setOnMouseEntered(e2 -> {
                                    bettingAmtField.setStyle("-fx-background-color: white;");
                                    bettingAmtField.setText("Maximun $1000");  
                                    
                                    
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
            menu2.getChildren().addAll(imageView, playerLabel, nameField, bettingAmtLabel, selectCarText,
                    redInstruction, bettingAmtField, bAmountNxtBtn, nameNxtBtn, carMark
            );

            Rectangle bg = new Rectangle(800, 600);
            bg.setFill(Color.GREY);
            bg.setOpacity(0.4);

            getChildren().addAll(bg, menu0);
            
//            UnaryOperator<TextFormatter.Change> filter = new UnaryOperator<TextFormatter.Change>() {
//
//            @Override
//            public TextFormatter.Change apply(TextFormatter.Change t) {
//
//                if (t.isReplaced()) 
//                    if(t.getText().matches("[^0-9]"))
//                        t.setText(t.getControlText().substring(t.getRangeStart(), t.getRangeEnd()));
//                
//
//                if (t.isAdded()) {
//                    if (t.getControlText().contains(".")) {
//                        if (t.getText().matches("[^0-9]")) {
//                            t.setText("");
//                        }
//                    } else if (t.getText().matches("[^0-9.]")) {
//                        t.setText("");
//                    }
//                }
//
//                return t;
//            }
//        };

        }
    }