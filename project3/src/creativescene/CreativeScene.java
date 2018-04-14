package creativescene;

import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.shape.*;
import javafx.scene.effect.*;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;

public class CreativeScene extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        /* Set color of the pain */
        pane.setStyle("-fx-background-color: #001229;");

        Smoke smoke = new Smoke(220, 423, Color.WHITESMOKE);
        Smoke smoke1 = new Smoke(375, 423, Color.WHITESMOKE);

        smoke.setOpacity(3);
        smoke1.setOpacity(3);

        /* Create Ellipse that represents the planet */
        Ellipse planet = new Ellipse();
        planet.setFill(Color.valueOf("#003380"));
        planet.setLayoutX(533.0);
        planet.setLayoutY(581.0);
        planet.setRadiusX(566.0);
        planet.setRadiusY(302.0);
        planet.setRotate(-21.0);
        planet.setStrokeWidth(0.0);

        /* Add shadow effect to the ellipse created*/
        DropShadow planetShadow = new DropShadow();
        planetShadow.setColor(Color.valueOf("#003380"));
        planetShadow.setHeight(247.71);
        planetShadow.setRadius(125.17750000000001);
        planetShadow.setSpread(0.77);
        planetShadow.setWidth(255.0);
        planet.setEffect(planetShadow);

        /* Create ellipse that represent a the top-left galaxy */
        Ellipse galaxy = new Ellipse();
        galaxy.setFill(Color.valueOf("#1e2e42"));
        galaxy.setLayoutX(168.0);
        galaxy.setLayoutY(26.0);
        galaxy.setRadiusX(204.0);
        galaxy.setRadiusY(47.0);
        galaxy.setRotate(-12.5);
        galaxy.setStrokeWidth(0.0);

        /* Add shadow effet to the galaxy */
        DropShadow galaxyShadow = new DropShadow();
        galaxyShadow.setColor(Color.valueOf("#1e2e42"));
        galaxyShadow.setHeight(176.55);
        galaxyShadow.setRadius(43.6375);
        galaxyShadow.setSpread(0.74);
        galaxyShadow.setWidth(0.0);
        galaxy.setEffect(galaxyShadow);

        /* Create an arc that represents the black hole of the galaxy */
        Arc blackHole = new Arc();
        blackHole.setFill(Color.valueOf("#00132b"));
        blackHole.setLayoutX(112.0);
        blackHole.setLayoutY(76.0);
        blackHole.setLength(20.0);
        blackHole.setOpacity(0.56);
        blackHole.setRadiusX(240.0);
        blackHole.setRadiusY(209.0);
        blackHole.setRotate(9.7);
        blackHole.setStartAngle(26.6);
        blackHole.setStrokeWidth(0.0);
        blackHole.setType(javafx.scene.shape.ArcType.ROUND);

        /* Add some blur effect to the black hole */
        BoxBlur blackHoleBlur = new BoxBlur();
        blackHoleBlur.setWidth(32.32);
        blackHole.setEffect(blackHoleBlur);

        /* Create a rectangle that represent the body
        of the Rocket. The Rocket is divided it into two
        rectangles to be able to change colors */
        Rectangle rocketBodyLeft = new Rectangle();
        rocketBodyLeft.setArcWidth(5.0);
        rocketBodyLeft.setFill(Color.valueOf("#fa812a"));
        rocketBodyLeft.setHeight(249.0);
        rocketBodyLeft.setLayoutX(271.0);
        rocketBodyLeft.setLayoutY(164.0);
        rocketBodyLeft.setStrokeWidth(0.0);
        rocketBodyLeft.setWidth(54.5);

        Rectangle rocketBodyRight = new Rectangle();
        rocketBodyRight.setArcWidth(5.0);
        rocketBodyRight.setFill(Color.valueOf("#f56c11"));
        rocketBodyRight.setHeight(249.0);
        rocketBodyRight.setLayoutX(329.0);
        rocketBodyRight.setLayoutY(165.0);
        rocketBodyRight.setStrokeWidth(0.0);
        rocketBodyRight.setTranslateX(-4.0);
        rocketBodyRight.setTranslateY(-1.0);
        rocketBodyRight.setWidth(54.5);

        /* Right part of the Rocket Nose Cone (TOP)*/
        Arc rightNoseCone = new Arc();
        rightNoseCone.setFill(Color.valueOf("#752f00"));
        rightNoseCone.setLayoutX(325.0);
        rightNoseCone.setLayoutY(170.0);
        rightNoseCone.setLength(90.0);
        rightNoseCone.setRadiusX(55.0);
        rightNoseCone.setRadiusY(89.0);
        rightNoseCone.setStrokeWidth(0.0);
        rightNoseCone.setType(ArcType.ROUND);

        /* Defining color of the Linear Gradient in the top of the rocket*/
        Stop[] stops = new Stop[]{
            new Stop(0, Color.valueOf("#ab7216")),
            new Stop(1, Color.valueOf("#752f00"))
        };

        /* Create Linear Gradient with the stops of the aboves colors*/
        LinearGradient lg = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

        /* Left Part of the Rocket Nose Cone (TOP)*/
        Arc leftNoseCone = new Arc();
        leftNoseCone.setFill(lg);
        leftNoseCone.setLayoutX(326.0);
        leftNoseCone.setLayoutY(170.0);
        leftNoseCone.setLength(90.0);
        leftNoseCone.setRadiusX(55.0);
        leftNoseCone.setRadiusY(89.0);
        leftNoseCone.setStartAngle(90.0);
        leftNoseCone.setStrokeWidth(40.0);
        leftNoseCone.setType(ArcType.ROUND);

        /* Create two arcs that represent the inside Nose Cone */
        Arc insideLeftNoseCone = new Arc();
        insideLeftNoseCone.setFill(Color.valueOf("#ffe9d6"));
        insideLeftNoseCone.setLayoutX(322.0);
        insideLeftNoseCone.setLayoutY(242.0);
        insideLeftNoseCone.setLength(90.0);
        insideLeftNoseCone.setRadiusX(32.5);
        insideLeftNoseCone.setRadiusY(70.0);
        insideLeftNoseCone.setStartAngle(90.0);
        insideLeftNoseCone.setStrokeWidth(0.0);
        insideLeftNoseCone.setTranslateX(3.0);
        insideLeftNoseCone.setTranslateY(6.0);
        insideLeftNoseCone.setType(ArcType.ROUND);

        Arc insideRightNoseCone = new Arc();
        insideRightNoseCone.setFill(Color.valueOf("#fcd9bd"));
        insideRightNoseCone.setLayoutX(322.0);
        insideRightNoseCone.setLayoutY(242.0);
        insideRightNoseCone.setLength(90.0);
        insideRightNoseCone.setRadiusX(32.5);
        insideRightNoseCone.setRadiusY(72.0);
        insideRightNoseCone.setStrokeWidth(0.0);
        insideRightNoseCone.setTranslateX(3.0);
        insideRightNoseCone.setTranslateY(8.0);
        insideRightNoseCone.setType(ArcType.ROUND);

        /* Rocket Turbine Left Side */
        Rectangle turbineLL = new Rectangle();
        turbineLL.setArcWidth(5.0);
        turbineLL.setFill(Color.valueOf("#ffe9d6"));
        turbineLL.setHeight(186.0);
        turbineLL.setLayoutX(224.0);
        turbineLL.setLayoutY(246.0);
        turbineLL.setStrokeWidth(0.0);
        turbineLL.setTranslateX(1.0);
        turbineLL.setWidth(23.5);

        Rectangle turbineLR = new Rectangle();
        turbineLR.setArcWidth(5.0);
        turbineLR.setFill(Color.valueOf("#fcd4b8"));
        turbineLR.setHeight(186.0);
        turbineLR.setLayoutX(249.0);
        turbineLR.setLayoutY(241.0);
        turbineLR.setStrokeWidth(0.0);
        turbineLR.setTranslateX(-1.0);
        turbineLR.setTranslateY(5.0);
        turbineLR.setWidth(23.5);
        
        /* Rocket Turbine Right Side */
        Rectangle turbineRL = new Rectangle();
        turbineRL.setArcWidth(5.0);
        turbineRL.setFill(Color.valueOf("#ffe9d6"));
        turbineRL.setHeight(186.0);
        turbineRL.setLayoutX(375.0);
        turbineRL.setLayoutY(240.0);
        turbineRL.setStrokeWidth(0.0);
        turbineRL.setTranslateX(4.0);
        turbineRL.setTranslateY(4.0);
        turbineRL.setWidth(23.5);
        
        Rectangle turbineRR = new Rectangle();
        turbineRR.setArcWidth(5.0);
        turbineRR.setFill(Color.valueOf("#fcd4b8"));
        turbineRR.setHeight(186.0);
        turbineRR.setLayoutX(403.0);
        turbineRR.setLayoutY(244.0);
        turbineRR.setStrokeWidth(0.0);
        turbineRR.setTranslateX(-1.0);
        turbineRR.setWidth(23.5);
        
        /* Rectangles that represent the lines in the left turbine*/
        Rectangle topLL = new Rectangle();
        topLL.setArcWidth(5.0);
        topLL.setFill(Color.valueOf("#4d2c15"));
        topLL.setHeight(12.0);
        topLL.setLayoutX(224.0);
        topLL.setLayoutY(249.0);
        topLL.setStrokeWidth(0.0);
        topLL.setTranslateX(0.5);
        topLL.setWidth(24.0);

        Rectangle topLR = new Rectangle();
        topLR.setArcWidth(5.0);
        topLR.setFill(Color.valueOf("#301d0e"));
        topLR.setHeight(12.0);
        topLR.setLayoutX(248.0);
        topLR.setLayoutY(252.0);
        topLR.setStrokeWidth(0.0);
        topLR.setTranslateY(-3.0);
        topLR.setWidth(24.0);

        Rectangle middleLL = new Rectangle();
        middleLL.setArcWidth(5.0);
        middleLL.setFill(Color.valueOf("#4d2c15"));
        middleLL.setHeight(12.0);
        middleLL.setLayoutX(224.0);
        middleLL.setLayoutY(300.0);
        middleLL.setStrokeWidth(0.0);
        middleLL.setWidth(24.0);

        Rectangle middleLR = new Rectangle();
        middleLR.setArcWidth(5.0);
        middleLR.setFill(Color.valueOf("#301d0e"));
        middleLR.setHeight(12.0);
        middleLR.setLayoutX(248.0);
        middleLR.setLayoutY(303.0);
        middleLR.setStrokeWidth(0.0);
        middleLR.setTranslateY(-3.0);
        middleLR.setWidth(24.0);

        Rectangle bottomLR = new Rectangle();
        bottomLR.setArcWidth(5.0);
        bottomLR.setFill(Color.valueOf("#4d2c15"));
        bottomLR.setHeight(12.0);
        bottomLR.setLayoutX(224.0);
        bottomLR.setLayoutY(318.0);
        bottomLR.setStrokeWidth(0.0);
        bottomLR.setWidth(24.0);

        Rectangle buttonLL = new Rectangle();
        buttonLL.setArcWidth(5.0);
        buttonLL.setFill(Color.valueOf("#301d0e"));
        buttonLL.setHeight(12.0);
        buttonLL.setLayoutX(248.0);
        buttonLL.setLayoutY(321.0);
        buttonLL.setStrokeWidth(0.0);
        buttonLL.setTranslateY(-3.0);
        buttonLL.setWidth(24.0);

        /* Rectangles that represent the lines in the right turbine*/
        Rectangle topRL = new Rectangle();
        topRL.setArcWidth(5.0);
        topRL.setFill(Color.valueOf("#4d2c15"));
        topRL.setHeight(12.0);
        topRL.setLayoutX(379.0);
        topRL.setLayoutY(249.0);
        topRL.setStrokeWidth(0.0);
        topRL.setWidth(24.0);
        
        Rectangle topRR = new Rectangle();
        topRR.setArcWidth(5.0);
        topRR.setFill(Color.valueOf("#301d0e"));
        topRR.setHeight(12.0);
        topRR.setLayoutX(402.0);
        topRR.setLayoutY(251.0);
        topRR.setStrokeWidth(0.0);
        topRR.setTranslateY(-2.0);
        topRR.setWidth(24.0);
        
        Rectangle middleRL = new Rectangle();
        middleRL.setArcWidth(5.0);
        middleRL.setFill(Color.valueOf("#4d2c15"));
        middleRL.setHeight(12.0);
        middleRL.setLayoutX(378.0);
        middleRL.setLayoutY(300.0);
        middleRL.setStrokeWidth(0.0);
        middleRL.setWidth(24.0);
        
        Rectangle middleRR = new Rectangle();
        middleRR.setArcWidth(5.0);
        middleRR.setFill(Color.valueOf("#301d0e"));
        middleRR.setHeight(12.0);
        middleRR.setLayoutX(401.0);
        middleRR.setLayoutY(302.0);
        middleRR.setStrokeWidth(0.0);
        middleRR.setTranslateY(-2.0);
        middleRR.setWidth(24.0);
        
        Rectangle bottomRL = new Rectangle();
        bottomRL.setArcWidth(5.0);
        bottomRL.setFill(Color.valueOf("#4d2c15"));
        bottomRL.setHeight(12.0);
        bottomRL.setLayoutX(378.0);
        bottomRL.setLayoutY(318.0);
        bottomRL.setStrokeWidth(0.0);
        bottomRL.setWidth(24.0);
        
        Rectangle bottomRR = new Rectangle();
        bottomRR.setArcWidth(5.0);
        bottomRR.setFill(Color.valueOf("#301d0e"));
        bottomRR.setHeight(12.0);
        bottomRR.setLayoutX(401.0);
        bottomRR.setLayoutY(320.0);
        bottomRR.setStrokeWidth(0.0);
        bottomRR.setTranslateY(-2.0);
        bottomRR.setWidth(24.0);
        
        /* Create arcs that represent the fings of the rocket */
     
        Arc rightFing = new Arc(); //RIGHT SIDE (Bigest)
        rightFing.setFill(Color.valueOf("#f56c11"));
        rightFing.setLayoutX(358.0);
        rightFing.setLayoutY(419.0);
        rightFing.setLength(90.0);
        rightFing.setRadiusX(94.0);
        rightFing.setRadiusY(102.0);
        rightFing.setStroke(Color.valueOf("#f0c243"));
        rightFing.setStrokeType(StrokeType.INSIDE);
        rightFing.setStrokeWidth(2.0);
        rightFing.setTranslateX(-3.0);
        rightFing.setTranslateY(1.0);
        rightFing.setType(ArcType.ROUND);
        
        Arc leftFing = new Arc();//LEFT SIDE (Bigest)
        leftFing.setFill(Color.valueOf("#f56c11"));
        leftFing.setLayoutX(294.0);
        leftFing.setLayoutY(451.0);
        leftFing.setLength(90.0);
        leftFing.setRadiusX(94.0);
        leftFing.setRadiusY(102.0);
        leftFing.setStartAngle(90.0);
        leftFing.setStroke(Color.valueOf("#f0c243"));
        leftFing.setStrokeType(StrokeType.INSIDE);
        leftFing.setStrokeWidth(2.0);
        leftFing.setTranslateX(1.0);
        leftFing.setTranslateY(-31.0);
        leftFing.setType(ArcType.ROUND);
        
        Arc rightFingSmall = new Arc(); //RIGHT SIDE (Smallest)
        rightFingSmall.setFill(Color.valueOf("#f56c11"));
        rightFingSmall.setLayoutX(357.0);
        rightFingSmall.setLayoutY(307.0);
        rightFingSmall.setLength(180.0);
        rightFingSmall.setRadiusX(28.0);
        rightFingSmall.setRadiusY(48.0);
        rightFingSmall.setStartAngle(270.0);
        rightFingSmall.setStrokeType(StrokeType.INSIDE);
        rightFingSmall.setStrokeWidth(2.0);
        rightFingSmall.setTranslateX(-1.0);
        rightFingSmall.setTranslateY(1.0);
        rightFingSmall.setType(ArcType.ROUND);

        Arc leftFingSmall = new Arc(); //LEFT SIDE (Smallest)
        leftFingSmall.setFill(Color.valueOf("#f56c11"));
        leftFingSmall.setLayoutX(293.0);
        leftFingSmall.setLayoutY(339.0);
        leftFingSmall.setLength(180.0);
        leftFingSmall.setRadiusX(28.0);
        leftFingSmall.setRadiusY(48.0);
        leftFingSmall.setStartAngle(90.0);
        leftFingSmall.setStrokeType(StrokeType.INSIDE);
        leftFingSmall.setStrokeWidth(2.0);
        leftFingSmall.setTranslateX(1.0);
        leftFingSmall.setTranslateY(-31.0);
        leftFingSmall.setType(ArcType.ROUND);
        
        /* Rectangle that represents the inside body of the rocket */
        Rectangle leftPartInside = new Rectangle();
        leftPartInside.setArcWidth(5.0);
        leftPartInside.setFill(Color.valueOf("#ffe9d6"));
        leftPartInside.setHeight(186.0);
        leftPartInside.setLayoutX(293.0);
        leftPartInside.setLayoutY(246.0);
        leftPartInside.setStrokeWidth(0.0);
        leftPartInside.setWidth(32.5);  
        
        /* Polygons that represent the motors of the Rocket */
        Polygon leftMotorSmall = new Polygon();
        leftMotorSmall.setFill(Color.valueOf("#fa812a"));
        leftMotorSmall.setLayoutX(238.0);
        leftMotorSmall.setLayoutY(424.0);
        leftMotorSmall.setScaleX(2.0);
        leftMotorSmall.setStrokeWidth(0.0);
        leftMotorSmall.setTranslateY(-2.0);
        
        Polygon leftMotorBig = new Polygon();
        leftMotorBig.setFill(Color.valueOf("#fae061"));
        leftMotorBig.setLayoutX(395.0);
        leftMotorBig.setLayoutY(429.0);
        leftMotorBig.setScaleX(3.0);
        leftMotorBig.setScaleY(1.5);
        leftMotorBig.setStrokeWidth(0.0);
        leftMotorBig.setTranslateX(-157.0);
        leftMotorBig.setTranslateY(5.0);
        
        Polygon leftMotorShadow = new Polygon();
        leftMotorShadow.setFill(Color.valueOf("#fc6c05"));
        leftMotorShadow.setLayoutX(233.0);
        leftMotorShadow.setLayoutY(488.0);
        leftMotorShadow.setScaleX(2.0);
        leftMotorShadow.setStroke(Color.valueOf("#fa6b05"));
        leftMotorShadow.setStrokeType(StrokeType.INSIDE);
        leftMotorShadow.setStrokeWidth(0.0);
        leftMotorShadow.setTranslateX(5.0);
        leftMotorShadow.setTranslateY(-67.0);
        
        Polygon rightMotorSmall = new Polygon();
        rightMotorSmall.setFill(Color.valueOf("#fa812a"));
        rightMotorSmall.setLayoutX(395.0);
        rightMotorSmall.setLayoutY(422.0);
        rightMotorSmall.setScaleX(2.0);
        rightMotorSmall.setStrokeWidth(0.0);
        rightMotorSmall.setTranslateY(-2.0);
        
        Polygon rightMotorBig = new Polygon();
        rightMotorBig.setFill(Color.valueOf("#fae061"));
        rightMotorBig.setLayoutX(405.0);
        rightMotorBig.setLayoutY(439.0);
        rightMotorBig.setScaleX(3.0);
        rightMotorBig.setScaleY(1.5);
        rightMotorBig.setStrokeWidth(0.0);
        rightMotorBig.setTranslateX(-11.0);
        rightMotorBig.setTranslateY(-7.0);
        
        Polygon rightMotorShadow = new Polygon();
        rightMotorShadow.setFill(Color.valueOf("#fc6c05"));
        rightMotorShadow.setLayoutX(243.0);
        rightMotorShadow.setLayoutY(498.0);
        rightMotorShadow.setScaleX(2.0);
        rightMotorShadow.setStrokeWidth(0.0);
        rightMotorShadow.setTranslateX(152.0);
        rightMotorShadow.setTranslateY(-79.0);
        
        /* Square that represents the inside motors */
        Rectangle toInsideMotorL = new Rectangle();
        toInsideMotorL.setArcWidth(5.0);
        toInsideMotorL.setFill(Color.valueOf("#ffdd54"));
        toInsideMotorL.setHeight(5.0);
        toInsideMotorL.setLayoutX(298.0);
        toInsideMotorL.setLayoutY(440.0);
        toInsideMotorL.setStrokeWidth(0.0);
        toInsideMotorL.setTranslateX(5.0);
        toInsideMotorL.setTranslateY(2.0);
        toInsideMotorL.setWidth(13.0);
        
        Rectangle toInsideMotorR = new Rectangle();
        toInsideMotorR.setArcWidth(5.0);
        toInsideMotorR.setFill(Color.valueOf("#ffdd54"));
        toInsideMotorR.setHeight(5.0);
        toInsideMotorR.setLayoutX(330.0);
        toInsideMotorR.setLayoutY(442.0);
        toInsideMotorR.setStrokeWidth(0.0);
        toInsideMotorR.setTranslateX(4.0);
        toInsideMotorR.setWidth(13.0);
        
        /* INSIDE BODY OF THE ROCKET */
        Rectangle rightInsideBody = new Rectangle();
        rightInsideBody.setArcWidth(5.0);
        rightInsideBody.setFill(Color.valueOf("#fcd9bd"));
        rightInsideBody.setHeight(186.0);
        rightInsideBody.setLayoutX(326.0);
        rightInsideBody.setLayoutY(246.0);
        rightInsideBody.setStrokeWidth(0.0);
        rightInsideBody.setTranslateX(-1.0);
        rightInsideBody.setWidth(32.5);
        
        Rectangle toInsideMotorSmallL = new Rectangle();
        toInsideMotorSmallL.setArcWidth(5.0);
        toInsideMotorSmallL.setHeight(2.0);
        toInsideMotorSmallL.setLayoutX(303.0);
        toInsideMotorSmallL.setLayoutY(446.0);
        toInsideMotorSmallL.setStrokeWidth(0.0);
        toInsideMotorSmallL.setWidth(13.0);
        
        Rectangle toInsideMotorSmallR = new Rectangle();
        toInsideMotorSmallR.setArcWidth(5.0);
        toInsideMotorSmallR.setHeight(2.0);
        toInsideMotorSmallR.setLayoutX(332.0);
        toInsideMotorSmallR.setLayoutY(448.0);
        toInsideMotorSmallR.setStrokeWidth(0.0);
        toInsideMotorSmallR.setTranslateX(2.0);
        toInsideMotorSmallR.setTranslateY(-1.0);
        toInsideMotorSmallR.setWidth(13.0);
        
        /* Yellow rectangle at the bottom of the inside body */
        Rectangle yellowBottom = new Rectangle();
        yellowBottom.setArcWidth(5.0);
        yellowBottom.setFill(Color.valueOf("#fcda4e"));
        yellowBottom.setHeight(17.0);
        yellowBottom.setLayoutX(293.0);
        yellowBottom.setLayoutY(432.0);
        yellowBottom.setStrokeWidth(0.0);
        yellowBottom.setTranslateY(-7.0);
        yellowBottom.setWidth(65.0);
        
        /* Yellow motors in the inside body part of the rocket */
        Polygon leftSmallMotor = new Polygon();
        leftSmallMotor.setFill(Color.valueOf("#fae061"));
        leftSmallMotor.setLayoutX(298.0);
        leftSmallMotor.setLayoutY(441.0);
        leftSmallMotor.setScaleY(0.6);
        leftSmallMotor.setStrokeWidth(0.0);
        leftSmallMotor.setTranslateX(2.0);
        leftSmallMotor.setTranslateY(-5.0);

        Polygon rightSmallMotor = new Polygon();
        rightSmallMotor.setFill(Color.valueOf("#fae061"));
        rightSmallMotor.setLayoutX(331.0);
        rightSmallMotor.setLayoutY(441.0);
        rightSmallMotor.setScaleY(0.6);
        rightSmallMotor.setStrokeWidth(0.0);
        rightSmallMotor.setTranslateY(-4.0);
        
        
        /* Lines on the inside part of the rocket */
        Line line = new Line();
        line.setEndX(99.5);
        line.setLayoutX(106.0);
        line.setLayoutY(217.0);
        line.setStartX(68.0);
        line.setStroke(Color.valueOf("#d69267"));
        line.setStrokeWidth(2.0);
        line.setTranslateX(151.0);
        line.setTranslateY(29.0);
        
        Line line0 = new Line();
        line0.setEndX(97.5);
        line0.setLayoutX(229.0);
        line0.setLayoutY(246.0);
        line0.setStartX(67.0);
        line0.setStroke(Color.valueOf("#e6c6ae"));
        line0.setStrokeWidth(2.0);
        line0.setTranslateX(-2.5);

        Line line1 = new Line();
        line1.setEndX(97.5);
        line1.setLayoutX(229.0);
        line1.setLayoutY(380.0);
        line1.setStartX(67.0);
        line1.setStroke(Color.valueOf("#e6c6ae"));
        line1.setStrokeWidth(2.0);
        line1.setTranslateX(-2.0);
        line1.setTranslateY(-14.0);
        
        Line line2 = new Line();
        line2.setEndX(98.5);
        line2.setLayoutX(258.0);
        line2.setLayoutY(367.0);
        line2.setStartX(68.0);
        line2.setStroke(Color.valueOf("#d69267"));
        line2.setStrokeWidth(2.0);
        line2.setTranslateY(-1.0);
        
        /* Images of the NASA and US Flag */
        ImageView nasaLogo = new ImageView();
        nasaLogo.setFitHeight(95.0);
        nasaLogo.setFitWidth(62.5);
        nasaLogo.setLayoutX(297.0);
        nasaLogo.setLayoutY(280.0);
        nasaLogo.setPickOnBounds(true);
        nasaLogo.setPreserveRatio(true);
        nasaLogo.setTranslateX(-3.0);
        nasaLogo.setImage(new Image(getClass().getResource("nasa.png").toExternalForm()));
        
        ImageView usaFlag = new ImageView();
        usaFlag.setAccessibleText("us_flag");
        usaFlag.setFitHeight(20.0);
        usaFlag.setFitWidth(26.0);
        usaFlag.setLayoutX(282.0);
        usaFlag.setLayoutY(376.0);
        usaFlag.setPickOnBounds(true);
        usaFlag.setPreserveRatio(true);
        usaFlag.setTranslateX(27.0);
        usaFlag.setTranslateY(13.0);
        usaFlag.setImage(new Image(getClass().getResource("us.png").toExternalForm()));

        /* Black window of the rocket */
        Arc rocketWindow = new Arc();
        rocketWindow.setFill(Color.valueOf("#262120"));
        rocketWindow.setLayoutX(326.0);
        rocketWindow.setLayoutY(224.0);
        rocketWindow.setLength(180.0);
        rocketWindow.setRadiusX(25.0);
        rocketWindow.setRadiusY(23.0);
        rocketWindow.setTranslateX(-1.0);
        rocketWindow.setTranslateY(1.0);
        rocketWindow.setType(ArcType.ROUND);
        
        /* Rectangles that cover the arc black arc that makes the windows
       making the arc looks like a window */
        Rectangle leftDivisorOfWindow = new Rectangle();
        leftDivisorOfWindow.setArcWidth(5.0);
        leftDivisorOfWindow.setFill(Color.valueOf("#fce6d4"));
        leftDivisorOfWindow.setHeight(21.0);
        leftDivisorOfWindow.setLayoutX(307.0);
        leftDivisorOfWindow.setLayoutY(204.0);
        leftDivisorOfWindow.setRotate(132.0);
        leftDivisorOfWindow.setStrokeWidth(0.0);
        leftDivisorOfWindow.setWidth(5.0);
        
        Rectangle leftBorderOfTheWindow = new Rectangle();
        leftBorderOfTheWindow.setArcWidth(5.0);
        leftBorderOfTheWindow.setFill(Color.valueOf("#fce6d4"));
        leftBorderOfTheWindow.setHeight(15.0);
        leftBorderOfTheWindow.setLayoutX(301.0);
        leftBorderOfTheWindow.setLayoutY(223.0);
        leftBorderOfTheWindow.setRotate(132.0);
        leftBorderOfTheWindow.setStrokeWidth(0.0);
        leftBorderOfTheWindow.setTranslateX(-3.0);
        leftBorderOfTheWindow.setTranslateY(-4.0);
        leftBorderOfTheWindow.setWidth(10.0);
        
        Rectangle rightDivisorOfTheWindow = new Rectangle();
        rightDivisorOfTheWindow.setArcWidth(5.0);
        rightDivisorOfTheWindow.setFill(Color.valueOf("#fcd9bd"));
        rightDivisorOfTheWindow.setHeight(21.0);
        rightDivisorOfTheWindow.setLayoutX(317.0);
        rightDivisorOfTheWindow.setLayoutY(214.0);
        rightDivisorOfTheWindow.setRotate(-132.0);
        rightDivisorOfTheWindow.setStrokeWidth(0.0);
        rightDivisorOfTheWindow.setTranslateX(19.0);
        rightDivisorOfTheWindow.setTranslateY(-9.0);
        rightDivisorOfTheWindow.setWidth(5.0);
        
        Rectangle rightBorderOfTheWindow = new Rectangle();
        rightBorderOfTheWindow.setArcWidth(5.0);
        rightBorderOfTheWindow.setFill(Color.valueOf("#fcd9bd"));
        rightBorderOfTheWindow.setHeight(15.0);
        rightBorderOfTheWindow.setLayoutX(311.0);
        rightBorderOfTheWindow.setLayoutY(233.0);
        rightBorderOfTheWindow.setRotate(-132.0);
        rightBorderOfTheWindow.setStrokeWidth(0.0);
        rightBorderOfTheWindow.setTranslateX(31.0);
        rightBorderOfTheWindow.setTranslateY(-13.0);
        rightBorderOfTheWindow.setWidth(10.0);
        
        /* Black parts of the motor at the bottom of each body part */
        Rectangle blackPartofTheMotorL = new Rectangle();
        blackPartofTheMotorL.setArcWidth(5.0);
        blackPartofTheMotorL.setHeight(12.0);
        blackPartofTheMotorL.setLayoutX(225.0);
        blackPartofTheMotorL.setLayoutY(415.0);
        blackPartofTheMotorL.setStrokeWidth(0.0);
        blackPartofTheMotorL.setTranslateY(5.0);
        blackPartofTheMotorL.setWidth(47.0);
        
        Rectangle blackPartofTheMotorR = new Rectangle();
        blackPartofTheMotorR.setArcWidth(5.0);
        blackPartofTheMotorR.setHeight(12.0);
        blackPartofTheMotorR.setLayoutX(235.0);
        blackPartofTheMotorR.setLayoutY(425.0);
        blackPartofTheMotorR.setStrokeWidth(0.0);
        blackPartofTheMotorR.setTranslateX(144.0);
        blackPartofTheMotorR.setTranslateY(-5.0);
        blackPartofTheMotorR.setWidth(47.0);
        
        /* Borders between the Body Tube of the rocket and the nose cone */
        Rectangle borderLineL = new Rectangle();
        borderLineL.setArcWidth(5.0);
        borderLineL.setFill(Color.RED.valueOf("#fff4d1"));
        borderLineL.setHeight(5.0);
        borderLineL.setLayoutX(259.0);
        borderLineL.setLayoutY(172.0);
        borderLineL.setStrokeWidth(0.0);
        borderLineL.setTranslateX(12.0);
        borderLineL.setTranslateY(-4.0);
        borderLineL.setWidth(54.5);
        
        Rectangle borderLineR = new Rectangle();
        borderLineR.setArcWidth(5.0);
        borderLineR.setFill(Color.valueOf("#fce386"));
        borderLineR.setHeight(5.0);
        borderLineR.setLayoutX(312.0);
        borderLineR.setLayoutY(168.0);
        borderLineR.setStrokeWidth(0.0);
        borderLineR.setTranslateX(13.0);
        borderLineR.setWidth(54.5);
        
        /* Polyline that represent the stars with Cross Form */
        Polyline starWithCrossForm = new Polyline();
        starWithCrossForm.setFill(Color.valueOf("#b0b4b8"));
        starWithCrossForm.setLayoutX(102.0);
        starWithCrossForm.setLayoutY(73.0);
        starWithCrossForm.setStrokeType(StrokeType.INSIDE);
        starWithCrossForm.setStrokeWidth(0.0);
        starWithCrossForm.setTranslateX(139.0);
        starWithCrossForm.setTranslateY(-66.0);
        
        Polyline starWithCrossForm1 = new Polyline();
        starWithCrossForm1.setFill(Color.valueOf("#c4cad0"));
        starWithCrossForm1.setLayoutX(112.0);
        starWithCrossForm1.setLayoutY(83.0);
        starWithCrossForm1.setStrokeType(StrokeType.INSIDE);
        starWithCrossForm1.setStrokeWidth(0.0);
        starWithCrossForm1.setTranslateX(22.0);
        starWithCrossForm1.setTranslateY(30.0);
        
        /***************** CLOUDS ****************************/
        Ellipse cloud = new Ellipse();
        cloud.setFill(Color.valueOf("#385e96"));
        cloud.setLayoutX(633.0);
        cloud.setLayoutY(442.0);
        cloud.setRadiusX(41.0);
        cloud.setRadiusY(45.0);
        cloud.setStroke(Color.BLACK);
        cloud.setStrokeType(StrokeType.INSIDE);
        cloud.setStrokeWidth(0.0);
        
        DropShadow cloudShadow = new DropShadow();
        cloudShadow.setColor(Color.valueOf("#385e96"));
        cloudShadow.setHeight(72.61);
        cloudShadow.setRadius(41.1175);
        cloudShadow.setSpread(0.38);
        cloudShadow.setWidth(93.86);
        cloud.setEffect(cloudShadow);
        
        Ellipse cloud1 = new Ellipse();
        cloud1.setFill(Color.valueOf("#385e96"));
        cloud1.setLayoutX(587.0);
        cloud1.setLayoutY(529.0);
        cloud1.setRadiusX(90.0);
        cloud1.setRadiusY(80.0);
        cloud1.setStrokeType(StrokeType.INSIDE);
        cloud1.setStrokeWidth(0.0);
        
        DropShadow cloud1Shadow = new DropShadow();
        cloud1Shadow.setColor(Color.valueOf("#385e96"));
        cloud1Shadow.setHeight(169.75);
        cloud1Shadow.setRadius(92.7225);
        cloud1Shadow.setSpread(0.54);
        cloud1Shadow.setWidth(203.14);
        cloud1.setEffect(cloud1Shadow);
        
        Ellipse cloud2 = new Ellipse();
        cloud2.setFill(Color.valueOf("#385e96"));
        cloud2.setLayoutX(477.0);
        cloud2.setLayoutY(553.0);
        cloud2.setRadiusX(51.0);
        cloud2.setRadiusY(56.0);
        cloud2.setStrokeType(StrokeType.INSIDE);
        cloud2.setStrokeWidth(0.0);

        DropShadow cloud2Shadow = new DropShadow();
        cloud2Shadow.setColor(Color.valueOf("#385e96"));
        cloud2Shadow.setHeight(151.54);
        cloud2Shadow.setRadius(93.48249);
        cloud2Shadow.setSpread(0.6);
        cloud2Shadow.setWidth(224.39);
        cloud2.setEffect(cloud2Shadow);
        
        Ellipse cloud3 = new Ellipse();
        cloud3.setFill(Color.valueOf("#385e96"));
        cloud3.setLayoutX(434.0);
        cloud3.setLayoutY(609.0);
        cloud3.setRadiusX(47.0);
        cloud3.setRadiusY(47.0);
        cloud3.setStrokeWidth(0.0);
        
        DropShadow cloud3Shadow = new DropShadow();
        cloud3Shadow.setColor(Color.valueOf("#385e96"));
        cloud3Shadow.setHeight(148.5);
        cloud3Shadow.setRadius(79.0625);
        cloud3Shadow.setSpread(0.47);
        cloud3Shadow.setWidth(169.75);
        cloud3.setEffect(cloud3Shadow);
        
        Ellipse cloud4 = new Ellipse();
         cloud4.setFill(Color.valueOf("#385e96"));
        cloud4.setLayoutX(385.0);
        cloud4.setLayoutY(584.0);
        cloud4.setRadiusX(34.0);
        cloud4.setRadiusY(32.0);
        cloud4.setStroke(Color.BLACK);
        cloud4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud4.setStrokeWidth(0.0);
        
        DropShadow dropShadow5 = new DropShadow();
        dropShadow5.setColor(Color.valueOf("#385e96"));
        dropShadow5.setHeight(106.0);
        dropShadow5.setRadius(51.739);
        dropShadow5.setSpread(0.08);
        dropShadow5.setWidth(102.96);
        cloud4.setEffect(dropShadow5);
        Ellipse cloud5 = new Ellipse();
        DropShadow dropShadow6 = new DropShadow();
        Ellipse cloud6 = new Ellipse();
        DropShadow dropShadow7 = new DropShadow();
        Ellipse cloud7 = new Ellipse();
        DropShadow dropShadow8 = new DropShadow();
        Ellipse cloud8 = new Ellipse();
        DropShadow dropShadow9 = new DropShadow();
        Ellipse cloud9 = new Ellipse();
        DropShadow dropShadow10 = new DropShadow();
        Ellipse cloud10 = new Ellipse();
        DropShadow dropShadow11 = new DropShadow();
        Ellipse cloud11 = new Ellipse();
        DropShadow dropShadow12 = new DropShadow();
        Ellipse cloud12 = new Ellipse();
        DropShadow dropShadow13 = new DropShadow();
        Ellipse cloud13 = new Ellipse();
        DropShadow dropShadow14 = new DropShadow();
        Ellipse cloud14 = new Ellipse();
        DropShadow dropShadow15 = new DropShadow();
        Ellipse cloud15 = new Ellipse();
        DropShadow dropShadow16 = new DropShadow();
        Ellipse cloud16 = new Ellipse();
        DropShadow dropShadow17 = new DropShadow();
        Ellipse cloud17 = new Ellipse();
        DropShadow dropShadow18 = new DropShadow();
        Ellipse cloud18 = new Ellipse();
        DropShadow dropShadow19 = new DropShadow();
        Ellipse cloud19 = new Ellipse();
        DropShadow dropShadow110 = new DropShadow();
        Ellipse cloud20 = new Ellipse();
        DropShadow dropShadow111 = new DropShadow();
        Ellipse cloud21 = new Ellipse();
        DropShadow dropShadow112 = new DropShadow();
        Ellipse cloud22 = new Ellipse();
        DropShadow dropShadow113 = new DropShadow();
        Ellipse cloud23 = new Ellipse();
        Ellipse cloud24 = new Ellipse();
        DropShadow dropShadow114 = new DropShadow();
        Ellipse cloud25 = new Ellipse();
        Ellipse cloud26 = new Ellipse();
        Ellipse cloud27 = new Ellipse();
        Ellipse cloud28 = new Ellipse();
        Ellipse cloud29 = new Ellipse();
        DropShadow dropShadow115 = new DropShadow();
        Ellipse cloud30 = new Ellipse();
        Ellipse cloud31 = new Ellipse();
        Ellipse cloud32 = new Ellipse();
        Ellipse cloud33 = new Ellipse();
        Ellipse cloud34 = new Ellipse();
        Ellipse cloud35 = new Ellipse();
        Ellipse cloud36 = new Ellipse();
        Ellipse cloud37 = new Ellipse();
        Ellipse cloud38 = new Ellipse();
        Ellipse cloud39 = new Ellipse();
        Ellipse cloud40 = new Ellipse();
        Ellipse ellipse11112 = new Ellipse();
        Ellipse ellipse11113 = new Ellipse();
        Ellipse ellipse11114 = new Ellipse();
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
        Circle circle9 = new Circle();
        Circle circle10 = new Circle();
        Circle circle11 = new Circle();
        Circle circle12 = new Circle();
        Circle circle13 = new Circle();
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
        
        /******************* UP TO HERE *************************/
        /*===============================================================================================================================================*/


        cloud5.setFill(Color.WHITE);
        cloud5.setLayoutX(639.0);
        cloud5.setLayoutY(528.0);
        cloud5.setRadiusX(41.0);
        cloud5.setRadiusY(40.0);
        cloud5.setStroke(Color.BLACK);
        cloud5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud5.setStrokeWidth(0.0);

        dropShadow6.setColor(Color.WHITE);
        dropShadow6.setHeight(48.32);
        dropShadow6.setRadius(19.1075);
        dropShadow6.setSpread(0.4);
        dropShadow6.setWidth(30.11);
        cloud5.setEffect(dropShadow6);

        cloud6.setFill(Color.WHITE);
        cloud6.setLayoutX(604.0);
        cloud6.setLayoutY(565.0);
        cloud6.setRadiusX(28.0);
        cloud6.setRadiusY(32.0);
        cloud6.setStroke(Color.BLACK);
        cloud6.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud6.setStrokeWidth(0.0);

        dropShadow7.setColor(Color.WHITE);
        dropShadow7.setHeight(48.32);
        dropShadow7.setRadius(19.1075);
        dropShadow7.setSpread(0.4);
        dropShadow7.setWidth(30.11);
        cloud6.setEffect(dropShadow7);

        cloud7.setFill(Color.WHITE);
        cloud7.setLayoutX(571.0);
        cloud7.setLayoutY(572.0);
        cloud7.setRadiusX(28.0);
        cloud7.setRadiusY(32.0);
        cloud7.setStroke(Color.BLACK);
        cloud7.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud7.setStrokeWidth(0.0);

        dropShadow8.setColor(Color.WHITE);
        dropShadow8.setHeight(48.32);
        dropShadow8.setRadius(19.1075);
        dropShadow8.setSpread(0.4);
        dropShadow8.setWidth(30.11);
        cloud7.setEffect(dropShadow8);

        cloud8.setFill(Color.WHITE);
        cloud8.setLayoutX(544.0);
        cloud8.setLayoutY(543.0);
        cloud8.setRadiusX(30.0);
        cloud8.setRadiusY(35.0);
        cloud8.setStroke(Color.BLACK);
        cloud8.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud8.setStrokeWidth(0.0);

        dropShadow9.setColor(Color.WHITE);
        dropShadow9.setHeight(48.32);
        dropShadow9.setRadius(19.1075);
        dropShadow9.setSpread(0.4);
        dropShadow9.setWidth(30.11);
        cloud8.setEffect(dropShadow9);

        cloud9.setFill(Color.WHITE);
        cloud9.setLayoutX(496.0);
        cloud9.setLayoutY(581.0);
        cloud9.setRadiusX(34.0);
        cloud9.setRadiusY(33.0);
        cloud9.setStroke(Color.BLACK);
        cloud9.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud9.setStrokeWidth(0.0);

        dropShadow10.setColor(Color.WHITE);
        dropShadow10.setHeight(48.32);
        dropShadow10.setRadius(19.1075);
        dropShadow10.setSpread(0.4);
        dropShadow10.setWidth(30.11);
        cloud9.setEffect(dropShadow10);

        cloud10.setFill(Color.WHITE);
        cloud10.setLayoutX(448.0);
        cloud10.setLayoutY(593.0);
        cloud10.setRadiusX(28.0);
        cloud10.setRadiusY(32.0);
        cloud10.setStroke(Color.BLACK);
        cloud10.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud10.setStrokeWidth(0.0);

        dropShadow11.setColor(Color.WHITE);
        dropShadow11.setHeight(48.32);
        dropShadow11.setRadius(19.1075);
        dropShadow11.setSpread(0.4);
        dropShadow11.setWidth(30.11);
        cloud10.setEffect(dropShadow11);

        cloud11.setFill(Color.WHITE);
        cloud11.setLayoutX(406.0);
        cloud11.setLayoutY(603.0);
        cloud11.setRadiusX(28.0);
        cloud11.setRadiusY(32.0);
        cloud11.setStroke(Color.BLACK);
        cloud11.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud11.setStrokeWidth(0.0);

        dropShadow12.setColor(Color.WHITE);
        dropShadow12.setHeight(48.32);
        dropShadow12.setRadius(19.1075);
        dropShadow12.setSpread(0.4);
        dropShadow12.setWidth(30.11);
        cloud11.setEffect(dropShadow12);

        cloud12.setFill(Color.WHITE);
        cloud12.setLayoutX(368.0);
        cloud12.setLayoutY(576.0);
        cloud12.setRadiusX(19.0);
        cloud12.setRadiusY(26.0);
        cloud12.setStroke(Color.BLACK);
        cloud12.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud12.setStrokeWidth(0.0);

        dropShadow13.setColor(Color.WHITE);
        dropShadow13.setHeight(48.32);
        dropShadow13.setRadius(19.1075);
        dropShadow13.setSpread(0.4);
        dropShadow13.setWidth(30.11);
        cloud12.setEffect(dropShadow13);

        cloud13.setFill(Color.WHITE);
        cloud13.setLayoutX(336.0);
        cloud13.setLayoutY(588.0);
        cloud13.setRadiusX(28.0);
        cloud13.setRadiusY(32.0);
        cloud13.setStroke(Color.BLACK);
        cloud13.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud13.setStrokeWidth(0.0);

        dropShadow14.setColor(Color.WHITE);
        dropShadow14.setHeight(48.32);
        dropShadow14.setRadius(19.1075);
        dropShadow14.setSpread(0.4);
        dropShadow14.setWidth(30.11);
        cloud13.setEffect(dropShadow14);

        cloud14.setFill(Color.WHITE);
        cloud14.setLayoutX(298.0);
        cloud14.setLayoutY(587.0);
        cloud14.setRadiusX(19.0);
        cloud14.setRadiusY(27.0);
        cloud14.setStroke(Color.BLACK);
        cloud14.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud14.setStrokeWidth(0.0);

        dropShadow15.setColor(Color.WHITE);
        dropShadow15.setHeight(48.32);
        dropShadow15.setRadius(19.1075);
        dropShadow15.setSpread(0.4);
        dropShadow15.setWidth(30.11);
        cloud14.setEffect(dropShadow15);

        cloud15.setFill(Color.WHITE);
        cloud15.setLayoutX(15.0);
        cloud15.setLayoutY(489.0);
        cloud15.setRadiusX(28.0);
        cloud15.setRadiusY(32.0);
        cloud15.setStroke(Color.BLACK);
        cloud15.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud15.setStrokeWidth(0.0);

        dropShadow16.setColor(Color.WHITE);
        dropShadow16.setHeight(48.32);
        dropShadow16.setRadius(19.1075);
        dropShadow16.setSpread(0.4);
        dropShadow16.setWidth(30.11);
        cloud15.setEffect(dropShadow16);

        cloud16.setFill(Color.WHITE);
        cloud16.setLayoutX(149.0);
        cloud16.setLayoutY(602.0);
        cloud16.setRadiusX(28.0);
        cloud16.setRadiusY(24.0);
        cloud16.setStroke(Color.BLACK);
        cloud16.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud16.setStrokeWidth(0.0);

        dropShadow17.setColor(Color.WHITE);
        dropShadow17.setHeight(48.32);
        dropShadow17.setRadius(19.1075);
        dropShadow17.setSpread(0.4);
        dropShadow17.setWidth(30.11);
        cloud16.setEffect(dropShadow17);

        cloud17.setFill(Color.WHITE);
        cloud17.setLayoutX(32.0);
        cloud17.setLayoutY(540.0);
        cloud17.setRadiusX(28.0);
        cloud17.setRadiusY(32.0);
        cloud17.setStroke(Color.BLACK);
        cloud17.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud17.setStrokeWidth(0.0);

        dropShadow18.setColor(Color.WHITE);
        dropShadow18.setHeight(48.32);
        dropShadow18.setRadius(19.1075);
        dropShadow18.setSpread(0.4);
        dropShadow18.setWidth(30.11);
        cloud17.setEffect(dropShadow18);

        cloud18.setFill(Color.WHITE);
        cloud18.setLayoutX(62.0);
        cloud18.setLayoutY(534.0);
        cloud18.setRadiusX(20.0);
        cloud18.setRadiusY(23.0);
        cloud18.setStroke(Color.BLACK);
        cloud18.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud18.setStrokeWidth(0.0);

        dropShadow19.setColor(Color.WHITE);
        dropShadow19.setHeight(48.32);
        dropShadow19.setRadius(19.1075);
        dropShadow19.setSpread(0.4);
        dropShadow19.setWidth(30.11);
        cloud18.setEffect(dropShadow19);

        cloud19.setFill(Color.WHITE);
        cloud19.setLayoutX(80.0);
        cloud19.setLayoutY(565.0);
        cloud19.setRadiusX(20.0);
        cloud19.setRadiusY(23.0);
        cloud19.setStroke(Color.BLACK);
        cloud19.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud19.setStrokeWidth(0.0);

        dropShadow110.setColor(Color.WHITE);
        dropShadow110.setHeight(48.32);
        dropShadow110.setRadius(19.1075);
        dropShadow110.setSpread(0.4);
        dropShadow110.setWidth(30.11);
        cloud19.setEffect(dropShadow110);

        cloud20.setFill(Color.WHITE);
        cloud20.setLayoutX(124.0);
        cloud20.setLayoutY(570.0);
        cloud20.setRadiusX(34.0);
        cloud20.setRadiusY(29.0);
        cloud20.setStroke(Color.BLACK);
        cloud20.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud20.setStrokeWidth(0.0);

        dropShadow111.setColor(Color.WHITE);
        dropShadow111.setHeight(48.32);
        dropShadow111.setRadius(19.1075);
        dropShadow111.setSpread(0.4);
        dropShadow111.setWidth(30.11);
        cloud20.setEffect(dropShadow111);

        cloud21.setFill(Color.WHITE);
        cloud21.setLayoutX(171.0);
        cloud21.setLayoutY(565.0);
        cloud21.setRadiusX(28.0);
        cloud21.setRadiusY(24.0);
        cloud21.setStroke(Color.BLACK);
        cloud21.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud21.setStrokeWidth(0.0);

        dropShadow112.setColor(Color.WHITE);
        dropShadow112.setHeight(48.32);
        dropShadow112.setRadius(19.1075);
        dropShadow112.setSpread(0.4);
        dropShadow112.setWidth(30.11);
        cloud21.setEffect(dropShadow112);

        cloud22.setFill(Color.WHITE);
        cloud22.setLayoutX(223.0);
        cloud22.setLayoutY(618.0);
        cloud22.setRadiusX(61.0);
        cloud22.setRadiusY(66.0);
        cloud22.setRotate(-153.4);
        cloud22.setStroke(Color.BLACK);
        cloud22.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud22.setStrokeWidth(0.0);

        dropShadow113.setColor(Color.WHITE);
        dropShadow113.setHeight(48.32);
        dropShadow113.setRadius(19.1075);
        dropShadow113.setSpread(0.4);
        dropShadow113.setWidth(30.11);
        cloud22.setEffect(dropShadow113);

        cloud23.setFill(Color.valueOf("#e0dbda"));
        cloud23.setLayoutX(-6.0);
        cloud23.setLayoutY(641.0);
        cloud23.setRadiusX(105.0);
        cloud23.setRadiusY(90.0);
        cloud23.setStroke(Color.BLACK);
        cloud23.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud23.setStrokeWidth(0.0);

        cloud24.setFill(Color.valueOf("#e0dbda"));
        cloud24.setLayoutX(-7.0);
        cloud24.setLayoutY(536.0);
        cloud24.setRadiusX(30.0);
        cloud24.setRadiusY(31.0);
        cloud24.setStroke(Color.BLACK);
        cloud24.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud24.setStrokeWidth(0.0);

        dropShadow114.setColor(Color.valueOf("#e0dbda"));
        dropShadow114.setHeight(151.54);
        dropShadow114.setRadius(47.9475);
        dropShadow114.setWidth(42.25);
        cloud24.setEffect(dropShadow114);

        cloud25.setFill(Color.valueOf("#e0dbda"));
        cloud25.setLayoutX(99.0);
        cloud25.setLayoutY(599.0);
        cloud25.setRadiusX(30.0);
        cloud25.setRadiusY(31.0);
        cloud25.setStroke(Color.BLACK);
        cloud25.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud25.setStrokeWidth(0.0);

        cloud26.setFill(Color.valueOf("#e0dbda"));
        cloud26.setLayoutX(123.0);
        cloud26.setLayoutY(632.0);
        cloud26.setRadiusX(35.0);
        cloud26.setRadiusY(42.0);
        cloud26.setStroke(Color.BLACK);
        cloud26.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud26.setStrokeWidth(0.0);

        cloud27.setFill(Color.valueOf("#e0dbda"));
        cloud27.setLayoutX(179.0);
        cloud27.setLayoutY(655.0);
        cloud27.setRadiusX(42.0);
        cloud27.setRadiusY(35.0);
        cloud27.setRotate(47.1);
        cloud27.setStroke(Color.BLACK);
        cloud27.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud27.setStrokeWidth(0.0);

        cloud28.setFill(Color.valueOf("#e0dbda"));
        cloud28.setLayoutX(59.0);
        cloud28.setLayoutY(559.0);
        cloud28.setRadiusX(18.0);
        cloud28.setRadiusY(17.0);
        cloud28.setStroke(Color.BLACK);
        cloud28.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud28.setStrokeWidth(0.0);

        cloud29.setFill(Color.WHITE);
        cloud29.setLayoutX(272.0);
        cloud29.setLayoutY(609.0);
        cloud29.setRadiusX(18.0);
        cloud29.setRadiusY(17.0);
        cloud29.setStroke(Color.BLACK);
        cloud29.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud29.setStrokeWidth(0.0);

        dropShadow115.setColor(Color.WHITE);
        dropShadow115.setHeight(48.32);
        dropShadow115.setRadius(19.1075);
        dropShadow115.setSpread(0.4);
        dropShadow115.setWidth(30.11);
        cloud29.setEffect(dropShadow115);

        cloud30.setFill(Color.valueOf("#e0dbda"));
        cloud30.setLayoutX(249.0);
        cloud30.setLayoutY(651.0);
        cloud30.setRadiusX(30.0);
        cloud30.setRadiusY(31.0);
        cloud30.setStroke(Color.BLACK);
        cloud30.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud30.setStrokeWidth(0.0);

        cloud31.setFill(Color.valueOf("#e0dbda"));
        cloud31.setLayoutX(273.0);
        cloud31.setLayoutY(626.0);
        cloud31.setRadiusX(20.0);
        cloud31.setRadiusY(17.0);
        cloud31.setStroke(Color.BLACK);
        cloud31.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud31.setStrokeWidth(0.0);

        cloud32.setFill(Color.valueOf("#e0dbda"));
        cloud32.setLayoutX(292.0);
        cloud32.setLayoutY(615.0);
        cloud32.setRadiusX(18.0);
        cloud32.setRadiusY(17.0);
        cloud32.setStroke(Color.BLACK);
        cloud32.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud32.setStrokeWidth(0.0);

        cloud33.setFill(Color.valueOf("#e0dbda"));
        cloud33.setLayoutX(331.0);
        cloud33.setLayoutY(646.0);
        cloud33.setRadiusX(20.0);
        cloud33.setRadiusY(17.0);
        cloud33.setStroke(Color.BLACK);
        cloud33.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud33.setStrokeWidth(0.0);

        cloud34.setFill(Color.valueOf("#e0dbda"));
        cloud34.setLayoutX(361.0);
        cloud34.setLayoutY(621.0);
        cloud34.setRadiusX(20.0);
        cloud34.setRadiusY(17.0);
        cloud34.setStroke(Color.BLACK);
        cloud34.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud34.setStrokeWidth(0.0);

        cloud35.setFill(Color.valueOf("#e0dbda"));
        cloud35.setLayoutX(382.0);
        cloud35.setLayoutY(630.0);
        cloud35.setRadiusX(20.0);
        cloud35.setRadiusY(17.0);
        cloud35.setStroke(Color.BLACK);
        cloud35.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud35.setStrokeWidth(0.0);

        cloud36.setFill(Color.valueOf("#e0dbda"));
        cloud36.setLayoutX(324.0);
        cloud36.setLayoutY(615.0);
        cloud36.setRadiusX(20.0);
        cloud36.setRadiusY(17.0);
        cloud36.setStroke(Color.BLACK);
        cloud36.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud36.setStrokeWidth(0.0);

        cloud37.setFill(Color.valueOf("#e0dbda"));
        cloud37.setLayoutX(305.0);
        cloud37.setLayoutY(594.0);
        cloud37.setRadiusX(14.0);
        cloud37.setRadiusY(13.0);
        cloud37.setStroke(Color.BLACK);
        cloud37.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud37.setStrokeWidth(0.0);

        cloud38.setFill(Color.valueOf("#e0dbda"));
        cloud38.setLayoutX(646.0);
        cloud38.setLayoutY(575.0);
        cloud38.setRadiusX(20.0);
        cloud38.setRadiusY(17.0);
        cloud38.setStroke(Color.BLACK);
        cloud38.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud38.setStrokeWidth(0.0);

        cloud39.setFill(Color.valueOf("#e0dbda"));
        cloud39.setLayoutX(543.0);
        cloud39.setLayoutY(601.0);
        cloud39.setRadiusX(20.0);
        cloud39.setRadiusY(17.0);
        cloud39.setStroke(Color.BLACK);
        cloud39.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud39.setStrokeWidth(0.0);

        cloud40.setFill(Color.valueOf("#e0dbda"));
        cloud40.setLayoutX(425.0);
        cloud40.setLayoutY(634.0);
        cloud40.setRadiusX(40.0);
        cloud40.setRadiusY(40.0);
        cloud40.setStroke(Color.BLACK);
        cloud40.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cloud40.setStrokeWidth(0.0);

        ellipse11112.setFill(Color.valueOf("#e0dbda"));
        ellipse11112.setLayoutX(449.0);
        ellipse11112.setLayoutY(622.0);
        ellipse11112.setRadiusX(18.0);
        ellipse11112.setRadiusY(18.0);
        ellipse11112.setStroke(Color.BLACK);
        ellipse11112.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11112.setStrokeWidth(0.0);

        ellipse11113.setFill(Color.valueOf("#e0dbda"));
        ellipse11113.setLayoutX(392.0);
        ellipse11113.setLayoutY(640.0);
        ellipse11113.setRadiusX(20.0);
        ellipse11113.setRadiusY(17.0);
        ellipse11113.setStroke(Color.BLACK);
        ellipse11113.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11113.setStrokeWidth(0.0);

        ellipse11114.setFill(Color.valueOf("#e0dbda"));
        ellipse11114.setLayoutX(609.0);
        ellipse11114.setLayoutY(628.0);
        ellipse11114.setRadiusX(81.0);
        ellipse11114.setRadiusY(54.0);
        ellipse11114.setRotate(-20.6);
        ellipse11114.setStroke(Color.BLACK);
        ellipse11114.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11114.setStrokeWidth(0.0);

        ellipse11115.setFill(Color.valueOf("#e0dbda"));
        ellipse11115.setLayoutX(514.0);
        ellipse11115.setLayoutY(650.0);
        ellipse11115.setRadiusX(81.0);
        ellipse11115.setRadiusY(44.0);
        ellipse11115.setRotate(-18.4);
        ellipse11115.setStroke(Color.BLACK);
        ellipse11115.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11115.setStrokeWidth(0.0);

        ellipse11116.setFill(Color.valueOf("#e0dbda"));
        ellipse11116.setLayoutX(532.0);
        ellipse11116.setLayoutY(580.0);
        ellipse11116.setRadiusX(14.0);
        ellipse11116.setRadiusY(13.0);
        ellipse11116.setStroke(Color.BLACK);
        ellipse11116.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11116.setStrokeWidth(0.0);

        ellipse11117.setFill(Color.valueOf("#e0dbda"));
        ellipse11117.setLayoutX(316.0);
        ellipse11117.setLayoutY(666.0);
        ellipse11117.setRadiusX(81.0);
        ellipse11117.setRadiusY(44.0);
        ellipse11117.setStroke(Color.BLACK);
        ellipse11117.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11117.setStrokeWidth(0.0);

        ellipse11118.setFill(Color.valueOf("#e0dbda"));
        ellipse11118.setLayoutX(370.0);
        ellipse11118.setLayoutY(606.0);
        ellipse11118.setRadiusX(10.0);
        ellipse11118.setRadiusY(9.0);
        ellipse11118.setStroke(Color.BLACK);
        ellipse11118.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11118.setStrokeWidth(0.0);

        ellipse11119.setFill(Color.valueOf("#e0dbda"));
        ellipse11119.setLayoutX(462.0);
        ellipse11119.setLayoutY(609.0);
        ellipse11119.setRadiusX(10.0);
        ellipse11119.setRadiusY(9.0);
        ellipse11119.setStroke(Color.BLACK);
        ellipse11119.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11119.setStrokeWidth(0.0);

        ellipse111110.setFill(Color.valueOf("#e0dbda"));
        ellipse111110.setLayoutX(476.0);
        ellipse111110.setLayoutY(614.0);
        ellipse111110.setRadiusX(10.0);
        ellipse111110.setRadiusY(9.0);
        ellipse111110.setStroke(Color.BLACK);
        ellipse111110.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111110.setStrokeWidth(0.0);

        ellipse111111.setFill(Color.valueOf("#e0dbda"));
        ellipse111111.setLayoutX(579.0);
        ellipse111111.setLayoutY(592.0);
        ellipse111111.setRadiusX(15.0);
        ellipse111111.setRadiusY(12.0);
        ellipse111111.setStroke(Color.BLACK);
        ellipse111111.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111111.setStrokeWidth(0.0);

        ellipse111112.setFill(Color.valueOf("#e0dbda"));
        ellipse111112.setLayoutX(626.0);
        ellipse111112.setLayoutY(569.0);
        ellipse111112.setRadiusX(10.0);
        ellipse111112.setRadiusY(13.0);
        ellipse111112.setStroke(Color.BLACK);
        ellipse111112.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111112.setStrokeWidth(0.0);

        ellipse111113.setFill(Color.valueOf("#e0dbda"));
        ellipse111113.setLayoutX(178.0);
        ellipse111113.setLayoutY(620.0);
        ellipse111113.setRadiusX(10.0);
        ellipse111113.setRadiusY(9.0);
        ellipse111113.setStroke(Color.BLACK);
        ellipse111113.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111113.setStrokeWidth(0.0);

        ellipse111114.setFill(Color.valueOf("#e0dbda"));
        ellipse111114.setLayoutX(209.0);
        ellipse111114.setLayoutY(630.0);
        ellipse111114.setRadiusX(10.0);
        ellipse111114.setRadiusY(9.0);
        ellipse111114.setStroke(Color.BLACK);
        ellipse111114.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111114.setStrokeWidth(0.0);

        ellipse111115.setFill(Color.valueOf("#e0dbda"));
        ellipse111115.setLayoutX(129.0);
        ellipse111115.setLayoutY(596.0);
        ellipse111115.setRadiusX(10.0);
        ellipse111115.setRadiusY(9.0);
        ellipse111115.setStroke(Color.BLACK);
        ellipse111115.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111115.setStrokeWidth(0.0);

        ellipse111116.setFill(Color.valueOf("#e0dbda"));
        ellipse111116.setLayoutX(69.0);
        ellipse111116.setLayoutY(576.0);
        ellipse111116.setRadiusX(10.0);
        ellipse111116.setRadiusY(9.0);
        ellipse111116.setStroke(Color.BLACK);
        ellipse111116.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111116.setStrokeWidth(0.0);

        ellipse111117.setFill(Color.valueOf("#e0dbda"));
        ellipse111117.setLayoutX(31.0);
        ellipse111117.setLayoutY(552.0);
        ellipse111117.setRadiusX(10.0);
        ellipse111117.setRadiusY(9.0);
        ellipse111117.setStroke(Color.BLACK);
        ellipse111117.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111117.setStrokeWidth(0.0);

        ellipse111118.setFill(Color.valueOf("#e0dbda"));
        ellipse111118.setLayoutX(21.0);
        ellipse111118.setLayoutY(550.0);
        ellipse111118.setRadiusX(10.0);
        ellipse111118.setRadiusY(9.0);
        ellipse111118.setStroke(Color.BLACK);
        ellipse111118.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111118.setStrokeWidth(0.0);

        ellipse111119.setFill(Color.valueOf("#e0dbda"));
        ellipse111119.setLayoutX(154.0);
        ellipse111119.setLayoutY(605.0);
        ellipse111119.setRadiusX(6.0);
        ellipse111119.setRadiusY(8.0);
        ellipse111119.setStroke(Color.BLACK);
        ellipse111119.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse111119.setStrokeWidth(0.0);

        dropShadow116.setColor(Color.valueOf("#e0dbda"));
        ellipse111119.setEffect(dropShadow116);

        ellipse1111110.setFill(Color.valueOf("#e0dbda"));
        ellipse1111110.setLayoutX(431.0);
        ellipse1111110.setLayoutY(647.0);
        ellipse1111110.setRadiusX(27.0);
        ellipse1111110.setRadiusY(14.0);
        ellipse1111110.setStroke(Color.BLACK);
        ellipse1111110.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111110.setStrokeWidth(0.0);

        ellipse1111111.setFill(Color.valueOf("#e0dbda"));
        ellipse1111111.setLayoutX(472.0);
        ellipse1111111.setLayoutY(619.0);
        ellipse1111111.setRadiusX(10.0);
        ellipse1111111.setRadiusY(9.0);
        ellipse1111111.setStroke(Color.BLACK);
        ellipse1111111.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111111.setStrokeWidth(0.0);

        ellipse1111112.setFill(Color.valueOf("#e0dbda"));
        ellipse1111112.setLayoutX(504.0);
        ellipse1111112.setLayoutY(611.0);
        ellipse1111112.setRadiusX(18.0);
        ellipse1111112.setRadiusY(10.0);
        ellipse1111112.setStroke(Color.BLACK);
        ellipse1111112.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111112.setStrokeWidth(0.0);

        ellipse1111113.setFill(Color.valueOf("#e0dbda"));
        ellipse1111113.setLayoutX(516.0);
        ellipse1111113.setLayoutY(600.0);
        ellipse1111113.setRadiusX(10.0);
        ellipse1111113.setRadiusY(9.0);
        ellipse1111113.setStroke(Color.BLACK);
        ellipse1111113.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111113.setStrokeWidth(0.0);

        ellipse1111114.setFill(Color.valueOf("#e0dbda"));
        ellipse1111114.setLayoutX(562.0);
        ellipse1111114.setLayoutY(596.0);
        ellipse1111114.setRadiusX(10.0);
        ellipse1111114.setRadiusY(9.0);
        ellipse1111114.setStroke(Color.BLACK);
        ellipse1111114.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111114.setStrokeWidth(0.0);

        ellipse1111115.setFill(Color.valueOf("#e0dbda"));
        ellipse1111115.setLayoutX(41.0);
        ellipse1111115.setLayoutY(551.0);
        ellipse1111115.setRadiusX(10.0);
        ellipse1111115.setRadiusY(9.0);
        ellipse1111115.setStroke(Color.BLACK);
        ellipse1111115.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111115.setStrokeWidth(0.0);

        ellipse1111116.setFill(Color.valueOf("#e0dbda"));
        ellipse1111116.setLayoutX(612.0);
        ellipse1111116.setLayoutY(581.0);
        ellipse1111116.setRadiusX(14.0);
        ellipse1111116.setRadiusY(9.0);
        ellipse1111116.setStroke(Color.BLACK);
        ellipse1111116.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111116.setStrokeWidth(0.0);

        ellipse1111117.setFill(Color.valueOf("#e0dbda"));
        ellipse1111117.setLayoutX(232.0);
        ellipse1111117.setLayoutY(652.0);
        ellipse1111117.setRadiusX(10.0);
        ellipse1111117.setRadiusY(21.0);
        ellipse1111117.setStroke(Color.BLACK);
        ellipse1111117.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111117.setStrokeWidth(0.0);

        ellipse1111118.setFill(Color.valueOf("#e0dbda"));
        ellipse1111118.setLayoutX(219.0);
        ellipse1111118.setLayoutY(649.0);
        ellipse1111118.setRadiusX(18.0);
        ellipse1111118.setRadiusY(17.0);
        ellipse1111118.setStroke(Color.BLACK);
        ellipse1111118.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111118.setStrokeWidth(0.0);

        ellipse1111119.setFill(Color.WHITE);
        ellipse1111119.setLayoutX(385.0);
        ellipse1111119.setLayoutY(565.0);
        ellipse1111119.setRadiusX(14.0);
        ellipse1111119.setRadiusY(12.0);
        ellipse1111119.setStroke(Color.BLACK);
        ellipse1111119.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse1111119.setStrokeWidth(0.0);
        dropShadow117.setColor(Color.WHITE);
        dropShadow117.setHeight(48.32);
        dropShadow117.setRadius(19.1075);
        dropShadow117.setSpread(0.4);
        dropShadow117.setWidth(30.11);
        ellipse1111119.setEffect(dropShadow117);
        ellipse11111110.setFill(Color.WHITE);
        ellipse11111110.setLayoutX(230.0);
        ellipse11111110.setLayoutY(573.0);
        ellipse11111110.setRadiusX(24.0);
        ellipse11111110.setRadiusY(36.0);
        ellipse11111110.setStroke(Color.BLACK);
        ellipse11111110.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11111110.setStrokeWidth(0.0);

        dropShadow118.setColor(Color.WHITE);
        dropShadow118.setHeight(48.32);
        dropShadow118.setRadius(19.1075);
        dropShadow118.setSpread(0.4);
        dropShadow118.setWidth(30.11);
        ellipse11111110.setEffect(dropShadow118);

        ellipse11111111.setFill(Color.WHITE);
        ellipse11111111.setLayoutX(398.0);
        ellipse11111111.setLayoutY(553.0);
        ellipse11111111.setRadiusX(30.0);
        ellipse11111111.setRadiusY(35.0);
        ellipse11111111.setStroke(Color.BLACK);
        ellipse11111111.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11111111.setStrokeWidth(0.0);

        dropShadow119.setColor(Color.WHITE);
        dropShadow119.setHeight(48.32);
        dropShadow119.setRadius(19.1075);
        dropShadow119.setSpread(0.4);
        dropShadow119.setWidth(30.11);
        ellipse11111111.setEffect(dropShadow119);

        ellipse11111112.setFill(Color.WHITE);
        ellipse11111112.setLayoutX(273.0);
        ellipse11111112.setLayoutY(556.0);
        ellipse11111112.setRadiusX(30.0);
        ellipse11111112.setRadiusY(36.0);
        ellipse11111112.setStroke(Color.BLACK);
        ellipse11111112.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11111112.setStrokeWidth(0.0);

        dropShadow1110.setColor(Color.WHITE);
        dropShadow1110.setHeight(48.32);
        dropShadow1110.setRadius(19.1075);
        dropShadow1110.setSpread(0.4);
        dropShadow1110.setWidth(30.11);
        ellipse11111112.setEffect(dropShadow1110);

        ellipse11111113.setFill(Color.WHITE);
        ellipse11111113.setLayoutX(439.0);
        ellipse11111113.setLayoutY(563.0);
        ellipse11111113.setRadiusX(30.0);
        ellipse11111113.setRadiusY(35.0);
        ellipse11111113.setStroke(Color.BLACK);
        ellipse11111113.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse11111113.setStrokeWidth(0.0);

        dropShadow1111.setColor(Color.WHITE);
        dropShadow1111.setHeight(48.32);
        dropShadow1111.setRadius(19.1075);
        dropShadow1111.setSpread(0.4);
        dropShadow1111.setWidth(30.11);
        ellipse11111113.setEffect(dropShadow1111);
        
        

        circle.setFill(Color.valueOf("#6b7685"));
        circle.setLayoutX(124.0);
        circle.setLayoutY(48.0);
        circle.setRadius(8.0);
        circle.setStroke(Color.BLACK);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle0.setFill(Color.valueOf("#6b7685"));
        circle0.setLayoutX(101.0);
        circle0.setLayoutY(197.0);
        circle0.setRadius(8.0);
        circle0.setStroke(Color.BLACK);
        circle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle1.setFill(Color.valueOf("#6b7685"));
        circle1.setLayoutX(23.0);
        circle1.setLayoutY(40.0);
        circle1.setRadius(6.0);
        circle1.setStroke(Color.BLACK);
        circle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle2.setFill(Color.valueOf("#6b7685"));
        circle2.setLayoutX(48.0);
        circle2.setLayoutY(125.0);
        circle2.setRadius(5.0);
        circle2.setStroke(Color.BLACK);
        circle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle3.setFill(Color.valueOf("#6b7685"));
        circle3.setLayoutX(506.0);
        circle3.setLayoutY(64.0);
        circle3.setRadius(8.0);
        circle3.setStroke(Color.BLACK);
        circle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle4.setFill(Color.valueOf("#6b7685"));
        circle4.setLayoutX(632.0);
        circle4.setLayoutY(128.0);
        circle4.setRadius(8.0);
        circle4.setStroke(Color.BLACK);
        circle4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle5.setFill(Color.valueOf("#6b7685"));
        circle5.setLayoutX(248.0);
        circle5.setLayoutY(144.0);
        circle5.setRadius(8.0);
        circle5.setStroke(Color.BLACK);
        circle5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle6.setFill(Color.valueOf("#6b7685"));
        circle6.setLayoutX(414.0);
        circle6.setLayoutY(56.0);
        circle6.setRadius(5.0);
        circle6.setStroke(Color.BLACK);
        circle6.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle7.setFill(Color.valueOf("#6b7685"));
        circle7.setLayoutX(42.0);
        circle7.setLayoutY(228.0);
        circle7.setRadius(4.0);
        circle7.setStroke(Color.BLACK);
        circle7.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle8.setFill(Color.valueOf("#6b7685"));
        circle8.setLayoutX(46.0);
        circle8.setLayoutY(356.0);
        circle8.setRadius(4.0);
        circle8.setStroke(Color.BLACK);
        circle8.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle9.setFill(Color.valueOf("#6b7685"));
        circle9.setLayoutX(121.0);
        circle9.setLayoutY(308.0);
        circle9.setRadius(4.0);
        circle9.setStroke(Color.BLACK);
        circle9.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle10.setFill(Color.valueOf("#6b7685"));
        circle10.setLayoutX(139.0);
        circle10.setLayoutY(291.0);
        circle10.setRadius(4.0);
        circle10.setStroke(Color.BLACK);
        circle10.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle11.setFill(Color.valueOf("#6b7685"));
        circle11.setLayoutX(199.0);
        circle11.setLayoutY(197.0);
        circle11.setRadius(4.0);
        circle11.setStroke(Color.BLACK);
        circle11.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle12.setFill(Color.valueOf("#6b7685"));
        circle12.setLayoutX(154.0);
        circle12.setLayoutY(152.0);
        circle12.setRadius(4.0);
        circle12.setStroke(Color.BLACK);
        circle12.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle13.setFill(Color.valueOf("#6b7685"));
        circle13.setLayoutX(428.0);
        circle13.setLayoutY(136.0);
        circle13.setRadius(4.0);
        circle13.setStroke(Color.BLACK);
        circle13.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle14.setFill(Color.valueOf("#6b7685"));
        circle14.setLayoutX(449.0);
        circle14.setLayoutY(152.0);
        circle14.setRadius(4.0);
        circle14.setStroke(Color.BLACK);
        circle14.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle15.setFill(Color.valueOf("#6b7685"));
        circle15.setLayoutX(532.0);
        circle15.setLayoutY(93.0);
        circle15.setRadius(4.0);
        circle15.setStroke(Color.BLACK);
        circle15.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle16.setFill(Color.valueOf("#6b7685"));
        circle16.setLayoutX(604.0);
        circle16.setLayoutY(34.0);
        circle16.setRadius(4.0);
        circle16.setStroke(Color.BLACK);
        circle16.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle17.setFill(Color.valueOf("#6b7685"));
        circle17.setLayoutX(543.0);
        circle17.setLayoutY(148.0);
        circle17.setRadius(4.0);
        circle17.setStroke(Color.BLACK);
        circle17.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle18.setFill(Color.valueOf("#6b7685"));
        circle18.setLayoutX(453.0);
        circle18.setLayoutY(22.0);
        circle18.setRadius(4.0);
        circle18.setStroke(Color.BLACK);
        circle18.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle19.setFill(Color.valueOf("#6b7685"));
        circle19.setLayoutX(170.0);
        circle19.setLayoutY(22.0);
        circle19.setRadius(4.0);
        circle19.setStroke(Color.BLACK);
        circle19.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        arc7.setFill(Color.valueOf("#ffe9d6"));
        arc7.setLayoutX(248.0);
        arc7.setLayoutY(247.0);
        arc7.setLength(90.0);
        arc7.setRadiusX(23.5);
        arc7.setRadiusY(58.0);
        arc7.setStartAngle(90.0);
        arc7.setStroke(Color.BLACK);
        arc7.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc7.setStrokeWidth(0.0);
        arc7.setTranslateX(1.0);
        arc7.setTranslateY(-1.0);
        arc7.setType(javafx.scene.shape.ArcType.ROUND);

        arc8.setFill(Color.valueOf("#fcd4b8"));
        arc8.setLayoutX(248.0);
        arc8.setLayoutY(247.0);
        arc8.setLength(90.0);
        arc8.setRadiusX(23.5);
        arc8.setRadiusY(58.0);
        arc8.setStrokeWidth(0.0);
        arc8.setTranslateY(-1.0);
        arc8.setType(ArcType.ROUND);

        arc9.setFill(Color.valueOf("#ffe9d6"));
        arc9.setLayoutX(258.0);
        arc9.setLayoutY(257.0);
        arc9.setLength(90.0);
        arc9.setRadiusX(23.5);
        arc9.setRadiusY(58.0);
        arc9.setStartAngle(90.0);
        arc9.setStrokeWidth(0.0);
        arc9.setTranslateX(144.0);
        arc9.setTranslateY(-11.0);
        arc9.setType(ArcType.ROUND);

        arc10.setFill(Color.valueOf("#fcd4b8"));
        arc10.setLayoutX(258.0);
        arc10.setLayoutY(257.0);
        arc10.setLength(90.0);
        arc10.setRadiusX(23.5);
        arc10.setRadiusY(58.0);
        arc10.setStrokeWidth(0.0);
        arc10.setTranslateX(144.0);
        arc10.setTranslateY(-11.0);
        arc10.setType(ArcType.ROUND);

        arc11.setFill(Color.valueOf("#fcd4b8"));
        arc11.setLayoutX(99.0);
        arc11.setLayoutY(143.0);
        arc11.setLength(90.0);
        arc11.setRadiusX(21.0);
        arc11.setRadiusY(21.0);
        arc11.setStrokeWidth(0.0);
        arc11.setTranslateX(226.0);
        arc11.setTranslateY(92.0);
        arc11.setType(ArcType.ROUND);

        arc12.setFill(Color.valueOf("#ffe9d6"));
        arc12.setLayoutX(99.0);
        arc12.setLayoutY(143.0);
        arc12.setLength(90.0);
        arc12.setRadiusX(21.0);
        arc12.setRadiusY(21.0);
        arc12.setStartAngle(90.0);
        arc12.setStroke(Color.BLACK);
        arc12.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        arc12.setStrokeWidth(0.0);
        arc12.setTranslateX(226.0);
        arc12.setTranslateY(92.0);
        arc12.setType(javafx.scene.shape.ArcType.ROUND);

        /* ADD ALL ELEMEMTS TO THE PANE */
        pane.getChildren().add(planet);
        pane.getChildren().add(galaxy);
        pane.getChildren().add(blackHole);
        pane.getChildren().add(rocketBodyLeft);
        pane.getChildren().add(rocketBodyRight);
        pane.getChildren().add(insideLeftNoseCone);
        pane.getChildren().add(insideRightNoseCone);
        pane.getChildren().add(turbineLL);
        pane.getChildren().add(turbineLR);
        pane.getChildren().add(topLL);
        pane.getChildren().add(middleLL);
        pane.getChildren().add(bottomLR);
        pane.getChildren().add(topLR);
        pane.getChildren().add(middleLR);
        pane.getChildren().add(buttonLL);
        pane.getChildren().add(turbineRL);
        pane.getChildren().add(turbineRR);
        pane.getChildren().add(topRL);
        pane.getChildren().add(middleRL);
        pane.getChildren().add(bottomRL);
        pane.getChildren().add(topRR);
        pane.getChildren().add(middleRR);
        pane.getChildren().add(bottomRR);
        pane.getChildren().add(rightFing);
        pane.getChildren().add(leftFing);
        pane.getChildren().add(rightFingSmall);
        pane.getChildren().add(leftFingSmall);
        pane.getChildren().add(leftPartInside);
        leftMotorSmall.getPoints().addAll(
                1.0, 10.0, 18.0, 10.0,
                21.0, 20.0, -2.0, 20.0
        );
        pane.getChildren().add(leftMotorSmall);
        leftMotorBig.getPoints().addAll(
                0.0, 10.0, 19.0, 10.0,
                22.0, 20.0, -3.0, 20.0
        );
        pane.getChildren().add(leftMotorBig);
        leftMotorShadow.getPoints().addAll(
                1.0, 15.0, 18.0, 15.0,
                21.0, 20.0, -2.0, 20.0
        );
        pane.getChildren().add(leftMotorShadow);
        rightMotorSmall.getPoints().addAll(
                1.0, 10.0, 18.0, 10.0,
                21.0, 20.0, -2.0, 20.0
        );
        pane.getChildren().add(rightMotorSmall);
        rightMotorBig.getPoints().addAll(
                0.0, 10.0, 19.0, 10.0,
                22.0, 20.0, -3.0, 20.0
        );
        pane.getChildren().add(rightMotorBig);
        rightMotorShadow.getPoints().addAll(
                1.0, 15.0, 18.0, 15.0,
                21.0, 20.0, -2.0, 20.0
        );
        pane.getChildren().add(rightMotorShadow);
        pane.getChildren().add(toInsideMotorL);
        pane.getChildren().add(toInsideMotorR);
        pane.getChildren().add(rightInsideBody);
        pane.getChildren().add(yellowBottom);
        pane.getChildren().add(toInsideMotorSmallL);
        pane.getChildren().add(toInsideMotorSmallR);
        leftSmallMotor.getPoints().addAll(
                0.0, 10.0, 19.0, 10.0,
                22.0, 20.0, -3.0, 20.0
        );
        pane.getChildren().add(leftSmallMotor);
        rightSmallMotor.getPoints().addAll(
                0.0, 10.0, 19.0, 10.0,
                22.0, 20.0, -3.0, 20.0
        );
        pane.getChildren().add(rightSmallMotor);
        pane.getChildren().add(line);
        pane.getChildren().add(line0);
        pane.getChildren().add(line1);
        pane.getChildren().add(line2);
        pane.getChildren().add(nasaLogo);
        pane.getChildren().add(usaFlag);
        pane.getChildren().add(rocketWindow);
        pane.getChildren().add(leftDivisorOfWindow);
        pane.getChildren().add(leftBorderOfTheWindow);
        pane.getChildren().add(rightDivisorOfTheWindow);
        pane.getChildren().add(rightBorderOfTheWindow);
        pane.getChildren().add(blackPartofTheMotorL);
        pane.getChildren().add(blackPartofTheMotorR);
        pane.getChildren().add(borderLineL);
        pane.getChildren().add(borderLineR);
        pane.getChildren().add(cloud);
        pane.getChildren().add(cloud1);
        pane.getChildren().add(cloud2);
        pane.getChildren().add(cloud3);
        pane.getChildren().add(cloud4);
        pane.getChildren().add(cloud5);
        pane.getChildren().add(cloud6);
        pane.getChildren().add(cloud7);
        pane.getChildren().add(cloud8);
        pane.getChildren().add(cloud9);
        pane.getChildren().add(cloud10);
        pane.getChildren().add(cloud11);
        pane.getChildren().add(cloud12);
        pane.getChildren().add(cloud13);
        pane.getChildren().add(cloud14);
        pane.getChildren().add(cloud15);
        pane.getChildren().add(cloud16);
        pane.getChildren().add(cloud17);
        pane.getChildren().add(cloud18);
        pane.getChildren().add(cloud19);
        pane.getChildren().add(cloud20);
        pane.getChildren().add(cloud21);
        pane.getChildren().add(cloud22);
        pane.getChildren().add(cloud23);
        pane.getChildren().add(cloud24);
        pane.getChildren().add(cloud25);
        pane.getChildren().add(cloud26);
        pane.getChildren().add(cloud27);
        pane.getChildren().add(cloud28);
        pane.getChildren().add(cloud29);
        pane.getChildren().add(cloud30);
        pane.getChildren().add(cloud31);
        pane.getChildren().add(cloud32);
        pane.getChildren().add(cloud33);
        pane.getChildren().add(cloud34);
        pane.getChildren().add(cloud35);
        pane.getChildren().add(cloud36);
        pane.getChildren().add(cloud37);
        pane.getChildren().add(cloud38);
        pane.getChildren().add(cloud39);
        pane.getChildren().add(cloud40);
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

        /* Polylines are the starts (type of cross) */
        starWithCrossForm.getPoints().addAll(
                7.5, 0.0, 10.0, 0.0,
                10.0, 5.0, 17.5, 5.0,
                17.5, 7.5, 10.0, 7.5,
                10.0, 15.0, 7.5, 15.0,
                7.5, 7.5, 0.0, 7.5,
                0.0, 5.0, 7.5, 5.0,
                7.5, 00.0
        );
        pane.getChildren().add(starWithCrossForm);
        starWithCrossForm1.getPoints().addAll(
                7.5, 0.0, 10.0, 0.0,
                10.0, 5.0, 17.5, 5.0,
                17.5, 7.5, 10.0, 7.5,
                10.0, 15.0, 7.5, 15.0,
                7.5, 7.5, 0.0, 7.5,
                0.0, 5.0, 7.5, 5.0,
                7.5, 00.0
        );
        pane.getChildren().add(starWithCrossForm1);
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
        pane.getChildren().add(rightNoseCone);
        pane.getChildren().add(leftNoseCone);
        pane.getChildren().add(smoke);
        pane.getChildren().add(smoke1);

        /* Display the scene */
        Scene scene = new Scene(pane, 650, 650);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
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

