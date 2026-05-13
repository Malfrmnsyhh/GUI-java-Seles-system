package Toko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://127.0.0.1:3308/penjualan_GUI";
                String user = "root";
                String pass = "admin";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi Berhasil");
            } catch (Exception e) {
                System.err.println("error");
            }
        }
        return koneksi;
    }
    public static void main(String args[]) {
        getKoneksi();
    }
}
