package com.nickuli.fajn;

public class Car {
    int distance = 0;

    public void start() {
        System.out.println("Машина завелась.");
    }

    public void stop() {
        System.out.println("Машина остановилась.");
    }

    public int drive(int howLong) {
        distance += howLong * 60;
        System.out.println("Машина ехала " + howLong + " часа. Пройденный путь " + distance + " км.");
        return distance;
    }
}
