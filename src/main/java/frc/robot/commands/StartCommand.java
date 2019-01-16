/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class StartCommand extends Command {
  public StartCommand() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.exampleSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
   
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //WRITE THIS! This is pretty much the only line of code you need to write in a button command
    //This call the method from the subsystem so that when the button is pressed, this command is
    //executed, and here the method is called that moves the motors
    Robot.exampleSubsystem.startShooterMotor();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
    //MAKE SURE THIS RETURNS TRUE SO THE COMMAND CAN BE REPEATED 
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
