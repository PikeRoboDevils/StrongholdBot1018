package org.usfirst.frc.team1018.robot.commands;

import org.usfirst.frc.team1018.robot.subsystems.Fingers;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RetractFingers extends Command {
	Fingers fingers;
    public RetractFingers() {
    	fingers = new Fingers();
    	requires(fingers);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	fingers.RetractFingers();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}