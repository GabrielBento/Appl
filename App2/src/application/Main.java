package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;

public class Main extends Application {
	//inicio
	public static final String MAIN_SCREEN = "principal";
	public static final String MAIN_SCREEN_FXML = "principal.fxml";
	//Cadastro
	public static final String CADASTRO = "cadastro";
	public static final String CADASTRO_FXML ="cadastro.fxml";
	//Esqueceu Senha
	public static final String ESQUECEU_SENHA = "esqueceu";
	public static final String ESQUECEU_SENHA_FXML= "esqueceu.fxml";
	//myfabs
	public static final String Second_SCREEN = "secunda";
	public static final String Second_SCREEN_FXML = "tela2.fxml";
	//meu descarte
	public static final String Third_SCREEN = "terceira";
	public static final String Third_SCREEN_FXML = "tela3.fxml";
	//mini cursos
	public static final String Quarta_SCREEN = "quarta";
	public static final String Quarta_SCREEN_FXML = "tela4.fxml";
    //o que é fab lab
	public static final String About_SCREEN = "informarção";
	public static final String About_SCREEN_FXML = "sobre.fxml";
	// o que é o eco fab lab
	public static final String About2_SCREEN = "informação2";
	public static final String About2_SCREEN_FXML = "sobre2.fxml";
	//Vantagens
	public static final String About3_SCREEN = "informação3";
	public static final String About3_SCREEN_FXML = "sobre3.fxml";
	//Sobra os nossos clientes
	public static final String About4_SCREEN = "informação4";
	public static final String About4_SCREEN_FXML = "sobre4.fxml";
	//ajuda
	public static final String Tutorial_SCREEN = "ajuda";
	public static final String Turorial_SCREEN_FXML = "help.fxml";
	//load
	public static final String Concluido_SCREEN = "Concluido";	
	public static final String Concluido_SCREEN_FXML = "concluido.fxml";	
	//load2
	public static final String Concluido2_SCREEN = "Aviso";	
	public static final String Concluido2_SCREEN_FXML = "aviso.fxml"; 
	//menu de informações
	public static final String MenuInfo_SCREEN = "menuDeInformações";
	public static final String MenuInfo_SCREEN_FXML = "menuInfo.fxml";
	//configurações
	public static final String Config_SCREEN =   "Configuração";
	public static final String Config_SCREEN_FXML =   "config.fxml";
	//webview
	public static final String Web_SCREEN = "gmaps";
	public static final String Web_SCREEN_FXML = "WebView.fxml";
	//webview2
	public static final String Web2_SCREEN = "site";
	public static final String Web2_SCREEN_FXML = "WebView2.fxml";
	//
	@Override
	public void start(Stage piso) {
		try {
			ControleJanela mainContainer = new ControleJanela();
			
			mainContainer.loadTela(Main.MAIN_SCREEN, Main.MAIN_SCREEN_FXML);
			mainContainer.loadTela(Main.CADASTRO, Main.CADASTRO_FXML);
			mainContainer.loadTela(Main.ESQUECEU_SENHA, Main.ESQUECEU_SENHA_FXML);
			mainContainer.loadTela(Main.Second_SCREEN, Main.Second_SCREEN_FXML);
			mainContainer.loadTela(Main.Third_SCREEN, Main.Third_SCREEN_FXML);
			mainContainer.loadTela(Main.Quarta_SCREEN, Main.Quarta_SCREEN_FXML);
			mainContainer.loadTela(Main.About_SCREEN, Main.About_SCREEN_FXML);
			mainContainer.loadTela(Main.About2_SCREEN, Main.About2_SCREEN_FXML);
			mainContainer.loadTela(Main.About3_SCREEN, Main.About3_SCREEN_FXML);
			mainContainer.loadTela(Main.About4_SCREEN, Main.About4_SCREEN_FXML);
			mainContainer.loadTela(Main.Concluido_SCREEN, Main.Concluido_SCREEN_FXML);
			mainContainer.loadTela(Main.Concluido2_SCREEN, Main.Concluido2_SCREEN_FXML);
			mainContainer.loadTela(Main.MenuInfo_SCREEN, Main.MenuInfo_SCREEN_FXML);
			mainContainer.loadTela(Main.Config_SCREEN, Main.Config_SCREEN_FXML);
			mainContainer.loadTela(Main.Web_SCREEN, Main.Web_SCREEN_FXML);
			mainContainer.loadTela(Main.Web2_SCREEN, Main.Web2_SCREEN_FXML);
			

			
			mainContainer.setScreen(Main.MAIN_SCREEN);
			
			Group root = new Group();
			root.getChildren().addAll(mainContainer);
			
			Scene scene = new Scene(root);
			piso.setScene(scene);
			piso.show();
			piso.setTitle("Eco FabLabs");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
