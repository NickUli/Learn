package com.nickuli.fajn;

public class TemperatureConverter {
    public String convertedTemp(int temperature, char convertTo) {
        String str="";
        switch (convertTo) {
            case 'C':
                System.out.println("Температура = " + (temperature - 273.15) + " по Цельсию.");
                break;
            case 'F':
                System.out.println("Температура = " + (temperature * 9 / 5 - 459.67) + " по Фаренгейту.");
                break;
            default:
                System.out.println("Некорректно введенные данные.");
        }
        return str;
    }

    public static void main(String[] args) {
        TemperatureConverter tc=new TemperatureConverter();
        tc.convertedTemp(100,'F');
    }
}
