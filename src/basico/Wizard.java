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
		
		janela = primaryStage;
		
		criarPasso1();
		
		primaryStage.setScene(passo1);
		primaryStage.setTitle("Wizard");
		primaryStage.show();
		
	}
	
	private void criarPasso1() {
		Button proximoPasso = new Button("Ir");
		proximoPasso.setPrefSize(80, 30);
		
		
		HBox box = new HBox();
		box.setAlignment(Pos.BOTTOM_RIGHT);
		box.getChildren().add(proximoPasso);
		
		String pathCSS = getClass()
				.getResource("/basico/Wizard.css")
				.toExternalForm();
		
		
		passo1 = new Scene(box, 400, 400);
		passo1.getStylesheets().add(pathCSS);
	}
	
	private void criarPasso2() {
		
		Button proximoPasso = new Button("Ir");
		Button voltarPasso = new Button("Voltar");
		
		HBox box = new HBox();
		box.setAlignment(Pos.BOTTOM_RIGHT);
		box.getChildren().add(voltarPasso);
		box.getChildren().add(proximoPasso); 
		
		String pathCSS = getClass()
				.getResource("/basico/Wizard.css")
				.toExternalForm();
		
		passo2 = new Scene(box, 400, 400);
		passo2.getStylesheets().add(pathCSS);
		
	}
	
	
	private void criarPasso3() {
		
		Button proximoPasso = new Button("Ir");
		Button voltarPasso = new Button("Voltar");
		
		HBox box = new HBox();
		box.setAlignment(Pos.BOTTOM_RIGHT);
		box.getChildren().add(voltarPasso);
		box.getChildren().add(proximoPasso); 
		
		String pathCSS = getClass()
				.getResource("/basico/Wizard.css")
				.toExternalForm();
		
		passo3 = new Scene(box, 400, 400);
		passo3.getStylesheets().add(pathCSS);
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
