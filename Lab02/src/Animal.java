/**
 * Animal is a java class that represents the animal array list.  Class contains
 * constructors, getters, and setters to accommodate for the variables.
 * Parameters:
 *  I	name			Name of the animal
 *  I	type			The type of the animal
 *  I	isVegetarian	Boolean value determining if the animal is vegetarian or carnivore
 *  I	zoneCode		Code to determine the zone an animal belongs in
 * @author Nathan Mauch (nja859)
 * UTSA CS 3443 - Lab 2
 * Fall 2019
 */
public class Animal {

	private String name;
	
	private String type;
	
	private boolean isVegetarian;
	
	private String zoneCode;
	/**
	 * 
	 * @param name
	 * @param type
	 * @param isVegetarian
	 * @param zoneCode
	 */
	public Animal(String name, String type, boolean isVegetarian, String zoneCode)
	{
		this.name = name;
		this.type = type;
		this.isVegetarian = isVegetarian;
		this.zoneCode = zoneCode;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getZoneCode()
	{
		return zoneCode;
	}
	
	public void setZoneCode(String zoneCode)
	{
		this.zoneCode = zoneCode;
	}
	
	public String getType()
	{
		return type;
	}
	
	public boolean getVegetarian()
	{
		return isVegetarian;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void setVegetarian(boolean isVegetarian)
	{
		this.isVegetarian = isVegetarian;
	}
	/**
	 * toString method to properly format printing the information from the
	 * Animal class and returns to Lab02.
	 */
	public String toString()
	{
		return String.format("%s - %s " + (!isVegetarian ? "(Vegetarian)" : "(Carnivore)"), name, type);
	}	
}
