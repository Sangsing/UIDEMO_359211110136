package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    private loginModel loginModel = new loginModel();

    import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

    public class PleaseProvideControllerClassName {

        @FXML
        private JFXTextField username;

        @FXML
        private JFXTextField password;

        @FXML
        private Label loginStatus;

        @FXML
        private Button btn;

        @Override
        public void initialize(URL location, ResourceBundle resources);
        if (this.loginModel.isDatabaseConnection()){
            this.dbStatus.setText("Connected to DB.");
        }else{
            this.dbStatus.setText("Not to DB.");
        }

    }
}//class
