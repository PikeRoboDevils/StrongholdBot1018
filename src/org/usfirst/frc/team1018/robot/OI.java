package org.usfirst.frc.team1018.robot;

import org.usfirst.frc.team1018.robot.commands.StartShooter;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private static int GAMEPAD_ELEVEN = 11;
	private static int GAMEPAD_TWELVE = 12;
	private static int GAMEPAD_THIRTEEN = 13;
	private static int GAMEPAD_THREE = 3;
	private static int GAMEPAD_FOUR = 4;
	private static int GAMEPAD_FIVE = 5;
	private static int GAMEPAD_TEN = 10;
	private static int GAMEPAD_TWO = 2;
	
	public Joystick gamepad;
	public Joystick rightStick;
	public Joystick leftStick;
	
	public Button ballInButton,
					ballOutButton,
					readyButton,
					armsButton,
					climbButton,
					fireButton,
					extraButtonOne,
					extraButtonTwo;
					
	
	public OI(){
		this.leftStick = new Joystick(0);
		this.rightStick = new Joystick(1);
		this.gamepad = new Joystick(2);
    	
    	this.fireButton = new JoystickButton(this.gamepad, GAMEPAD_FIVE);
    	this.ballInButton = new JoystickButton(this.gamepad, GAMEPAD_ELEVEN);
    	this.ballOutButton = new JoystickButton(this.gamepad, GAMEPAD_TWELVE);
    	this.readyButton = new JoystickButton(this.gamepad, GAMEPAD_THIRTEEN); 	
    	this.armsButton = new JoystickButton(this.gamepad, GAMEPAD_THREE);
    	this.climbButton = new JoystickButton(this.gamepad, GAMEPAD_FOUR);
    	this.extraButtonOne = new JoystickButton(this.gamepad, GAMEPAD_TEN);
    	this.extraButtonTwo = new JoystickButton(this.gamepad, GAMEPAD_TWO);
    	
    	this.fireButton.whileHeld(new StartShooter());
    	
	}
}

