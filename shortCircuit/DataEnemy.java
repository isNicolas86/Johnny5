package shortCircuit;

/**
 * @author Nicolas Whaibe
 */
public class DataEnemy {
    private double energy;
    private double velocity;
    private double heading;
    private double coordinates;
    private double time;


    public DataEnemy(double energy, double velocity, double heading, double coordinates, double time) {
        this.energy = energy;
        this.velocity = velocity;
        this.heading = heading;
        this.coordinates = coordinates;
        this.time = time;
    }

    public double getEnergy() {
        return energy;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getHeading() {
        return heading;
    }

    public double getCoordinates() {
        return coordinates;
    }

    public double getTime() {
        return time;
    }
}
