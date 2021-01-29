package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
/**
 * MainController.java is a java class that is a controller for the lab03 program.
 * Handles ActionEvent from Main.fxml and then will get list of Disney movies based on 
 * search criteria entered by user
 * Parameters:
 *  I	event			Event of pressing button
 *  I	textArea		Search parameters entered by user
 *  O	result			Result of movies from search parameters
 *  I	movies			Movies object with array list of disney movies
 * @author Nathan Mauch (nja859)
 * UTSA CS 3443 - Lab 3
 * Fall 2019
 */


public class MainController {
	
	@FXML
	private TextField textArea;
	@FXML
	private DisneyMovies movies;
	@FXML
	private TextArea result;

	public void handle(ActionEvent event) {
		String value = textArea.getText();
		movies = DisneyMovies.getMoviesByName(value);
		result.setText(movies.toString());
	}
}
