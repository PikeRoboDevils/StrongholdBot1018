package org.usfirst.frc.team1018.robot.subsystems;

import org.usfirst.frc.team1018.robot.RobotMap;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	
	private Talon intakeWheelLeft = RobotMap.intakeWheelLeft;
	private Talon intakeWheelRight = RobotMap.intakeWheelRight;
	private Talon intakeArmLeft = RobotMap.intakeArmLeft;
	private Talon intakeArmRight = RobotMap.intakeArmRight;

	DigitalInput limitSwitch = new DigitalInput(1);
	Counter counter = new Counter(limitSwitch);
	
	public Intake() {
		// Empty constructor. Consider removing
	}
	
	public boolean isSwitchSet() {
		return counter.get() > 0;
		
	}
	
	public void initializeCounter() {
		counter.reset();
	}
	
	public void extendIntake(){
		this.intakeArmLeft.set(0.5);
		this.intakeArmRight.set(0.5);
	}
	
	public void retractIntake(){
		this.intakeArmLeft.set(-0.5);
		this.intakeArmRight.set(-0.5);
	}
	
	public void stopArmIntake(){
		this.intakeArmLeft.set(0.0);
		this.intakeArmRight.set(0.0);
	}
	
	public void spinIntakeIn() {   
		this.intakeWheelLeft.set(1.0);
		this.intakeWheelRight.set(1.0);
	}
	
	public void spinIntakeOut() {   
		this.intakeWheelLeft.set(-1.0);
		this.intakeWheelRight.set(-1.0);
	}
	
	public void stopWheelIntake() {   
		this.intakeWheelLeft.set(0.0);
		this.intakeWheelRight.set(0.0);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    

}

