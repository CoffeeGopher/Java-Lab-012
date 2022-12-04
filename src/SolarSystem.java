import java.util.Arrays;
import java.util.List;

public class SolarSystem {
    private Sun sun;
    private List<Planet> planets;
    private double GRAVITY = 0.1;
    private double DT = 0.1;

    public SolarSystem(Sun sun, List<Planet> planets) {
        this.sun = sun;
        this.planets = planets;
    }



    public void addPlanets(Planet... planets) {
        this.planets.addAll(Arrays.asList(planets));
    }
    public List<Planet> getPlanets() {
        return planets;
    }
    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }
    public Sun getSun() {
        return sun;
    }
    public void setSun(Sun sun) {
        this.sun = sun;
    }

    public void movePlanets() {

        for (Planet p : planets) {
            p.translate(DT * p.getVelX(), DT * p.getVelY());

            // calculate distance from the sun (r)
            double rX = sun.getX() - p.getX();
            double rY = sun.getX() - p.getY();
            double r = Math.sqrt(Math.pow(rX, 2) + Math.pow(rY, 2));

            double accX = GRAVITY * sun.getMass() * rX / Math.pow(r, 3);
            double accY = GRAVITY * sun.getMass() * rY / Math.pow(r, 3);

            p.setVelX(p.getVelX() + DT * accX);
            p.setVelY(p.getVelY() + DT * accY);
        }
    }

    @Override
    public String toString() {
        return "SolarSystem{" +
                "sun=" + sun +
                ", planets=" + planets +
                '}';
    }
}
