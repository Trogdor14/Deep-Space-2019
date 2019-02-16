/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
  // Motors
  public static final int LEFT_MOTOR = 1;
  public static final int RIGHT_MOTOR = 2;

  // Joystick Axis
  public static final int LEFT_Y_AXIS = 1;
  public static final int LEFT_X_AXIS = 0;
  public static final int RIGHT_Y_AXIS = 5;
  public static final int RIGHT_X_AXIS = 4;

  // Talon ID's
  public static final int LEFTMASTER = 3;
  public static final int RIGHTMASTER = 1;
  public static final int LEFTSLAVE1 = 4;
  public static final int LEFTSLAVE2 = 11;
  public static final int LEFTSLAVE3 = 12;
  public static final int RIGHTSLAVE1 = 2;
  public static final int RIGHTSLAVE2 = 13;
  public static final int RIGHTSLAVE3 = 14;
  public static final int LIFTMASTER = 8;
  public static final int LIFTFOLLOW = 9;

  public static final int PNEUMATICS = 5;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  // JoystickAxis
  public static final int X_LEFT_AXIS = 0;
  public static final int Y_LEFT_AXIS = 1;
  public static final int LEFT_TRIGGER = 2;
  public static final int RIGHT_TRIGGER = 3;
  public static final int X_RIGHT_AXIS = 4;
  public static final int Y_RIGHT_AXIS = 5;

  /*
   * //this is stuff for logitech that we might not use this year public static
   * final int X_AXIS_LOGITECH = 0; public static final int Y_AXIS_LOGITECH = 1;
   * public static final int Z_AXIS_LOGITECH = 2; public static final int
   * SLIDER_AXIS_LOGITECH = 3;
   * 
   * //Logitech Axis public static final int X_AXIS = 0; public static final int
   * Y_AXIS = 1;
   */

  // basic pneumatic stuff
  public static final int PNEUMATICCLAW_OPEN = 0;
  public static final int PNEUMATICCLAW_CLOSED = 1;
  public static final int CLIMB_EXTRACT = 2;
  public static final int CLIMB_RETRACT = 3;

  // limit switches
  public static final int HATCH_SWITCH_VERTICAL = 2;
  public static final int HATCH_SWTICH_HORIZONTAL = 3;

  // Canifier stuff
  public static final int PIGEONIMU = 10;
  public static final int CANIFIERLIMITS = 0;
  public static final int DIGITALINPUT1 = 2;
  public static final int DIGITALINPUT2 = 3;

  // for fist intake; not the real numbers need to find the real
  // public static final int INTAKE_MASTER = 2;
  // public static final int INTAKE_FOLLOW = 1;
}
