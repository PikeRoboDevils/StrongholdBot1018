package org.usfirst.frc.team1018.robot.commands;

import org.usfirst.frc.team1018.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class StartShooter extends Command {
	
    public StartShooter() {
    	requires(Robot.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        SmartDashboard.putString("Flywheels initalized ", "true"); 
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putString("Flywheels spinning ", "true");
    	Robot.shooter.shooterStart();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	SmartDashboard.putString("Finished ", "false");
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	SmartDashboard.putString("Flywheels spinning ", "false");
    	SmartDashboard.putString("Finished ", "true");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
