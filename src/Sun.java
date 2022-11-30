public class Sun {

    private double radius;
    private double mass;
    private double xPosition;
    private double yPosition;
    private String name;

    public Sun(double radius, double mass, double xPosition, double yPosition, String name){
        this.radius = radius;
        this.mass = mass;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.name = name;
    }

    public double getMass() {
        return this.mass;
    }

    public double getXPosition() {
        return this.xPosition;
    }

    public double getYPosition() {
        return this.yPosition;
    }

}
