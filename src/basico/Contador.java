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
		
		HBox boxBotes = new HBox();
		
		VBox boxPrincipal = new VBox();
		boxPrincipal.getChildren().add(labelTitulo);
		boxPrincipal.getChildren().add(labelNumero);
		boxPrincipal.getChildren().add(botaoIncremento);
		boxPrincipal.getChildren().add(botaoDecremento);
		
		
		Scene cenaPrincipal = new Scene(boxPrincipal);
		
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
