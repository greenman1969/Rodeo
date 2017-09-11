import java.util.ArrayList;
public class Contestant extends Object implements java.io.Serializable
{
	public static void main(String[] args)
	{
		
	}
	private String name;
	private int number;
	private boolean sex;
	private double barrelRaceTime;
	private double ropeTime;
	private double poleTime;
	private int barebackScore;
	private int bullridingScore;
	private int saddleBronkRidingScore;
	private double steerWrestlingTime;
	
	
	public Contestant(String name, boolean sex, int number)
	{
		this.name=name;
		this.number=number;
		this.sex=sex;
	}
	public int getNumber()
	{
		return number;
	}
	public double getBarrelRaceTime()
	{
		return barrelRaceTime;
	}
	public void setBarrelRaceTime(double time)
	{
		barrelRaceTime=time;
	}
	public double getRopeTime()
	{
		return ropeTime;
	}
	public void setRopeTime(double time)
	{
		ropeTime=time;
	}
	public double getPoleTime()
	{
		return poleTime;
	}
	public void setPoleTime(double time)
	{
		poleTime=time;
	}
}
