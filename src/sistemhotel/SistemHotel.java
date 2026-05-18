/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemhotel;


import java.sql.Connection;
import util.DatabaseConnection;

/**
 *
 * @author Lab Informatika
 */
public class SistemHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn = DatabaseConnection.getConnection();
        if (conn != null) {
            System.out.println("Koneksi Berhasil");
        } else {
            System.out.println("Koneksi Gagal");
        }
    }
    
}
