import java.io.*;
import java.util.*;
public class Rodeo implements java.io.Serializable
{
	private TreeMap<Integer,Contestant> contestants;
	private BarrelRace womensBarrelRace;
	private BarrelRace mensBarrelRace;
	private Roping womensRoping;
	private Roping mensRoping;
	private Poles womensPoles;
	private Poles mensPoles;
	public Rodeo()
	{
		
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean i = true;
		while(i)
		{
			System.out.print("$ ");
			String s=input.nextLine();
			if(s=="add")
				System.out.println("Add a new Event");
			else if(s=="delete")
				System.out.println("Delete an Event");
			else
				System.out.println(s+" is not a valid command");
		}
	}
}
