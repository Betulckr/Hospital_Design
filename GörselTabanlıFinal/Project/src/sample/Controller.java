package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {

    @FXML
    public Button girisId, cikisId,girissId,kaydolYonetimId,kayitmhrsId,kaydolId,kaydolIdd,exit;



    @FXML
    private ToggleButton btn1;

    @FXML
    public ToggleButton btn2;

    @FXML
    public ToggleButton btn3;

    @FXML ToggleButton btn4;

    @FXML ToggleButton btn5;

    @FXML ToggleButton btn6;

    @FXML
    public ToggleButton btn7;

    @FXML
    public Button kaydet;

    @FXML
    public TextField kullaniciKodunuz;

    @FXML
    public TextField kullaniciParolaniz;

    @FXML
    private TextField gmailNo;

    @FXML
    private TextField parolaNo;



    @FXML
    void handlerKaydol(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Kaydol.fxml"));

        Stage window = (Stage) kaydolId.getScene().getWindow();
        window.setScene(new Scene(root, 1550, 800));
    }

    @FXML
    void tikla(ActionEvent event) throws IOException {

        Alert mesaj = new Alert(Alert.AlertType.INFORMATION);
        mesaj.setTitle("SEMT POLİKLİNİKLERİNE RANDEVU VERİLMEYE BAŞLANDI");
        mesaj.setHeaderText(null);
        mesaj.setContentText("Sağlık Bakanlığına bağlı hastanelerin semt polikliniklerine MHRS üzerinden randevu oluşturabilme uygulaması Türkiye genelinde hizmete girdi. " +
                "Vatandaşlar, bundan böyle MHRS üzerinden semt polikliniklerini ayrı bir kurum gibi görüntüleyip randevu alabilecek.\n" +
                "\n" +
                "Ankara Nafiz Körez Devlet Hastanesinde pilot olarak başlatılan semt polikliniklerine ayrı birer kurum gibi MHRS üzerinden randevu oluşturabilme " +
                "uygulaması tüm Türkiye'de hizmete girdi. Vatandaşların ALO182’ye alternatif olarak aynı bilgilere erişerek muayene randevusu alabildiği mhrs.gov.tr " +
                "ve MHRS Mobil uygulamasında yapılan güncelleme ile semt poliklinikleri artık bağlı olduğu ana hastanenin altında ayrı ayrı listelenecek.\n" +
                "Uygulama ile Sağlık bakanlığına bağlı hastanelerin çeşitli lokasyonlarında bulunan alt polikliniklerine dair bilgiler görüntülenebilecek. " +
                "Bu sayede vatandaşların en yakın hizmet noktasını seçerek randevu alabilmesi ve alt polikliniklere ana hastanenin ismi ile randevu verildiğinde yaşanan karışıklıkların giderilmesi amaçlanıyor.");
        mesaj.show();



    }

    @FXML
    void tikla2(ActionEvent event) throws IOException {
        Alert mesaj = new Alert(Alert.AlertType.INFORMATION);
        mesaj.setTitle("KISITLAMALAR SÜRECİNDE COVİD-19 AŞI RANDEVULARI HAKKINDA");
        mesaj.setHeaderText(null);
        mesaj.setContentText("Değerli vatandaşlarımız,\n" +
                "\n" +
                "Covid-19 aşı randevunuzu sokağa çıkma kısıtlaması olan bir güne aldıysanız aşağıdaki belgelerden herhangi birini gerektiğinde güvenlik görevlilerine ibraz etmek için yanınızda bulundurarak aşınızı yaptıracağınız sağlık kuruluşuna gidebilirsiniz:\n" +
                "\n" +
                "-MHRS mobil ve web sitesindeki \"Randevularım\" sekmesinde bulunan ilgili randevu kartı.\n" +
                "-Randevu bilgilerinizin bulunduğu sayfanın PDF olarak alabileceğiniz çıktısı.\n" +
                "-Randevu bilgilerinin bulunduğu sayfanın cihazınıza kaydedilmiş ekran görüntüsü.\n" +
                "-Randevu bilgilendirme seçeneklerinde SMS veya mail ile bilgilendirme tercihiniz aktif ise size gönderilen randevu bilgilendirme mesajı.");
        mesaj.show();

    }


    @FXML
    void tikla3(ActionEvent event) throws IOException {

        Alert mesaj = new Alert(Alert.AlertType.INFORMATION);
        mesaj.setTitle("COVİD-19 AŞI RANDEVULARI HAKKINDA");
        mesaj.setHeaderText(null);
        mesaj.setContentText("Saygıdeğer Vatandaşımız,\n" +
                "\n" +
                "Covid-19 Aşılama Programı öncelikli gruplarla başlamıştır. \n" +
                "Aşılama için önceliği bulunan gruplar sırasıyla Ulusal Basın ve\n" +
                "Medya organları ile kamuoyuna duyurulacak ve bu duyurudan sonra randevu verilecektir.");
        mesaj.show();


    }

    @FXML
    void tikla4(ActionEvent event) throws IOException {

        Alert mesaj = new Alert(Alert.AlertType.INFORMATION);
        mesaj.setTitle("MHRS Çalışma Usul ve Esasları Hakkında Yönerge Yayınlandı");
        mesaj.setHeaderText(null);
        mesaj.setContentText("T.C. Sağlık Bakanlığı, Sağlık Bilgi Sistemleri Genel Müdürlüğü tarafından Merkezi Hekim Randevu Sistemi (MHRS) yönergesinde sistemin teknik alt yapısı ve \n" +
                "işleyişine dair bazı düzenlemeler yapılan yönergeyi onayladı.\n" + "Vatandaşların, Sağlık Bakanlığına bağlı sağlık kuruluşlarından hizmet almasını kolaylaştırmak maksadıyla yapılan güncelleme, \n" +
                "2016 yılı itibari ile hayata geçti.");
        mesaj.show();

    }

    @FXML
    void tikla5(ActionEvent event) throws IOException {

        Alert mesaj = new Alert(Alert.AlertType.INFORMATION);
        mesaj.setTitle("ÖNCELİKLİ HASTALAR UYGULAMASI");
        mesaj.setHeaderText(null);
        mesaj.setContentText("İhtiyaçları önceliğimiz olan 65 yaş üstü, riskli gebe ve engelli vatandaşlarımız için MHRS'de randevu önceliği uygulaması başlatıldı.\n" +
                "Hekimlerimizin günlük belli kontenjanları otomatik olarak bu vatandaşlarımıza ayrılmaktadır. Sağlık Bakanlığı kayıtlarında \"öncelikli\" kaydı bulunan vatandaşlarımız kendilerine ayrılmış olan kontenjandan faydalanarak randevu alabilmektedirler.");
        mesaj.show();

    }

    @FXML
    void tikla6(ActionEvent event) throws IOException {

        Alert mesaj = new Alert(Alert.AlertType.INFORMATION);
        mesaj.setTitle("MHRS'DEN GURURLANDIRAN ÖDÜL");
        mesaj.setHeaderText(null);
        mesaj.setContentText("Daha önce EMEA (Avrupa, Orta Asya ve Afrika) bölgesinin “Best Outsourcing Partnership” (En İyi Dış Kaynak Ortaklığı) kategorisinde 2017 yılı birincisi olan MHRS, şimdi de kıtalararası dünya birinciliğini elde etti.\n" + "\n" +
                "Türkiye'nin öz kaynakları ile hayat bulan ve hastanelere tek merkezden randevu alma imkanı sunan MHRS, uluslararası büyük bir ödül daha kazandı. Dünyada, ülkesindeki tüm hastaneleri merkezi randevu sisteminde buluşturan ilk ve tek sistem olan MHRS, tescillenen başarısı ile bizleri bir kez daha gururlandırdı.\n" + "Londra'da düzenlenen, Avrupa, Amerika, Orta Asya ve " +
                "Afrika'dan birçok temsilcinin yarıştığı ve Çağrı merkezi sektörünün en saygın yarışmalarından olan Contact Center World Awards'a \"Best Outsourcing Partnership\" (En İyi Dış Kaynak Ortaklığı) kategorisinde katılan MHRS, " +
                "dünyanın en iyi çağrı merkezlerini geride bırakarak 2017 yılı dünya birincisi oldu.");
        mesaj.show();



    }

    @FXML
    void tikla7(ActionEvent event) throws IOException {

        Alert mesaj = new Alert(Alert.AlertType.INFORMATION);
        mesaj.setTitle("MHRS'DE CEPTEN RANDEVU HATIRLATMA DÖNEMİ");
        mesaj.setHeaderText(null);
        mesaj.setContentText("Sağlık Bakanlığına bağlı tüm sağlık kurum ve kuruluşlarına muayene randevu hizmeti sunan Merkezi Hekim Randevu Sistemi (MHRS), gelişmiş teknolojiler ışığında yenilenmeye ve hizmet kalitesini artırmaya devam ediyor.\n" +
                "2010 yılından bu yana tüm Türkiye’ye kesintisiz hizmet veren MHRS, randevulara artan talebe karşılık yeni bir uygulamayı daha hayata geçirdi. MHRS’de yoğunlaşan talebe cevap vermek, " +
                "randevuları hatırlatarak MHRS kolaylığından yararlanma oranını yükseltmek ve gerekli durumda iptalini gerçekleştirerek muayene saatlerini tekrar randevuya açmak için randevu tarihinden 1 gün önce vatandaşlara tercihine göre " +
                "SMS ve sesli arama ile randevu hatırlatma/iptal servislerini hayata geçirdi. Böylece, gidemeyeceği muayene randevularının iptalini gerçekleştiren vatandaşlar diğer vatandaşların MHRS’ den faydalanmasına katkı sağlayacak.");
        mesaj.show();



    }



    @FXML
    public void handleCikis() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Stage window = (Stage) cikisId.getScene().getWindow();
        window.setScene(new Scene(root, 1550, 800));
    }

    @FXML
    void tikla8(ActionEvent event) throws IOException {

        Alert mesaj = new Alert(Alert.AlertType.INFORMATION);
        mesaj.setTitle("KAYIT BİLGİLENDİRME");
        mesaj.setHeaderText(null);
        mesaj.setContentText("Kaydınız başarılı bir şekilde oluşturulmuştur.\nSeçtiğiniz tarih aralığından bir gün belirnelip\n" +
                "mesaj yoluyla bilgilendirileceksiniz.");
        mesaj.show();

    }
    @FXML
    public void handleGiris() throws SQLException, IOException {


        Parent root = null;

        SQLiteJDBC sql = new SQLiteJDBC();
        ResultSet rs = sql.getTable("HastaneKayit");
        boolean kontrol = false;
        while (rs.next()){

            String gmail = rs.getString("gmail");
            String sifre = rs.getString("kullaniciSifre");

            if(gmailNo.getText().equals(gmail) && parolaNo.getText().equals(sifre)){
                gmailNo.clear();
                parolaNo.clear();
                kontrol = true;
                FXMLLoader loader = new FXMLLoader(getClass().getResource("mhrs.fxml"));
                root = loader.load();

                rs.close();
                Stage window = (Stage) girisId.getScene().getWindow();
                window.setScene(new Scene(root));
            }
        }
        rs.close();

        if (!kontrol)
            System.out.println("sistemde boyle bır kullanıcı bulunamamıştır");
    }

    @FXML
    public void handleGiriss() throws Exception {
        String admin = "betul";
        String pass = "123";

         if (kullaniciKodunuz.getText().equals(admin) && kullaniciParolaniz.getText().equals(pass)){
             Parent root = FXMLLoader.load(getClass().getResource("yonetme.fxml"));

             Stage window = (Stage) girissId.getScene().getWindow();
             window.setScene(new Scene(root, 1550, 800));
         }
         else{
             JOptionPane.showMessageDialog(null,"Kullanıcı adınız veya parolanız yanlış girilmiştir.");
         }

    }


    @FXML
    public void handleKayitt() throws Exception {


        Parent root = FXMLLoader.load(getClass().getResource("kaydolYonetme.fxml"));

        Stage window = (Stage) kaydolIdd.getScene().getWindow();
        window.setScene(new Scene(root, 1550, 800));

    }

    @FXML
    public void handlerexit() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Stage window = (Stage) exit.getScene().getWindow();
        window.setScene(new Scene(root, 1550, 800));
    }

}