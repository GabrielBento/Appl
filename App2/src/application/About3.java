package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class About3 implements Initializable, controle{

	@FXML
	public Button bb3;
	@FXML
	public Button nxt3;
	@FXML
	public Button myIn3;
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
		imageLoad();
	}
	@FXML
	public void goToBack(ActionEvent event)
	{
		mind.setScreen(Main.About2_SCREEN);			
	}
	@FXML
	public void goToMenuInfo(ActionEvent eventwo)
	{
		mind.setScreen(Main.MenuInfo_SCREEN);
	}
	@FXML
	public void goToNext(ActionEvent eventree)
	{
		mind.setScreen(Main.About4_SCREEN);
	}
	public void imageLoad()
	{
		bb3.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		nxt3.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		myIn3.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());

	}

}
