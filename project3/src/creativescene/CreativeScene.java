package creativescene;

import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.paint.*;
import javafx.scene.image.*;
import javafx.scene.shape.*;
import javafx.scene.effect.*;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;


public class CreativeScene extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane();
        
        Smoke smoke = new Smoke(220, 423, Color.WHITESMOKE);
        Smoke smoke1 = new Smoke(375, 423, Color.WHITESMOKE);
        
        smoke.setOpacity(3);
        smoke1.setOpacity(3);
        
        Ellipse ellipse = new Ellipse();
        DropShadow dropShadow = new DropShadow();
        Ellipse ellipse0 = new Ellipse();
        DropShadow dropShadow0 = new DropShadow();
        Arc arc = new Arc();
        BoxBlur boxBlur = new BoxBlur();
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle0 = new Rectangle();
        Arc arc0 = new Arc();
        Arc arc1 = new Arc();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();
        Rectangle rectangle4 = new Rectangle();
        Rectangle rectangle5 = new Rectangle();
        Rectangle rectangle6 = new Rectangle();
        Rectangle rectangle7 = new Rectangle();
        Rectangle rectangle8 = new Rectangle();
        Rectangle rectangle9 = new Rectangle();
        Rectangle rectangle10 = new Rectangle();
        Rectangle rectangle11 = new Rectangle();
        Rectangle rectangle12 = new Rectangle();
        Rectangle rectangle13 = new Rectangle();
        Rectangle rectangle14 = new Rectangle();
        Rectangle rectangle15 = new Rectangle();
        Rectangle rectangle16 = new Rectangle();
        Arc arc2 = new Arc();
        Arc arc3 = new Arc();
        Arc arc4 = new Arc();
        Arc arc5 = new Arc();
        Rectangle rectangle17 = new Rectangle();
        Polygon polygon = new Polygon();
        Polygon polygon0 = new Polygon();
        Polygon polygon1 = new Polygon();
        Polygon polygon2 = new Polygon();
        Polygon polygon3 = new Polygon();
        Polygon polygon4 = new Polygon();
        Rectangle rectangle18 = new Rectangle();
        Rectangle rectangle19 = new Rectangle();
        Rectangle rectangle110 = new Rectangle();
        Rectangle rectangle111 = new Rectangle();
        Rectangle rectangle112 = new Rectangle();
        Rectangle  rectangle113 = new Rectangle();
        Polygon polygon5 = new Polygon();
        Polygon polygon6 = new Polygon();
        Line line = new Line();
        Line line0 = new Line();
        Line line1 = new Line();
        Line line2 = new Line();
        ImageView imageView = new ImageView();
        ImageView imageView0 = new ImageView();
        Arc arc6 = new Arc();
        Rectangle rectangle114 = new Rectangle();
        Rectangle rectangle115 = new Rectangle();
        Rectangle rectangle116 = new Rectangle();
        Rectangle  rectangle117 = new Rectangle();
        Rectangle rectangle118 = new Rectangle();
        Rectangle rectangle119 = new Rectangle();
        Rectangle rectangle1110 = new Rectangle();
        Rectangle rectangle1111 = new Rectangle();
        Ellipse ellipse1 = new Ellipse();
        DropShadow dropShadow1 = new DropShadow();
        Ellipse ellipse2 = new Ellipse();
        DropShadow dropShadow2 = new DropShadow();
        Ellipse ellipse3 = new Ellipse();
        DropShadow dropShadow3 = new DropShadow();
        Ellipse ellipse4 = new Ellipse();
        DropShadow dropShadow4 = new DropShadow();
        Ellipse ellipse5 = new Ellipse();
        DropShadow dropShadow5 = new DropShadow();
        Ellipse ellipse6 = new Ellipse();
        DropShadow dropShadow6 = new DropShadow();
        Ellipse ellipse7 = new Ellipse();
        DropShadow dropShadow7 = new DropShadow();
        Ellipse ellipse8 = new Ellipse();
        DropShadow dropShadow8 = new DropShadow();
        Ellipse ellipse9 = new Ellipse();
        DropShadow dropShadow9 = new DropShadow();
        Ellipse ellipse10 = new Ellipse();
        DropShadow dropShadow10 = new DropShadow();
        Ellipse ellipse11 = new Ellipse();
        DropShadow dropShadow11 = new DropShadow();
        Ellipse ellipse12 = new Ellipse();
        DropShadow  dropShadow12 = new DropShadow();
        Ellipse ellipse13 = new Ellipse();
        DropShadow dropShadow13 = new DropShadow();
        Ellipse ellipse14 = new Ellipse();
        DropShadow dropShadow14 = new DropShadow();
        Ellipse ellipse15 = new Ellipse();
        DropShadow dropShadow15 = new DropShadow();
        Ellipse ellipse16 = new Ellipse();
        DropShadow dropShadow16 = new DropShadow();
        Ellipse ellipse17 = new Ellipse();
        DropShadow dropShadow17 = new DropShadow();
        Ellipse ellipse18 = new Ellipse();
        DropShadow dropShadow18 = new DropShadow();
        Ellipse ellipse19 = new Ellipse();
        DropShadow dropShadow19 = new DropShadow();
        Ellipse ellipse110 = new Ellipse();
        DropShadow dropShadow110 = new DropShadow();
        Ellipse ellipse111 = new Ellipse();
        DropShadow dropShadow111 = new DropShadow();
        Ellipse ellipse112 = new Ellipse();
        DropShadow  dropShadow112 = new DropShadow();
        Ellipse ellipse113 = new Ellipse();
        DropShadow dropShadow113 = new DropShadow();
        Ellipse ellipse114 = new Ellipse();
        Ellipse ellipse115 = new Ellipse();
        DropShadow dropShadow114 = new DropShadow();
        Ellipse ellipse116 = new Ellipse();
        Ellipse ellipse117 = new Ellipse();
        Ellipse ellipse118 = new Ellipse();
        Ellipse ellipse119 = new Ellipse();
        Ellipse ellipse1110 = new Ellipse();
        DropShadow dropShadow115 = new DropShadow();
        Ellipse ellipse1111 = new Ellipse();
        Ellipse ellipse1112 = new Ellipse();
        Ellipse ellipse1113 = new Ellipse();
        Ellipse ellipse1114 = new Ellipse();
        Ellipse ellipse1115 = new Ellipse();
        Ellipse ellipse1116 = new Ellipse();
        Ellipse ellipse1117 = new Ellipse();
        Ellipse ellipse1118 = new Ellipse();
        Ellipse ellipse1119 = new Ellipse();
        Ellipse ellipse11110 = new Ellipse();
        Ellipse ellipse11111 = new Ellipse();
        Ellipse ellipse11112 = new Ellipse();
        Ellipse ellipse11113 = new Ellipse();
        Ellipse  ellipse11114 = new Ellipse();
        Ellipse ellipse11115 = new Ellipse();
        Ellipse ellipse11116 = new Ellipse();
        Ellipse ellipse11117 = new Ellipse();
        Ellipse ellipse11118 = new Ellipse();
        Ellipse ellipse11119 = new Ellipse();
        Ellipse ellipse111110 = new Ellipse();
        Ellipse ellipse111111 = new Ellipse();
        Ellipse ellipse111112 = new Ellipse();
        Ellipse ellipse111113 = new Ellipse();
        Ellipse ellipse111114 = new Ellipse();
        Ellipse ellipse111115 = new Ellipse();
        Ellipse ellipse111116 = new Ellipse();
        Ellipse ellipse111117 = new Ellipse();
        Ellipse ellipse111118 = new Ellipse();
        Ellipse ellipse111119 = new Ellipse();
        DropShadow dropShadow116 = new DropShadow();
        Ellipse ellipse1111110 = new Ellipse();
        Ellipse ellipse1111111 = new Ellipse();
        Ellipse ellipse1111112 = new Ellipse();
        Ellipse ellipse1111113 = new Ellipse();
        Ellipse ellipse1111114 = new Ellipse();
        Ellipse ellipse1111115 = new Ellipse();
        Ellipse ellipse1111116 = new Ellipse();
        Ellipse ellipse1111117 = new Ellipse();
        Ellipse ellipse1111118 = new Ellipse();
        Ellipse ellipse1111119 = new Ellipse();
        DropShadow dropShadow117 = new DropShadow();
        Ellipse ellipse11111110 = new Ellipse();
        DropShadow dropShadow118 = new DropShadow();
        Ellipse ellipse11111111 = new Ellipse();
        DropShadow dropShadow119 = new DropShadow();
        Ellipse ellipse11111112 = new Ellipse();
        DropShadow dropShadow1110 = new DropShadow();
        Ellipse ellipse11111113 = new Ellipse();
        DropShadow dropShadow1111 = new DropShadow();
        Polyline polyline = new Polyline();
        Polyline polyline0 = new Polyline();
        Circle circle = new Circle();
        Circle circle0 = new Circle();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        Circle circle5 = new Circle();
        Circle circle6 = new Circle();
        Circle circle7 = new Circle();
        Circle circle8 = new Circle();
        Circle  circle9 = new Circle();
        Circle circle10 = new Circle();
        Circle circle11 = new Circle();
        Circle circle12 = new Circle();
        Circle  circle13 = new Circle();
        Circle circle14 = new Circle();
        Circle circle15 = new Circle();
        Circle circle16 = new Circle();
        Circle circle17 = new Circle();
        Circle circle18 = new Circle();
        Circle circle19 = new Circle();
        Arc arc7 = new Arc();
        Arc arc8 = new Arc();
        Arc arc9 = new Arc();
        Arc arc10 = new Arc();
        Arc arc11 = new Arc();
        Arc arc12 = new Arc();
        Arc arc13 = new Arc();
        Arc arc14 = new Arc();

        pane.setStyle("-fx-background-color: #001229;");

        ellipse.setFill(javafx.scene.paint.Color.valueOf("#003380"));
        ellipse.setLayoutX(533.0);
        ellipse.setLayoutY(581.0);
        ellipse.setRadiusX(566.0);
        ellipse.setRadiusY(302.0);
        ellipse.setRotate(-21.0);
        ellipse.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse.setStrokeWidth(0.0);

        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#003380"));
        dropShadow.setHeight(247.71);
        dropShadow.setRadius(125.17750000000001);
        dropShadow.setSpread(0.77);
        dropShadow.setWidth(255.0);
        ellipse.setEffect(dropShadow);

        ellipse0.setFill(javafx.scene.paint.Color.valueOf("#1e2e42"));
        ellipse0.setLayoutX(168.0);
        ellipse0.setLayoutY(26.0);
        ellipse0.setRadiusX(204.0);
        ellipse0.setRadiusY(47.0);
        ellipse0.setRotate(-12.5);
        ellipse0.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse0.setStrokeWidth(0.0);

        dropShadow0.setColor(javafx.scene.paint.Color.valueOf("#1e2e42"));
        dropShadow0.setHeight(176.55);
        dropShadow0.setRadius(43.6375);
        dropShadow0.setSpread(0.74);
        dropShadow0.setWidth(0.0);
        ellipse0.setEffect(dropShadow0);

        arc.setFill(javafx.scene.paint.Color.valueOf("#00132b"));
        arc.setLayoutX(112.0);
        arc.setLayoutY(76.0);
        arc.setLength(20.0);
        arc.setOpacity(0.56);
        arc.setRadiusX(240.0);
        arc.setRadiusY(209.0);
        arc.setRotate(9.7);
        arc.setStartAngle(26.6);
        arc.setStroke(javafx.scene.paint.Color.BLACK);
        arc.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc.setStrokeWidth(0.0);
        arc.setType(javafx.scene.shape.ArcType.ROUND);

        boxBlur.setWidth(32.32);
        arc.setEffect(boxBlur);

        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#fa812a"));
        rectangle.setHeight(249.0);
        rectangle.setLayoutX(271.0);
        rectangle.setLayoutY(164.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setStrokeWidth(0.0);
        rectangle.setWidth(54.5);

        rectangle0.setArcWidth(5.0);
        rectangle0.setFill(javafx.scene.paint.Color.valueOf("#f56c11"));
        rectangle0.setHeight(249.0);
        rectangle0.setLayoutX(329.0);
        rectangle0.setLayoutY(165.0);
        rectangle0.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle0.setStrokeWidth(0.0);
        rectangle0.setTranslateX(-4.0);
        rectangle0.setTranslateY(-1.0);
        rectangle0.setWidth(54.5);

        arc0.setFill(javafx.scene.paint.Color.valueOf("#ffe9d6"));
        arc0.setLayoutX(322.0);
        arc0.setLayoutY(242.0);
        arc0.setLength(90.0);
        arc0.setRadiusX(32.5);
        arc0.setRadiusY(70.0);
        arc0.setStartAngle(90.0);
        arc0.setStroke(javafx.scene.paint.Color.BLACK);
        arc0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc0.setStrokeWidth(0.0);
        arc0.setTranslateX(3.0);
        arc0.setTranslateY(6.0);
        arc0.setType(javafx.scene.shape.ArcType.ROUND);

        arc1.setFill(javafx.scene.paint.Color.valueOf("#fcd9bd"));
        arc1.setLayoutX(322.0);
        arc1.setLayoutY(242.0);
        arc1.setLength(90.0);
        arc1.setRadiusX(32.5);
        arc1.setRadiusY(72.0);
        arc1.setStroke(javafx.scene.paint.Color.BLACK);
        arc1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc1.setStrokeWidth(0.0);
        arc1.setTranslateX(3.0);
        arc1.setTranslateY(8.0);
        arc1.setType(javafx.scene.shape.ArcType.ROUND);

        rectangle1.setArcWidth(5.0);
        rectangle1.setFill(javafx.scene.paint.Color.valueOf("#ffe9d6"));
        rectangle1.setHeight(186.0);
        rectangle1.setLayoutX(224.0);
        rectangle1.setLayoutY(246.0);
        rectangle1.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1.setStrokeWidth(0.0);
        rectangle1.setTranslateX(1.0);
        rectangle1.setWidth(23.5);

        rectangle2.setArcWidth(5.0);
        rectangle2.setFill(javafx.scene.paint.Color.valueOf("#fcd4b8"));
        rectangle2.setHeight(186.0);
        rectangle2.setLayoutX(249.0);
        rectangle2.setLayoutY(241.0);
        rectangle2.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle2.setStrokeWidth(0.0);
        rectangle2.setTranslateX(-1.0);
        rectangle2.setTranslateY(5.0);
        rectangle2.setWidth(23.5);

        rectangle3.setArcWidth(5.0);
        rectangle3.setFill(javafx.scene.paint.Color.valueOf("#4d2c15"));
        rectangle3.setHeight(12.0);
        rectangle3.setLayoutX(224.0);
        rectangle3.setLayoutY(249.0);
        rectangle3.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle3.setStrokeWidth(0.0);
        rectangle3.setTranslateX(0.5);
        rectangle3.setWidth(24.0);

        rectangle4.setArcWidth(5.0);
        rectangle4.setFill(javafx.scene.paint.Color.valueOf("#4d2c15"));
        rectangle4.setHeight(12.0);
        rectangle4.setLayoutX(224.0);
        rectangle4.setLayoutY(300.0);
        rectangle4.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle4.setStrokeWidth(0.0);
        rectangle4.setWidth(24.0);

        rectangle5.setArcWidth(5.0);
        rectangle5.setFill(javafx.scene.paint.Color.valueOf("#4d2c15"));
        rectangle5.setHeight(12.0);
        rectangle5.setLayoutX(224.0);
        rectangle5.setLayoutY(318.0);
        rectangle5.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle5.setStrokeWidth(0.0);
        rectangle5.setWidth(24.0);

        rectangle6.setArcWidth(5.0);
        rectangle6.setFill(javafx.scene.paint.Color.valueOf("#301d0e"));
        rectangle6.setHeight(12.0);
        rectangle6.setLayoutX(248.0);
        rectangle6.setLayoutY(252.0);
        rectangle6.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle6.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle6.setStrokeWidth(0.0);
        rectangle6.setTranslateY(-3.0);
        rectangle6.setWidth(24.0);

        rectangle7.setArcWidth(5.0);
        rectangle7.setFill(javafx.scene.paint.Color.valueOf("#301d0e"));
        rectangle7.setHeight(12.0);
        rectangle7.setLayoutX(248.0);
        rectangle7.setLayoutY(303.0);
        rectangle7.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle7.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle7.setStrokeWidth(0.0);
        rectangle7.setTranslateY(-3.0);
        rectangle7.setWidth(24.0);

        rectangle8.setArcWidth(5.0);
        rectangle8.setFill(javafx.scene.paint.Color.valueOf("#301d0e"));
        rectangle8.setHeight(12.0);
        rectangle8.setLayoutX(248.0);
        rectangle8.setLayoutY(321.0);
        rectangle8.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle8.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle8.setStrokeWidth(0.0);
        rectangle8.setTranslateY(-3.0);
        rectangle8.setWidth(24.0);

        rectangle9.setArcWidth(5.0);
        rectangle9.setFill(javafx.scene.paint.Color.valueOf("#ffe9d6"));
        rectangle9.setHeight(186.0);
        rectangle9.setLayoutX(375.0);
        rectangle9.setLayoutY(240.0);
        rectangle9.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle9.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle9.setStrokeWidth(0.0);
        rectangle9.setTranslateX(4.0);
        rectangle9.setTranslateY(4.0);
        rectangle9.setWidth(23.5);

        rectangle10.setArcWidth(5.0);
        rectangle10.setFill(javafx.scene.paint.Color.valueOf("#fcd4b8"));
        rectangle10.setHeight(186.0);
        rectangle10.setLayoutX(403.0);
        rectangle10.setLayoutY(244.0);
        rectangle10.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle10.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle10.setStrokeWidth(0.0);
        rectangle10.setTranslateX(-1.0);
        rectangle10.setWidth(23.5);

        rectangle11.setArcWidth(5.0);
        rectangle11.setFill(javafx.scene.paint.Color.valueOf("#4d2c15"));
        rectangle11.setHeight(12.0);
        rectangle11.setLayoutX(379.0);
        rectangle11.setLayoutY(249.0);
        rectangle11.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle11.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle11.setStrokeWidth(0.0);
        rectangle11.setWidth(24.0);

        rectangle12.setArcWidth(5.0);
        rectangle12.setFill(javafx.scene.paint.Color.valueOf("#4d2c15"));
        rectangle12.setHeight(12.0);
        rectangle12.setLayoutX(378.0);
        rectangle12.setLayoutY(300.0);
        rectangle12.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle12.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle12.setStrokeWidth(0.0);
        rectangle12.setWidth(24.0);

        rectangle13.setArcWidth(5.0);
        rectangle13.setFill(javafx.scene.paint.Color.valueOf("#4d2c15"));
        rectangle13.setHeight(12.0);
        rectangle13.setLayoutX(378.0);
        rectangle13.setLayoutY(318.0);
        rectangle13.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle13.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle13.setStrokeWidth(0.0);
        rectangle13.setWidth(24.0);

        rectangle14.setArcWidth(5.0);
        rectangle14.setFill(javafx.scene.paint.Color.valueOf("#301d0e"));
        rectangle14.setHeight(12.0);
        rectangle14.setLayoutX(402.0);
        rectangle14.setLayoutY(251.0);
        rectangle14.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle14.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle14.setStrokeWidth(0.0);
        rectangle14.setTranslateY(-2.0);
        rectangle14.setWidth(24.0);

        rectangle15.setArcWidth(5.0);
        rectangle15.setFill(javafx.scene.paint.Color.valueOf("#301d0e"));
        rectangle15.setHeight(12.0);
        rectangle15.setLayoutX(401.0);
        rectangle15.setLayoutY(302.0);
        rectangle15.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle15.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle15.setStrokeWidth(0.0);
        rectangle15.setTranslateY(-2.0);
        rectangle15.setWidth(24.0);

        rectangle16.setArcWidth(5.0);
        rectangle16.setFill(javafx.scene.paint.Color.valueOf("#301d0e"));
        rectangle16.setHeight(12.0);
        rectangle16.setLayoutX(401.0);
        rectangle16.setLayoutY(320.0);
        rectangle16.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle16.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle16.setStrokeWidth(0.0);
        rectangle16.setTranslateY(-2.0);
        rectangle16.setWidth(24.0);

        arc2.setFill(javafx.scene.paint.Color.valueOf("#f56c11"));
        arc2.setLayoutX(358.0);
        arc2.setLayoutY(419.0);
        arc2.setLength(90.0);
        arc2.setRadiusX(94.0);
        arc2.setRadiusY(102.0);
        arc2.setStroke(javafx.scene.paint.Color.valueOf("#f0c243"));
        arc2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc2.setStrokeWidth(2.0);
        arc2.setTranslateX(-3.0);
        arc2.setTranslateY(1.0);
        arc2.setType(javafx.scene.shape.ArcType.ROUND);

        arc3.setFill(javafx.scene.paint.Color.valueOf("#f56c11"));
        arc3.setLayoutX(294.0);
        arc3.setLayoutY(451.0);
        arc3.setLength(90.0);
        arc3.setRadiusX(94.0);
        arc3.setRadiusY(102.0);
        arc3.setStartAngle(90.0);
        arc3.setStroke(javafx.scene.paint.Color.valueOf("#f0c243"));
        arc3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc3.setStrokeWidth(2.0);
        arc3.setTranslateX(1.0);
        arc3.setTranslateY(-31.0);
        arc3.setType(javafx.scene.shape.ArcType.ROUND);

        arc4.setFill(javafx.scene.paint.Color.valueOf("#f56c11"));
        arc4.setLayoutX(357.0);
        arc4.setLayoutY(307.0);
        arc4.setLength(180.0);
        arc4.setRadiusX(28.0);
        arc4.setRadiusY(48.0);
        arc4.setStartAngle(270.0);
        arc4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc4.setStrokeWidth(2.0);
        arc4.setTranslateX(-1.0);
        arc4.setTranslateY(1.0);
        arc4.setType(javafx.scene.shape.ArcType.ROUND);

        arc5.setFill(javafx.scene.paint.Color.valueOf("#f56c11"));
        arc5.setLayoutX(293.0);
        arc5.setLayoutY(339.0);
        arc5.setLength(180.0);
        arc5.setRadiusX(28.0);
        arc5.setRadiusY(48.0);
        arc5.setStartAngle(90.0);
        arc5.setStrokeLineJoin(javafx.scene.shape.StrokeLineJoin.ROUND);
        arc5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc5.setStrokeWidth(2.0);
        arc5.setTranslateX(1.0);
        arc5.setTranslateY(-31.0);
        arc5.setType(javafx.scene.shape.ArcType.ROUND);

        rectangle17.setArcWidth(5.0);
        rectangle17.setFill(javafx.scene.paint.Color.valueOf("#ffe9d6"));
        rectangle17.setHeight(186.0);
        rectangle17.setLayoutX(293.0);
        rectangle17.setLayoutY(246.0);
        rectangle17.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle17.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle17.setStrokeWidth(0.0);
        rectangle17.setWidth(32.5);

        polygon.setFill(javafx.scene.paint.Color.valueOf("#fa812a"));
        polygon.setLayoutX(238.0);
        polygon.setLayoutY(424.0);
        polygon.setScaleX(2.0);
        polygon.setScaleZ(0.0);
        polygon.setStroke(javafx.scene.paint.Color.BLACK);
        polygon.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        polygon.setStrokeWidth(0.0);
        polygon.setTranslateY(-2.0);

        polygon0.setFill(javafx.scene.paint.Color.valueOf("#fae061"));
        polygon0.setLayoutX(395.0);
        polygon0.setLayoutY(429.0);
        polygon0.setScaleX(3.0);
        polygon0.setScaleY(1.5);
        polygon0.setScaleZ(0.0);
        polygon0.setStroke(javafx.scene.paint.Color.BLACK);
        polygon0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        polygon0.setStrokeWidth(0.0);
        polygon0.setTranslateX(-157.0);
        polygon0.setTranslateY(5.0);

        polygon1.setFill(javafx.scene.paint.Color.valueOf("#fc6c05"));
        polygon1.setLayoutX(233.0);
        polygon1.setLayoutY(488.0);
        polygon1.setScaleX(2.0);
        polygon1.setStroke(javafx.scene.paint.Color.valueOf("#fa6b05"));
        polygon1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        polygon1.setStrokeWidth(0.0);
        polygon1.setTranslateX(5.0);
        polygon1.setTranslateY(-67.0);

        polygon2.setFill(javafx.scene.paint.Color.valueOf("#fa812a"));
        polygon2.setLayoutX(395.0); 
        polygon2.setLayoutY(422.0); 
        polygon2.setScaleX(2.0);
        polygon2.setScaleZ(0.0);
        polygon2.setStroke(javafx.scene.paint.Color.BLACK);
        polygon2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        polygon2.setStrokeWidth(0.0);
        polygon2.setTranslateY(-2.0);

        polygon3.setFill(javafx.scene.paint.Color.valueOf("#fae061"));
        polygon3.setLayoutX(405.0);
        polygon3.setLayoutY(439.0);
        polygon3.setScaleX(3.0);
        polygon3.setScaleY(1.5);
        polygon3.setStroke(javafx.scene.paint.Color.BLACK);
        polygon3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        polygon3.setStrokeWidth(0.0);
        polygon3.setTranslateX(-11.0);
        polygon3.setTranslateY(-7.0);

        polygon4.setFill(javafx.scene.paint.Color.valueOf("#fc6c05"));
        polygon4.setLayoutX(243.0);
        polygon4.setLayoutY(498.0);
        polygon4.setScaleX(2.0);
        polygon4.setStroke(javafx.scene.paint.Color.BLACK);
        polygon4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        polygon4.setStrokeWidth(0.0);
        polygon4.setTranslateX(152.0);
        polygon4.setTranslateY(-79.0);

        rectangle18.setArcWidth(5.0);
        rectangle18.setFill(javafx.scene.paint.Color.valueOf("#ffdd54"));
        rectangle18.setHeight(5.0);
        rectangle18.setLayoutX(298.0);
        rectangle18.setLayoutY(440.0);
        rectangle18.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle18.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle18.setStrokeWidth(0.0);
        rectangle18.setTranslateX(5.0);
        rectangle18.setTranslateY(2.0);
        rectangle18.setWidth(13.0);

        rectangle19.setArcWidth(5.0);
        rectangle19.setFill(javafx.scene.paint.Color.valueOf("#ffdd54"));
        rectangle19.setHeight(5.0);
        rectangle19.setLayoutX(330.0);
        rectangle19.setLayoutY(442.0);
        rectangle19.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle19.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle19.setStrokeWidth(0.0);
        rectangle19.setTranslateX(4.0);
        rectangle19.setWidth(13.0);

        rectangle110.setArcWidth(5.0);
        rectangle110.setFill(javafx.scene.paint.Color.valueOf("#fcd9bd"));
        rectangle110.setHeight(186.0);
        rectangle110.setLayoutX(326.0);
        rectangle110.setLayoutY(246.0);
        rectangle110.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle110.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle110.setStrokeWidth(0.0);
        rectangle110.setTranslateX(-1.0);
        rectangle110.setWidth(32.5);

        rectangle111.setArcWidth(5.0);
        rectangle111.setFill(javafx.scene.paint.Color.valueOf("#fcda4e"));
        rectangle111.setHeight(17.0);
        rectangle111.setLayoutX(293.0);
        rectangle111.setLayoutY(432.0);
        rectangle111.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle111.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle111.setStrokeWidth(0.0);
        rectangle111.setTranslateY(-7.0);
        rectangle111.setWidth(65.0);

        rectangle112.setArcWidth(5.0);
        rectangle112.setHeight(2.0);
        rectangle112.setLayoutX(303.0);
        rectangle112.setLayoutY(446.0);
        rectangle112.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle112.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle112.setStrokeWidth(0.0);
        rectangle112.setWidth(13.0);

        rectangle113.setArcWidth(5.0);
        rectangle113.setHeight(2.0);
        rectangle113.setLayoutX(332.0);
        rectangle113.setLayoutY(448.0);
        rectangle113.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle113.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle113.setStrokeWidth(0.0);
        rectangle113.setTranslateX(2.0);
        rectangle113.setTranslateY(-1.0);
        rectangle113.setWidth(13.0);

        polygon5.setFill(javafx.scene.paint.Color.valueOf("#fae061"));
        polygon5.setLayoutX(298.0);
        polygon5.setLayoutY(441.0);
        polygon5.setScaleY(0.6);
        polygon5.setStroke(javafx.scene.paint.Color.BLACK);
        polygon5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        polygon5.setStrokeWidth(0.0);
        polygon5.setTranslateX(2.0);
        polygon5.setTranslateY(-5.0);

        polygon6.setFill(javafx.scene.paint.Color.valueOf("#fae061"));
        polygon6.setLayoutX(331.0);
        polygon6.setLayoutY(441.0);
        polygon6.setScaleY(0.6);
        polygon6.setStroke(javafx.scene.paint.Color.BLACK);
        polygon6.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        polygon6.setStrokeWidth(0.0);
        polygon6.setTranslateY(-4.0);

        line.setEndX(99.5);
        line.setLayoutX(106.0);
        line.setLayoutY(217.0);
        line.setScaleZ(0.0);
        line.setStartX(68.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#d69267"));
        line.setStrokeWidth(2.0);
        line.setTranslateX(151.0);
        line.setTranslateY(29.0);

        line0.setEndX(97.5);
        line0.setLayoutX(229.0);
        line0.setLayoutY(246.0);
        line0.setStartX(67.0);
        line0.setStroke(javafx.scene.paint.Color.valueOf("#e6c6ae"));
        line0.setStrokeWidth(2.0);
        line0.setTranslateX(-2.5);

        line1.setEndX(97.5);
        line1.setLayoutX(229.0);
        line1.setLayoutY(380.0);
        line1.setStartX(67.0);
        line1.setStroke(javafx.scene.paint.Color.valueOf("#e6c6ae"));
        line1.setStrokeWidth(2.0);
        line1.setTranslateX(-2.0);
        line1.setTranslateY(-14.0);

        line2.setEndX(98.5);
        line2.setLayoutX(258.0);
        line2.setLayoutY(367.0);
        line2.setStartX(68.0);
        line2.setStroke(javafx.scene.paint.Color.valueOf("#d69267"));
        line2.setStrokeWidth(2.0);
        line2.setTranslateY(-1.0);

        imageView.setFitHeight(95.0);
        imageView.setFitWidth(62.5);
        imageView.setLayoutX(297.0);
        imageView.setLayoutY(280.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setTranslateX(-3.0);
        imageView.setImage(new Image(getClass().getResource("nasa.png").toExternalForm()));

        imageView0.setAccessibleText("us_flag");
        imageView0.setFitHeight(20.0);
        imageView0.setFitWidth(26.0);
        imageView0.setLayoutX(282.0);
        imageView0.setLayoutY(376.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setTranslateX(27.0);
        imageView0.setTranslateY(13.0);
        imageView0.setImage(new Image(getClass().getResource("us.png").toExternalForm()));

        arc6.setFill(javafx.scene.paint.Color.valueOf("#262120"));
        arc6.setLayoutX(326.0);
        arc6.setLayoutY(224.0);
        arc6.setLength(180.0);
        arc6.setRadiusX(25.0);
        arc6.setRadiusY(23.0);
        arc6.setStroke(javafx.scene.paint.Color.BLACK);
        arc6.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc6.setTranslateX(-1.0);
        arc6.setTranslateY(1.0);
        arc6.setType(javafx.scene.shape.ArcType.ROUND);

        rectangle114.setArcWidth(5.0);
        rectangle114.setFill(javafx.scene.paint.Color.valueOf("#fce6d4"));
        rectangle114.setHeight(21.0);
        rectangle114.setLayoutX(307.0);
        rectangle114.setLayoutY(204.0);
        rectangle114.setRotate(132.0);
        rectangle114.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle114.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle114.setStrokeWidth(0.0);
        rectangle114.setWidth(5.0);

        rectangle115.setArcWidth(5.0);
        rectangle115.setFill(javafx.scene.paint.Color.valueOf("#fce6d4"));
        rectangle115.setHeight(15.0);
        rectangle115.setLayoutX(301.0);
        rectangle115.setLayoutY(223.0);
        rectangle115.setRotate(132.0);
        rectangle115.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle115.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle115.setStrokeWidth(0.0);
        rectangle115.setTranslateX(-3.0);
        rectangle115.setTranslateY(-4.0);
        rectangle115.setWidth(10.0);

        rectangle116.setArcWidth(5.0);
        rectangle116.setFill(javafx.scene.paint.Color.valueOf("#fcd9bd"));
        rectangle116.setHeight(21.0);
        rectangle116.setLayoutX(317.0);
        rectangle116.setLayoutY(214.0);
        rectangle116.setRotate(-132.0);
        rectangle116.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle116.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle116.setStrokeWidth(0.0);
        rectangle116.setTranslateX(19.0);
        rectangle116.setTranslateY(-9.0);
        rectangle116.setWidth(5.0);

        rectangle117.setArcWidth(5.0);
        rectangle117.setFill(javafx.scene.paint.Color.valueOf("#fcd9bd"));
        rectangle117.setHeight(15.0);
        rectangle117.setLayoutX(311.0);
        rectangle117.setLayoutY(233.0);
        rectangle117.setRotate(-132.0);
        rectangle117.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle117.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle117.setStrokeWidth(0.0);
        rectangle117.setTranslateX(31.0);
        rectangle117.setTranslateY(-13.0);
        rectangle117.setWidth(10.0);

        rectangle118.setArcWidth(5.0);
        rectangle118.setHeight(12.0);
        rectangle118.setLayoutX(225.0);
        rectangle118.setLayoutY(415.0);
        rectangle118.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle118.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle118.setStrokeWidth(0.0);
        rectangle118.setTranslateY(5.0);
        rectangle118.setWidth(47.0);

        rectangle119.setArcWidth(5.0);
        rectangle119.setHeight(12.0);
        rectangle119.setLayoutX(235.0);
        rectangle119.setLayoutY(425.0);
        rectangle119.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle119.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle119.setStrokeWidth(0.0);
        rectangle119.setTranslateX(144.0);
        rectangle119.setTranslateY(-5.0);
        rectangle119.setWidth(47.0);

        rectangle1110.setArcWidth(5.0);
        rectangle1110.setFill(javafx.scene.paint.Color.valueOf("#fff4d1"));
        rectangle1110.setHeight(5.0);
        rectangle1110.setLayoutX(259.0);
        rectangle1110.setLayoutY(172.0);
        rectangle1110.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle1110.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1110.setStrokeWidth(0.0);
        rectangle1110.setTranslateX(12.0);
        rectangle1110.setTranslateY(-4.0);
        rectangle1110.setWidth(54.5);

        rectangle1111.setArcWidth(5.0);
        rectangle1111.setFill(javafx.scene.paint.Color.valueOf("#fce386"));
        rectangle1111.setHeight(5.0);
        rectangle1111.setLayoutX(312.0);
        rectangle1111.setLayoutY(168.0);
        rectangle1111.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle1111.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1111.setStrokeWidth(0.0);
        rectangle1111.setTranslateX(13.0);
        rectangle1111.setWidth(54.5);

        ellipse1.setFill(javafx.scene.paint.Color.valueOf("#385e96"));
        ellipse1.setLayoutX(633.0);
        ellipse1.setLayoutY(442.0);
        ellipse1.setRadiusX(41.0);
        ellipse1.setRadiusY(45.0);
        ellipse1.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1.setStrokeWidth(0.0);

        dropShadow1.setColor(javafx.scene.paint.Color.valueOf("#385e96"));
        dropShadow1.setHeight(72.61);
        dropShadow1.setRadius(41.1175);
        dropShadow1.setSpread(0.38);
        dropShadow1.setWidth(93.86);
        ellipse1.setEffect(dropShadow1);

        ellipse2.setFill(javafx.scene.paint.Color.valueOf("#385e96"));
        ellipse2.setLayoutX(587.0);
        ellipse2.setLayoutY(529.0);
        ellipse2.setRadiusX(90.0);
        ellipse2.setRadiusY(80.0);
        ellipse2.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse2.setStrokeWidth(0.0);

        dropShadow2.setColor(javafx.scene.paint.Color.valueOf("#385e96"));
        dropShadow2.setHeight(169.75);
        dropShadow2.setRadius(92.7225);
        dropShadow2.setSpread(0.54);
        dropShadow2.setWidth(203.14);
        ellipse2.setEffect(dropShadow2);

        ellipse3.setFill(javafx.scene.paint.Color.valueOf("#385e96"));
        ellipse3.setLayoutX(477.0);
        ellipse3.setLayoutY(553.0);
        ellipse3.setRadiusX(51.0);
        ellipse3.setRadiusY(56.0);
        ellipse3.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse3.setStrokeWidth(0.0);

        dropShadow3.setColor(javafx.scene.paint.Color.valueOf("#385e96"));
        dropShadow3.setHeight(151.54);
        dropShadow3.setRadius(93.48249999999999);
        dropShadow3.setSpread(0.6);
        dropShadow3.setWidth(224.39);
        ellipse3.setEffect(dropShadow3);

        ellipse4.setFill(javafx.scene.paint.Color.valueOf("#385e96"));
        ellipse4.setLayoutX(434.0);
        ellipse4.setLayoutY(609.0);
        ellipse4.setRadiusX(47.0);
        ellipse4.setRadiusY(47.0);
        ellipse4.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse4.setStrokeWidth(0.0);

        dropShadow4.setColor(javafx.scene.paint.Color.valueOf("#385e96"));
        dropShadow4.setHeight(148.5);
        dropShadow4.setRadius(79.0625);
        dropShadow4.setSpread(0.47);
        dropShadow4.setWidth(169.75);
        ellipse4.setEffect(dropShadow4);

        ellipse5.setFill(javafx.scene.paint.Color.valueOf("#385e96"));
        ellipse5.setLayoutX(385.0);
        ellipse5.setLayoutY(584.0);
        ellipse5.setRadiusX(34.0);
        ellipse5.setRadiusY(32.0);
        ellipse5.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse5.setStrokeWidth(0.0);

        dropShadow5.setColor(javafx.scene.paint.Color.valueOf("#385e96"));
        dropShadow5.setHeight(106.0);
        dropShadow5.setRadius(51.739999999999995);
        dropShadow5.setSpread(0.08);
        dropShadow5.setWidth(102.96);
        ellipse5.setEffect(dropShadow5);

        ellipse6.setFill(javafx.scene.paint.Color.WHITE);
        ellipse6.setLayoutX(639.0);
        ellipse6.setLayoutY(528.0);
        ellipse6.setRadiusX(41.0);
        ellipse6.setRadiusY(40.0);
        ellipse6.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse6.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse6.setStrokeWidth(0.0);

        dropShadow6.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow6.setHeight(48.32);
        dropShadow6.setRadius(19.1075);
        dropShadow6.setSpread(0.4);
        dropShadow6.setWidth(30.11);
        ellipse6.setEffect(dropShadow6);

        ellipse7.setFill(javafx.scene.paint.Color.WHITE);
        ellipse7.setLayoutX(604.0);
        ellipse7.setLayoutY(565.0);
        ellipse7.setRadiusX(28.0);
        ellipse7.setRadiusY(32.0);
        ellipse7.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse7.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse7.setStrokeWidth(0.0);

        dropShadow7.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow7.setHeight(48.32);
        dropShadow7.setRadius(19.1075);
        dropShadow7.setSpread(0.4);
        dropShadow7.setWidth(30.11);
        ellipse7.setEffect(dropShadow7);

        ellipse8.setFill(javafx.scene.paint.Color.WHITE);
        ellipse8.setLayoutX(571.0);
        ellipse8.setLayoutY(572.0);
        ellipse8.setRadiusX(28.0);
        ellipse8.setRadiusY(32.0);
        ellipse8.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse8.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse8.setStrokeWidth(0.0);

        dropShadow8.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow8.setHeight(48.32);
        dropShadow8.setRadius(19.1075);
        dropShadow8.setSpread(0.4);
        dropShadow8.setWidth(30.11);
        ellipse8.setEffect(dropShadow8);

        ellipse9.setFill(javafx.scene.paint.Color.WHITE);
        ellipse9.setLayoutX(544.0);
        ellipse9.setLayoutY(543.0);
        ellipse9.setRadiusX(30.0);
        ellipse9.setRadiusY(35.0);
        ellipse9.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse9.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse9.setStrokeWidth(0.0);

        dropShadow9.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow9.setHeight(48.32);
        dropShadow9.setRadius(19.1075);
        dropShadow9.setSpread(0.4);
        dropShadow9.setWidth(30.11);
        ellipse9.setEffect(dropShadow9);

        ellipse10.setFill(javafx.scene.paint.Color.WHITE);
        ellipse10.setLayoutX(496.0);
        ellipse10.setLayoutY(581.0);
        ellipse10.setRadiusX(34.0);
        ellipse10.setRadiusY(33.0);
        ellipse10.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse10.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse10.setStrokeWidth(0.0);

        dropShadow10.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow10.setHeight(48.32);
        dropShadow10.setRadius(19.1075);
        dropShadow10.setSpread(0.4);
        dropShadow10.setWidth(30.11);
        ellipse10.setEffect(dropShadow10);

        ellipse11.setFill(javafx.scene.paint.Color.WHITE);
        ellipse11.setLayoutX(448.0);
        ellipse11.setLayoutY(593.0);
        ellipse11.setRadiusX(28.0);
        ellipse11.setRadiusY(32.0);
        ellipse11.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11.setStrokeWidth(0.0);

        dropShadow11.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow11.setHeight(48.32);
        dropShadow11.setRadius(19.1075);
        dropShadow11.setSpread(0.4);
        dropShadow11.setWidth(30.11);
        ellipse11.setEffect(dropShadow11);

        ellipse12.setFill(javafx.scene.paint.Color.WHITE);
        ellipse12.setLayoutX(406.0);
        ellipse12.setLayoutY(603.0);
        ellipse12.setRadiusX(28.0);
        ellipse12.setRadiusY(32.0);
        ellipse12.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse12.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse12.setStrokeWidth(0.0);

        dropShadow12.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow12.setHeight(48.32);
        dropShadow12.setRadius(19.1075);
        dropShadow12.setSpread(0.4);
        dropShadow12.setWidth(30.11);
        ellipse12.setEffect(dropShadow12);

        ellipse13.setFill(javafx.scene.paint.Color.WHITE);
        ellipse13.setLayoutX(368.0);
        ellipse13.setLayoutY(576.0);
        ellipse13.setRadiusX(19.0);
        ellipse13.setRadiusY(26.0);
        ellipse13.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse13.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse13.setStrokeWidth(0.0);

        dropShadow13.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow13.setHeight(48.32);
        dropShadow13.setRadius(19.1075);
        dropShadow13.setSpread(0.4);
        dropShadow13.setWidth(30.11);
        ellipse13.setEffect(dropShadow13);

        ellipse14.setFill(javafx.scene.paint.Color.WHITE);
        ellipse14.setLayoutX(336.0);
        ellipse14.setLayoutY(588.0);
        ellipse14.setRadiusX(28.0);
        ellipse14.setRadiusY(32.0);
        ellipse14.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse14.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse14.setStrokeWidth(0.0);

        dropShadow14.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow14.setHeight(48.32);
        dropShadow14.setRadius(19.1075);
        dropShadow14.setSpread(0.4);
        dropShadow14.setWidth(30.11);
        ellipse14.setEffect(dropShadow14);

        ellipse15.setFill(javafx.scene.paint.Color.WHITE);
        ellipse15.setLayoutX(298.0);
        ellipse15.setLayoutY(587.0);
        ellipse15.setRadiusX(19.0);
        ellipse15.setRadiusY(27.0);
        ellipse15.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse15.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse15.setStrokeWidth(0.0);

        dropShadow15.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow15.setHeight(48.32);
        dropShadow15.setRadius(19.1075);
        dropShadow15.setSpread(0.4);
        dropShadow15.setWidth(30.11);
        ellipse15.setEffect(dropShadow15);

        ellipse16.setFill(javafx.scene.paint.Color.WHITE);
        ellipse16.setLayoutX(15.0);
        ellipse16.setLayoutY(489.0);
        ellipse16.setRadiusX(28.0);
        ellipse16.setRadiusY(32.0);
        ellipse16.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse16.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse16.setStrokeWidth(0.0);

        dropShadow16.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow16.setHeight(48.32);
        dropShadow16.setRadius(19.1075);
        dropShadow16.setSpread(0.4);
        dropShadow16.setWidth(30.11);
        ellipse16.setEffect(dropShadow16);

        ellipse17.setFill(javafx.scene.paint.Color.WHITE);
        ellipse17.setLayoutX(149.0);
        ellipse17.setLayoutY(602.0);
        ellipse17.setRadiusX(28.0);
        ellipse17.setRadiusY(24.0);
        ellipse17.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse17.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse17.setStrokeWidth(0.0);

        dropShadow17.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow17.setHeight(48.32);
        dropShadow17.setRadius(19.1075);
        dropShadow17.setSpread(0.4);
        dropShadow17.setWidth(30.11);
        ellipse17.setEffect(dropShadow17);

        ellipse18.setFill(javafx.scene.paint.Color.WHITE);
        ellipse18.setLayoutX(32.0);
        ellipse18.setLayoutY(540.0);
        ellipse18.setRadiusX(28.0);
        ellipse18.setRadiusY(32.0);
        ellipse18.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse18.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse18.setStrokeWidth(0.0);

        dropShadow18.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow18.setHeight(48.32);
        dropShadow18.setRadius(19.1075);
        dropShadow18.setSpread(0.4);
        dropShadow18.setWidth(30.11);
        ellipse18.setEffect(dropShadow18);

        ellipse19.setFill(javafx.scene.paint.Color.WHITE);
        ellipse19.setLayoutX(62.0);
        ellipse19.setLayoutY(534.0);
        ellipse19.setRadiusX(20.0);
        ellipse19.setRadiusY(23.0);
        ellipse19.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse19.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse19.setStrokeWidth(0.0);

        dropShadow19.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow19.setHeight(48.32);
        dropShadow19.setRadius(19.1075);
        dropShadow19.setSpread(0.4);
        dropShadow19.setWidth(30.11);
        ellipse19.setEffect(dropShadow19);

        ellipse110.setFill(javafx.scene.paint.Color.WHITE);
        ellipse110.setLayoutX(80.0);
        ellipse110.setLayoutY(565.0);
        ellipse110.setRadiusX(20.0);
        ellipse110.setRadiusY(23.0);
        ellipse110.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse110.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse110.setStrokeWidth(0.0);

        dropShadow110.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow110.setHeight(48.32);
        dropShadow110.setRadius(19.1075);
        dropShadow110.setSpread(0.4);
        dropShadow110.setWidth(30.11);
        ellipse110.setEffect(dropShadow110);

        ellipse111.setFill(javafx.scene.paint.Color.WHITE);
        ellipse111.setLayoutX(124.0);
        ellipse111.setLayoutY(570.0);
        ellipse111.setRadiusX(34.0);
        ellipse111.setRadiusY(29.0);
        ellipse111.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse111.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111.setStrokeWidth(0.0);

        dropShadow111.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow111.setHeight(48.32);
        dropShadow111.setRadius(19.1075);
        dropShadow111.setSpread(0.4);
        dropShadow111.setWidth(30.11);
        ellipse111.setEffect(dropShadow111);

        ellipse112.setFill(javafx.scene.paint.Color.WHITE);
        ellipse112.setLayoutX(171.0);
        ellipse112.setLayoutY(565.0);
        ellipse112.setRadiusX(28.0);
        ellipse112.setRadiusY(24.0);
        ellipse112.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse112.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse112.setStrokeWidth(0.0);

        dropShadow112.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow112.setHeight(48.32);
        dropShadow112.setRadius(19.1075);
        dropShadow112.setSpread(0.4);
        dropShadow112.setWidth(30.11);
        ellipse112.setEffect(dropShadow112);

        ellipse113.setFill(javafx.scene.paint.Color.WHITE);
        ellipse113.setLayoutX(223.0);
        ellipse113.setLayoutY(618.0);
        ellipse113.setRadiusX(61.0);
        ellipse113.setRadiusY(66.0);
        ellipse113.setRotate(-153.4);
        ellipse113.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse113.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse113.setStrokeWidth(0.0);

        dropShadow113.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow113.setHeight(48.32);
        dropShadow113.setRadius(19.1075);
        dropShadow113.setSpread(0.4);
        dropShadow113.setWidth(30.11);
        ellipse113.setEffect(dropShadow113);

        ellipse114.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse114.setLayoutX(-6.0);
        ellipse114.setLayoutY(641.0);
        ellipse114.setRadiusX(105.0);
        ellipse114.setRadiusY(90.0);
        ellipse114.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse114.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse114.setStrokeWidth(0.0);

        ellipse115.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse115.setLayoutX(-7.0);
        ellipse115.setLayoutY(536.0);
        ellipse115.setRadiusX(30.0);
        ellipse115.setRadiusY(31.0);
        ellipse115.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse115.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse115.setStrokeWidth(0.0);

        dropShadow114.setColor(javafx.scene.paint.Color.valueOf("#e0dbda"));
        dropShadow114.setHeight(151.54);
        dropShadow114.setRadius(47.9475);
        dropShadow114.setWidth(42.25);
        ellipse115.setEffect(dropShadow114);

        ellipse116.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse116.setLayoutX(99.0);
        ellipse116.setLayoutY(599.0);
        ellipse116.setRadiusX(30.0);
        ellipse116.setRadiusY(31.0);
        ellipse116.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse116.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse116.setStrokeWidth(0.0);

        ellipse117.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse117.setLayoutX(123.0);
        ellipse117.setLayoutY(632.0);
        ellipse117.setRadiusX(30.0);
        ellipse117.setRadiusY(31.0);
        ellipse117.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse117.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse117.setStrokeWidth(0.0);

        ellipse118.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse118.setLayoutX(179.0);
        ellipse118.setLayoutY(655.0);
        ellipse118.setRadiusX(42.0);
        ellipse118.setRadiusY(35.0);
        ellipse118.setRotate(47.1);
        ellipse118.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse118.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse118.setStrokeWidth(0.0);

        ellipse119.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse119.setLayoutX(59.0);
        ellipse119.setLayoutY(559.0);
        ellipse119.setRadiusX(18.0);
        ellipse119.setRadiusY(17.0);
        ellipse119.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse119.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse119.setStrokeWidth(0.0);

        ellipse1110.setFill(javafx.scene.paint.Color.WHITE);
        ellipse1110.setLayoutX(272.0);
        ellipse1110.setLayoutY(609.0);
        ellipse1110.setRadiusX(18.0);
        ellipse1110.setRadiusY(17.0);
        ellipse1110.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1110.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1110.setStrokeWidth(0.0);

        dropShadow115.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow115.setHeight(48.32);
        dropShadow115.setRadius(19.1075);
        dropShadow115.setSpread(0.4);
        dropShadow115.setWidth(30.11);
        ellipse1110.setEffect(dropShadow115);

        ellipse1111.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1111.setLayoutX(249.0);
        ellipse1111.setLayoutY(651.0);
        ellipse1111.setRadiusX(30.0);
        ellipse1111.setRadiusY(31.0);
        ellipse1111.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1111.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111.setStrokeWidth(0.0);

        ellipse1112.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1112.setLayoutX(273.0);
        ellipse1112.setLayoutY(626.0);
        ellipse1112.setRadiusX(20.0);
        ellipse1112.setRadiusY(17.0);
        ellipse1112.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1112.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1112.setStrokeWidth(0.0);

        ellipse1113.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1113.setLayoutX(292.0);
        ellipse1113.setLayoutY(615.0);
        ellipse1113.setRadiusX(18.0);
        ellipse1113.setRadiusY(17.0);
        ellipse1113.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1113.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1113.setStrokeWidth(0.0);

        ellipse1114.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1114.setLayoutX(331.0);
        ellipse1114.setLayoutY(646.0);
        ellipse1114.setRadiusX(20.0);
        ellipse1114.setRadiusY(17.0);
        ellipse1114.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1114.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1114.setStrokeWidth(0.0);

        ellipse1115.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1115.setLayoutX(361.0);
        ellipse1115.setLayoutY(621.0);
        ellipse1115.setRadiusX(20.0);
        ellipse1115.setRadiusY(17.0);
        ellipse1115.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1115.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1115.setStrokeWidth(0.0);

        ellipse1116.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1116.setLayoutX(382.0);
        ellipse1116.setLayoutY(630.0);
        ellipse1116.setRadiusX(20.0);
        ellipse1116.setRadiusY(17.0);
        ellipse1116.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1116.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1116.setStrokeWidth(0.0);

        ellipse1117.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1117.setLayoutX(324.0);
        ellipse1117.setLayoutY(615.0);
        ellipse1117.setRadiusX(20.0);
        ellipse1117.setRadiusY(17.0);
        ellipse1117.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1117.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1117.setStrokeWidth(0.0);

        ellipse1118.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1118.setLayoutX(305.0);
        ellipse1118.setLayoutY(594.0);
        ellipse1118.setRadiusX(14.0);
        ellipse1118.setRadiusY(13.0);
        ellipse1118.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1118.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1118.setStrokeWidth(0.0);

        ellipse1119.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1119.setLayoutX(646.0);
        ellipse1119.setLayoutY(575.0);
        ellipse1119.setRadiusX(20.0);
        ellipse1119.setRadiusY(17.0);
        ellipse1119.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1119.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1119.setStrokeWidth(0.0);

        ellipse11110.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse11110.setLayoutX(543.0);
        ellipse11110.setLayoutY(601.0);
        ellipse11110.setRadiusX(20.0);
        ellipse11110.setRadiusY(17.0);
        ellipse11110.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11110.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11110.setStrokeWidth(0.0);

        ellipse11111.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse11111.setLayoutX(425.0);
        ellipse11111.setLayoutY(634.0);
        ellipse11111.setRadiusX(20.0);
        ellipse11111.setRadiusY(17.0);
        ellipse11111.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11111.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11111.setStrokeWidth(0.0);

        ellipse11112.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse11112.setLayoutX(449.0);
        ellipse11112.setLayoutY(622.0);
        ellipse11112.setRadiusX(18.0);
        ellipse11112.setRadiusY(18.0);
        ellipse11112.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11112.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11112.setStrokeWidth(0.0);

        ellipse11113.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse11113.setLayoutX(392.0);
        ellipse11113.setLayoutY(640.0);
        ellipse11113.setRadiusX(20.0);
        ellipse11113.setRadiusY(17.0);
        ellipse11113.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11113.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11113.setStrokeWidth(0.0);

        ellipse11114.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse11114.setLayoutX(609.0);
        ellipse11114.setLayoutY(628.0);
        ellipse11114.setRadiusX(81.0);
        ellipse11114.setRadiusY(44.0);
        ellipse11114.setRotate(-20.6);
        ellipse11114.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11114.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11114.setStrokeWidth(0.0);

        ellipse11115.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse11115.setLayoutX(514.0);
        ellipse11115.setLayoutY(650.0);
        ellipse11115.setRadiusX(81.0);
        ellipse11115.setRadiusY(44.0);
        ellipse11115.setRotate(-18.4);
        ellipse11115.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11115.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11115.setStrokeWidth(0.0);

        ellipse11116.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse11116.setLayoutX(532.0);
        ellipse11116.setLayoutY(580.0);
        ellipse11116.setRadiusX(14.0);
        ellipse11116.setRadiusY(13.0);
        ellipse11116.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11116.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11116.setStrokeWidth(0.0);

        ellipse11117.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse11117.setLayoutX(316.0);
        ellipse11117.setLayoutY(666.0);
        ellipse11117.setRadiusX(81.0);
        ellipse11117.setRadiusY(44.0);
        ellipse11117.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11117.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11117.setStrokeWidth(0.0);

        ellipse11118.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse11118.setLayoutX(370.0);
        ellipse11118.setLayoutY(606.0);
        ellipse11118.setRadiusX(10.0);
        ellipse11118.setRadiusY(9.0);
        ellipse11118.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11118.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11118.setStrokeWidth(0.0);

        ellipse11119.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse11119.setLayoutX(462.0);
        ellipse11119.setLayoutY(609.0);
        ellipse11119.setRadiusX(10.0);
        ellipse11119.setRadiusY(9.0);
        ellipse11119.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11119.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11119.setStrokeWidth(0.0);

        ellipse111110.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse111110.setLayoutX(476.0);
        ellipse111110.setLayoutY(614.0);
        ellipse111110.setRadiusX(10.0);
        ellipse111110.setRadiusY(9.0);
        ellipse111110.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse111110.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111110.setStrokeWidth(0.0);

        ellipse111111.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse111111.setLayoutX(579.0);
        ellipse111111.setLayoutY(592.0);
        ellipse111111.setRadiusX(15.0);
        ellipse111111.setRadiusY(12.0);
        ellipse111111.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse111111.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111111.setStrokeWidth(0.0);

        ellipse111112.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse111112.setLayoutX(626.0);
        ellipse111112.setLayoutY(569.0);
        ellipse111112.setRadiusX(10.0);
        ellipse111112.setRadiusY(13.0);
        ellipse111112.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse111112.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111112.setStrokeWidth(0.0);

        ellipse111113.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse111113.setLayoutX(178.0);
        ellipse111113.setLayoutY(620.0);
        ellipse111113.setRadiusX(10.0);
        ellipse111113.setRadiusY(9.0);
        ellipse111113.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse111113.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111113.setStrokeWidth(0.0);

        ellipse111114.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse111114.setLayoutX(209.0);
        ellipse111114.setLayoutY(630.0);
        ellipse111114.setRadiusX(10.0);
        ellipse111114.setRadiusY(9.0);
        ellipse111114.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse111114.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111114.setStrokeWidth(0.0);

        ellipse111115.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse111115.setLayoutX(129.0);
        ellipse111115.setLayoutY(596.0);
        ellipse111115.setRadiusX(10.0);
        ellipse111115.setRadiusY(9.0);
        ellipse111115.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse111115.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111115.setStrokeWidth(0.0);

        ellipse111116.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse111116.setLayoutX(69.0);
        ellipse111116.setLayoutY(576.0);
        ellipse111116.setRadiusX(10.0);
        ellipse111116.setRadiusY(9.0);
        ellipse111116.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse111116.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111116.setStrokeWidth(0.0);

        ellipse111117.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse111117.setLayoutX(31.0);
        ellipse111117.setLayoutY(552.0);
        ellipse111117.setRadiusX(10.0);
        ellipse111117.setRadiusY(9.0);
        ellipse111117.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse111117.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111117.setStrokeWidth(0.0);

        ellipse111118.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse111118.setLayoutX(21.0);
        ellipse111118.setLayoutY(550.0);
        ellipse111118.setRadiusX(10.0);
        ellipse111118.setRadiusY(9.0);
        ellipse111118.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse111118.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111118.setStrokeWidth(0.0);

        ellipse111119.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse111119.setLayoutX(154.0);
        ellipse111119.setLayoutY(605.0);
        ellipse111119.setRadiusX(6.0);
        ellipse111119.setRadiusY(8.0);
        ellipse111119.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse111119.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111119.setStrokeWidth(0.0);

        dropShadow116.setColor(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse111119.setEffect(dropShadow116);

        ellipse1111110.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1111110.setLayoutX(431.0);
        ellipse1111110.setLayoutY(647.0);
        ellipse1111110.setRadiusX(27.0);
        ellipse1111110.setRadiusY(14.0);
        ellipse1111110.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1111110.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111110.setStrokeWidth(0.0);

        ellipse1111111.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1111111.setLayoutX(472.0);
        ellipse1111111.setLayoutY(619.0);
        ellipse1111111.setRadiusX(10.0);
        ellipse1111111.setRadiusY(9.0);
        ellipse1111111.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1111111.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111111.setStrokeWidth(0.0);

        ellipse1111112.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1111112.setLayoutX(504.0);
        ellipse1111112.setLayoutY(611.0);
        ellipse1111112.setRadiusX(18.0);
        ellipse1111112.setRadiusY(10.0);
        ellipse1111112.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1111112.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111112.setStrokeWidth(0.0);

        ellipse1111113.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1111113.setLayoutX(516.0);
        ellipse1111113.setLayoutY(600.0);
        ellipse1111113.setRadiusX(10.0);
        ellipse1111113.setRadiusY(9.0);
        ellipse1111113.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1111113.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111113.setStrokeWidth(0.0);

        ellipse1111114.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1111114.setLayoutX(562.0);
        ellipse1111114.setLayoutY(596.0);
        ellipse1111114.setRadiusX(10.0);
        ellipse1111114.setRadiusY(9.0);
        ellipse1111114.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1111114.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111114.setStrokeWidth(0.0);

        ellipse1111115.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1111115.setLayoutX(41.0);
        ellipse1111115.setLayoutY(551.0);
        ellipse1111115.setRadiusX(10.0);
        ellipse1111115.setRadiusY(9.0);
        ellipse1111115.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1111115.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111115.setStrokeWidth(0.0);

        ellipse1111116.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1111116.setLayoutX(612.0);
        ellipse1111116.setLayoutY(581.0);
        ellipse1111116.setRadiusX(14.0);
        ellipse1111116.setRadiusY(9.0);
        ellipse1111116.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1111116.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111116.setStrokeWidth(0.0);

        ellipse1111117.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1111117.setLayoutX(232.0);
        ellipse1111117.setLayoutY(652.0);
        ellipse1111117.setRadiusX(10.0);
        ellipse1111117.setRadiusY(21.0);
        ellipse1111117.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1111117.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111117.setStrokeWidth(0.0);

        ellipse1111118.setFill(javafx.scene.paint.Color.valueOf("#e0dbda"));
        ellipse1111118.setLayoutX(219.0);
        ellipse1111118.setLayoutY(649.0);
        ellipse1111118.setRadiusX(18.0);
        ellipse1111118.setRadiusY(17.0);
        ellipse1111118.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1111118.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111118.setStrokeWidth(0.0);

        ellipse1111119.setFill(javafx.scene.paint.Color.WHITE);
        ellipse1111119.setLayoutX(385.0);
        ellipse1111119.setLayoutY(565.0);
        ellipse1111119.setRadiusX(14.0);
        ellipse1111119.setRadiusY(12.0);
        ellipse1111119.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1111119.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111119.setStrokeWidth(0.0);

        dropShadow117.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow117.setHeight(48.32);
        dropShadow117.setRadius(19.1075);
        dropShadow117.setSpread(0.4);
        dropShadow117.setWidth(30.11);
        ellipse1111119.setEffect(dropShadow117);

        ellipse11111110.setFill(javafx.scene.paint.Color.WHITE);
        ellipse11111110.setLayoutX(230.0);
        ellipse11111110.setLayoutY(573.0);
        ellipse11111110.setRadiusX(24.0);
        ellipse11111110.setRadiusY(36.0);
        ellipse11111110.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11111110.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11111110.setStrokeWidth(0.0);

        dropShadow118.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow118.setHeight(48.32);
        dropShadow118.setRadius(19.1075);
        dropShadow118.setSpread(0.4);
        dropShadow118.setWidth(30.11);
        ellipse11111110.setEffect(dropShadow118);

        ellipse11111111.setFill(javafx.scene.paint.Color.WHITE);
        ellipse11111111.setLayoutX(398.0);
        ellipse11111111.setLayoutY(553.0);
        ellipse11111111.setRadiusX(30.0);
        ellipse11111111.setRadiusY(35.0);
        ellipse11111111.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11111111.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11111111.setStrokeWidth(0.0);

        dropShadow119.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow119.setHeight(48.32);
        dropShadow119.setRadius(19.1075);
        dropShadow119.setSpread(0.4);
        dropShadow119.setWidth(30.11);
        ellipse11111111.setEffect(dropShadow119);

        ellipse11111112.setFill(javafx.scene.paint.Color.WHITE);
        ellipse11111112.setLayoutX(273.0);
        ellipse11111112.setLayoutY(556.0);
        ellipse11111112.setRadiusX(30.0);
        ellipse11111112.setRadiusY(36.0);
        ellipse11111112.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11111112.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11111112.setStrokeWidth(0.0);

        dropShadow1110.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow1110.setHeight(48.32);
        dropShadow1110.setRadius(19.1075);
        dropShadow1110.setSpread(0.4);
        dropShadow1110.setWidth(30.11);
        ellipse11111112.setEffect(dropShadow1110);

        ellipse11111113.setFill(javafx.scene.paint.Color.WHITE);
        ellipse11111113.setLayoutX(439.0);
        ellipse11111113.setLayoutY(563.0);
        ellipse11111113.setRadiusX(30.0);
        ellipse11111113.setRadiusY(35.0);
        ellipse11111113.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse11111113.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11111113.setStrokeWidth(0.0);

        dropShadow1111.setColor(javafx.scene.paint.Color.WHITE);
        dropShadow1111.setHeight(48.32);
        dropShadow1111.setRadius(19.1075);
        dropShadow1111.setSpread(0.4);
        dropShadow1111.setWidth(30.11);
        ellipse11111113.setEffect(dropShadow1111);

        polyline.setFill(javafx.scene.paint.Color.valueOf("#b0b4b8"));
        polyline.setLayoutX(102.0);
        polyline.setLayoutY(73.0);
        polyline.setScaleZ(0.0);
        polyline.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        polyline.setStrokeWidth(0.0);
        polyline.setTranslateX(139.0);
        polyline.setTranslateY(-66.0);

        polyline0.setFill(javafx.scene.paint.Color.valueOf("#c4cad0"));
        polyline0.setLayoutX(112.0);
        polyline0.setLayoutY(83.0);
        polyline0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        polyline0.setStrokeWidth(0.0);
        polyline0.setTranslateX(22.0);
        polyline0.setTranslateY(30.0);

        circle.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle.setLayoutX(124.0);
        circle.setLayoutY(48.0);
        circle.setRadius(8.0);
        circle.setStroke(javafx.scene.paint.Color.BLACK);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle0.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle0.setLayoutX(101.0);
        circle0.setLayoutY(197.0);
        circle0.setRadius(8.0);
        circle0.setStroke(javafx.scene.paint.Color.BLACK);
        circle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle1.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle1.setLayoutX(23.0);
        circle1.setLayoutY(40.0);
        circle1.setRadius(6.0);
        circle1.setStroke(javafx.scene.paint.Color.BLACK);
        circle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle2.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle2.setLayoutX(48.0);
        circle2.setLayoutY(125.0);
        circle2.setRadius(5.0);
        circle2.setStroke(javafx.scene.paint.Color.BLACK);
        circle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle3.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle3.setLayoutX(506.0);
        circle3.setLayoutY(64.0);
        circle3.setRadius(8.0);
        circle3.setStroke(javafx.scene.paint.Color.BLACK);
        circle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle4.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle4.setLayoutX(632.0);
        circle4.setLayoutY(128.0);
        circle4.setRadius(8.0);
        circle4.setStroke(javafx.scene.paint.Color.BLACK);
        circle4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle5.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle5.setLayoutX(248.0);
        circle5.setLayoutY(144.0);
        circle5.setRadius(8.0);
        circle5.setStroke(javafx.scene.paint.Color.BLACK);
        circle5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle6.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle6.setLayoutX(414.0);
        circle6.setLayoutY(56.0);
        circle6.setRadius(5.0);
        circle6.setStroke(javafx.scene.paint.Color.BLACK);
        circle6.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle7.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle7.setLayoutX(42.0);
        circle7.setLayoutY(228.0);
        circle7.setRadius(4.0);
        circle7.setStroke(javafx.scene.paint.Color.BLACK);
        circle7.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle8.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle8.setLayoutX(46.0);
        circle8.setLayoutY(356.0);
        circle8.setRadius(4.0);
        circle8.setStroke(javafx.scene.paint.Color.BLACK);
        circle8.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle9.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle9.setLayoutX(121.0);
        circle9.setLayoutY(308.0);
        circle9.setRadius(4.0);
        circle9.setStroke(javafx.scene.paint.Color.BLACK);
        circle9.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle10.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle10.setLayoutX(139.0);
        circle10.setLayoutY(291.0);
        circle10.setRadius(4.0);
        circle10.setStroke(javafx.scene.paint.Color.BLACK);
        circle10.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle11.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle11.setLayoutX(199.0);
        circle11.setLayoutY(197.0);
        circle11.setRadius(4.0);
        circle11.setStroke(javafx.scene.paint.Color.BLACK);
        circle11.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle12.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle12.setLayoutX(154.0);
        circle12.setLayoutY(152.0);
        circle12.setRadius(4.0);
        circle12.setStroke(javafx.scene.paint.Color.BLACK);
        circle12.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle13.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle13.setLayoutX(428.0);
        circle13.setLayoutY(136.0);
        circle13.setRadius(4.0);
        circle13.setStroke(javafx.scene.paint.Color.BLACK);
        circle13.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle14.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle14.setLayoutX(449.0);
        circle14.setLayoutY(152.0);
        circle14.setRadius(4.0);
        circle14.setStroke(javafx.scene.paint.Color.BLACK);
        circle14.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle15.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle15.setLayoutX(532.0);
        circle15.setLayoutY(93.0);
        circle15.setRadius(4.0);
        circle15.setStroke(javafx.scene.paint.Color.BLACK);
        circle15.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle16.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle16.setLayoutX(604.0);
        circle16.setLayoutY(34.0);
        circle16.setRadius(4.0);
        circle16.setStroke(javafx.scene.paint.Color.BLACK);
        circle16.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle17.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle17.setLayoutX(543.0);
        circle17.setLayoutY(148.0);
        circle17.setRadius(4.0);
        circle17.setStroke(javafx.scene.paint.Color.BLACK);
        circle17.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle18.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle18.setLayoutX(453.0);
        circle18.setLayoutY(22.0);
        circle18.setRadius(4.0);
        circle18.setStroke(javafx.scene.paint.Color.BLACK);
        circle18.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle19.setFill(javafx.scene.paint.Color.valueOf("#6b7685"));
        circle19.setLayoutX(170.0);
        circle19.setLayoutY(22.0);
        circle19.setRadius(4.0);
        circle19.setStroke(javafx.scene.paint.Color.BLACK);
        circle19.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        arc7.setFill(javafx.scene.paint.Color.valueOf("#ffe9d6"));
        arc7.setLayoutX(248.0);
        arc7.setLayoutY(247.0);
        arc7.setLength(90.0);
        arc7.setRadiusX(23.5);
        arc7.setRadiusY(58.0);
        arc7.setScaleZ(0.0);
        arc7.setStartAngle(90.0);
        arc7.setStroke(javafx.scene.paint.Color.BLACK);
        arc7.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc7.setStrokeWidth(0.0);
        arc7.setTranslateX(1.0);
        arc7.setTranslateY(-1.0);
        arc7.setType(javafx.scene.shape.ArcType.ROUND);

        arc8.setFill(javafx.scene.paint.Color.valueOf("#fcd4b8"));
        arc8.setLayoutX(248.0);
        arc8.setLayoutY(247.0);
        arc8.setLength(90.0);
        arc8.setRadiusX(23.5);
        arc8.setRadiusY(58.0);
        arc8.setStroke(javafx.scene.paint.Color.BLACK);
        arc8.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc8.setStrokeWidth(0.0);
        arc8.setTranslateY(-1.0);
        arc8.setType(javafx.scene.shape.ArcType.ROUND);

        arc9.setFill(javafx.scene.paint.Color.valueOf("#ffe9d6"));
        arc9.setLayoutX(258.0);
        arc9.setLayoutY(257.0);
        arc9.setLength(90.0);
        arc9.setRadiusX(23.5);
        arc9.setRadiusY(58.0);
        arc9.setStartAngle(90.0);
        arc9.setStroke(javafx.scene.paint.Color.BLACK);
        arc9.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc9.setStrokeWidth(0.0);
        arc9.setTranslateX(144.0);
        arc9.setTranslateY(-11.0);
        arc9.setType(javafx.scene.shape.ArcType.ROUND);

        arc10.setFill(javafx.scene.paint.Color.valueOf("#fcd4b8"));
        arc10.setLayoutX(258.0);
        arc10.setLayoutY(257.0);
        arc10.setLength(90.0);
        arc10.setRadiusX(23.5);
        arc10.setRadiusY(58.0);
        arc10.setStroke(javafx.scene.paint.Color.BLACK);
        arc10.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc10.setStrokeWidth(0.0);
        arc10.setTranslateX(144.0);
        arc10.setTranslateY(-11.0);
        arc10.setType(javafx.scene.shape.ArcType.ROUND);

        arc11.setFill(javafx.scene.paint.Color.valueOf("#fcd4b8"));
        arc11.setLayoutX(99.0);
        arc11.setLayoutY(143.0);
        arc11.setLength(90.0);
        arc11.setRadiusX(21.0);
        arc11.setRadiusY(21.0);
        arc11.setStroke(javafx.scene.paint.Color.BLACK);
        arc11.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc11.setStrokeWidth(0.0);
        arc11.setTranslateX(226.0);
        arc11.setTranslateY(92.0);
        arc11.setType(javafx.scene.shape.ArcType.ROUND);

        arc12.setFill(javafx.scene.paint.Color.valueOf("#ffe9d6"));
        arc12.setLayoutX(99.0);
        arc12.setLayoutY(143.0);
        arc12.setLength(90.0);
        arc12.setRadiusX(21.0);
        arc12.setRadiusY(21.0);
        arc12.setStartAngle(90.0);
        arc12.setStroke(javafx.scene.paint.Color.BLACK);
        arc12.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc12.setStrokeWidth(0.0);
        arc12.setTranslateX(226.0);
        arc12.setTranslateY(92.0);
        arc12.setType(javafx.scene.shape.ArcType.ROUND);

        arc13.setFill(javafx.scene.paint.Color.valueOf("#752f00"));
        arc13.setLayoutX(325.0);
        arc13.setLayoutY(170.0);
        arc13.setLength(90.0);
        arc13.setRadiusX(55.0);
        arc13.setRadiusY(89.0);
        arc13.setStroke(javafx.scene.paint.Color.BLACK);
        arc13.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc13.setStrokeWidth(0.0);
        arc13.setType(javafx.scene.shape.ArcType.ROUND);

        /* Defining color of the reflection in the top of the rocket*/
        Stop[] stops = new Stop[] { 
            new Stop(0, Color.valueOf("#ab7216")),
            new Stop(1, Color.valueOf("#752f00"))
        };
        
        /* Create Linear Gradient with the stops of the aboves colors*/
        LinearGradient lg = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
        
        /* Add properties for arc14 (Top of Rocket) */
        arc14.setFill(lg);
        arc14.setLayoutX(326.0);
        arc14.setLayoutY(170.0);
        arc14.setLength(90.0);
        arc14.setRadiusX(55.0);
        arc14.setRadiusY(89.0);
        arc14.setStartAngle(90.0);
        arc14.setStrokeWidth(40.0);
        arc14.setType(javafx.scene.shape.ArcType.ROUND);
        
        /* ADD ALL ELEMEMTS TO THE PANE */
        pane.getChildren().add(ellipse);
        pane.getChildren().add(ellipse0);
        pane.getChildren().add(arc);
        pane.getChildren().add(rectangle);
        pane.getChildren().add(rectangle0);
        pane.getChildren().add(arc0);
        pane.getChildren().add(arc1);
        pane.getChildren().add(rectangle1);
        pane.getChildren().add(rectangle2);
        pane.getChildren().add(rectangle3);
        pane.getChildren().add(rectangle4);
        pane.getChildren().add(rectangle5);
        pane.getChildren().add(rectangle6);
        pane.getChildren().add(rectangle7);
        pane.getChildren().add(rectangle8);
        pane.getChildren().add(rectangle9);
        pane.getChildren().add(rectangle10);
        pane.getChildren().add(rectangle11);
        pane.getChildren().add(rectangle12);
        pane.getChildren().add(rectangle13);
        pane.getChildren().add(rectangle14);
        pane.getChildren().add(rectangle15);
        pane.getChildren().add(rectangle16);
        pane.getChildren().add(arc2);
        pane.getChildren().add(arc3);
        pane.getChildren().add(arc4);
        pane.getChildren().add(arc5);
        pane.getChildren().add(rectangle17);
        polygon.getPoints().addAll(
                1.0, 10.0, 18.0, 10.0,
                21.0, 20.0, -2.0, 20.0
        );
        pane.getChildren().add(polygon);
        polygon0.getPoints().addAll(
                0.0, 10.0, 19.0, 10.0,
                22.0, 20.0, -3.0, 20.0
        );
        pane.getChildren().add(polygon0);
        polygon1.getPoints().addAll(
                1.0, 15.0, 18.0, 15.0,
                21.0, 20.0, -2.0, 20.0
        );
        pane.getChildren().add(polygon1);
        polygon2.getPoints().addAll(
                1.0, 10.0, 18.0, 10.0,
                21.0, 20.0, -2.0, 20.0
        );
        pane.getChildren().add(polygon2);
        polygon3.getPoints().addAll(
                0.0, 10.0, 19.0, 10.0,
                22.0, 20.0, -3.0, 20.0
        );
        pane.getChildren().add(polygon3);
        polygon4.getPoints().addAll(
                1.0, 15.0, 18.0, 15.0,
                21.0, 20.0, -2.0, 20.0
        );
        pane.getChildren().add(polygon4);
        pane.getChildren().add(rectangle18);
        pane.getChildren().add(rectangle19);
        pane.getChildren().add(rectangle110);
        pane.getChildren().add(rectangle111);
        pane.getChildren().add(rectangle112);
        pane.getChildren().add(rectangle113);
        polygon5.getPoints().addAll(
                0.0, 10.0, 19.0, 10.0,
                22.0, 20.0, -3.0, 20.0
        );
        pane.getChildren().add(polygon5);
        polygon6.getPoints().addAll(
                0.0, 10.0, 19.0, 10.0,
                22.0, 20.0, -3.0, 20.0
        );
        pane.getChildren().add(polygon6);
        pane.getChildren().add(line);
        pane.getChildren().add(line0);
        pane.getChildren().add(line1);
        pane.getChildren().add(line2);
        pane.getChildren().add(imageView);
        pane.getChildren().add(imageView0);
        pane.getChildren().add(arc6);
        pane.getChildren().add(rectangle114);
        pane.getChildren().add(rectangle115);
        pane.getChildren().add(rectangle116);
        pane.getChildren().add(rectangle117);
        pane.getChildren().add(rectangle118);
        pane.getChildren().add(rectangle119);
        pane.getChildren().add(rectangle1110);
        pane.getChildren().add(rectangle1111);
        pane.getChildren().add(ellipse1);
        pane.getChildren().add(ellipse2);
        pane.getChildren().add(ellipse3);
        pane.getChildren().add(ellipse4);
        pane.getChildren().add(ellipse5);
        pane.getChildren().add(ellipse6);
        pane.getChildren().add(ellipse7);
        pane.getChildren().add(ellipse8);
        pane.getChildren().add(ellipse9);
        pane.getChildren().add(ellipse10);
        pane.getChildren().add(ellipse11);
        pane.getChildren().add(ellipse12);
        pane.getChildren().add(ellipse13);
        pane.getChildren().add(ellipse14);
        pane.getChildren().add(ellipse15);
        pane.getChildren().add(ellipse16);
        pane.getChildren().add(ellipse17);
        pane.getChildren().add(ellipse18);
        pane.getChildren().add(ellipse19);
        pane.getChildren().add(ellipse110);
        pane.getChildren().add(ellipse111);
        pane.getChildren().add(ellipse112);
        pane.getChildren().add(ellipse113);
        pane.getChildren().add(ellipse114);
        pane.getChildren().add(ellipse115);
        pane.getChildren().add(ellipse116);
        pane.getChildren().add(ellipse117);
        pane.getChildren().add(ellipse118);
        pane.getChildren().add(ellipse119);
        pane.getChildren().add(ellipse1110);
        pane.getChildren().add(ellipse1111);
        pane.getChildren().add(ellipse1112);
        pane.getChildren().add(ellipse1113);
        pane.getChildren().add(ellipse1114);
        pane.getChildren().add(ellipse1115);
        pane.getChildren().add(ellipse1116);
        pane.getChildren().add(ellipse1117);
        pane.getChildren().add(ellipse1118);
        pane.getChildren().add(ellipse1119);
        pane.getChildren().add(ellipse11110);
        pane.getChildren().add(ellipse11111);
        pane.getChildren().add(ellipse11112);
        pane.getChildren().add(ellipse11113);
        pane.getChildren().add(ellipse11114);
        pane.getChildren().add(ellipse11115);
        pane.getChildren().add(ellipse11116);
        pane.getChildren().add(ellipse11117);
        pane.getChildren().add(ellipse11118);
        pane.getChildren().add(ellipse11119);
        pane.getChildren().add(ellipse111110);
        pane.getChildren().add(ellipse111111);
        pane.getChildren().add(ellipse111112);
        pane.getChildren().add(ellipse111113);
        pane.getChildren().add(ellipse111114);
        pane.getChildren().add(ellipse111115);
        pane.getChildren().add(ellipse111116);
        pane.getChildren().add(ellipse111117);
        pane.getChildren().add(ellipse111118);
        pane.getChildren().add(ellipse111119);
        pane.getChildren().add(ellipse1111110);
        pane.getChildren().add(ellipse1111111);
        pane.getChildren().add(ellipse1111112);
        pane.getChildren().add(ellipse1111113);
        pane.getChildren().add(ellipse1111114);
        pane.getChildren().add(ellipse1111115);
        pane.getChildren().add(ellipse1111116);
        pane.getChildren().add(ellipse1111117);
        pane.getChildren().add(ellipse1111118);
        pane.getChildren().add(ellipse1111119);
        pane.getChildren().add(ellipse11111110);
        pane.getChildren().add(ellipse11111111);
        pane.getChildren().add(ellipse11111112);
        pane.getChildren().add(ellipse11111113);
        
    //Polylines are the starts (type of cross)
        polyline.getPoints().addAll(
                7.5, 0.0, 10.0, 0.0,
                10.0, 5.0, 17.5, 5.0,
                17.5, 7.5, 10.0, 7.5, 
                10.0, 15.0, 7.5, 15.0,
                7.5, 7.5, 0.0, 7.5,
                0.0, 5.0, 7.5, 5.0,
                7.5, 00.0
        );
        pane.getChildren().add(polyline);
        polyline0.getPoints().addAll(
                7.5, 0.0, 10.0, 0.0,
                10.0, 5.0, 17.5, 5.0,
                17.5, 7.5, 10.0, 7.5, 
                10.0, 15.0, 7.5, 15.0,
                7.5, 7.5, 0.0, 7.5,
                0.0, 5.0, 7.5, 5.0,
                7.5, 00.0
        );
        pane.getChildren().add(polyline0);
        pane.getChildren().add(circle);
        pane.getChildren().add(circle0);
        pane.getChildren().add(circle1);
        pane.getChildren().add(circle2);
        pane.getChildren().add(circle3);
        pane.getChildren().add(circle4);
        pane.getChildren().add(circle5);
        pane.getChildren().add(circle6);
        pane.getChildren().add(circle7);
        pane.getChildren().add(circle8);
        pane.getChildren().add(circle9);
        pane.getChildren().add(circle10);
        pane.getChildren().add(circle11);
        pane.getChildren().add(circle12);
        pane.getChildren().add(circle13);
        pane.getChildren().add(circle14);
        pane.getChildren().add(circle15);
        pane.getChildren().add(circle16);
        pane.getChildren().add(circle17);
        pane.getChildren().add(circle18);
        pane.getChildren().add(circle19);
        pane.getChildren().add(arc7);
        pane.getChildren().add(arc8);
        pane.getChildren().add(arc9);
        pane.getChildren().add(arc10);
        pane.getChildren().add(arc11);
        pane.getChildren().add(arc12);
        pane.getChildren().add(arc13);
        pane.getChildren().add(arc14);
        pane.getChildren().add(smoke);
        pane.getChildren().add(smoke1);

        /* Display the scene */
        Scene scene = new Scene(pane, 650, 650);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        AnimationTimer gameloop = new AnimationTimer() {
            @Override
            public void handle(long arg0) {
                smoke.update();
                smoke1.update();
            }
        };
        gameloop.start();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
}

class Smoke extends Group{
    WritableImage baseImg;
    ImageView[] lifeCycle;

    int FRAMES = 50;
    int FALLING_FRAMES = 32;
    int width = 60;
    int height = 60;
    double radius;
    Point2D midPoint;

    double xThrow = 0 ; 
    int xWobble = 1;
    double yThrow = 5;
    int yWobble = 10;

    Random random;
    int throttle;
    int throttleMax;

    public Smoke(int xLoc, int yLoc, Color color){   
        throttleMax = 4; // 4 ==> 15 fps animation rate
        random = new Random();

        midPoint = new Point2D(width/2, height/2);
        radius = width/2 - 1;
        lifeCycle = new ImageView[50];

        double topAlpha = 0.5; 
        double fadeAmount = topAlpha/FALLING_FRAMES;
        double fadeInAmount = 
                topAlpha/((FRAMES - FALLING_FRAMES) * 3);

        double pixR = color.getRed();
        double pixG = color.getGreen();
        double pixB = color.getBlue();
        double pixA = topAlpha;

        // Create the base image. 
        // The color is constant, the alpha is a
        // computed radial gradient.
        baseImg = new WritableImage(width, height); 
        PixelWriter baseRaster = baseImg.getPixelWriter();
        double distance;
        double gradientFactor; // between 0 and 1

        for (int jj = 0; jj < height; jj++){
            for (int kk = 0; kk < width; kk++){
                distance = midPoint.distance(jj, kk);
                if (distance > radius) gradientFactor = 0.0;
                else gradientFactor = (radius - distance) / radius;

                pixA =  topAlpha * gradientFactor;
                baseRaster.setColor(jj, kk, new Color(pixR, pixG, pixB, pixA));
            }   
        }   

        for (int i = 0; i < FRAMES; ++i){
            lifeCycle[i]= new ImageView();
            lifeCycle[i].setImage(baseImg);
            lifeCycle[i].setX(xLoc);
            lifeCycle[i].setY(yLoc);
            this.getChildren().add(lifeCycle[i]);
        }

        // alpha will rise and fall over course of lifeCycle
        for (int i = 0; i < FALLING_FRAMES; ++i){
            lifeCycle[i].setOpacity((i + 1) * fadeAmount);
        }

        for (int i = FALLING_FRAMES; i < FRAMES; i++){
            lifeCycle[i].setOpacity(
                    topAlpha - (i - FALLING_FRAMES + 1) * fadeInAmount);
        }
    }

    public void update() { 
        // Slow the animation by skipping cycles. 60 fps is overkill.
        if (throttle -- > 0) return;
        else throttle = throttleMax;

        // Propagate location of particles, while adding 
        //     'throw' and 'wobble'
        // lifeCycle[n] is stationary (origin of stream, visually)
        int n = FRAMES - 1; 
        for (int i = 0; i < n; i++) {
            lifeCycle[i].setX( lifeCycle[i+1].getX() 
                + xThrow + random.nextInt(xWobble));
            lifeCycle[i].setY( lifeCycle[i+1].getY() 
                + yThrow + random.nextInt(yWobble)); 
        }       
    }
}