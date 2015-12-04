package application;

import java.util.HashMap;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class ControleJanela extends StackPane{

	private HashMap<String, Node> telas = new HashMap<>();

	public void addTela(String name, Node screen) {
		telas.put(name, screen);
	}
	
	public boolean loadTela(String name, String resource) {
		try {
			FXMLLoader myLoader = new FXMLLoader(getClass().getResource(resource));
			Parent loadScreen = (Parent) myLoader.load();
			controle myScreenControler = ((controle) myLoader.getController());
			myScreenControler.setScreenParent(this);
			addTela(name, loadScreen);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean setScreen(final String name) {

		if (telas.get(name) != null) {
			if (!getChildren().isEmpty()) {
				getChildren().remove(0);
				getChildren().add(0, telas.get(name));
			} else {
				getChildren().add(telas.get(name));
			}
			return true;
		} else {
			System.out.println("A tela não pode ser carregada \n");
			return false;
		}
	}
}
