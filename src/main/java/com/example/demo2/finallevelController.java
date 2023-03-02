package com.example.demo2;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
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

public class finallevelController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(welcome);
        translate.setDuration(Duration.millis(6000));
        translate.setCycleCount(1);
        translate.setByX(1200);
        translate.play();

        TranslateTransition translated = new TranslateTransition();
        translated.setNode(ta1);
        translated.setDuration(Duration.millis(66000));
        translated.setCycleCount(1);
        translated.setByX(1800);
        translated.play();

        TranslateTransition translateda = new TranslateTransition();
        translateda.setNode(ta11);
        translateda.setDuration(Duration.millis(66000));
        translateda.setCycleCount(1);
        translateda.setByX(1800);
        translateda.play();

        TranslateTransition translatedaa = new TranslateTransition();
        translatedaa.setNode(ta111);
        translatedaa.setDuration(Duration.millis(62000));
        translatedaa.setCycleCount(1);
        translatedaa.setByX(1800);
        translatedaa.play();

        TranslateTransition translatedaaf = new TranslateTransition();
        translatedaaf.setNode(ta1112);
        translatedaaf.setDuration(Duration.millis(62000));
        translatedaaf.setCycleCount(1);
        translatedaaf.setByX(2200);
        translatedaaf.play();

    }


    @FXML
    void back(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("maxlevel.fxml")));
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
    private ImageView firerain1;

    @FXML
    private ImageView ta1;

    @FXML
    private ImageView ta11;

    @FXML
    private ImageView use1;
    @FXML
    private ImageView use11;

    @FXML
    private ImageView ta111;

    @FXML
    private ImageView ta1112;
    @FXML
    private ImageView firerain2;
    @FXML
    private ImageView firerain3;
    @FXML
    private ImageView firerain4;
    @FXML
    private ImageView firerain5;
    @FXML
    private ImageView firerain6;
    @FXML
    private ImageView firerain7;
    @FXML
    private ImageView firerain8;
    @FXML
    private ImageView firerain9;
    @FXML
    private ImageView firerain10;
    @FXML
    private ImageView firerain11;

    @FXML
    private ImageView firerain12;
    @FXML
    private ImageView firerain13;
    @FXML
    private ImageView firerain14;
    @FXML
    private ImageView firerain141;;
    @FXML
    private ImageView firerain142;

    @FXML
    private ImageView firerain143;
    @FXML
    private ImageView firerain144;

    @FXML
    private ImageView over;

    @FXML
    private ImageView pic;

    @FXML
    private ImageView use2;

    @FXML
    private ImageView use22;

    @FXML
    private ImageView use3;

    @FXML
    private ImageView use33;

    @FXML
    private ImageView use4;

    @FXML
    private ImageView use44;


    @FXML
    void finalkill(MouseEvent event) {
        TranslateTransition translatede = new TranslateTransition();
        translatede.setNode(ta1);
        translatede.setDuration(Duration.millis(1300));
        translatede.setCycleCount(1);
        translatede.setByY(-800);
        translatede.play();

        TranslateTransition translatedes = new TranslateTransition();
        translatedes.setNode(ta111);
        translatedes.setDuration(Duration.millis(1300));
        translatedes.setCycleCount(1);
        translatedes.setByY(-800);
        translatedes.play();

        TranslateTransition translatedea = new TranslateTransition();
        translatedea.setNode(ta11);
        translatedea.setDuration(Duration.millis(1300));
        translatedea.setCycleCount(1);
        translatedea.setByY(-800);
        translatedea.play();

        TranslateTransition translatedesx = new TranslateTransition();
        translatedesx.setNode(ta1112);
        translatedesx.setDuration(Duration.millis(1300));
        translatedesx.setCycleCount(1);
        translatedesx.setByY(-800);
        translatedesx.play();




        TranslateTransition translat = new TranslateTransition();
        translat.setNode(over);
        translat.setDuration(Duration.millis(2000));
        translat.setCycleCount(1);
        translat.setByY(600);
        translat.play();



        TranslateTransition translatq = new TranslateTransition();
        translatq.setNode(pic);
        translatq.setDuration(Duration.millis(2000));
        translatq.setCycleCount(1);
        translatq.setByY(300);
        translatq.play();

    }

    @FXML
    private ImageView welcome;

    @FXML
    void firerain(MouseEvent event) {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(firerain1);
        translate.setDuration(Duration.millis(1900));
        translate.setCycleCount(1);
        translate.setByY(700);
        translate.play();
        TranslateTransition translated = new TranslateTransition();
        translated.setNode(firerain2);
        translated.setDuration(Duration.millis(1900));
        translated.setCycleCount(1);
        translated.setByY(700);
        translated.play();
        TranslateTransition translates = new TranslateTransition();
        translates.setNode(firerain3);
        translates.setDuration(Duration.millis(1900));
        translates.setCycleCount(1);
        translates.setByY(700);
        translates.play();
        TranslateTransition translatec = new TranslateTransition();
        translatec.setNode(firerain4);
        translatec.setDuration(Duration.millis(1900));
        translatec.setCycleCount(1);
        translatec.setByY(700);
        translatec.play();
        TranslateTransition translaten = new TranslateTransition();
        translaten.setNode(firerain5);
        translaten.setDuration(Duration.millis(1900));
        translaten.setCycleCount(1);
        translaten.setByY(700);
        translaten.play();
        TranslateTransition translatez = new TranslateTransition();
        translatez.setNode(firerain6);
        translatez.setDuration(Duration.millis(1900));
        translatez.setCycleCount(1);
        translatez.setByY(700);
        translatez.play();
        TranslateTransition translatex = new TranslateTransition();
        translatex.setNode(firerain7);
        translatex.setDuration(Duration.millis(1900));
        translatex.setCycleCount(1);
        translatex.setByY(700);
        translatex.play();
        TranslateTransition translatea = new TranslateTransition();
        translatea.setNode(firerain8);
        translatea.setDuration(Duration.millis(1900));
        translatea.setCycleCount(1);
        translatea.setByY(700);
        translatea.play();
        TranslateTransition translatef = new TranslateTransition();
        translatef.setNode(firerain9);
        translatef.setDuration(Duration.millis(1900));
        translatef.setCycleCount(1);
        translatef.setByY(700);
        translatef.play();
        TranslateTransition translater = new TranslateTransition();
        translater.setNode(firerain10);
        translater.setDuration(Duration.millis(1900));
        translater.setCycleCount(1);
        translater.setByY(700);
        translater.play();
        TranslateTransition translatee = new TranslateTransition();
        translatee.setNode(firerain11);
        translatee.setDuration(Duration.millis(1900));
        translatee.setCycleCount(1);
        translatee.setByY(700);
        translatee.play();
        TranslateTransition translateef = new TranslateTransition();
        translateef.setNode(firerain12);
        translateef.setDuration(Duration.millis(1900));
        translateef.setCycleCount(1);
        translateef.setByY(700);
        translateef.play();
        TranslateTransition translateex = new TranslateTransition();
        translateex.setNode(firerain13);
        translateex.setDuration(Duration.millis(1900));
        translateex.setCycleCount(1);
        translateex.setByY(700);
        translateex.play();
        TranslateTransition translateev = new TranslateTransition();
        translateev.setNode(firerain14);
        translateev.setDuration(Duration.millis(1900));
        translateev.setCycleCount(1);
        translateev.setByY(700);
        translateev.play();
        TranslateTransition translateea = new TranslateTransition();
        translateea.setNode(firerain141);
        translateea.setDuration(Duration.millis(1900));
        translateea.setCycleCount(1);
        translateea.setByY(700);
        translateea.play();
        TranslateTransition translateeq = new TranslateTransition();
        translateeq.setNode(firerain142);
        translateeq.setDuration(Duration.millis(1900));
        translateeq.setCycleCount(1);
        translateeq.setByY(700);
        translateeq.play();
        TranslateTransition translateer = new TranslateTransition();
        translateer.setNode(firerain143);
        translateer.setDuration(Duration.millis(1900));
        translateer.setCycleCount(1);
        translateer.setByY(700);
        translateer.play();
        TranslateTransition translateem = new TranslateTransition();
        translateem.setNode(firerain144);
        translateem.setDuration(Duration.millis(1900));
        translateem.setCycleCount(1);
        translateem.setByY(700);
        translateem.play();

        TranslateTransition translatede = new TranslateTransition();
        translatede.setNode(ta1);
        translatede.setDuration(Duration.millis(1300));
        translatede.setCycleCount(1);
        translatede.setByY(-800);
        translatede.play();

        TranslateTransition translatedes = new TranslateTransition();
        translatedes.setNode(ta111);
        translatedes.setDuration(Duration.millis(1300));
        translatedes.setCycleCount(1);
        translatedes.setByY(-800);
        translatedes.play();

        TranslateTransition translateda = new TranslateTransition();
        translateda.setNode(ta11);
        translateda.setDuration(Duration.millis(500));
        translateda.setCycleCount(1);
        translateda.setByX(-120);
        translateda.play();

        TranslateTransition translatedaq = new TranslateTransition();
        translatedaq.setNode(ta1112);
        translatedaq.setDuration(Duration.millis(500));
        translatedaq.setCycleCount(1);
        translatedaq.setByX(-200);
        translatedaq.play();

        RotateTransition fight = new RotateTransition();
        fight.setNode(ta11);
        fight.setDuration(Duration.millis(900));
        fight.setByAngle(360);
        fight.setCycleCount(2);
        fight.play();

    }

    @FXML
    void power(MouseEvent event) {

    }

    @FXML
    void ualex1(MouseEvent event) {
        FadeTransition translatq = new FadeTransition();
        translatq.setNode(use3);
        translatq.setDuration(Duration.millis(500));
        translatq.setCycleCount(1);
        translatq.setFromValue(0);
        translatq.setToValue(1);
        translatq.play();
        TranslateTransition translat = new TranslateTransition();
        translat.setNode(use3);
        translat.setDuration(Duration.millis(3000));
        translat.setCycleCount(1);
        translat.setByX(-300);
        translat.play();
        RotateTransition fight = new RotateTransition();
        fight.setNode(use3);
        fight.setDuration(Duration.millis(800));
        fight.setByAngle(-360);
        fight.play();

    }

    @FXML
    void ualex2(MouseEvent event) {
        FadeTransition translatq = new FadeTransition();
        translatq.setNode(use33);
        translatq.setDuration(Duration.millis(500));
        translatq.setCycleCount(1);
        translatq.setFromValue(0);
        translatq.setToValue(1);
        translatq.play();
        TranslateTransition translat = new TranslateTransition();
        translat.setNode(use33);
        translat.setDuration(Duration.millis(3000));
        translat.setCycleCount(1);
        translat.setByX(-300);
        translat.play();
        RotateTransition fight = new RotateTransition();
        fight.setNode(use33);
        fight.setDuration(Duration.millis(800));
        fight.setByAngle(-360);
        fight.play();

    }

    @FXML
    void ubob1(MouseEvent event) {
        FadeTransition translatq = new FadeTransition();
        translatq.setNode(use2);
        translatq.setDuration(Duration.millis(500));
        translatq.setCycleCount(1);
        translatq.setFromValue(0);
        translatq.setToValue(1);
        translatq.play();
        TranslateTransition translat = new TranslateTransition();
        translat.setNode(use2);
        translat.setDuration(Duration.millis(3000));
        translat.setCycleCount(1);
        translat.setByX(-380);
        translat.play();

    }

    @FXML
    void ubob2(MouseEvent event) {
        FadeTransition translatq = new FadeTransition();
        translatq.setNode(use2);
        translatq.setDuration(Duration.millis(500));
        translatq.setCycleCount(1);
        translatq.setFromValue(0);
        translatq.setToValue(1);
        translatq.play();
        TranslateTransition translat = new TranslateTransition();
        translat.setNode(use2);
        translat.setDuration(Duration.millis(3000));
        translat.setCycleCount(1);
        translat.setByX(-380);
        translat.play();

    }

    @FXML
    void ulara1(MouseEvent event) {
        FadeTransition translatq = new FadeTransition();
        translatq.setNode(use1);
        translatq.setDuration(Duration.millis(500));
        translatq.setCycleCount(1);
        translatq.setFromValue(0);
        translatq.setToValue(1);
        translatq.play();
        TranslateTransition translat = new TranslateTransition();
        translat.setNode(use1);
        translat.setDuration(Duration.millis(4000));
        translat.setCycleCount(1);
        translat.setByX(-300);
        translat.play();

    }

    @FXML
    void ulara2(MouseEvent event) {
        FadeTransition translatq = new FadeTransition();
        translatq.setNode(use11);
        translatq.setDuration(Duration.millis(500));
        translatq.setCycleCount(1);
        translatq.setFromValue(0);
        translatq.setToValue(1);
        translatq.play();
        TranslateTransition translat = new TranslateTransition();
        translat.setNode(use11);
        translat.setDuration(Duration.millis(4000));
        translat.setCycleCount(1);
        translat.setByX(-300);
        translat.play();

    }

    @FXML
    void usim1(MouseEvent event) {
        FadeTransition translatq = new FadeTransition();
        translatq.setNode(use4);
        translatq.setDuration(Duration.millis(500));
        translatq.setCycleCount(1);
        translatq.setFromValue(0);
        translatq.setToValue(1);
        translatq.play();
        TranslateTransition translat = new TranslateTransition();
        translat.setNode(use4);
        translat.setDuration(Duration.millis(6000));
        translat.setCycleCount(1);
        translat.setByX(-490);
        translat.play();
        RotateTransition fight = new RotateTransition();
        fight.setNode(use4);
        fight.setDuration(Duration.millis(800));
        fight.setByAngle(-360);
        fight.play();

    }

    @FXML
    void usim2(MouseEvent event) {
        FadeTransition translatq = new FadeTransition();
        translatq.setNode(use44);
        translatq.setDuration(Duration.millis(500));
        translatq.setCycleCount(1);
        translatq.setFromValue(0);
        translatq.setToValue(1);
        translatq.play();
        TranslateTransition translat = new TranslateTransition();
        translat.setNode(use44);
        translat.setDuration(Duration.millis(6000));
        translat.setCycleCount(1);
        translat.setByX(-490);
        translat.play();
        RotateTransition fight = new RotateTransition();
        fight.setNode(use44);
        fight.setDuration(Duration.millis(800));
        fight.setByAngle(-360);
        fight.play();

    }


    @FXML
    void extra(MouseEvent event) {
        FadeTransition translatq = new FadeTransition();
        translatq.setNode(use44);
        translatq.setDuration(Duration.millis(500));
        translatq.setCycleCount(8);
        translatq.setFromValue(0);
        translatq.setToValue(1);
        translatq.play();
        FadeTransition translatqd = new FadeTransition();
        translatqd.setNode(use4);
        translatqd.setDuration(Duration.millis(500));
        translatqd.setCycleCount(8);
        translatqd.setFromValue(0);
        translatqd.setToValue(1);
        translatqd.play();
        FadeTransition translatqz = new FadeTransition();
        translatqz.setNode(use11);
        translatqz.setDuration(Duration.millis(500));
        translatqz.setCycleCount(8);
        translatqz.setFromValue(0);
        translatqz.setToValue(1);
        translatqz.play();
        FadeTransition translatqe = new FadeTransition();
        translatqe.setNode(use1);
        translatqe.setDuration(Duration.millis(500));
        translatqe.setCycleCount(8);
        translatqe.setFromValue(0);
        translatqe.setToValue(1);
        translatqe.play();
        FadeTransition translatqn = new FadeTransition();
        translatqn.setNode(use2);
        translatqn.setDuration(Duration.millis(500));
        translatqn.setCycleCount(8);
        translatqn.setFromValue(0);
        translatqn.setToValue(1);
        translatqn.play();
        FadeTransition translatqt = new FadeTransition();
        translatqt.setNode(use22);
        translatqt.setDuration(Duration.millis(500));
        translatqt.setCycleCount(8);
        translatqt.setFromValue(0);
        translatqt.setToValue(1);
        translatqt.play();
        FadeTransition translatqa = new FadeTransition();
        translatqa.setNode(use3);
        translatqa.setDuration(Duration.millis(500));
        translatqa.setCycleCount(8);
        translatqa.setFromValue(0);
        translatqa.setToValue(1);
        translatqa.play();
        FadeTransition translatqj = new FadeTransition();
        translatqj.setNode(use33);
        translatqj.setDuration(Duration.millis(500));
        translatqj.setCycleCount(8);
        translatqj.setFromValue(0);
        translatqj.setToValue(1);
        translatqj.play();


        TranslateTransition translatedes = new TranslateTransition();
        translatedes.setNode(ta111);
        translatedes.setDuration(Duration.millis(3000));
        translatedes.setCycleCount(1);
        translatedes.setByY(-800);
        translatedes.play();

        TranslateTransition translatedea = new TranslateTransition();
        translatedea.setNode(ta11);
        translatedea.setDuration(Duration.millis(3000));
        translatedea.setCycleCount(1);
        translatedea.setByY(-800);
        translatedea.play();

        TranslateTransition translatedesx = new TranslateTransition();
        translatedesx.setNode(ta1112);
        translatedesx.setDuration(Duration.millis(3000));
        translatedesx.setCycleCount(1);
        translatedesx.setByY(-800);
        translatedesx.play();

    }
}
