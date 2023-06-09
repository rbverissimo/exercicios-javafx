package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
		
		criarPasso2();
		
		criarPasso3();
		
		janela.setScene(passo1);
		janela.setTitle("Wizard");
		janela.show();
		
	}
	
	private void criarPasso1() {
		
		Label labelCena = new Label();
		labelCena.setText("Bem-vindo!!! ");
		labelCena.setAlignment(Pos.CENTER);
		
		Button proximoPasso = new Button("Ir");
		proximoPasso.getStyleClass().add("botao-navegacao");
		proximoPasso.setAlignment(Pos.CENTER);
		proximoPasso.setPrefSize(80, 30);
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo2);
		});
		
		
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.BOTTOM_RIGHT);
		boxBotoes.getChildren().add(proximoPasso);
		
		VBox boxPrincipal = new VBox();
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.getChildren().add(labelCena);
		boxPrincipal.getChildren().add(boxBotoes);
		
		String pathCSS = getClass()
				.getResource("/basico/Wizard.css")
				.toExternalForm();
		
		
		passo1 = new Scene(boxPrincipal, 400, 400);
		passo1.getStylesheets().add(pathCSS);
	}
	
	private void criarPasso2() {
		
		Button proximoPasso = new Button("Ir");
		proximoPasso.getStyleClass().add("botao-navegacao");
		proximoPasso.setPrefSize(80, 30);
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo3);
		});
		
		Button voltarPasso = new Button("Voltar");
		voltarPasso.getStyleClass().add("botao-navegacao");
		voltarPasso.setPrefSize(80, 30);
		voltarPasso.setOnAction(e -> {
			janela.setScene(passo1);
		});
		
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
		
		Button voltarPasso = new Button("Voltar");
		voltarPasso.getStyleClass().add("botao-navegacao");
		voltarPasso.setPrefSize(80, 30);
		voltarPasso.setOnAction(e -> {
			janela.setScene(passo2);
		});
		
		Button finalizar = new Button("Finalizar");
		finalizar.getStyleClass().add("botao-navegacao");
		finalizar.setPrefSize(80, 30);
		finalizar.setOnAction(e -> {
			System.exit(0);
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.BOTTOM_RIGHT);
		box.getChildren().add(voltarPasso);
		box.getChildren().add(finalizar);
		
		
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
