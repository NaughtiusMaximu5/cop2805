package project4;

import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public abstract class FXMLDocumentBase extends Pane {

    protected final Text text;
    protected final TextField textField;
    protected final Rectangle rectangle;
    protected final BoxBlur boxBlur;
    protected final Text text0;

    public FXMLDocumentBase() {

        text = new Text();
        textField = new TextField();
        rectangle = new Rectangle();
        boxBlur = new BoxBlur();
        text0 = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(600.0);

        text.setLayoutX(58.0);
        text.setLayoutY(83.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Eneter Name");

        textField.setLayoutX(58.0);
        textField.setLayoutY(117.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.DODGERBLUE);
        rectangle.setHeight(45.0);
        rectangle.setLayoutX(332.0);
        rectangle.setLayoutY(330.0);
        rectangle.setOpacity(0.15);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setStrokeWidth(0.0);
        rectangle.setWidth(130.0);

        rectangle.setEffect(boxBlur);

        text0.setLayoutX(380.0);
        text0.setLayoutY(358.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("NEXT");

        getChildren().add(text);
        getChildren().add(textField);
        getChildren().add(rectangle);
        getChildren().add(text0);

    }
}
