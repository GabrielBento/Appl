package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class cadastro implements Initializable, controle {
	//definindo botões;
	@FXML
	public  Button cadastro01;
	@FXML
	public Button back01;
	@FXML
	public TextField txf;
	@FXML
	public TextField txf2;
	@FXML
	public DatePicker dp;
	@FXML
	public PasswordField pss;
	@FXML
	public PasswordField pss2;
	@FXML
	public Label av1;
	@FXML
	public Label av2;
	@FXML
	public Label av3;
	@FXML
	public Label av4;
	ControleJanela mind = new ControleJanela();
	public static String nome1;
	public static String email1;
	public static String senha1;
	public static boolean confir1;
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		ImageLoad();
	}
	
	@Override
	public void setScreenParent(ControleJanela screenParent) 
	{
		// TODO Auto-generated method stub
		mind = screenParent;
	}
	//voltar ao inicio
	@FXML
	public void goToBack(ActionEvent event)
	{
		mind.setScreen(Main.MAIN_SCREEN);
	}
	//load
	@FXML
	public void load(ActionEvent eventwo)
	{	
		DataBase db = new DataBase();
		// obrigatorio
		av1.setText("");
		av2.setText("");
		av3.setText("");
		av4.setText("");
		
		// var acao 
		String  nome = txf.getText();
		nome1 = nome;
		String senha = pss.getText();
		senha1 = senha;
		String senha2 = pss2.getText();
		String email = txf2.getText();
		email1 = email;
		String charEsp = "á,é,í,ó,ú,ç";
		String [] n = charEsp.split(",");
		boolean confir = false;
		confir1 = confir;
		
		boolean verificarNome = nome.matches("[a-zA-Z-\\s-'''"+n[5]+"]*");
		boolean verificarEmail = email.matches("[a-zA-Z]\\w+@\\w{3,10}+\\.\\w{2,3}\\.\\w{2,3}");
		boolean verificarEmail2 = email.matches("[a-zA-Z]\\w+@\\w{3,10}+\\.\\w{2,3}");
		
		if(verificarNome == true && nome.length()>= 15)
		{
			if(verificarEmail == true || verificarEmail2 == true)
			{
				if(senha.equals(senha2) && senha.length() >= 8 )
				{
					confir = true;
					confir1 = confir;
					db.cadastro();
					mind.setScreen(Main.Second_SCREEN);
				}
			}
		}
		if(true)
		{
			if(nome.length()<3)
			{
				av1.setText("Campo obrigatório");
			}
			if(verificarNome == false )
			{
				av1.setText("Caractere inválido");
			}
			if(email.length()<1)
			{
				av2.setText("Campo obrigatório");
			}
			if(verificarEmail == false && verificarEmail2 == false)
			{
				av2.setText("Email inválido");
			}
			if(senha.equals(senha2) == false){
				av4.setText("Senha inválida");
			}
			if(senha.length()<8)
			{
				av3.setText("Senha no minimo 8 caracteres");
				
			}
			if(senha2.length() < 8)
			{
				av4.setText("Confirme sua senha");
			}
		}
		
	}
	public static boolean getConfir(){
		return confir1;
	}
	public static String getNome(){
		return nome1;
	}
	public static String getEmail(){
		return email1;
	}
	public static String getSenha(){
		return senha1;
	}
	public void ImageLoad()
	{
		cadastro01.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		back01.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
	}
}

