package org.usfirst.frc.team1018.robot.subsystems;

import org.usfirst.frc.team1018.robot.RobotMap;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	public RobotMap myRobot = new RobotMap(0,1,2,3); 
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public Intake() {
		myRobot.intakeWheelLeft = new Jaguar(6);
		myRobot.intakeWheelRight = new Jaguar(7);
		
	}
	
	public void ExtendIntake(){
		myRobot.intakeWheelLeft.set(1);
		myRobot.intakeWheelRight.set(1);
	}
	
	public void RetractIntake(){
		myRobot.intakeWheelLeft.set(1);
		myRobot.intakeWheelRight.set(1);
	}
	
	public void SpinIntake() {
		myRobot.intakeWheelLeft.set(1);
		myRobot.intakeWheelRight.set(1);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

