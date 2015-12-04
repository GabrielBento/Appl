package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebErrorEvent;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;
import javafx.util.Callback;

public class PdeEntrega implements Initializable, controle{
	
	@FXML
	private WebView wbv;
	@FXML
	private Button back3;
	@FXML
	private Label cnet;
	ControleJanela mind = new ControleJanela();
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		// TODO Auto-generated method stub
		view();
		ImageView();
	}
	@Override
	public void setScreenParent(ControleJanela screenParent) {
		
	// TODO Auto-generated method stub
		mind = screenParent;
	
	}
	@FXML
	public void goToBack()
	{
		mind.setScreen(Main.Second_SCREEN);
	}

	public void view()
	{
		cnet.setText("");
		WebEngine view = wbv.getEngine();
		view.load("https://www.google.com.br/maps/place/Escola+Sesi%2FSenai+"+
		"-+EBEP/@-9.6581827,-35.725297,17z/data=!3m1!4b1!4m2!3m1!1s0x701459ebf01c911:"+
		"0x11f430cb804f2cf8?hl=pt-BR");
		wbv.setZoom(0.77);
		
	}
	public void ImageView()
	{
		back3.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
	}


}
