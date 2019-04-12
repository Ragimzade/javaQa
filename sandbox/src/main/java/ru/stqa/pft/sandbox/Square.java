package ru.stqa.pft.sandbox;

public class Square {
    public double l;

    public double area() {
        return this.l * this.l;
    }

    public Square(double l) {
        this.l = l;
    }
}
