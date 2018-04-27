package test4;

import static com.sun.deploy.security.URLClassPathControl.disable;
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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Reflection;
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

    public static int carSelected;
    public static int amountSelected;
    public static String name;
    private int imageOrder = 0;
    private ImageView imageView;
    private List<Cars> lists = new ArrayList<Cars>();
    
    public Menu() {

        TextField nameField = new TextField();
        MediaPlayer mediaPlayer = new MediaPlayer(new Media(getClass().getResource("a.mp3").toString()));
        
        VBox menu0 = new VBox(10);
        VBox menu1 = new VBox(1);
        Pane menu2 = new Pane();

        menu2.setPrefSize(600, 600);

        menu0.setTranslateX(170);
        menu0.setTranslateY(200);

        menu1.setTranslateX(-200);
        menu1.setTranslateY(100);

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

            nameField.requestFocus();
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

        
        String[] cars = {"ferrari", "lamborghini", "mustang", "corvette", "citroen"};

        for (int i = 0; i < cars.length; i++) {
            Cars c = new Cars();
            c.setImagesMenu(cars[i] + ".png");
            c.setCarNames(cars[i].toUpperCase());

            lists.add(i, c);
        }


        Image images[] = new Image[lists.size()];
        for (int i = 0; i < lists.size(); i++) {
            images[i] = new Image(getClass().getResource(lists.get(i).getImagesMenu()).toExternalForm());
        }

        imageView = new ImageView(images[0]);
//            imageView.setCursor(Cursor.CLOSED_HAND);
        imageView.setFitHeight(230);
        imageView.setFitWidth(305);
        imageView.setLayoutX(-50);
        imageView.setLayoutY(200);

        ////////////////////////
        nameField.setEffect(drop);

        Text redInstruction = new Text();

        Text playerLabel = new Text();
        playerLabel.setLayoutX(-50);
        playerLabel.setLayoutY(73.0);
        playerLabel.setFill(Color.WHITE);
        playerLabel.setStrokeWidth(0.0);
        playerLabel.setFont(new Font(16.0));
        playerLabel.setText("ENTER PLAYER NAME");

        nameField.setLayoutX(-50);
        nameField.setLayoutY(88);
        nameField.setOpacity(0.7);
        nameField.setPrefHeight(27);
        nameField.setPrefWidth(209);

        Playground nameNxtBtn = new Playground();
        nameNxtBtn.addButton("Next", 195, 83);

        Text selectCarText = new Text();
        selectCarText.setFill(Color.WHITE);
        selectCarText.setLayoutX(-50);
        selectCarText.setLayoutY(152.0);
        selectCarText.setStrokeWidth(0.0);
        selectCarText.setText("SELECT YOUR CAR");
        selectCarText.setFont(new Font(16.0));

        redInstruction.setFill(Color.YELLOW);
        redInstruction.setLayoutX(-50);
        redInstruction.setLayoutY(184.0);
        redInstruction.setStrokeWidth(0.0);
        redInstruction.setText("Change car with arrow keys. Press Enter to select your car.");
        redInstruction.setFont(new Font(11.0));

        Text bettingAmtLabel = new Text();
        bettingAmtLabel.setLayoutX(-50);
        bettingAmtLabel.setFill(Color.WHITE);
        bettingAmtLabel.setLayoutY(480);
        bettingAmtLabel.setText("ENTER BETTING AMOUNT");
        bettingAmtLabel.setFont(new Font(16));

        TextField bettingAmtField = new TextField() {
            @Override
            public void replaceText(int start, int end, String text) {
                // If the replaced text would end up being invalid, then simply
                // ignore this call!
                if (!text.matches("[a-z]") && !text.matches("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+")) {
                    super.replaceText(start, end, text);
                }
            }

            @Override
            public void replaceSelection(String text) {
                if (!text.matches("[a-z]") && !text.matches("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+")) {
                    super.replaceSelection(text);
                }
            }
        };
        final int LIMIT = 4;
        bettingAmtField.lengthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (newValue.intValue() > oldValue.intValue()) {
                    // Check if the new character is greater than LIMIT
                    if (bettingAmtField.getText().length() >= LIMIT) {

                        // if it's 11th character then just setText to previous
                        // one
                        bettingAmtField.setText(bettingAmtField.getText().substring(0, LIMIT));
                    }
                    try {
                        if (Integer.parseInt(bettingAmtField.getText()) >= 1000) {
                            bettingAmtField.setText("1000");
                        }
                    } catch (Exception e) {
                        bettingAmtField.clear();
                    }
                }
            }

        });

        Rectangle bg = new Rectangle(610, 610);
        bg.setFill(Color.GREY);
        bg.setOpacity(0.4);

        bettingAmtField.setLayoutX(-50);
        bettingAmtField.setLayoutY(502.0);
        bettingAmtField.setOpacity(0.7);
        bettingAmtField.setPrefHeight(27.0);
        bettingAmtField.setPrefWidth(209.0);
        bettingAmtField.setPromptText("Maximun $1000");

        Text carMark = new Text();
        carMark.setLayoutX(127);//263);
        carMark.setLayoutY(420.0);
        carMark.setText("FERRARI");
        carMark.setFill(Color.WHITE);
        carMark.setFont(new Font(18));

        Text dollarSign = new Text();
        dollarSign.setLayoutX(-43);
        dollarSign.setLayoutY(520.0);
        dollarSign.setStrokeWidth(0.0);
        dollarSign.setText("$");
        dollarSign.setVisible(false);

        Playground bAmountNxtBtn = new Playground();
        bAmountNxtBtn.addButton("Next", 195, 492);
       
        Button btnRestart = new Button();
        btnRestart.setLayoutX(60);
        btnRestart.setLayoutY(5);
        btnRestart.setText("Restart");
