package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class inicio implements Initializable, controle {
	@FXML
	public TextField email;
	@FXML
	public TextField senha;
	@FXML
	public  Button ent, kdt;
	@FXML
	private Hyperlink link;
	@FXML
	private Label av1,av2;
	private static ControleJanela mind = new ControleJanela();
	static String email1;
	static String senha1;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		imageView();
	}
	
	@Override
	public void setScreenParent(ControleJanela screenParent) {
		// TODO Auto-generated method stub
		mind = screenParent;
	}
	@FXML
	public  void goTo(ActionEvent event)
	{
		DataBase log = new DataBase();
		String user = email.getText();
		email1  = user;
		String pass = senha.getText();
		senha1 = pass;
		boolean verificar_User = user.matches("[a-zA-Z]\\w+@\\w{3,10}+\\.\\w{2,3}\\.\\w{2,3}");
		boolean verificar_User2 = user.matches("[a-zA-Z]\\w+@\\w{3,10}+\\.\\w{2,3}");
		av1.setText("");
		av2.setText("");
		/*
		if(verificar_User == true || verificar_User2 == true )
		{
			av1.setText("");
			av2.setText("");
			if(pass.trim().equals("") == false)
			{
				av1.setText("");
				av2.setText("");
					if(log.getConf() == true)
					{
						if(log.getSen() == true)
						{
							email.setText("");
							senha.setText("");
							*/
							mind.setScreen(Main.Second_SCREEN);
							/*
						} 
						if(log.getSen() == false)
						{
							av2.setText("Senha incorreta, tente novamente");
						}
					}
					if(log.getConf() == false)
					{
						av1.setText("Email incorreto, cadastre-se");
					}
			} 
			if(pass.trim().equals("") == true)
			{
				av1.setText("");
				av2.setText("Campo obrigatório");
			}	
		}
		if(verificar_User == false && verificar_User2 == false)
		{
			av1.setText("Campo obrigatório");
		}
		if(pass.trim().equals("") == true)
		{
			av2.setText("Campo obrigatório");
		}
	*/
		
	}
	@FXML
	public void esqueceu(ActionEvent event){
		mind.setScreen(Main.ESQUECEU_SENHA);
	}
	@FXML
	public  void novo(ActionEvent event)
	{
		mind.setScreen(Main.CADASTRO);
	}
	public static String getEmail(){
		return email1;
	}
	public static String getSenha(){
		return senha1;
	}
	public void imageView()
	{
		ent.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		kdt.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
	}
}
