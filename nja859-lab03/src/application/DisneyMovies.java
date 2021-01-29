package application;
/**
 * DisneyMovies.java is a java class that is a model to initialize the object for the
 * Disney Movies.  Will load up 2 csv files, one of movies and one of characters and enter them
 * into array list and adding characters to the proper movies based on the unique ID
 * Parameters:
 * I	value					the search parameter of movies
 * O	disneyMovies			Object containing array list of movies that match the search
 * @author Nathan Mauch (nja859)
 * UTSA CS 3443 - Lab 3
 * Fall 2019
 */	
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DisneyMovies {
	
	public static ArrayList<Movies> movies;
	
	public DisneyMovies(String name) {
		DisneyMovies.movies = new ArrayList<Movies>();
	}
	
	public static DisneyMovies getMoviesByName(String value){
		DisneyMovies disneyMovies = new DisneyMovies("List of movies");
		loadMovies("data/movies.csv", value);
		loadCast("data/characters.csv", value);
		return disneyMovies;
	}
	
	public static void loadMovies(String fileMovies, String value) {
		try {
			File file = new File(fileMovies);
			Scanner inputStream = new Scanner(file);
		
			while(inputStream.hasNextLine())
			{
				String data = inputStream.nextLine();
				String[] values = data.split(",");
				if(values[0].contains(value))
				{
					Movies tempMovies = new Movies(values[0], values[1], values[2]);
			
					movies.add(tempMovies);
				}
			}
			inputStream.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void loadCast(String fileCast, String value)
	{
		
		try {
			File file = new File(fileCast);
			Scanner inputStream = new Scanner(file);
		
			while(inputStream.hasNextLine())
			{
				int movieIndex = -3;
				String data = inputStream.nextLine();
				String[] values = data.split(",");
			
				Cast tempCast = new Cast(values[0], values[1], values[2], values[4]);
				for(int i=0; i < movies.size(); i++)
				{
					Movies currentMovie = movies.get(i);
					if(currentMovie.getUniqueID().equals(values[3]))
					{
						movieIndex = i;
						break;
					}
				}
			
				if(movieIndex >= 0)
				{
					movies.get(movieIndex).addCast(tempCast);
				}
			}
			inputStream.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String toString()
	{
		String stringFormat = "";
		for(int i = 0; i < movies.size(); i++)
		{
			stringFormat += movies.get(i).toString() + "\n";
		}
		return stringFormat;
	}
}
