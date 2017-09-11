import java.util.TreeMap;
public class Roping extends RodeoEvent implements java.io.Serializable
{
	public Roping()
	{
		super();
	}
	public Roping(TreeMap<Integer,Contestant> contestants)
	{
		super(contestants);
	}
	public void setTime(Contestant contestant, double time)
	{
		contestant.setRopeTime(time);
	}
	public double getTime(Contestant contestant)
	{
		return contestant.getRopeTime();
	}
}
