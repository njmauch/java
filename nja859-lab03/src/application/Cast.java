package application;
/**
 * Cast.java is a java class that is a model to read characters from a csv file
 * and enter them in a array list according to the uniqueID that it matches to the movie 
 * Parameters:
 * I	characterName			Name of the disney character
 * I	actorName				Name of the actor that played the character
 * I	role					The role of the character in the movie
 * I	nationality				The nationality of the actor
 * @author Nathan Mauch (nja859)
 * UTSA CS 3443 - Lab 3
 * Fall 2019
 */	
public class Cast {

	private String characterName;
	
	private String actorName;
	
	private String role;
	
	private String nationality;
	/**
	 * 
	 * @param characterName
	 * @param actorName
	 * @param role
	 * @param nationality
	 */
	public Cast(String characterName, String actorName, String role, String nationality)
	{
		this.characterName = characterName;
		this.actorName = actorName;
		this.role = role;
		this.nationality = nationality;
	}
	
	public String getCharacterName() 
	{
		return characterName;
	}
	
	public void setCharacterName(String characterName)
	{
		this.characterName = characterName;
	}
	
	public String getActorName()
	{
		return actorName;
	}
	
	public void setActorName(String actorName)
	{
		this.actorName = actorName;
	}
	
	public String getRole()
	{
		return role;
	}
	
	public String getNationality()
	{
		return nationality;
	}
	
	public void setRole(String role)
	{
		this.role = role;
	}
	
	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}
	/**
	 * toString method to properly format printing the information from the
	 * Animal class and returns to Lab02.
	 */
	public String toString()
	{
		return String.format("%s %s, %s (%s)",role, characterName, actorName, nationality);
	}	
}