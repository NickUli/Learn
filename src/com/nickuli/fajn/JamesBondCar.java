package com.nickuli.fajn;

public class JamesBondCar extends Car {
    public int drive(int howLong) {
        distance += howLong * 180;
        System.out.println("Машина Джеймса Бонда за " + howLong + " часа проделала путь " + distance + " км.");
        return distance;
    }
}
