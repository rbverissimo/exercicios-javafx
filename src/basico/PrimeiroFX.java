package basico;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox box = new VBox();
		
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		List<Button> botoes = new ArrayList<>();
		botoes.add(botaoA);
		botoes.add(botaoB);
		botoes.add(botaoC);
		
		botaoA.setOnAction(e -> System.out.println("A"));
		botaoB.setOnAction(e -> System.out.println("B"));
		botaoC.setOnAction(e -> System.exit(0));
		
		box.setSpacing(10);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(botoes);
		
		Scene unicaCena = new Scene(box, 100, 150);
		
		primaryStage.setScene(unicaCena);
		
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
