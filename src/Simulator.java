import java.util.ArrayList;

public class Simulator {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem(new Sun("Sunny",100,10000), new ArrayList<>());
        ss.addPlanets(
                new Planet("Mupiter", 1, 1, 1000, 1000, 1, -1),
                new Planet("Plearth", 2, 2, -4000, -2500, -1, 1),
                new Planet("I-Can-See-My-House-From-Here", 15, 3, 5000, -4000, 1, 1)
        );

        System.out.println(ss);

        int timePeriod = 1000;

        for (int i = 0; i < timePeriod; i++) {
            ss.movePlanets();
            System.out.printf("Time Period: %d%n", i);
            for (Planet p : ss.getPlanets()) {
                System.out.printf("  %s: (%.3f, %.3f)%n", p.getName(), p.getX(), p.getY());
            }
        }
    }
}
