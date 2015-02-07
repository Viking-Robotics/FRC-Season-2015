package org.usfirst.frc.team2928.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.buttons.Button;

public class Intake {

	Talon talon1;
	Talon talon2;
	//RobotDrive myRobot = new RobotDrive(talon1,talon2);
		
	public Intake(Talon talon1, Talon talon2)  //pneumatics to be add to the constructor
	{
		
		this.talon1 = talon1;
		this.talon2 = talon2;
		
	}
	


	public void takeInTote(Joystick op, Solenoid s, Solenoid s2)
	{
		if((op.getY() >.25))
		{
			talon1.set(-1);
			talon2.set(1);
			return;
		}
		else if((op.getY()<-.25))
				{
					talon1.set(1);
					talon2.set(-1);
					return;
				}
		talon1.set(0);
		talon2.set(0);
		
		
		
		
		
		while(op.getTrigger() == true)
		 {
			 s2.set(false);
			 s.set(true);
			 
			 return;
		 }
		 
		 
			 s.set(false);
			 s2.set(true);
		 }
		
		/*if(op.getTrigger()&&!s.get()&&!s2.get())
		{
			
			s.set(true);
			s2.set(true);
			
		
		}
		else if(!op.getTrigger()&&s.get()&&s2.get())
		{
			s.set(false);
			s2.set(false);
		}*/
		
	}

