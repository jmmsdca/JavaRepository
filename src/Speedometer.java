package jmmsdca.github.spdmtr;

public class Speedometer {
	
	private double speed;
	private double accelerationRate;
	
	public Speedometer()
	{
		speed = 0.0;
		accelerationRate = 1.0;
	}
	
	public Speedometer(double theSpeed, double theAccelerationRate)
	{
		speed = theSpeed;
		accelerationRate = theAccelerationRate;
	}
	
	public double accelerate()
	{
		speed += accelerationRate;
		return speed;
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	
	public double getAccelerationRate()
	{
		return accelerationRate;
	}

	public void setAccelerationRate(double accelerationRate)
	{
		this.accelerationRate = accelerationRate;
	}
}
