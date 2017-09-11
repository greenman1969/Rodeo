import java.util.TreeMap;
import java.util.PriorityQueue;
public class RodeoEvent extends Object implements java.io.Serializable
{
	public static void main(String[] args)
	{
		
	}
	protected TreeMap<Integer,Contestant> contestants;
	protected PriorityQueue<Contestant> places;
	public RodeoEvent()
	{
		
	}
	public RodeoEvent(TreeMap<Integer,Contestant> contestants)
	{
		this.contestants=contestants;
	}
	public void addContestant(Contestant contestant)
	{
		contestants.put(contestant.getNumber(),contestant);
	}
	public TreeMap<Integer,Contestant> getContestants()
	{
		return contestants;
	}
}
