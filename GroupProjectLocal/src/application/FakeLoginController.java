package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FakeLoginController implements Initializable {
	@FXML
	public Label myLabel;
	@FXML
	private TextField textArea; 
	
	public void buttonAction(ActionEvent event) {
		String value = textArea.getText();
		try {		
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Account.fxml"));
			Parent root = loader.load();
			AccountController accountController = loader.getController();
			accountController.Welcome(value);
			
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.setTitle("Account Page");
			stage.show();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		myLabel.setText("User Name: ");
	}
}
