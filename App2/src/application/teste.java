package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;

public class teste implements Initializable, controle {
	private Button bck;
	private WebView view;
	ControleJanela mind = new ControleJanela();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setScreenParent(ControleJanela screenParent) {
		// TODO Auto-generated method stub
		mind = screenParent;
	}
	@FXML
	public void view(ActionEvent event)
	{
		
	}
	@FXML
	public void back(ActionEvent eventwo)
	{
		
	}

}
