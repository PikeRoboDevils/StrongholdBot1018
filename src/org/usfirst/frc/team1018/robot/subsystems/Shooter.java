package org.usfirst.frc.team1018.robot.subsystems;

import org.usfirst.frc.team1018.robot.RobotMap;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Shooter extends Subsystem {
	private double speed; 
	
	private Jaguar shooterTop = RobotMap.shooterTop;
	private Jaguar shooterBottom = RobotMap.shooterBottom;
  
  	public Shooter() {
  		SmartDashboard.putString("Shooter initalized", "true");
  		this.shooterBottom.setInverted(true);
  		setSpeed(0.0);
  	}
  
    public void initDefaultCommand() {
    }
    
    public void shooterStart() {
    	SmartDashboard.putString("Shooter started", "true");
    	
    	// if not spinning
    	if(getSpeed() == 0.0){
    		setSpeed(0.25);
        	this.shooterTop.set(getSpeed());
        	this.shooterBottom.set(getSpeed());
    	} else {
    		this.shooterTop.set(getSpeed());
        	this.shooterBottom.set(getSpeed());
    	}
    }
    
    public void shooterStop() {
    	setSpeed(0.0);
    	this.shooterTop.set(getSpeed());
    	this.shooterBottom.set(getSpeed());
    }
    
    public void increaseShooterSpeed(){
    	if(speed < 1.0){
    		speed += 0.25;
        	this.shooterTop.set(speed);
        	this.shooterBottom.set(speed);
    	}
    }
    
    public void decreaseShooterSpeed(){
    	if(speed > 0.0){
    		speed -= 0.25;
        	this.shooterTop.set(speed);
        	this.shooterBottom.set(speed);
    	}
    }
    
    public double getSpeed() {
    	return this.speed;
    }
    
    public void setSpeed(double s) {
    	this.speed = s;
    }
}
