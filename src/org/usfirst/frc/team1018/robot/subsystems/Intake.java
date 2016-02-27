package org.usfirst.frc.team1018.robot.subsystems;

import org.usfirst.frc.team1018.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	
	private Talon intakeWheelLeft = RobotMap.intakeWheelLeft;
	private Talon intakeWheelRight = RobotMap.intakeWheelRight;

	public Intake() {
		// Empty constructor. Consider removing.
	}
	
	public void ExtendIntake(){
		this.intakeWheelLeft.set(1.0);
		this.intakeWheelRight.set(1.0);
	}
	
	public void RetractIntake(){
		this.intakeWheelLeft.set(-1.0);
		this.intakeWheelRight.set(-1.0);
	}
	
	public void SpinIntake() {
		this.intakeWheelLeft.set(1.0);
		this.intakeWheelRight.set(1.0);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

