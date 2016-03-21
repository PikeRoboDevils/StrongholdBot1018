package org.usfirst.frc.team1018.robot;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	// Drive motor ports
	private static final int FRONT_LEFT_DRIVE_MOTOR = 0;
	private static final int FRONT_RIGHT_DRIVE_MOTOR = 2;
	private static final int BACK_LEFT_DRIVE_MOTOR = 1;
	private static final int BACK_RIGHT_DRIVE_MOTOR = 3;
	
	// Shooter motor ports
	private static final int TOP_SHOOTER_MOTOR = 4;
	private static final int BOTTOM_SHOOTER_MOTOR = 5;
	
	// Finger motor ports
	private static final int LEFT_FINGER_MOTOR = 6;
	private static final int RIGHT_FINGER_MOTOR = 7;
	
	// The rest of the ports
	private static final int PORT_EIGHT = 8;
	private static final int PORT_NINE = 9;
	private static final int PORT_TEN = 10;
	private static final int PORT_ELEVEN = 11;
	
	// Drive Motors
   public static Talon frontLeft;
   public static Talon frontRight;
   public static Talon backLeft;
   public static Talon backRight;
   
   // Shooter Motors
   public static Talon shooterTop;
   public static Talon shooterBottom;
   
   // Intake motors
   public static Talon intakeWheelLeft;
   public static Talon intakeWheelRight;
   
   // Finger motors
   public static Talon fingerOne;
   public static Talon fingerTwo;
   
   // The rest of the motors
   public static Servo flipperLeft;
   public static Servo flipperRight;
   public static Talon intakeArmLeft;
   public static Talon intakeArmRight;
   

   public void init(){
	   initDriveMotors(FRONT_LEFT_DRIVE_MOTOR, BACK_LEFT_DRIVE_MOTOR, FRONT_RIGHT_DRIVE_MOTOR, BACK_RIGHT_DRIVE_MOTOR);
	   initShooterMotors(TOP_SHOOTER_MOTOR, BOTTOM_SHOOTER_MOTOR);
	   initFingerMotors(LEFT_FINGER_MOTOR, RIGHT_FINGER_MOTOR);
	   initTheRest(PORT_EIGHT, PORT_NINE, PORT_TEN, PORT_ELEVEN);
   }
    
    private void initDriveMotors(int fl, int bl, int fr, int br){
    	frontLeft = new Talon(fl);
    	frontRight = new Talon(fr);
    	backLeft = new Talon(bl);
    	backRight = new Talon(br);
    }
    
   private void initShooterMotors(int tm, int bm){
    	shooterTop = new Talon(tm);
    	shooterBottom = new Talon(bm);
    }
    
   private void initFingerMotors(int lm, int rm){
	   fingerOne = new Talon(lm);
	   fingerTwo = new Talon(rm);
   }
   
   private void initTheRest(int one, int two, int three, int four){
	   flipperLeft = new Servo(one);
	   flipperRight = new Servo(two);
	   intakeArmLeft = new Talon(three);
	   intakeArmRight = new Talon(four);
   }
}
