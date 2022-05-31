
package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class kaydolYonetmeController {

    @FXML
    public ResourceBundle resources;

    @FXML
    public URL location;

    @FXML
    public TextField adYonetim;

    @FXML
    public TextField soyadYonetim;

    @FXML
    public TextField yasYonetim;

    @FXML
    public TextField gmailYonetim;

    @FXML
    public TextField kodYonetim;

    @FXML
    public TextField sifreYonetim;

    @FXML
    public Button kaydolYonetimId;

    @FXML
    public void handleKayitYonetim() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Stage window = (Stage) kaydolYonetimId.getScene().getWindow();
        window.setScene(new Scene(root, 1550, 800));

    }

    @FXML
    void initialize() {

    }
}

