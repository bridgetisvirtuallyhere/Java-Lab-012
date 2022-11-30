public class Planet {

    private double radius;
    private double mass;

    private double xPosition;
    private double yPosition;
    private double xVelocity;
    private double yVelocity;

    private String name;

    public Planet(double radius,double mass,double xPosition,double yPosition,double xVelocity,double yVelocity, String name) {
        this.radius = radius;
        this.mass = mass;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.name = name;
    }

    public double getXPosition() {
        return this.xPosition;
    }

    public double getYPosition() {
        return this.yPosition;
    }

    public double getXVelocity() {
       return this.xVelocity;
    }

    public double getYVelocity() {
        return this.yVelocity;
    }

    public void setXVelocity(double newVelX) {
        this.yVelocity = newVelX;
    }

    public void setYVelocity(double newVelY) {
        this.yVelocity = newVelY;
    }

    public void moveTo(double newX, double newY) {
        this.xPosition = newX;
        this.yPosition = newY;
    }

    public double getMass() {
        return this.mass;
    }

    @Override
    public String toString() {
        return String.format("%s: x%f, y:%f", this.name, this.xPosition, this.yPosition);
    }

}
