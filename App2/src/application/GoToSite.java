package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class GoToSite implements Initializable, controle {

	@FXML
	private WebView  wsite;
	@FXML
	private Button voltar02;
	ControleJanela mind = new ControleJanela();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		WebSite();
		ImageLoad();
	}

	@Override
	public void setScreenParent(ControleJanela screenParent) {
		// TODO Auto-generated method stub
		mind = screenParent;
	}
	public void WebSite()
	{
		WebEngine view = wsite.getEngine();
		view.load("http://ecofablab.github.io/projeto/");
		wsite.setZoom(0.77);
		
	}
	@FXML
	public void goToBack(ActionEvent event)
	{
		mind.setScreen(Main.Second_SCREEN);
	}
	public void ImageLoad()
	{
		voltar02.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
	}
}
