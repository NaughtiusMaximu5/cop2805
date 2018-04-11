package test;

import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;

public abstract class FXMLDocumentBase extends Pane {

    protected final Ellipse ellipse;
    protected final DropShadow dropShadow;

    public FXMLDocumentBase() {

        ellipse = new Ellipse();
        dropShadow = new DropShadow();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(650.0);
        setPrefWidth(650.0);
        setStyle("-fx-background-color: #001229;");

        ellipse.setFill(javafx.scene.paint.Color.valueOf("#003380"));
        ellipse.setLayoutX(533.0);
        ellipse.setLayoutY(581.0);
        ellipse.setRadiusX(566.0);
        ellipse.setRadiusY(302.0);
        ellipse.setRotate(-21.0);
        ellipse.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse.setStrokeWidth(0.0);

        dropShadow.setColor(javafx.scene.paint.Color.rgb(0,51,128));
        dropShadow.setHeight(247.71);
        dropShadow.setRadius(125.17750000000001);
        dropShadow.setSpread(0.77);
        dropShadow.setWidth(255.0);
        ellipse.setEffect(dropShadow);

        getChildren().add(ellipse);

    }
}
