package org.usfirst.frc.team1018.robot.commands;

import org.usfirst.frc.team1018.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RetractIntake extends Command {
	
    public RetractIntake() {
    	requires(Robot.intake);
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.intake.initializeCounter();
    	Robot.intake.retractIntake();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Robot.intake.isSwitchSet();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.stopArmIntake();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
