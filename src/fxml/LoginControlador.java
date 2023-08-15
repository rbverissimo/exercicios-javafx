package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		
		boolean emailValido = campoEmail.getText().equals("aluno@cod3r.com.br");
		boolean senhaValida = campoSenha.getText().equals("12345678");
		
		if(emailValido && senhaValida) {
			Notifications.create().title("Login FXML")
			.position(Pos.TOP_RIGHT)
			.text("Login efetuado com sucesso!")
			.showInformation();
		} else Notifications.create().title("Login FXML")
		.position(Pos.TOP_RIGHT)
		.text("Usuário e senha inválidos")
		.showError();
	}

}
