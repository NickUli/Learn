package com.nickuli.fajn;

public class CarOwener {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.drive(2);
        myCar.drive(3);
        myCar.stop();
        JamesBondCar agent007Car=new JamesBondCar();
        agent007Car.start();
        agent007Car.drive(2);
        agent007Car.stop();
    }
}
