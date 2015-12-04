package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class myfabs implements  Initializable , controle{
	@FXML
	private  Button sai,md,mc,sb,conf,pe,er;
	
    private static ControleJanela mind = new ControleJanela();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		imagesStyles();
	}

	@Override
	public void setScreenParent(ControleJanela screenParent) {
		// TODO Auto-generated method stub
		mind = screenParent;

	}
	@FXML
	public void goToMain(ActionEvent eventwo)
	{
		mind.setScreen(Main.MAIN_SCREEN);
	}
	@FXML
	public void goToDesc(ActionEvent eventrade)
	{
		mind.setScreen(Main.Third_SCREEN);
	}
	@FXML
	public void goToCurs(ActionEvent eventum)
	{
		mind.setScreen(Main.Quarta_SCREEN);
	}
	@FXML
	public void goToAbout(ActionEvent eventtrix)
	{
		mind.setScreen(Main.MenuInfo_SCREEN);
   }
	@FXML
	public void configura(ActionEvent evenx)
	{
		mind.setScreen(Main.Config_SCREEN);
	}
	@FXML
	public void webScreen(ActionEvent eventex)
	{
		mind.setScreen(Main.Web_SCREEN);
	}
	@FXML
	public void goTosite(ActionEvent eventrue)
	{
		mind.setScreen(Main.Web2_SCREEN);
	}
	public void imagesStyles()
	{
		md.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		mc.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		conf.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		sb.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		sai.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		pe.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		er.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());

	}
	
}
