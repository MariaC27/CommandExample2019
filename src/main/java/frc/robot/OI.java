/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());



  //WRITE THIS: declare joysticks and buttons up here before the constructor
  Joystick myJoystick;
  JoystickButton pushButton;
  

  //WRITE this constructor!!!
  public OI(){
    //WRITE THIS - initialize the joysticks and buttons in the constructor 
    myJoystick = new Joystick(0);
    pushButton = new JoystickButton(myJoystick, 5);

    //MOST IMPORTANT PART: Link the button to the command
    pushButton.whileHeld(new StartCommand());
    //in english, this says that when the button is held, the command StartCommand will run, and
    //then inside the command, the subsytem method is called that actually tells the motor to move

    pushButton.whenReleased(new StopCommand());
    //once the button is released, stop the motor


    //NOTE:

    //the "whenPressed" method is for a pneumatic or something when you just want to press the button 
    //once and have something happen

    //the "whileHeld" method is for a motor or something when you want to hold down the button the 
    //entire time to keep the motor moving until you release it
    //when using a whileHeld command, you ALWAYS need the whenReleased command as well to stop the motor



  }

  public Joystick getJoystick(){
    return myJoystick;
  }




}
