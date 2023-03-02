package com.example.demo2;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class chemclassController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        TranslateTransition translate = new TranslateTransition();
//        translate.setNode(ta);
//        translate.setDuration(Duration.seconds(5));
//        translate.setCycleCount(1);
//        translate.setByX(300);
//        translate.play();
        TranslateTransition translated = new TranslateTransition();
        translated.setNode(ta);
        translated.setDuration(Duration.seconds(12));
        translated.setCycleCount(1);
        translated.setByX(372);
        translated.play();
        RotateTransition fight = new RotateTransition();
        fight.setNode(ta);
        fight.setDuration(Duration.millis(900));
        fight.setByAngle(360);
        fight.setCycleCount(6);
        fight.play();
        TranslateTransition translateq = new TranslateTransition();
        translateq.setNode(over);
        translateq.setDuration(Duration.seconds(48));
        translateq.setCycleCount(1);
        translateq.setByX(1450);
        translateq.play();





    }
    @FXML
    private ImageView ta;

    @FXML
    private ImageView over;

    @FXML
    void fight(MouseEvent event) {
        RotateTransition fight = new RotateTransition();
        fight.setNode(stu);
        fight.setDuration(Duration.millis(800));
        fight.setByAngle(-360);
        fight.play();
    }
    @FXML
    private ImageView pic;
    @FXML
    private ImageView sp;

    @FXML
    private ImageView prof;


    @FXML
    void shoot(MouseEvent event) {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(sp);
        translate.setDuration(Duration.millis(3000));
        translate.setCycleCount(1);
        translate.setByX(-600);
        translate.play();

        TranslateTransition translates = new TranslateTransition();
        translates.setNode(ta);
        translates.setDuration(Duration.millis(850));
        translates.setCycleCount(1);
        translates.setByX(-75);
        translates.play();


        ScaleTransition translated = new ScaleTransition();
        translated.setNode(ta);
        translated.setDuration(Duration.millis(2000));
        translated.setCycleCount(2);
        translated.setInterpolator(Interpolator.LINEAR);
        translated.setByX(0.3);
        translated.setAutoReverse(true);
        translated.play();

    }

    @FXML
    void finalkill(MouseEvent event) {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(ta);
        translate.setDuration(Duration.millis(500));
        translate.setCycleCount(1);
        translate.setByY(-300);
        translate.play();

        TranslateTransition translat = new TranslateTransition();
        translat.setNode(pic);
        translat.setDuration(Duration.millis(2000));
        translat.setCycleCount(1);
        translat.setByY(300);
        translat.play();

    }

    @FXML
    void fire(MouseEvent event) {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(stu);
        translate.setDuration(Duration.millis(700));
        translate.setCycleCount(1);
        translate.setByX(-50);
        translate.play();

    }
    @FXML
    void fireback(MouseEvent event) {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(stu);
        translate.setDuration(Duration.millis(700));
        translate.setCycleCount(1);
        translate.setByX(50);
        translate.play();

    }


    @FXML
    void back(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("choosemap.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void end(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("result.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private ImageView stu;


}
