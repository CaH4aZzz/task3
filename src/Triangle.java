import java.text.DecimalFormat;

/**
 * Created by avokado on 15.04.2019.
 */
public class Triangle {
    private String name;
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle() {
    }

    public Triangle(String name, double firstSide, double secondSide, double thirdSide) {
        this.name = name;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    public double getSquare() {
        double halfP = getPerimeter() / 2;

        double result = Math.sqrt((halfP - firstSide) * (halfP - secondSide) * (halfP - thirdSide));

        return result;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "[" + name + "]: " + df.format(getSquare()) + "cm";

    }
}
