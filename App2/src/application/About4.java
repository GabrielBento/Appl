package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class About4 implements Initializable, controle {
	@FXML
	public Button bb4;
	@FXML
	public Button nxt4;
	@FXML
	public Button myIn4;
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
	public void goToBack(ActionEvent event)
	{
		mind.setScreen(Main.About3_SCREEN);
			
	}
	@FXML
	public void goToMenuInfo(ActionEvent eventwo)
	{
		mind.setScreen(Main.MenuInfo_SCREEN);
	}
	@FXML
	public void goToNext(ActionEvent eventree)
	{
		mind.setScreen(Main.About_SCREEN);
	}
	public void imageLoad()
	{
		bb4.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		nxt4.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		myIn4.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());

	}
	
	
}
