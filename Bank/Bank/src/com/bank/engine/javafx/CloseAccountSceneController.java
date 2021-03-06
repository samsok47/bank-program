package com.bank.engine.javafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class CloseAccountSceneController extends Controller {
	
	@FXML
	PasswordField password;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void closeAccount(ActionEvent e) throws IOException {
		LOGGER.info("Selected close account button");	
			if(password.getText().equals(bank.getPassword(getAccount()))) {
				bank.closeAccount(getAccount());
				FXMLLoader loader = new FXMLLoader(getClass().getResource("StartScene.fxml"));
				root = loader.load();	
				stage = (Stage)((Node)e.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene);				
				stage.show();	
		} else {
			LOGGER.warn("Invalid password");
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1)  {	
	}
	
}
