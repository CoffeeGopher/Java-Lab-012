public class Sun {
    private String name;
    private double radius;
    private double mass;
    private double x;
    private double y;

    public Sun(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        x = 0;
        y = 0;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getMass() {
        return mass;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "radius=" + radius +
                ", mass=" + mass +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
