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
  		speed = 0.0;
  	}
  
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shooterStart() {
    	SmartDashboard.putString("Shooter started", "true");
    	speed = 0.25;
    	this.shooterTop.set(speed);
    	this.shooterBottom.set(speed);
    }
    
    public void shooterStop() {
    	speed = 0.0;
    	this.shooterTop.set(speed);
    	this.shooterBottom.set(speed);
    	
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
}

