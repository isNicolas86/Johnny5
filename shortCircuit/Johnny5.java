package shortCircuit;

import robocode.*;
import robocode.Robot;
import java.awt.*;

/*
* @author Nicolas G. Whaibe
*/
public class Johnny5 extends Robot {
    private DataEnemy dataEnemy;

    public void run() {

        //Setting Body, Gun, Radar Colors
        setColors(Color.gray, Color.red, Color.gray);

        while(true){
            turnRadarRight(36000);
        }

    }

    public void onScannedRobot(ScannedRobotEvent e){
        saveData(e, this.getHeading());
    }

    public void onHitWall(HitWallEvent e){

    }

    public void onHitRobot(HitRobotEvent e){

    }


    /*
    * Testing saving and retrieving data of an enemy in an object
    * */
    private void saveData(ScannedRobotEvent e, double myHeading){
        double eAngle = myHeading + e.getBearing(); //Angle between Y axis my robot and enemy robot
        dataEnemy = new DataEnemy(e.getEnergy(), e.getVelocity(), e.getHeading(),
                enemyCoordinates(getX(), getY(), e.getDistance(), eAngle), e.getTime());
        System.out.println("\nEnergy of the enemy: " + dataEnemy.getEnergy());
        System.out.println("Velocity of the enemy: " + dataEnemy.getVelocity());
        System.out.println("Heading of the enemy: " + dataEnemy.getHeading());
        System.out.println("X of the enemy: " + dataEnemy.getCoordinates()[0]);
        System.out.println("Y of the enemy: " + dataEnemy.getCoordinates()[1]);
        System.out.println("Time captured: " + dataEnemy.getTime());
    }

    /*
    * Return (X,Y) of an enemy
    * */
    private double[] enemyCoordinates(double x, double y, double distance, double eAngle){
        double enemyX = x + distance * Math.sin(Math.toRadians(eAngle));
        double enemyY = y + distance * Math.cos(Math.toRadians(eAngle));
        double[] coordinates = {enemyX, enemyY};
        return coordinates;
    }
}
