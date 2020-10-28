package shortCircuit;

import robocode.*;
import robocode.Robot;
import java.awt.*;
import java.util.ArrayList;

/*
* @author Nicolas G. Whaibe
*/
public class Johnny5 extends Robot {
    private DataEnemy dataEnemy;

    public void run() {

        //Setting Body, Gun, Radar Colors
        setColors(Color.gray, Color.red, Color.gray);

        while(true){
            //turnRadarRight(360);
        }

    }

    public void onScannedRobot(ScannedRobotEvent e){
        saveData(e);
    }

    public void onHitWall(HitWallEvent e){

    }

    public void onHitRobot(HitRobotEvent e){

    }

    private void saveData(ScannedRobotEvent e){

    }

    private double[] enemyCoordinates(double x, double y, double distance, double bearing){
        double enemyX = x + distance * Math.cos(Math.toRadians(bearing));
        double enemyY = y + distance * Math.sin(Math.toRadians(bearing));
        double[] coordinates = {enemyX, enemyY};
        return coordinates;
    }
}
