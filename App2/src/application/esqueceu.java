package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class esqueceu implements Initializable, controle {
	
	@FXML
	public  Button env01;
	@FXML
	public Button sair01;
	@FXML
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
	//inicio
	@FXML
	public void goToBack(ActionEvent event)
	{
		mind.setScreen(Main.MAIN_SCREEN);
	}
	//confirma ação
	@FXML
	public void goToGo(ActionEvent eventwo)
	{
		mind.setScreen(Main.Concluido2_SCREEN);
	}
	public void imageLoad()
	{
		env01.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		sair01.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
	}
}
