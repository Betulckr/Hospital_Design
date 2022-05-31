package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class KaydolController {



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button kayitmhrsId;

    @FXML
    private TextField ad;

    @FXML
    private TextField soyad;

    @FXML
    private TextField yas;

    @FXML
    private TextField gmail;

    @FXML
    private TextField kullaniciAd;

    @FXML
    private TextField kullaniciSifre;

    @FXML
    void handleKayitMhrs() throws IOException {
        SQLiteJDBC sql = new SQLiteJDBC();
        sql.addNewUser(ad.getText(), soyad.getText(), yas.getText(), gmail.getText(), kullaniciAd.getText(), kullaniciSifre.getText());

        Alert mesaj = new Alert(Alert.AlertType.INFORMATION);
        mesaj.setTitle("KAYIT BİLGİLENDİRME");
        mesaj.setHeaderText(null);
        mesaj.setContentText("Kaydınız başarılı bir şekilde oluşturulmuştur.\n" +
                "Giriş ekranına yönlendirildiniz.");
        mesaj.show();

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage window = (Stage) kayitmhrsId.getScene().getWindow();
        window.setScene(new Scene(root, 1550, 800));
    }
}

