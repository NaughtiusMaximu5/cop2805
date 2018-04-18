package test4;

import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Playground extends Pane {

        private Text text, text1;
        private Text text2;
        private Rectangle rectangle;

        public Playground() {
        }

        public Playground(String title) {

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

        void createText(String content) {
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
        
        void selectPlayer(){
            
            Text text = new Text();
            text.setLayoutX(36.0);
            text.setLayoutY(73.0);
            text.setFill(Color.WHITE);
            text.setStrokeWidth(0.0);
            text.setText("PLAYER ");
//            text.setWrappingWidth(184.415);
            text.setFont(new Font(31.0));
            getChildren().addAll(text);
        }
    }