package project4;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class FXMLDocumentBase extends Pane {

    protected final Text text;
    protected final TextField textField;
    protected final Text text0;
    protected final TextField textField0;
    protected final Text text1;
    protected final Text text2;
    protected final Text text3;
    protected final Rectangle rectangle;
    protected final Text text4;
    protected final Rectangle rectangle0;
    protected final Text text5;

    public FXMLDocumentBase() {

        text = new Text();
        textField = new TextField();
        text0 = new Text();
        textField0 = new TextField();
        text1 = new Text();
        text2 = new Text();
        text3 = new Text();
        rectangle = new Rectangle();
        text4 = new Text();
        rectangle0 = new Rectangle();
        text5 = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(600.0);

        text.setLayoutX(36.0);
        text.setLayoutY(73.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("PLAYER ");
        text.setWrappingWidth(184.41796875);
        text.setFont(new Font(31.0));

        textField.setLayoutX(36.0);
        textField.setLayoutY(88.0);
        textField.setOpacity(0.22);
        textField.setPrefHeight(27.0);
        textField.setPrefWidth(209.0);
        textField.setPromptText("ENTER YOUR NAME");

        text0.setLayoutX(36.0);
        text0.setLayoutY(480.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("ENTER BETTING AMOUNT");
        text0.setWrappingWidth(279.021484375);
        text0.setFont(new Font(16.0));

        textField0.setLayoutX(36.0);
        textField0.setLayoutY(502.0);
        textField0.setOpacity(0.22);
        textField0.setPrefHeight(27.0);
        textField0.setPrefWidth(209.0);
        textField0.setPromptText("Maximun $1000");

        text1.setLayoutX(36.0);
        text1.setLayoutY(152.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("SELECT YOUR CAR");
        text1.setWrappingWidth(279.021484375);
        text1.setFont(new Font(16.0));

        text2.setLayoutX(36.0);
        text2.setLayoutY(184.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Change car with arrow keys. Press Enter to select your car.");
        text2.setWrappingWidth(334.021484375);
        text2.setFont(new Font(11.0));

        text3.setLayoutX(302.0);
        text3.setLayoutY(106.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Next");

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#a2b1bf"));
        rectangle.setHeight(37.0);
        rectangle.setLayoutX(281.0);
        rectangle.setLayoutY(83.0);
        rectangle.setOpacity(0.3);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setStrokeWidth(0.0);
        rectangle.setWidth(69.0);

        text4.setLayoutX(317.0);
        text4.setLayoutY(515.0);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Next");

        rectangle0.setArcHeight(5.0);
        rectangle0.setArcWidth(5.0);
        rectangle0.setFill(javafx.scene.paint.Color.valueOf("#a2b1bf"));
        rectangle0.setHeight(37.0);
        rectangle0.setLayoutX(296.0);
        rectangle0.setLayoutY(492.0);
        rectangle0.setOpacity(0.3);
        rectangle0.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle0.setStrokeWidth(0.0);
        rectangle0.setWidth(69.0);

        text5.setLayoutX(263.0);
        text5.setLayoutY(420.0);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("TOYOTA");
        text5.setFont(new Font(16.0));

        getChildren().add(text);
        getChildren().add(textField);
        getChildren().add(text0);
        getChildren().add(textField0);
        getChildren().add(text1);
        getChildren().add(text2);
        getChildren().add(text3);
        getChildren().add(rectangle);
        getChildren().add(text4);
        getChildren().add(rectangle0);
        getChildren().add(text5);

    }
}
