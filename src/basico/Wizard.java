package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
	
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		criarPasso1();
		
		primaryStage.setScene(passo1);
		primaryStage.setTitle("Wizard");
		primaryStage.show();
		
	}
	
	private void criarPasso1() {
		Button proximoPasso = new Button("Ir");
		
		HBox box = new HBox();
		box.setAlignment(Pos.BOTTOM_RIGHT);
		box.getChildren().add(proximoPasso);
		
		passo1 = new Scene(box, 400, 400);
	}
	
	private void criarPasso2() {
		
		Button proximoPasso = new Button("Ir");
		Button voltarPasso = new Button("Voltar");
		
		HBox box = new HBox();
		box.setAlignment(Pos.BOTTOM_RIGHT);
		box.getChildren().add(voltarPasso);
		box.getChildren().add(proximoPasso); 
		
		passo2 = new Scene(box, 400, 400);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
