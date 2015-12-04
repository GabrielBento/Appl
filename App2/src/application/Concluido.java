package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Concluido implements Initializable ,  controle
{
	@FXML
	public Button cnc;
	
	ControleJanela mind = new ControleJanela();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		imageLoad();
	}
	@Override
	public void setScreenParent(ControleJanela screenParent) {
		// TODO Auto-generated method stub
		mind = screenParent;
	}
	@FXML
	public void goToIn(ActionEvent event)
	{
		mind.setScreen(Main.Second_SCREEN);
	}
	
	public void imageLoad()
	{
		cnc.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
	}
}
