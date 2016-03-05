package org.usfirst.frc.team1018.robot;

import org.usfirst.frc.team1018.robot.commands.DecreaseShooterSpeed;
import org.usfirst.frc.team1018.robot.commands.IncreaseShooterSpeed;
import org.usfirst.frc.team1018.robot.commands.StartShooter;
import org.usfirst.frc.team1018.robot.commands.StopShooter;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private static int BUTTON_ONE = 1;
	private static int BUTTON_FOUR = 4;
	private static int BUTTON_FIVE = 5;
	
	public Joystick rightStick;
	public Joystick leftStick;
	
	public Button buttonOne;
	public Button buttonFour;
	public Button buttonFive;
	
	public OI(){
		this.leftStick = new Joystick(0);
		this.rightStick = new Joystick(1);
    	
    	this.buttonOne = new JoystickButton(this.rightStick, BUTTON_ONE);
    	this.buttonFour = new JoystickButton(this.rightStick, BUTTON_FOUR);
    	this.buttonFive = new JoystickButton(this.rightStick, BUTTON_FIVE);
    	
    	this.buttonOne.whileHeld(new StartShooter());
    	this.buttonOne.whenReleased(new StopShooter());
    	this.buttonFour.whenPressed(new DecreaseShooterSpeed());
    	this.buttonFive.whenPressed(new IncreaseShooterSpeed());
	}
}

