package shortCircuit;

import robocode.*;
import robocode.Robot;
import java.awt.*;
/*
* @author Nicolas G. Whaibe
*/
public class Johnny5 extends Robot {

    public void run() {

        //Setting Body, Gun, Radar Colors
        setColors(Color.gray, Color.red, Color.gray);

        while(true){
            //turnRadarRight(360);
        }

    }

    public void onScannedRobot(ScannedRobotEvent e){

    }

    public void onHitWall(HitWallEvent e){

    }

    public void onHitRobot(HitRobotEvent e){

    }
}
