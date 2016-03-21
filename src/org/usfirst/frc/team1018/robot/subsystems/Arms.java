package org.usfirst.frc.team1018.robot.subsystems;

import org.usfirst.frc.team1018.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arms extends Subsystem {
	
	private Talon fingerOne = RobotMap.fingerOne;
	private Talon fingerTwo = RobotMap.fingerTwo;
	
	public Arms() {
		// Empty constructor. Consider removing.
	}
	
	public void ExtendArms(){
		this.fingerOne.set(1.0);
		this.fingerTwo.set(1.0);
	}
	
	public void RetractArms(){
		this.fingerOne.set(-1.0);
		this.fingerTwo.set(-1.0);
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

