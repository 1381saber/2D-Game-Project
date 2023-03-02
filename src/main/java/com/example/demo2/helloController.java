package com.example.demo2;

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

public class helloController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(bus);
        translate.setDuration(Duration.millis(8000));
        translate.setCycleCount(500);
        translate.setByX(899);
        translate.play();


        TranslateTransition translated = new TranslateTransition();
        translated.setNode(kid);
        translated.setDuration(Duration.millis(8000));
        translated.setCycleCount(500);
        translated.setByX(889);
        translated.play();

    }



    @FXML
    private ImageView bus;
    @FXML
    void exit(MouseEvent event) {
        System.exit(0);

    }
    @FXML
    private ImageView kid;

    @FXML
    void pinfo(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("info.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void start(MouseEvent event) throws IOException {

        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("choosefigter.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
