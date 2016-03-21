package org.usfirst.frc.team1018.robot.subsystems;

import org.usfirst.frc.team1018.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Shooter extends Subsystem {
	private double speed; 
	
	private Talon shooterTop = RobotMap.shooterTop;
	private Talon shooterBottom = RobotMap.shooterBottom;
	private Servo flipperLeft = RobotMap.flipperLeft;
	private Servo flipperRight = RobotMap.flipperRight;
  
  	public Shooter() {
  		SmartDashboard.putString("Shooter initalized", "true");
  		this.shooterBottom.setInverted(true);
  		setSpeed(0.0);
  	}
  
    public void initDefaultCommand() {
    }
    
    public void shooterStart() {
    	SmartDashboard.putString("Shooter started", "true");
		setSpeed(0.8);
    }
    
    public void shooterStop() {
    	setSpeed(0.0);
    }
    
    
    public double getSpeed() {
    	return this.speed;
    }
    
    public void setSpeed(double s) {
    	this.speed = s;
    	this.shooterTop.set(this.speed);
    	this.shooterBottom.set(this.speed);
    }
    
    public double getLeftServoPosition(){
    	return this.flipperLeft.get();
    }
    
    public double getRightServoPosition(){
    	return this.flipperRight.get();
    }
    
    public void flipperUp(){
    	this.flipperLeft.set(1.0);
    	this.flipperRight.set(1.0);
    }
    
    public void flipperDown(){
    	this.flipperLeft.set(0.0);
    	this.flipperRight.set(0.0);
    }
}
