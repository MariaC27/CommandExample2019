/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ExampleSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static SpeedController shooterSpark = RobotMap.shooterSpark;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }


  //WRITE THESE TWO METHODS!! 
  //CALL THESE METHODS in the commands when the button is pressed
  public void startShooterMotor(){

    shooterSpark.set(1);
    //set the % output to a number from -1 to 1


  }

  public void stopShooterMotor(){

    shooterSpark.set(0);
    //set the output to zero, which stops the motor

  }

}
