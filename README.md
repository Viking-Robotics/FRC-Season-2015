FRC-Season-2015
===============

robot code for recycle russsian

mechanum documentation ref:

/**
     * Drive method for Mecanum wheeled robots.
     *
     * A method for driving with Mecanum wheeled robots. There are 4 wheels
     * on the robot, arranged so that the front and back wheels are toed in 45 degrees.
     * When looking at the wheels from the top, the roller axles should form an X across the robot.
     *
     * This is designed to be directly driven by joystick axes.
     *
     * @param x The speed that the robot should drive in the X direction. [-1.0..1.0]
     * @param y The speed that the robot should drive in the Y direction.
     * This input is inverted to match the forward == -1.0 that joysticks produce. [-1.0..1.0]
     * @param rotation The rate of rotation for the robot that is completely independent of
     * the translation. [-1.0..1.0]
     * @param gyroAngle The current angle reading from the gyro.  Use this to implement field-oriented controls.
     */
    public void mecanumDrive_Cartesian(double x, double y, double rotation, double gyroAngle) {
    
 2015 Java Frc things
 http://wpilib.screenstepslive.com/s/4485/m/13809
    
