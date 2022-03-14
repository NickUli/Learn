package com.nickuli.vasilyev8.chapter8;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

class BankAccountUICG {
    double rate;
    PersonUICD fellow;

    BankAccountUICG(String name, double money, int time, double r) {
        this.rate = r;
        fellow = new PersonUICD(name, money, time);
    }

    void show() {
        showMessageDialog(null, fellow, "Депозит", INFORMATION_MESSAGE);
    }

    class PersonUICD {
        String name;
        double money;
        int time;

        PersonUICD(String txt, double m, int t) {
            this.name = txt;
            this.money = m;
            this.time = t;
        }

        double getMoney() {
            double s = money;
            for (int k = 1; k <= time; k++) {
                s *= (1 + rate / 100);
            }
            return Math.round(s * 100) / 100.0;
        }

        public String toString() {
            String txt = "Имя: " + name + "\n";
            txt += "Начальная сумма: " + money + "\n";
            txt += "Процентная ставка: " + rate + "\n";
            txt += "Время (лет): " + time + "\n";
            txt += "Итоговая сумма: " + getMoney();
            return txt;
        }
    }
}

public class UsingInnerClassDemo {
    public static void main(String[] args) {
        BankAccountUICG ivanov = new BankAccountUICG("Иван Иванов", 1000.0, 5, 8.0);
        ivanov.show();
    }
}
