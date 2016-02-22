package org.usfirst.frc.team1018.robot.subsystems;

import org.usfirst.frc.team1018.robot.RobotMap;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	private double speed;
	public RobotMap myRobot = new RobotMap(0,1,2,3); 
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

  
  	public Shooter() {
  		myRobot.shooterTop = new Jaguar(4); 
  		myRobot.shooterBottom = new Jaguar(5);
  		myRobot.shooterBottom.setInverted(true);
  		speed = 0.0;
  		
  	}
  
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shooterStart() {
    	speed = 0.25;
    	myRobot.shooterTop.set(speed);
    	myRobot.shooterBottom.set(speed);
    }
    
    public void shooterStop() {
    	speed = 0;
    	myRobot.shooterTop.set(speed);
    	myRobot.shooterBottom.set(speed);
    	
    }
    
    public void increaseShooterSpeed(){
    	speed += 0.25;
    	myRobot.shooterTop.set(speed);
    	myRobot.shooterBottom.set(speed);
    	
    }
    
    public void decreaseShooterSpeed(){
    	speed -= 0.25;
    	myRobot.shooterTop.set(speed);
    	myRobot.shooterBottom.set(speed);
    	
    }
}

