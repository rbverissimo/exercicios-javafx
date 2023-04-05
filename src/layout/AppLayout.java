package layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/* VBox tempCaixa = new VBox();
		tempCaixa.getChildren().add(new Caixa().comTexto("1"));
		tempCaixa.getChildren().add(new Caixa().comTexto("2"));
		tempCaixa.getChildren().add(new Caixa().comTexto("3"));
		tempCaixa.getChildren().add(new Caixa().comTexto("4"));
		tempCaixa.getChildren().add(new Caixa().comTexto("5"));
		tempCaixa.getChildren().add(new Caixa().comTexto("6"));
		
		VBox tempQuadrado = new VBox();
		for (int i = 0; i < 6; i++) {
			tempQuadrado.getChildren().add(new Quadrado());
		}
		
		Scene principal = new Scene(tempCaixa, 700, 550);
		*/
		
		Scene principal = new Scene(new TesteAnchorPane(), 800, 600);
		
		
		
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
