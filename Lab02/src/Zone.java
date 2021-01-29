/**
 * Zone is a java class representing the Zone array list, contains constructors,
 * getters, and setters to accommodate variables for the Zone array list.
 * Parameters:
 * 	I	name		Name of the zones
 * 	I	safetyList	Value of the safety rating of the zone
 * 	I	zoneCode	Code of zone
 * 	I	animals		An array list of animals in each zone
 * @author Nathan Mauch (nja859)
 * UTSA CS 3443 - Lab 2
 * Fall 2019
 */
import java.util.*;

public class Zone {

	private String name;
	
	private String safetyLevel;
	
	private String zoneCode;
	
	private ArrayList<Animal> animals;

	/**
	 * 
	 * @param name
	 * @param safetyLevel
	 * @param zoneCode
	 */
	public Zone(String name, String safetyLevel, String zoneCode)
	{
		this.animals = new ArrayList<Animal>();
		this.name = name;
		this.safetyLevel = safetyLevel;
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
	
	public String getSafetyLevel()
	{
		return safetyLevel;
	}
	
	public void setSafetyLevel(String safetyLevel)
	{
		this.safetyLevel = safetyLevel;
	}
	
	public String getZoneCode()
	{
		return zoneCode;
	}
	
	public void setZoneCode(String zoneCode)
	{
		this.zoneCode = zoneCode;
	}

	public ArrayList<Animal> getAnimals()
	{
		return animals;
	}
	
	public void setAnimals(ArrayList<Animal> animals)
	{
		this.animals = animals;
	}
	
	public void addAnimal(Animal animal)
	{
		this.animals.add(animal);
	}
	
	public void removeAnimal(Animal animal)
	{
		this.animals.remove(animal);
	}
	/**
	 * toString method to properly format printing the information from the
	 * Zone class and returns to Lab02.
	 */
	public String toString()
	{
		String stringFormat = zoneCode + ": " + name + " Zone (" + safetyLevel +" risk): \n";
		for(int i = 0; i < 29; i++)
		{
			stringFormat += "-";
		}
		stringFormat += "\n";
		for(int i = 0; i < animals.size(); i++)
		{
			stringFormat += " >>  " + animals.get(i).toString() + "\n";
		}
		return stringFormat;
	}
}
