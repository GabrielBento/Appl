package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class About02 implements Initializable,controle{
	@FXML
	public Button bb2;
	@FXML
	public Button nxt2;
	@FXML
	public Button myIn1;
	
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
	//informação
	@FXML
	public void goToBack(ActionEvent event)
	{
		mind.setScreen(Main.About_SCREEN);
	}
	//menu de informações
	@FXML
	public void goToAbout03(ActionEvent eventwo)
	{
		mind.setScreen(Main.About3_SCREEN);
	}
	@FXML
	public void goToMainInfo(ActionEvent eventree)
	{
		mind.setScreen(Main.MenuInfo_SCREEN);
	}
	public void imageLoad()
	{
		bb2.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		nxt2.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		myIn1.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());

	}

}
