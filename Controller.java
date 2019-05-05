package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

import java.util.Locale;
import java.util.ResourceBundle;

public class Controller {
    public Button btnLogin;
    public Button btnRegister;
    public Button btnListing;
    public Button btnExit;
    public RadioButton rdVN;
    public RadioButton rdEN;

    public void setLanguage(){
        ResourceBundle rb = ResourceBundle.getBundle("sample.Language");
        btnLogin.setText(rb.getString("login"));
        btnRegister.setText(rb.getString("register"));
        btnListing.setText(rb.getString("listing"));
        btnExit.setText(rb.getString("exit"));
    }
    public void changeVN(){
        Locale vi = new Locale("vi","VN");
        Locale.setDefault(vi);
        setLanguage();

        rdEN.setSelected(false);
        rdVN.setSelected(true);
    }
    public void changeEN(){
        Locale.setDefault(Locale.US);
        setLanguage();

        rdEN.setSelected(true);
        rdVN.setSelected(false);
    }
    public void changeLogin() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
}
