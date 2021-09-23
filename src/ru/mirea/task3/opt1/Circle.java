package ru.mirea.task3.opt1;

public class Circle {

    double r, S, P;

    public Circle(double r) {
        this.r = r;
        this.S = Math.PI * r * r;
        this.P = 2 * Math.PI * r;
    }

    public double getP() {
        return P;
    }

    public double getR() {
        return r;
    }

    public double getS() {
        return S;
    }

    public String toString() {
        return "Object <Circle>: {\nradius: " + getR() + "\nS: " + getS() + "\nP: " + getP() + " };\n";
    }
}
