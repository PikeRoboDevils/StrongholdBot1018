package org.usfirst.frc.team1018.robot;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	// Drive Motors
   public SpeedController frontLeft;
   public SpeedController frontRight;
   public SpeedController backLeft;
   public SpeedController backRight;
   
   // Shooter Motors
   public SpeedController shooterTop;
   public SpeedController shooterBottom;
   
   //intake motors
   public SpeedController intakeWheelLeft;
   public SpeedController intakeWheelRight;
   
   //Finger motors
   public SpeedController FingerOne;
   public SpeedController FingerTwo;
   
    	
    public RobotMap(int fl, int bl, int fr, int br){
    	frontLeft = new Jaguar(fl);
    	frontRight = new Jaguar(fr);
    	backLeft = new Jaguar(bl);
    	backRight = new Jaguar(br);
 }
    
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
