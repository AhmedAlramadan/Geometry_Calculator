package geometry_calculator;

public class Main {
    public static void main(String[] args) {
        Shape myCircle = new Circle(5.0);
        Shape myTriangle = new Triangle(4.0, 6.0);

        System.out.println("--- Geomtry Calculator ---");
        System.out.println(myCircle.getName() + " Area: " + myCircle.calculateArea());
        System.out.println(myTriangle.getName() + " Area " + myTriangle.calculateArea());
    }
}
