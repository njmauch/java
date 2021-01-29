/**
 * Animal is a java class that represents the animal object.  Class contains
 * constructors, getters, and setters to accommodate for the variables.
 * Parameters:
 *  I	name			Name of the animal
 *  I	type			The type of the animal
 *  I	isVegetarian	Boolean value determining if the animal is vegetarian or carnivore
 * @author Nathan Mauch (nja859)
 * UTSA CS 3443 - Lab 1
 * Fall 2019
 */
public class Animal {

	private String name;
	
	private String type;
	
	private boolean isVegetarian;
	/**
	 * Constructor to add animals to the object
	 * @param name
	 * @param type
	 * @param isVegetarian
	 */
	public Animal(String name, String type, boolean isVegetarian)
	{
		this.name = name;
		this.type = type;
		this.isVegetarian = isVegetarian;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getType()
	{
		return type;
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
	 * Animal class and returns to Lab1.
	 */
	public String toString()
	{
		return String.format("%s - %s " + (!isVegetarian ? "(Vegetarian)" : "(Carnivore)"), name, type);
	}	
}
