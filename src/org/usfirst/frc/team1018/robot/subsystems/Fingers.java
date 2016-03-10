package org.usfirst.frc.team1018.robot.subsystems;

import org.usfirst.frc.team1018.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Fingers extends Subsystem {
	
	private Talon fingerOne = RobotMap.fingerOne;
	private Talon fingerTwo = RobotMap.fingerTwo;
	
	public Fingers() {
		// Empty constructor. Consider removing.
	}
	
	public void ExtendFingers(){
		this.fingerOne.set(1.0);
		this.fingerTwo.set(1.0);
	}
	
	public void RetractFingers(){
		this.fingerOne.set(-1.0);
		this.fingerTwo.set(-1.0);
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

