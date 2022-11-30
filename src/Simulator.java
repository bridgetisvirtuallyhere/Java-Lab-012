/*
Bridget Acosta 11/30/2023
 */

public class Simulator {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        ss.addSun(new Sun(5000,10,0,0,"Sun"));

        Planet p = new Planet(47.5,100,0,0,6,5,"Earth");
        ss.addPlanets(p);

        p = new Planet(600,500,0,0,6,5,"Venus");
        ss.addPlanets(p);

        ss.showPlanets();

        int timePeriod = 100;
        for(int i=0; i<timePeriod; i++) {
            ss.movePlanets();
            ss.showPlanets();
        }
    }
}
