package org.usfirst.frc.team1018.robot.subsystems;

import org.usfirst.frc.team1018.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Fingers extends Subsystem {
	public RobotMap myRobot = new RobotMap(0,1,2,3); 
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public Fingers() {
		myRobot.FingerOne = new Talon(8);
		myRobot.FingerTwo = new Talon(9);
	}
	
	public void ExtendFingers(){
		myRobot.FingerOne.set(1);
		myRobot.FingerTwo.set(2);
	}
	
	public void RetractFingers(){
		myRobot.FingerOne.set(-1);
		myRobot.FingerTwo.set(-1);
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

