package org.usfirst.frc.team1018.robot.commands;

import org.usfirst.frc.team1018.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ExtendIntake extends Command {
	
    public ExtendIntake() {
    	requires(Robot.intake);
      
    }

   
    protected void initialize() {
    	Robot.intake.initializeCounter();
    	Robot.intake.extendIntake();
    }

    
    protected void execute() {
    }

    protected boolean isFinished() {
        return Robot.intake.isSwitchSet();
    }

   
    protected void end() {
    	Robot.intake.stopArmIntake();
    }

   
    protected void interrupted() {
    }
}
