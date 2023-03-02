package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 585, 388);
        stage.setTitle(" Koohdel Game ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

class Person {

    public Person(String name  ,int health , int power , int speed) {
         this.setName(name);
         this.setHealth(health);
         this.setPower(power);
         this.setSpeed(speed);


    }

    private static int health;
    private static int power;
    private static int speed;

    public static String getName() {
        return name;
    }
//  -----------
    public static void setName(String name) {
        Person.name = name;
    }
//  -----------
    private static String name;

//    ------------
    public static int getPower() {
        return power;
    }
//    ------------
 public static void setPower(int power) {
        Person.power = power;
    }
//    ------------
public static int getSpeed() {
        return speed;
    }
//    ------------
 public static void setSpeed(int speed) {
        Person.speed = speed;
    }
//    ------------
    public static int getHealth() {
        return health;
    }
//    -----------
    public static void setHealth(int health) {
        Person.health = health;
    }




}

class Ta extends Person{


    public Ta(String name, int health, int power, int speed) {
        super(name, health, power, speed);
    }
}

class Student extends Person {

    public Student(String name, int health, int power, int speed) {
        super(name, health, power, speed);
    }
}