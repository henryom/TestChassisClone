package com.team2915.SER_CHUNKY.autoroutines;

import com.team2915.SER_CHUNKY.commands.chassis.ExecuteTrajectory;
import com.team2915.SER_CHUNKY.util.motion.TrajectoryUtils;
import edu.wpi.first.wpilibj.command.CommandGroup;
import jaci.pathfinder.Waypoint;

public class DriveToScale extends CommandGroup {
  public DriveToScale(){


    //No idea what distance, measure at event
    Waypoint[] waypoints = new Waypoint[]{
        new Waypoint(0, 0, 0),
        new Waypoint(4, 0, 0)
    };
    addSequential(new ExecuteTrajectory(TrajectoryUtils.generateTrajectory(waypoints)));//TODO: add timeout to prevent running into wall
  }
}
