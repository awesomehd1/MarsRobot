package com.awesomehd1.MarsRobot;

public class MarsRobot {
    String Status;
    int Speed;
    float Temperature;
    int temperture;
    private String status;

    void CheckTemperature() {

        if (temperture < -80) {
            status = "returning home";
            Speed = 5;
        }
    }

    void showAttributes () {

    }
}
