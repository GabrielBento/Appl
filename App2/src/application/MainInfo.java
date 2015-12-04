package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class MainInfo implements Initializable, controle {
	
	@FXML
	private Button oqf;
	@FXML
	private Button oqef;
	@FXML
	private Button sv;
	@FXML
	private Button sp;
	@FXML
	private Button back6;
	ControleJanela mind = new ControleJanela();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		imagesStyles();
		
	}
	@Override
	public void setScreenParent(ControleJanela screenParent) {
		// TODO Auto-generated method stub
		mind = screenParent;
	}
	@FXML
	public void goToInfo1(ActionEvent event)
	{
		mind.setScreen(Main.About_SCREEN);
	}
	@FXML
	public void goToInfo2(ActionEvent eventwo)
	{
		mind.setScreen(Main.About2_SCREEN);
	}
	@FXML
	public void goToInfo3(ActionEvent eventree)
	{
		mind.setScreen(Main.About3_SCREEN);
	}
	@FXML
	public void goToBack(ActionEvent evenfor)
	{
		mind.setScreen(Main.Second_SCREEN);
	}
	@FXML
	public void goToPublic(ActionEvent evenfive)
	{
		mind.setScreen(Main.About4_SCREEN);
	}
	public void imagesStyles()
	{
		oqf.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		oqef.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		sv.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		sp.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());	
		back6.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());	
	}
}
