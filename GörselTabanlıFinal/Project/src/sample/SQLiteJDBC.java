package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLiteJDBC {

    public void addNewUser(String ad, String soyad, String yas, String gmail, String kullaniciAd, String kullaniciSifre) {

        Connection c = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:src\\hastane.db");
            stmt = c.createStatement();


            String sql = "INSERT INTO HASTANEKAYIT (ID, AD, SOYAD, YAS, GMAIL, KULLANICIAD,KULLANICISIFRE)" +
                    "VALUES (null, '"+ ad +"', '"+ soyad +"', '"+ yas +"', '"+ gmail +"'," +
                    "'"+ kullaniciAd +"', '"+ kullaniciSifre +"');";

            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        }catch (Exception e){
            System.err.println(e.getClass().getName()+ ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Veri başarılı bir şekilde tabloya kayıt edildi...");

    }




    public ResultSet getTable(String tabloAd){
        Connection c = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:src\\hastane.db");
            System.out.println("Bağlantı başarılı");

            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM " + tabloAd);

            // rs.close();
            //stmt.close();
            //c.close();

            return rs;
        }catch (Exception e){
            System.err.println(e.getClass().getName()+ ": " + e.getMessage());
            System.exit(0);
        }

        return rs;
    }
}
