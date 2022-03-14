package com.nickuli.vasilyev8.chapter7;

abstract class ColoredFigureUACD {
    String color;
    int size;

    ColoredFigureUACD(String clr, int s) {
        this.color = clr;
        this.size = s;
    }

    void show() {
        System.out.println("Фигура: " + color + " " + getName());
        System.out.println("Характерный размер (" + getSizeName() + "): " + size);
        System.out.printf("Площадь: %.3f\n", getArea());
        String line = "";
        for (int k = 1; k <= 30; k++) {
            line += "*";
        }
        System.out.println(line);
    }

    String getSizeName() {
        return "сторона";
    }

    abstract String getName();

    abstract double getArea();
}

class TriangleUACD extends ColoredFigureUACD {
    TriangleUACD(String clr, int s) {
        super(clr, s);
    }

    String getName() {
        return "треугольник";
    }

    double getArea() {
        double k = Math.sqrt(3) / 4;
        return size * size * k;
    }
}

class SquareUACD extends ColoredFigureUACD {
    SquareUACD(String clr, int s) {
        super(clr, s);
    }

    String getName() {
        return "квадрат";
    }

    double getArea() {
        double k = 1;
        return size * size * k;
    }
}

class CircleUACD extends ColoredFigureUACD {
    CircleUACD(String clr, int s) {
        super(clr, s);
    }

    String getName() {
        return "круг";
    }

    double getArea() {
        double k = Math.PI;
        return size * size * k;
    }

    String getSizeName() {
        return "радиус";
    }
}

public class UsingAbstractClassDemo {
    public static void main(String[] args) {
        TriangleUACD T = new TriangleUACD("красный", 2);
        SquareUACD S = new SquareUACD("черный", 3);
        CircleUACD C = new CircleUACD("желтый", 1);
        System.out.println("Использование объектных переменных подкласса");
        T.show();
        S.show();
        C.show();
        ColoredFigureUACD F;
        System.out.println("Использование объектной переменной абстрактного суперкласса");
        F = T;
        F.show();
        F = S;
        F.show();
        F = C;
        F.show();
    }
}
