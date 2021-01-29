/**
 * Zoo is a java class representing the Zoo object, contains constructors,
 * getters, and setters for the variables.
 * Parameters:
 * 	I	name		The name of the Zoo
 * 	I	zones		Array of the zones in the zoo
 * 	I	zoneCount	The max amount of zones
 *  I	count		The number of zones added to the zoo.	
 * @author Nathan Mauch (nja859)
 * UTSA CS 3443 - Lab 1
 * Fall 2019
 */
public class Zoo {
	private String name;
	
	private Zone zones[];
	
	private int zoneCount;
	
	private int count;
	/**]
	 * Constructor which creates the Zoo object and object array for zones
	 * @param name
	 * @param zoneCount
	 */
	public Zoo(String name, int zoneCount)
	{
		this.name = name;
		this.zoneCount = zoneCount;
		zones = new Zone[zoneCount];
		count = 0;
	}
	/**
	 * Adds zones to the zone object
	 * @param zone
	 */
	public void addZone(Zone zone)
	{
		if(count < zoneCount) {
			zones[count] = zone;
			count++;
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getZoneCount()
	{
		return zoneCount;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public Zone[] getZone()
	{
		return zones;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setZoneCount(int zoneCount)
	{
		this.zoneCount = zoneCount;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
	
	public void setZones(Zone[] zones)
	{
		this.zones = zones;
	}
	/**
	 * toString method to properly format printing the information from the
	 * Zoo class and returns to Lab1.
	 */
	public String toString()
	{
		String stringFormat = "Welcome to the \"" + name + "\"!\n";
		for(int i = 0; i < 34; i++)
		{
			stringFormat += "-";
		}
		stringFormat += "\n";
		for(int i = 0; i < count; i++)
		{
			stringFormat += zones[i] + "\n";
		}
		return stringFormat;
	}
}
