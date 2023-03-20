package basico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		Label labelNumero = new Label("0");
		
		Button botaoIncremento = new Button("+");
		Button botaoDecremento = new Button("-");
		
		HBox boxBotoes = new HBox();
		boxBotoes.getChildren().add(botaoIncremento);
		boxBotoes.getChildren().add(botaoDecremento);
		
		VBox boxPrincipal = new VBox();
		boxPrincipal.getChildren().add(labelTitulo);
		boxPrincipal.getChildren().add(labelNumero);
		boxPrincipal.getChildren().add(boxBotoes);
		
		
		Scene cenaPrincipal = new Scene(boxPrincipal, 400, 400);
		
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
