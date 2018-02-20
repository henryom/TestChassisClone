package com.team2915.SER_CHUNKY.autoroutines;

import com.team2915.SER_CHUNKY.commands.chassis.ExecuteTrajectory;
import com.team2915.SER_CHUNKY.util.motion.TrajectoryUtils;
import edu.wpi.first.wpilibj.command.CommandGroup;
import jaci.pathfinder.Waypoint;

public class DriveToAutoLine extends CommandGroup {
  public DriveToAutoLine(){
    //I think degrees are in radians

    //10 feet = 3.048m
    //go 3.1 so be safe
    Waypoint[] waypoints = new Waypoint[]{
        new Waypoint(0, 0, 0),
        new Waypoint(3.1, 0, 0)
    };
    addSequential(new ExecuteTrajectory(TrajectoryUtils.generateTrajectory(waypoints)));//TODO: add timeout to prevent running into wall
  }

}
