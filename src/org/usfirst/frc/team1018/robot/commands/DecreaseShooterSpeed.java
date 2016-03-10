package org.usfirst.frc.team1018.robot.commands;

import org.usfirst.frc.team1018.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DecreaseShooterSpeed extends Command {

    public DecreaseShooterSpeed() {
    	requires(Robot.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.shooter.setSpeed((Robot.shooter.getSpeed() - 0.25));
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
