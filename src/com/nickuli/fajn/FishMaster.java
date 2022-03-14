package com.nickuli.fajn;

public class FishMaster {
    public static void main(String[] args) {
        Fish myFish = new Fish();
        System.out.println(myFish.say("Привет"));
        myFish.dive(2);
        myFish.dive(97);
        myFish.dive(3);
        myFish.sleep();
    }
}
