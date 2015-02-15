FRC-Season-2015
===============
2015 Java FRC Resources:
http://wpilib.screenstepslive.com/s/4485/m/13809

Getting Started with 2015 Control System:
http://wpilib.screenstepslive.com/s/4485

Info on Driving with Mecanum: http://wpilib.screenstepslive.com/s/4485/m/13809/l/241862-driving-a-robot-using-mecanum-drive

WPILibJ Vision Tracking Documentation: http://first.wpi.edu/FRC/roborio/release/docs/java/classedu_1_1wpi_1_1first_1_1wpilibj_1_1vision_1_1AxisCamera.html

Algorithms for Mecanum Wheels:
http://thinktank.wpi.edu/resources/346/ControllingMecanumDrive.pdf

WPlib Example Robot Setup:
http://wpilib.screenstepslive.com/s/4485/m/13809/l/145307-creating-your-benchtop-test-program#!prettyPhoto

Screensteps for using PID:
http://wpilib.screenstepslive.com/s/3120/m/7912/l/79828-operating-the-robot-with-feedback-from-sensors-pid-control\
http://wpilib.screenstepslive.com/s/3120/m/7882/l/79335-writing-the-code-for-a-pidsubystem-in-java

    How to load working mecanum code on to a robot:
    1) Open Eclipse.
    2) Start a new Example Robot Project.
    3) Instead of using "Getting Started" as a template, use the template labeled "Mecanum Drive".
    4) When the example loads up, change the variable types of the motor channels to "Talon".
    5) Get rid of the lines that mention reversing two of the motors.
    6) Deploy to the robot.
    
    Electrical stuff as of 02/15/15:
    final Solenoid s0 = new Solenoid(0); //r intake open
    final Solenoid s1 = new Solenoid(1); //r intake close
    final Solenoid s2 = new Solenoid(2); //r stacker open
    final Solenoid s3 = new Solenoid(3); //r stacker close
    final Solenoid s4 = new Solenoid(4); //l intake open
    final Solenoid s5 = new Solenoid(5); //l intake close
    final Solenoid s6 = new Solenoid(6); //l stacker open
    final Solenoid s7 = new Solenoid(7); //l stacker closed
    
Ok Team!
=================================================
    
