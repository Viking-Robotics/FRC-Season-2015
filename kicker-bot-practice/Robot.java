
    	frontRight = new Talon(3);
    	rearLeft = new Talon(2);
    	rearRight = new Talon(4);
    	myRobot = new RobotDrive(frontLeft,rearLeft,frontRight,rearRight);
    	stick = new Joystick(1);
    	//stick.setAxisChannel(Joystick:kTwistAxis, 3);
    }
    package org.usfirst.frc.team2928.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	RobotDrive myRobot;
	Joystick stick;
	
	private double magnitude;
	private double direction;
	private double rotation;
	
	Talon frontLeft, frontRight, rearLeft, rearRight;
	
	int autoLoopCounter;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	frontLeft = new Talon(1);
    /**
     * This function is run once each time the robot enters autonomous mode
     */
    public void autonomousInit() {
    	autoLoopCounter = 0;
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	if(autoLoopCounter < 100) //Check if we've completed 100 loops (approximately 2 seconds)
		{
			myRobot.drive(-0.5, 0.0); 	// drive forwards half speed
			autoLoopCounter++;
			} else {
			myRobot.drive(0.0, 0.0); 	// stop robot
		}
    }
    
    /**
     * This function is called once each time the robot enters tele-operated mode
     */
    public void teleopInit(){
    	 magnitude = stick.getMagnitude();
    	 direction = stick.getDirectionDegrees();
    	 rotation = stick.getX();
    	myRobot.mecanumDrive_Polar(magnitude, direction, rotation);
    }

    
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	 magnitude = stick.getMagnitude();
    	 direction = stick.getDirectionDegrees();
    	 rotation = stick.getX();
        myRobot.mecanumDrive_Polar(magnitude, direction, rotation);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	LiveWindow.run();
    }
    
}