//        btnRestart.setVisible(false);
        
        
        //Create an event when press the NEXT button for name
        nameNxtBtn.setOnMouseClicked(e0 -> {
            mediaPlayer.play();
            nameField.setEffect(null);
            mediaPlayer.stop();
            selectCarText.setEffect(drop);

//                if(players.isEmpty()){
//                    players.get(0).name = text1.getText();
//                }
            name = nameField.getText();

            nameNxtBtn.setFocusTraversable(false);
            imageView.requestFocus();

            //Create events to select car with keys 
            imageView.setOnKeyPressed(e -> {// Move to the next car RIGHT

                if (e.getCode() == KeyCode.RIGHT) {
                    mediaPlayer.play();
                    imageOrder += 1;
                    if (imageOrder == lists.size()) {
                        imageOrder = 0;
                    }
                    imageView.setImage(images[imageOrder]);
                    carMark.setText(lists.get(imageOrder).getCarNames());
//                    carMark.setText(lists.get(i).imagesMenu);
                    mediaPlayer.seek(Duration.ZERO);
                }

                if (e.getCode() == KeyCode.LEFT) {// Move to the next car LEFT
                    mediaPlayer.play();
                    imageOrder -= 1;
                    //mediaPlayer.stop();
                    if (imageOrder == -1) //if image is index -1 set the last image
                    {
                        imageOrder = lists.size() - 1;
                    }
                    imageView.setImage(images[imageOrder]);
                    carMark.setText(lists.get(imageOrder).getCarNames());
                    mediaPlayer.seek(Duration.ZERO);
                }
                if (e.getCode() == KeyCode.ENTER) {
                    carSelected = imageOrder;
                    mediaPlayer.play();
                    selectCarText.setEffect(drop);
                    imageView.setEffect(drop);
                    bettingAmtField.setEffect(drop);
                    imageView.setFocusTraversable(false);
                    bettingAmtField.requestFocus();
                    dollarSign.setVisible(true);
                    mediaPlayer.seek(Duration.ZERO);
                    bettingAmtField.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);

                    bAmountNxtBtn.setOnMouseClicked(e2 -> {
                        mediaPlayer.play();
                        amountSelected = Integer.parseInt(bettingAmtField.getText());
                        
                            Race race = new Race();
                            menu2.getChildren().add(race);
                           
                            TranslateTransition tt = new TranslateTransition(Duration.seconds(0.25), menu2);
                            tt.setToX(menu2.getTranslateX() - 170);

                            TranslateTransition tt1 = new TranslateTransition(Duration.seconds(0.5), race);
                            tt1.setToX(race.getTranslateX());

                            tt.play();
                            tt1.play();

                            tt.setOnFinished(evt -> {
                                getChildren().removeAll(bg, menu0, menu1);
                                mediaPlayer.stop();
                            });
                        
                        mediaPlayer.seek(Duration.ZERO);

                    });
                }
            });

        });
        

        Playground information = new Playground("INFORMATION");
        information.createText("This game is a Robot Race animation with betting capabilities.\n"
                + "Every robot will represent a car. You will select your car to compete in the race.");
        Playground information1 = new Playground("HOW TO PLAY");
        information1.createText("Select the car you want to use for the race.\n"
                + "Then enter your name and the betting amout.");
        Playground information2 = new Playground("COPYRIGHT");
        information2.createText("2018 © AAA Group. COP 2805c.\n"
                + "Thanks for teaching us how to make this Rodolfo Cruz.");

        menu0.getChildren().addAll(btnPlay, btnOptions, btnExit);
        menu1.getChildren().addAll(btnBack, information, information1, information2);
        menu2.getChildren().addAll(imageView, playerLabel, nameField, bettingAmtLabel, selectCarText,
                redInstruction, bettingAmtField, bAmountNxtBtn, nameNxtBtn, carMark, dollarSign
        );

        // add btnResume when the race is on the way ******************************************************************************************
        getChildren().addAll(bg, menu0);

    }
}
class Cars {

    private String imagesMenu;
    private String carNames;
    
    public Cars() {}

    public void setImagesMenu(String imagesMenu) {
        this.imagesMenu = imagesMenu;
    }

    public void setCarNames(String carNames) {
        this.carNames = carNames;
    }

    public String getImagesMenu() {
        return imagesMenu;
    }

    public String getCarNames() {
        return carNames;
    }
}
