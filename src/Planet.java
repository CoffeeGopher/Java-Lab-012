public class Planet {
    private String name;
    private double radius;
    private double mass;
    private double x;
    private double y;
    private double velX;
    private double velY;

    public Planet(String name, double radius, double mass, double x, double y) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.x = x;
        this.y = y;
        velX = 0;
        velY = 0;
    }

    public Planet(String name, double radius, double mass, double x, double y, double velX, double velY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public double getVelX() {
        return velX;
    }
    public void setVelX(double velX) {
        this.velX = velX;
    }
    public double getVelY() {
        return velY;
    }
    public void setVelY(double velY) {
        this.velY = velY;
    }

    public void translate(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", mass=" + mass +
                ", x=" + x +
                ", y=" + y +
                ", velX=" + velX +
                ", velY=" + velY +
                '}';
    }
}
