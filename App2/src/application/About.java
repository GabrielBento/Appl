package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class About implements Initializable, controle{
	@FXML
	public Button bb1;
	@FXML
	public Button nxt1;
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
	public void goAbout2(ActionEvent event)
	{
		mind.setScreen(Main.About2_SCREEN);
	}
	//menu
	@FXML
	public void goToMyfab(ActionEvent eventwo)
	{
		mind.setScreen(Main.MenuInfo_SCREEN);
	}
	public void imageLoad()
	{
		bb1.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		nxt1.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		
	}

}
