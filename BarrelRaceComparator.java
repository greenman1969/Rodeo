import java.util.Comparator;
public class BarrelRaceComparator implements Comparator<Contestant>
{
	public int compare(Contestant one, Contestant two)
	{
		return Double.compare(one.getBarrelRaceTime(),two.getBarrelRaceTime());
	}
}
