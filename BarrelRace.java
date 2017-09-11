import java.util.TreeMap;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class BarrelRace extends RodeoEvent implements java.io.Serializable
{
	public BarrelRace()
	{
		super();
	}
	public BarrelRace(TreeMap<Integer,Contestant> contestants)
	{
		super(contestants);
	}
	public void setTime(Contestant contestant, double time)
	{
		contestant.setBarrelRaceTime(time);
	}
	public double getTime(Contestant contestant)
	{
		return contestant.getBarrelRaceTime();
	}
	public ArrayList<Contestant> getPlaces()
	{
		ArrayList<Integer> list = new ArrayList<Integer>(contestants.keySet());
		places = new PriorityQueue(new BarrelRaceComparator());
		for(int i:list)
		{
			places.add(contestants.get(i));
		}
		ArrayList<Contestant> order = new ArrayList<Contestant>();
		for(int i=0;i<3;i++)
		{
			order.add(places.poll());
		}
		for(int i=0;i<3;i++)
		{
			places.add(order.get(i));
		}
		return order;
	}
}
