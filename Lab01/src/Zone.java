/**
 * Zone is a java class representing the Zone object, contains constructors,
 * getters, and setters to accommodate variables for the Zone object.
 * Parameters:
 * 	I	name		Name of the zones
 * 	I	animals		Object for the different animals in each zone
 * 	I	animalCount	Max number of animals per zone
 * 	I	count		Count of the animals in the zone
 * @author Nathan Mauch (nja859)
 * UTSA CS 3443 - Lab 1
 * Fall 2019
 */
public class Zone {

	private String name;
	
	private Animal animals[];
	
	private int animalCount;
	
	private int count;
	/**
	 * Zone constructor to create zone object and new animal object.
	 * @param name
	 * @param animalCount
	 */
	public Zone(String name, int animalCount)
	{
		this.name = name;
		this.animalCount = animalCount;
		animals = new Animal[animalCount];
		count = 0;
	}
	/**
	 * addAnimal method to add new animal to the object.
	 * @param animal
	 */
	public void addAnimal(Animal animal)
	{
		if(count < animals.length)
		{
			animals[count] = animal;
			count++;
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public Animal[] getAnimal()
	{
		return animals;
	}
	
	public int getAnimalCount()
	{
		return animalCount;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAnimal(Animal[] animals)
	{
		this.animals = animals;
	}
	
	public void setAnimalCount(int animalCount)
	{
		this.animalCount = animalCount;
	}
	public void setCount(int count)
	{
		this.count = count;
	}
	/**
	 * toString method to properly format printing the information from the
	 * Zone class and returns to Lab1.
	 */
	public String toString()
	{
		String stringFormat = name + " Zone : \n";
		for(int i = 0; i < 16; i++)
		{
			stringFormat += "-";
		}
		stringFormat += "\n";
		for(int i = 0; i < count; i++)
		{
			stringFormat += " >>  " + animals[i] + "\n";
		}
		return stringFormat;
	}
}
