import java.util.ArrayList;

public class SolarSystem {

    private Sun theSun;
    private ArrayList<Planet> planets;

    public SolarSystem() {
        planets = new ArrayList<>();
        //this.theSun = Sun;
    }

    public void addPlanets(Planet p){
        planets.add(p);
    }

    public void addSun(Sun sun) {
        this.theSun = sun;
    }

    public void showPlanets() {
        for(Planet p : this.planets) {
            System.out.println(p);
        }
    }

    public void movePlanets() {
        double G = 0.2;
        double dt = 0.001;


        double x = 0.0;
        double y = 0.0;
        for(Planet p : this.planets) {
            System.out.println(p);
            p.moveTo(p.getXPosition() + dt * p.getXVelocity(),
                    p.getYPosition() + dt * p.getYVelocity()
            );

            double rx = this.theSun.getXPosition() - p.getXPosition();
            double ry = this.theSun.getYPosition() - p.getYPosition();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.theSun.getMass() * rx / Math.pow(r,3);
            double accY = G * this.theSun.getMass() * ry / Math.pow(r,3);

            p.setXVelocity(p.getXVelocity() + dt * accX);
            p.setYVelocity(p.getYVelocity() + dt * accY);
        }
    }

}
