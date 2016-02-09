package org.usfirst.frc.team1018.robot.subsystems;

import org.usfirst.frc.team1018.robot.RobotMap;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    Jaguar frontLeft = RobotMap.frontLeft;
    Jaguar frontRight = RobotMap.frontRight;
    Victor backLeft = RobotMap.backLeft;
    Victor backRight = RobotMap.backRight;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
   }
    
	public void drive(){
		frontLeft.set(.25);
		frontRight.set(.25);
		backLeft.set(.25);
		backRight.set(.25);
		
	}
	
	public void reverse(){
		frontLeft.set(-.25);
		frontRight.set(-.25);
		backLeft.set(-.25);
		backRight.set(-.25);
	}
	
	public void stop(){
		frontLeft.set(0);
		frontRight.set(0);
		backLeft.set(0);
		backRight.set(0);
		
	}
}