class Smoke extends Group {

    WritableImage baseImg;
    ImageView[] lifeCycle;

    int FRAMES = 50;
    int FALLING_FRAMES = 32;
    int width = 60;
    int height = 60;
    double radius;
    Point2D midPoint;

    double xThrow = 0;
    int xWobble = 1;
    double yThrow = 5;
    int yWobble = 10;

    Random random;
    int throttle;
    int throttleMax;

    public Smoke(int xLoc, int yLoc, Color color) {
        throttleMax = 4; // 4 ==> 15 fps animation rate
        random = new Random();

        midPoint = new Point2D(width / 2, height / 2);
        radius = width / 2 - 1;
        lifeCycle = new ImageView[50];

        double topAlpha = 0.5;
        double fadeAmount = topAlpha / FALLING_FRAMES;
        double fadeInAmount
                = topAlpha / ((FRAMES - FALLING_FRAMES) * 3);

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

        for (int jj = 0; jj < height; jj++) {
            for (int kk = 0; kk < width; kk++) {
                distance = midPoint.distance(jj, kk);
                if (distance > radius) {
                    gradientFactor = 0.0;
                } else {
                    gradientFactor = (radius - distance) / radius;
                }

                pixA = topAlpha * gradientFactor;
                baseRaster.setColor(jj, kk, new Color(pixR, pixG, pixB, pixA));
            }
        }

        for (int i = 0; i < FRAMES; ++i) {
            lifeCycle[i] = new ImageView();
            lifeCycle[i].setImage(baseImg);
            lifeCycle[i].setX(xLoc);
            lifeCycle[i].setY(yLoc);
            this.getChildren().add(lifeCycle[i]);
        }

        // alpha will rise and fall over course of lifeCycle
        for (int i = 0; i < FALLING_FRAMES; ++i) {
            lifeCycle[i].setOpacity((i + 1) * fadeAmount);
        }

        for (int i = FALLING_FRAMES; i < FRAMES; i++) {
            lifeCycle[i].setOpacity(
                    topAlpha - (i - FALLING_FRAMES + 1) * fadeInAmount);
        }
    }

    public void update() {
        // Slow the animation by skipping cycles. 60 fps is overkill.
        if (throttle-- > 0) {
            return;
        } else {
            throttle = throttleMax;
        }

        // Propagate location of particles, while adding 
        //     'throw' and 'wobble'
        // lifeCycle[n] is stationary (origin of stream, visually)
        int n = FRAMES - 1;
        for (int i = 0; i < n; i++) {
            lifeCycle[i].setX(lifeCycle[i + 1].getX()
                    + xThrow + random.nextInt(xWobble));
            lifeCycle[i].setY(lifeCycle[i + 1].getY()
                    + yThrow + random.nextInt(yWobble));
        }
    }
}
