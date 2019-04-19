package model;

import java.text.DecimalFormat;

public class Triangle implements Figure {
    private String name;
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(String name, double firstSide, double secondSide, double thirdSide) {
        this.name = name;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double getSquare() {
        double p = getPerimeter();
        double halfP = p / 2;
        double result = Math.sqrt(p * (halfP - firstSide) * (halfP - secondSide) * (halfP - thirdSide));

        return result;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "[" + name + "]: " + df.format(getSquare()) + "cm";

    }
}
