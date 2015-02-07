
package org.usfirst.frc.team2928.robot;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Timer;
/**
* This is a demo program showing how to use Mecanum control with the RobotDrive class.
*/
public class Robot extends SampleRobot {
RobotDrive robotDrive;
Joystick stick;
Joystick otherStick;
// Channels for the wheels
//Compressor compressor = new Compressor();

final Talon frontLeftChannel = new Talon(2);
final Talon rearLeftChannel	= new Talon (3);
final Talon frontRightChannel = new Talon (1);
final Talon rearRightChannel = new Talon (4);
final Talon talon1 = new Talon(5);
final Talon talon2 = new Talon(7);
final Solenoid s = new Solenoid(0);
final Solenoid s2 = new Solenoid(1);
final Intake i = new Intake(talon1, talon2);
// The channel on the driver station that the joystick is connected to
final int joystickChannel	= 0;
final int otherJoystickChannel = 1;
double frontLeftVoltage;
double rearLeftVoltage;
double frontRightVoltage;
double rearRightVoltage;
public Robot() {
//Button halfSpeed = new Button(7);
robotDrive = new RobotDrive(frontLeftChannel, rearLeftChannel, frontRightChannel, rearRightChannel);
// you may need to change or remove this to match your robot
stick = new Joystick(joystickChannel);
otherStick= new Joystick(otherJoystickChannel);
//compressor.start();
}
/*** Runs the motors with Mecanum drive.
*/
public void autonomous()
{
	while(isAutonomous() && isEnabled())
	{
		
	}

}
	public void operatorControl() {
	robotDrive.setSafetyEnabled(true);
		while (isOperatorControl() && isEnabled()) {

			double robotSpeedFL = stick.getY();
			double robotAngleFL = stick.getZ();
			double robotStrafeFL = stick.getX();
			frontLeftVoltage =robotSpeedFL*Math.sin(robotAngleFL+(Math.PI/4)+robotStrafeFL);
			rearLeftVoltage = robotSpeedFL*Math.cos(robotAngleFL+(Math.PI/4)+robotStrafeFL);
			frontRightVoltage = robotSpeedFL*Math.cos(robotAngleFL+(Math.PI/4)-robotStrafeFL);
			rearRightVoltage = robotSpeedFL*Math.sin(robotAngleFL+(Math.PI/4)-robotStrafeFL);


//solenoidSwitch(new Joystick(0), s1);

Timer.delay(.05);
i.takeInTote(otherStick, s, s2);

if((stick.getX() > .2 || stick.getX()< -.2) || (stick.getY()>.2 || stick.getY() <-.2) || (stick.getZ()>.3 || stick.getZ() <-.3))
{
	frontLeftChannel.set(frontLeftVoltage);
	rearLeftChannel.set(rearLeftVoltage);
	frontRightChannel.set(frontRightVoltage);
	rearLeftChannel.set(rearLeftVoltage);
//if(stick.GetRawButton(halfSpeed) == true;)
// Use the joystick X axis for lateral movement, Y axis for forward movement, and Z axis for rotation.
// This sample does not use field-oriented drive, so the gyro input is set to zero.
//Z and X are inverted because the joystick is stupid.


robotDrive.mecanumDrive_Cartesian(stick.getX(), stick.getY(), stick.getZ(), 0);
System.out.println(stick.getZ());

}
Timer.delay(0.005);	// wait 5ms to avoid hogging CPU cycles
}
}

}
