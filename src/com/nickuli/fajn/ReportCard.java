package com.nickuli.fajn;

public class ReportCard {
    public static char convertGrade(int testResult) {
        char grade;
        if (testResult >= 90) {
            grade = 'A';
        } else if (testResult >= 80 && testResult < 90) {
            grade = 'B';
        } else if (testResult >= 70 && testResult < 80) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }

    public static void main(String[] args) {
        char yourGrade = ReportCard.convertGrade(88);
        switch (yourGrade){
            case 'A':
                System.out.println("Превосходная работа!");
                break;
            case 'B':
                System.out.println("Хорошая работа!");
                break;
            case 'C':
                System.out.println("Надо подтянуть знания!");
                break;
            case 'D':
                System.out.println("Будь посерьёзнее!");
                break;
        }
    }
}
