package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public TextField txtUsername;
    public TextField txtPassword;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ResourceBundle rb = ResourceBundle.getBundle("sample.login");
        txtUsername.setPromptText(rb.getString("username"));
        txtPassword.setPromptText(rb.getString("password"));
    }
}
