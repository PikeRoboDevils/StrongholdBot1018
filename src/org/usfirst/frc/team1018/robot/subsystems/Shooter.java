package org.usfirst.frc.team1018.robot.subsystems;

import org.usfirst.frc.team1018.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	private double speed; 
	
	private Talon shooterTop = RobotMap.shooterTop;
	private Talon shooterBottom = RobotMap.shooterBottom;
  
  	public Shooter() {
  		this.shooterBottom.setInverted(true);
  		speed = 0.0;
  	}
  
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shooterStart() {
    	speed = 0.25;
    	this.shooterTop.set(speed);
    	this.shooterBottom.set(speed);
    }
    
    public void shooterStop() {
    	speed = 0;
    	this.shooterTop.set(speed);
    	this.shooterBottom.set(speed);
    	
    }
    
    public void increaseShooterSpeed(){
    	speed += 0.25;
    	this.shooterTop.set(speed);
    	this.shooterBottom.set(speed);
    	
    }
    
    public void decreaseShooterSpeed(){
    	speed -= 0.25;
    	this.shooterTop.set(speed);
    	this.shooterBottom.set(speed);
    	
    }
}

