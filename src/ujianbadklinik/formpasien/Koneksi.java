/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujianbadklinik.formpasien;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author scc1202200112
 */
public class Koneksi {

    private static java.sql.Connection koneksi;

    public static java.sql.Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/UjianBADKlinikDB";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil Terhubung");
            } catch (SQLException e) {
                System.out.println("Error");
            }
        }
        return koneksi;
    }

    public static void main(String args[]) {
        getKoneksi();
    }
}
