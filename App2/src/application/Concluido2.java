package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Concluido2 implements Initializable ,  controle
{
	
	@FXML
	public Button acess;
	
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
	public void acessar(ActionEvent eventwo)
	{
		mind.setScreen(Main.MAIN_SCREEN);
	}
	public void imageLoad()
	{
		acess.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
	}
}
