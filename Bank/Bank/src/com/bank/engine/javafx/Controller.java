package com.bank.engine.javafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.bank.engine.accounts.Account;
import com.bank.engine.accounts.Bank;
import com.bank.engine.utilitys.Logging;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller implements Initializable {	
	
	protected Logging LOGGER = new Logging(Controller.class.getName());	 
	
	 private Stage stage;
	 private Scene scene;
	 private Parent root; 
 
   private static Account account;
   
   protected Bank bank = new Bank();
   
   public String toString() {
		return "Controller";
	}
   
	protected void setAccount(Account account) {
		Controller.account = account;
	}
	
	protected static Account getAccount() {
		return account;
	}
	
	public void switchToNewAccountScene(ActionEvent e) throws IOException {	
		LOGGER.info("Switched to New Account scene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("NewAccountScene.fxml"));
		root = loader.load();
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();	
	}
	
	public void switchToBalanceScene(ActionEvent e) throws IOException {	
		LOGGER.info("Switched to Balance scene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("BalanceScene.fxml"));
		root = loader.load();
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();	
	}
	
	public void switchToCloseAccountScene(ActionEvent e) throws IOException {	
		LOGGER.info("Switched to CloseAccountScene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CloseAccountScene.fxml"));
		root = loader.load();
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();			
	}
	
	public void switchToDepositScene(ActionEvent e) throws IOException {	
		LOGGER.info("Switched to Deposit Scene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("DepositScene.fxml"));
		root = loader.load();
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();			
	}
	
	public void switchToWithdrawalScene(ActionEvent e) throws IOException {	
		LOGGER.info("Switched to withdrawal scene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("WithdrawalScene.fxml"));
		root = loader.load();
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();			
	}
	
	public void switchToPastTransactionScene(ActionEvent e) throws IOException {	
		LOGGER.info("Switched to recent transactions scene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("RecentTransactionScene.fxml"));
		root = loader.load();
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();			
	}
	
	public void switchToAccountInfoScene(ActionEvent e) throws IOException {
		LOGGER.info("Switched to account info scene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AccountInfoScene.fxml"));
		root = loader.load();	
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();			
	}
	
	public void switchToStartScene(ActionEvent e) throws IOException {
		bank.logout(getAccount());
		LOGGER.info("Logged out!");
		LOGGER.info("Switched to start scene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("StartScene.fxml"));
		root = loader.load();
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();			
	}
	
	public void switchToTransferScene(ActionEvent e) throws IOException {	
		LOGGER.info("Switched to transfer money scene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("TransferScene.fxml"));
		root = loader.load();
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();						
	}
	
	public void switchToAccountScene(ActionEvent e) throws IOException {
		LOGGER.info("Switched to account scene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AccountScene.fxml"));
		root = loader.load();			
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);				
		stage.show();	
	}
	
	public void switchToLoginScene(ActionEvent e) throws IOException {
		LOGGER.info("Switched to login scene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginScene.fxml"));
		root = loader.load();
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();			
	}
	
	public void AdminAccountScene(ActionEvent e) throws IOException {
		LOGGER.info("Switched to admin scene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminAccountScene.fxml"));
		root = loader.load();
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToBankScene(ActionEvent e) throws IOException {
		LOGGER.info("Switched to bank scene");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("BankScene.fxml"));
		root = loader.load();
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();	
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
      
	}
}
