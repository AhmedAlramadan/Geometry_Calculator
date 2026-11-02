package geometry_calculator;

public class Triangle extends Shape {

    private double base;
    public  double height;

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;

    }

    }

