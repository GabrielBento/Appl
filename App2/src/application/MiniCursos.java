package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.prism.paint.Color;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MiniCursos implements Initializable, controle {
	@FXML
	private Label txt_nom;
	@FXML
	private Label txt_ema;
	@FXML
	private Label txt_cpf;
	@FXML
	private TextField nome2;
	@FXML
	private TextField email2;
	@FXML
	private TextField cpf;
	@FXML
	private Button back2;
	@FXML
	private Button cadastrar2;
	@FXML
	private ComboBox <String> box1;
	ObservableList<String> lista1 = FXCollections.observableArrayList(
            "Lógica de Programação", "Manuseio da Fresadora", "Manuseio da Impressora 3D", 
            "Manuseio da Cortadora de Vinil", "Manuseio da Cortadora a Laser", "Introdução"
            + " a Robótica", "Robótica Aplicada", "Introdução a Metrologia");
	
	
	ControleJanela mind = new ControleJanela();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		box1.setItems(lista1);
		box1.setValue("Lógica de Programação");
		box1.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		ImageView();
		
	}
	
	@Override
	public void setScreenParent(ControleJanela screenParent) {
		// TODO Auto-generated method stub
		mind = screenParent;
		}
	@FXML
	public void goToBack(ActionEvent eventys)
	{
		mind.setScreen(Main.Second_SCREEN);
	}
	@FXML
	public void cadas(ActionEvent eventess)
	{
		txt_nom.setText("");
		txt_ema.setText("");
		txt_cpf.setText("");
		String txtN = nome2.getText();
		String txtE = email2.getText();
		String txtC = cpf.getText();
		boolean verificar_nome = txtN.matches("[a-zA-Z-\\s]*");
		boolean verificar_cpf = txtC.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d-\\d\\d"); 
		boolean verificar_email = txtE.matches("[a-zA-Z]\\w+@\\w{3,10}+\\.\\w{2,3}\\.\\w{2,3}");
		boolean verificar_email2 = txtE.matches("[a-zA-Z]\\w+@\\w{3,10}+\\.\\w{2,3}");
		if(box1.getValue() != null){
			if(verificar_nome == true && txtN.trim().equals("") == false && txtN.length() > 15){
				if(verificar_cpf == true){
					if(verificar_email == true || verificar_email2 == true){
						mind.setScreen(Main.Concluido_SCREEN);
					}
				}
			} 
		} 
	}
	public void ImageView()
	{
		back2.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		cadastrar2.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		box1.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
	}
}
	
