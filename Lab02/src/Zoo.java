import java.io.*;
import java.util.*;
/**
 * Zoo.java is a java class that represents the Zoo.  Class contains
 * constructors, getters, and setters to accommodate for the variables.
 * Parameters:
 *  I	name			Name of the zoo
 *  I	zones			An array list of the zones in the zoo
 * @author Nathan Mauch (nja859)
 * UTSA CS 3443 - Lab 2
 * Fall 2019
 */
public class Zoo 
{
	private String name;
	
	private ArrayList<Zone> zones;
	/**
	 * 
	 * @param name
	 */
	public Zoo(String name)
	{
		this.name = name;
		this.zones = new ArrayList<Zone>();
		
	}
	
	
	/**
	 * loadZones reads the zones from the csv file and adds the zone
	 * to the array list zones. Throws exception if exception found
	 * @param fileZones
	 * @throws IOException
	 */
	public void loadZones(String fileZones)
	{
		try {
			File file = new File(fileZones);
			Scanner inputStream = new Scanner(file);
		
			while(inputStream.hasNextLine())
			{
				String data = inputStream.nextLine();
				String[] values = data.split(",");
			
				Zone tempZone = new Zone(values[0], values[1], values[2]);
			
				zones.add(tempZone);
			}
			inputStream.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	/**
	 * Reads animals from the csv file animals.csv and then inserts the values
	 * into the animals array list.  Throws exception if exception is found
	 * @param fileAnimals
	 * @throws IOException
	 */
	public void loadAnimals(String fileAnimals)
	{
		try {
			File file = new File(fileAnimals);
			Scanner inputStream = new Scanner(file);
			boolean isVegetarian;
		
			while(inputStream.hasNextLine())
			{
				String data = inputStream.nextLine();
				String[] values = data.split(",");
				int zoneIndex = -3;
				//Since value is read as string uses this if statement
				//to convert value to boolean
				if(values[2].equals("TRUE"))
					isVegetarian = true;
				else
					isVegetarian = false;
			
				Animal tempAnimal = new Animal(values[0], values[1], isVegetarian, values[3]);
				for(int i=0; i < zones.size(); i++)
				{
					//Is checking the zone code of the animal to insert the animal
					//into the appropriate zone.
					Zone currentZone = zones.get(i);
					if(currentZone.getZoneCode().equals(values[3]))
					{
						zoneIndex = i;
						break;
					}
				}
			
				if(zoneIndex >= 0)
				{
					zones.get(zoneIndex).addAnimal(tempAnimal);
				}
			}
			inputStream.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Relocates the animal to another zone
	 * @param animalName
	 * @param zoneIndex
	 */
	public void relocate(String animalName, String zoneIndex)
	{
		int oldZoneIndex = -1;
		int newZoneIndex = -2;
		int animalIndex = -3;
		
		for(int i=0;i < zones.size(); i++)
		{
			Zone currentZone = zones.get(i);
			
			if(animalIndex < 0)
			{
				for(int j=0; j < currentZone.getAnimals().size(); j++)
				{
					Animal currentAnimal = currentZone.getAnimals().get(j);
					if(currentAnimal.getName().equals(animalName))
					{
						animalIndex = j;
						oldZoneIndex = i;
					}
				}
			}
			if(currentZone.getZoneCode().equals(zoneIndex))
			{
				newZoneIndex = i;
			}
		}
		Zone oldZone = zones.get(oldZoneIndex);
		Animal temp = oldZone.getAnimals().get(animalIndex);
		Zone newZone = zones.get(newZoneIndex);
		newZone.addAnimal(temp);
		oldZone.removeAnimal(temp);
	}
	/**
	 * Updates the csv file to match any changes/relocations that may 
	 * have happened
	 */
	public void save()
	{
		try
		{
			FileWriter animalsFile = new FileWriter("animalData/animals.csv");
			for(int i=0; i < zones.size(); i++)
			{
				Zone currentZone = zones.get(i);
				for(int j=0; j < currentZone.getAnimals().size(); j++)
				{
					Animal currentAnimal = currentZone.getAnimals().get(j);
					animalsFile.write(currentAnimal.getName() + "," + currentAnimal.getType() + "," + currentAnimal.getVegetarian() + "," + currentAnimal.getZoneCode());
					
					if(i != zones.size()-1)
						animalsFile.write("\n");
				}
			}
			animalsFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Zone> getZones()
	{
		return this.zones;
	}
	
	public void addZone(Zone newZone)
	{
		this.zones.add(newZone);
	}
	
	public void removeZone(Zone removeZone)
	{
		this.zones.remove(removeZone);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * String format to properly print the name of the zoo
	 */
	public String toString()
	{
		String stringFormat = "Welcome to " + name + "!\n";
		for(int i = 0; i < 30; i++)
		{
			stringFormat += "=";
		}
		stringFormat += "\n";
		for(int i = 0; i < zones.size(); i++)
		{
			stringFormat += zones.get(i).toString() + "\n";
		}
		return stringFormat;
	}
}