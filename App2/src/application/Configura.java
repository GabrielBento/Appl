package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;



public class Configura implements Initializable, controle {
	
	@FXML
	private Label l;
	
	@FXML
	private Label l1;
	
	@FXML
	private Label l2;
	
	@FXML
	private Label l3;
	
	@FXML
	private Label l4;
	
	@FXML
	private TextField nome;

	@FXML
	private TextField email_Ant;
	
	@FXML
	private TextField email_Nov;

	@FXML
	private PasswordField senha_Ant;
	
	@FXML
	private PasswordField senha_Nov;
	@FXML
	private Button sal;
	@FXML
	private Button back02;
	
	public static String senha;
	public static String email;
	public static String email_ne;
	
	ControleJanela mind = new ControleJanela();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	
		imagesLoad();
	}
	@Override
	public void setScreenParent(ControleJanela screenParent) {
		// TODO Auto-generated method stub
		mind = screenParent;
		}
	@FXML
	public void go(ActionEvent event)
	{
		 l.setText("");
		l1.setText("");
		l2.setText("");
		l3.setText("");
		l4.setText("");
		String txt_se = senha_Ant.getText();
		senha = txt_se;
		String txt_em = email_Ant.getText();
		email = txt_em;
		String txt_em_ne = email_Nov.getText();
		email_ne = txt_em_ne;
		String txt_no_ne = nome.getText();
		boolean verificarNome = txt_no_ne.matches("[a-zA-Z\\s]*");
		boolean verificarEmail = txt_em_ne.matches("[a-zA-Z]\\w+@\\w{3,10}+\\.\\w{2,3}\\.\\w{2,3}");
		boolean verificarEmail2 = txt_em_ne.matches("[a-zA-Z]\\w+@\\w{3,10}+\\.\\w{2,3}");
		DataBase db = new DataBase();
		if(verificarNome == true){
		}
		if(db.getConfigEmail() == true){
			if(db.getConfigSenha() == true){
				mind.setScreen(Main.Second_SCREEN);
			} else {
				l3.setText("Senha Errado");
			}
		}else{
			l1.setText("Email Errado");
		}
	}
	@FXML
	public void goToBack(ActionEvent eventas)
	{
		mind.setScreen(Main.Second_SCREEN);
	}
	public static String getSenha(){
		return senha;
	}
	public static String getEmail(){
		return email;
	}
	public static String getNewEmail(){
		return email_ne;
	}
	public void imagesLoad()
	{
		back02.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		sal.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		
	}
}