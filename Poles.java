import java.util.TreeMap;
public class Poles extends RodeoEvent implements java.io.Serializable
{
	public Poles()
	{
		super();
	}
	public Poles(TreeMap<Integer,Contestant> contestants)
	{
		super(contestants);
	}
	public void setTime(Contestant contestant, double time)
	{
		contestant.setPoleTime(time);
	}
	public double getTime(Contestant contestant)
	{
		return contestant.getPoleTime();
	}
}
