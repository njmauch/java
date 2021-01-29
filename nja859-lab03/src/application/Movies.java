package application;
/**
 * Movies.java is a java class that is a model to read movies from a csv file
 * and enter them in a array list if it meets the requirements of the search criteria
 * Parameters:
 * I	name					Name of the disney movie
 * I	uniqueID				unique ID of the movie
 * I	genre					The genre of the movie
 * I	value					The search paramaters of the movie
 * @author Nathan Mauch (nja859)
 * UTSA CS 3443 - Lab 3
 * Fall 2019
 */	
import java.util.ArrayList;

public class Movies {
	
	private String name;
	
	private String uniqueID;
	
	private String genre;
	
	private ArrayList<Cast> cast;

	public Movies(String name, String uniqueID, String genre)
	{
		this.cast = new ArrayList<Cast>();
		this.name = name;
		this.uniqueID = uniqueID;
		this.genre = genre;
	}

	public String getName()
	{
		return name;
	}
	

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getUniqueID()
	{
		return uniqueID;
	}
	
	public void setUniqueID(String uniqueID)
	{
		this.uniqueID = uniqueID;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public ArrayList<Cast> getCast()
	{
		return cast;
	}
	
	public void setCast(ArrayList<Cast> cast)
	{
		this.cast = cast;
	}
	
	public void addCast(Cast cast)
	{
		this.cast.add(cast);
	}
	/**
	 * toString method to properly format printing the information from the
	 * Zone class and returns to Lab02.
	 */
	public String toString()
	{
		String stringFormat = name + " [" + uniqueID + "], Genre: " + genre +", Cast: " + cast.size() + "\n";

		for(int i = 0; i < cast.size(); i++)
		{
			stringFormat += " -  " + cast.get(i).toString() + "\n";
		}
		return stringFormat;
	}
}
