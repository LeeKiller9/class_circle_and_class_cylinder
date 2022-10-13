public class Circle {
    final double PI = 3.14;
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: " + "radius = " + this.radius + ", color = " + this.color + ", area = " + this.getArea();
    }
}
