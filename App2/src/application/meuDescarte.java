package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
//nunca coloque static 
public class meuDescarte implements Initializable, controle {
	ObservableList <String> lixos = FXCollections.observableArrayList(
			"Lixo eletrônico","Madeira","Vidro","Plástico","Borracha");
	@FXML
	private  ChoiceBox <String> ch1;
	@FXML
	private  Button back1;
	@FXML
	private  Button kdt2;
	@FXML
	private TextField txf;
	@FXML
	private TextField txf2;
	@FXML
	private TextField txf3;
	@FXML
	private TextField txf4;
	@FXML
	private TextField txf5;
	@FXML
	private TextField txf6;
	
	
	ControleJanela mind = new ControleJanela();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		caixa();
		imageLoad();
	}

	@Override
	public void setScreenParent(ControleJanela screenParent) {
		// TODO Auto-generated method stub
		mind = screenParent;
	}
	//menu
	@FXML
	public void goToMy(ActionEvent eventree)
	{
		mind.setScreen(Main.Second_SCREEN);
	}
	//confirmar ação
	@FXML
	public void goToLoad(ActionEvent eventrade)
	{
		String estado = txf.getText();
		String cidade = txf2.getText();
		String bairro = txf3.getText();
		String rua = txf4.getText();
		String Num = txf5.getText();
		String anot = txf6.getText();
		if(estado.length() >2)
		{
			if(cidade.length()>2)
			{
				if(bairro.length()>3)
				{
					if(rua.length()>7)
					{	
						if(Num.length()>0)
						{
							if(anot.length() > 5)
							{
								mind.setScreen(Main.Concluido_SCREEN);
							}
						}
					}
				}
			}
		}
		if(true)
		{
			if(cidade.length()<=2)
			{
				//setText("Campo Obrigatorio");
			}
			if(bairro.length()<=3)
			{
				//setText("Campo Obrigatorio");
			}
			if(rua.length()<=7)
			{
				//setText("Campo Obrigatorio");
			}
			if(Num.length()<=0)
			{
				//setText("Campo Obrigatorio");
			}
			if(anot.length() <= 5)
			{
				//setText("Campo Obrigatorio");
			}
		}
		
	}
	//choice box
	public void caixa()
	{
		ch1.setValue("Lixo eletrônico");
		ch1.setItems(lixos);
	}
	public void imageLoad()
	{
		ch1.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		kdt2.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		back1.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());

	}

}
